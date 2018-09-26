package cn.org.escience.log.api.web.filter;

import cn.org.escience.log.api.config.AppConstant.Server;
import cn.org.escience.log.api.service.BaseService;
import cn.org.escience.log.api.service.ServiceManager;
import cn.org.escience.log.api.utils.JSONUtil;
import cn.org.escience.log.api.web.exception.AuthorizationException;
import cn.org.escience.log.api.web.exception.Message;
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
public class ServiceFilter implements ContainerRequestFilter {

  private static final Logger logger = LoggerFactory.getLogger(ServiceFilter.class);

  private static ServiceManager sm = ServiceManager.getInstance();

  @Context
  private ExtendedUriInfo uriInfo;

  private static Reflections relections =
      new Reflections("cn.org.escience.log.api");

  @Override
  public void filter(ContainerRequestContext crc) throws IOException {
    logger.debug("service 过滤器，检查查询id！");
    String method = crc.getMethod().toUpperCase();
//    UriInfo uriInfo = crc.getUriInfo();

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
    //最终的数据库的后缀名成是要和aw2sql那边一致的 ，前端传递过来的参数只有id（也就是自己的标识符
    String database = ids.get(0)+ Server.dbSuffix;

    //先检查是否存在该数据库

    //将service注入到每个controller
    injectService(uriInfo,database);

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
        }else{
          throw new RuntimeException(fieldClass+ "  服务接口类没有实现类！");
        }
      }
    }catch (Exception e){
      e.printStackTrace();
      logger.error(e.getMessage());
    }
  }
}
