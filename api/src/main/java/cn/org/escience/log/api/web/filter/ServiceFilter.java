package cn.org.escience.log.api.web.filter;

import cn.org.escience.log.api.config.AppConstant;
import cn.org.escience.log.api.config.AppConstant.Cros;
import cn.org.escience.log.api.config.AppConstant.Server;
import cn.org.escience.log.api.service.BaseService;
import cn.org.escience.log.api.service.ServiceManager;
import cn.org.escience.log.api.utils.JSONUtil;
import cn.org.escience.log.api.web.entity.response.APIResponse;
import cn.org.escience.log.api.web.exception.AuthorizationException;
import cn.org.escience.log.api.web.entity.response.Message;
import cn.org.escience.log.ddsdb.utils.StringUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.net.URI;
import java.util.List;
import java.util.Set;
import javax.annotation.Priority;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;
import org.glassfish.jersey.server.ExtendedUriInfo;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 */
@Provider
//@PreMatching
@Priority(value = 100000)
public class ServiceFilter implements ContainerRequestFilter, ContainerResponseFilter {

  private static final Logger logger = LoggerFactory.getLogger(ServiceFilter.class);

  private static ServiceManager sm = ServiceManager.getInstance();

  @Context
  private ExtendedUriInfo uriInfo;

  private static Reflections relections =
      new Reflections(Server.basePackage+".service");

  @Override
  public void filter(ContainerRequestContext crc) throws IOException {
    String method = crc.getMethod().toUpperCase();
//    UriInfo uriInfo = crc.getUriInfo();

    String path = uriInfo.getPath();
    logger.info("service 过滤器，检查查询id！"+path);
    boolean flag = false;//是否是首页
    String conetxtPath = Server.contextPath;
    if(StringUtil.isNullOrBlank(conetxtPath)){
      conetxtPath = "/";
    }
    if(StringUtil.isNullOrBlank(path) || conetxtPath.equals(path.trim())){
      flag = true;
    }

    //path是为空的话，是访问首页
    if(!flag){
      switch (method) {
        case "POST":    //构造解析，将post数据转化为querystring
          logger.debug("将 post 参数转换为querystring参数！");
          InputStream inputStream = crc.getEntityStream();
          URI uri = uriInfo.getRequestUri();
          BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
          StringBuffer rqbody = new StringBuffer() ;
          String line = "" ;
          while((line = br.readLine()) != null){
            rqbody.append(line) ;
          }
          String qs = rqbody.toString();
          String appendQs = null;
          if(!qs.contains("&")){
            String s = JSONUtil.jsonStr2Querytring(qs);
            if(s != null) {
              appendQs = s;
            }
          }else{
            appendQs = qs;
          }
          String query = uri.getQuery();
          if(StringUtil.isNullOrBlank(query)){
            query = appendQs;
          } else {
            query += "&"+appendQs;
          }

          uri = UriBuilder.fromUri(uri).replaceQuery(query).build();
          crc.setRequestUri(uri);
          break;
        case "GET":
          break;
        default:
          throw new RuntimeException("only get and post method is supported!");
      }

      MultivaluedMap<String, String> params = uriInfo.getQueryParameters();
      if(params == null || params.size() == 0){
        throw new AuthorizationException(Message.PARAMS_LOSE);
      }

      List<String> ids = params.get("id");
      if(ids == null || ids.size() == 0 || "".equals(ids.get(0).trim()) ){
        throw new AuthorizationException("请指定查询参数key id 的值！");
      }
      //检查偏移量和查询类型参数 偏移量默认为0，查询类型参数默认为month
      List<String> offsetList = params.get("offset");
      int offset = 0;
      try{
        offset = Integer.parseInt(offsetList.get(0));
      }catch (Exception e){
      }
      if(offset < 0){
        throw new AuthorizationException(Message.error("偏移量不能为负数！"));
      }
      List<String> typeList = params.get("type");
      String type = null;
      try{
        type = typeList.get(0);
      }catch (Exception e){
        type = "month";
      }
      if(!AppConstant.queryTypes.contains(type)){
        throw new AuthorizationException(Message.error("未知的查询类型 "+type+" ，查询类型是："+AppConstant.queryTypes));
      }
      //最终的数据库的后缀名成是要和aw2sql那边一致的 ，前端传递过来的参数只有id（也就是自己的标识符
      String database = ids.get(0)+ Server.dbSuffix;

      //先检查是否存在该数据库

      //将service注入到每个controller
      injectService(uriInfo,database);
    }

  }

  public void filter(ContainerRequestContext creq, ContainerResponseContext cres)
      throws IOException {
    logger.debug("跨域服务信息返回过滤器");
    cres.getHeaders().add("Access-Control-Allow-Origin", Cros.allowOrigin);
    cres.getHeaders().add("Access-Control-Allow-Headers", Cros.allowHeaders);
    cres.getHeaders().add("Access-Control-Allow-Credentials", Cros.allowCredentials);
    cres.getHeaders().add("Access-Control-Allow-Methods", Cros.allowMethods);
    cres.getHeaders().add("Access-Control-Max-Age", Cros.maxAge);
  }


  /**
   * 给每个controller注入service
   * @param uriInfo 匹配的url相关的信息
   * @param database 要查询的数据库的名称
   */
  private void injectService(UriInfo uriInfo, String database){

    //获取匹配的controller，如果使用@PreMatching，则这里无法获取到匹配的resource
    List<Object> matchedResources = uriInfo.getMatchedResources();
    if(matchedResources == null || matchedResources.size() == 0){
      throw new AuthorizationException("no matched resources found!");
    }
    try{
      Object matchedResource = uriInfo.getMatchedResources().get(0);
      final Class<?> resource = matchedResource.getClass();

      Field[] declaredFields = resource.getDeclaredFields();
      for (Field declaredField : declaredFields) {

        declaredField.setAccessible(true);
        Class<?> fieldClass = declaredField.getType();



        //获取service接口的实现类
        Set<Class<?>> implementionClasses =
            (Set<Class<?>>) relections.getSubTypesOf(fieldClass);

        if(implementionClasses != null && implementionClasses.size() > 0) {
          Class[] classes = new Class[implementionClasses.size()];
          classes = implementionClasses.toArray(classes);

          Class implementClass = classes[0];
          //查看是否有继承BaseService
          Class<?> superclass = implementClass.getSuperclass();
          if(superclass != BaseService.class){
            continue;
          }
          boolean containResult = sm.checkApiServices(database);

          BaseService service = null;
          boolean flag = false;
          if(containResult){ //从缓存里面获取服务接口数据
            service = sm.getService(database, fieldClass);
          }
          if(service == null){ //如果无法从缓存的service容器里面获取service，那么就放射生成
            Constructor<? extends Class> constructor = implementClass.getConstructor(String.class);
            Object obj = constructor.newInstance(database);
            service = (BaseService) obj;
            flag = true;
          }
          if(flag){
            sm.putService(database, fieldClass, service);
          }
          //给controller里面的service接口实例化
          declaredField.set(matchedResource,service);
        }
      }
    }catch (Exception e){
      e.printStackTrace();
      logger.error(e.getMessage());
    }
  }
}
