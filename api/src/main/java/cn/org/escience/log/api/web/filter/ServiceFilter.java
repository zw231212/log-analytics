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
    System.out.println("服务注入请求过滤器");
    String method = crc.getMethod().toUpperCase();
//    UriInfo uriInfo = crc.getUriInfo();

    switch (method) {
      case "POST":    //构造解析，将post数据转化为querystring
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
      logger.info("service 过滤器，查询id不存在，进行过滤，不进行后续操作！");
      throw new AuthorizationException("请指定查询参数key id 的值！");
    }
    //最终的数据库的后缀名成是要和aw2sql那边一致的 ，前端传递过来的参数只有id（也就是自己的标识符
    String database = ids.get(0)+ Server.dbSuffix;
    injectService(uriInfo,database);

  }

  private void injectService(UriInfo uriInfo, String database){
    List<String> matchedURIs = uriInfo.getMatchedURIs();
    System.out.println(matchedURIs);
    List<Object> matchedResources = uriInfo.getMatchedResources();
    if(matchedResources == null || matchedResources.size() == 0){
//      throw new AuthorizationException("no matched resources found!");
    }
    try{
      Object matchedResource = uriInfo.getMatchedResources().get(0);
      final Class<?> resource = matchedResource.getClass();

      Field[] declaredFields = resource.getDeclaredFields();
      for (Field declaredField : declaredFields) {
        declaredField.setAccessible(true);
        Class<?> fieldClass = declaredField.getType();
        System.out.println(fieldClass);
        System.out.println(fieldClass.isAssignableFrom(BaseService.class));

        Set<Class<?>> implementionClasses =
            (Set<Class<?>>) relections.getSubTypesOf(fieldClass);

        System.out.println(implementionClasses);
        if(implementionClasses != null && implementionClasses.size() > 0) {
          Class[] classes = new Class[implementionClasses.size()];
          classes = implementionClasses.toArray(classes);

          Class implementClass = classes[0];

          boolean containResult = sm.checkApiServices(database);
          BaseService service = null;
          boolean flag = false;
          if(containResult){
            service = sm.getService(database, fieldClass);
          }
          if(service == null){
            Constructor<? extends Class> constructor = implementClass.getConstructor(String.class);
            Object obj = constructor.newInstance(database);
            service = (BaseService) obj;
            flag = true;
          }
          System.out.println(service);
          if(flag){
            sm.putService(database, fieldClass, service);
          }
          declaredField.set(matchedResource,service);
        }
      }
    }catch (Exception e){
//      e.printStackTrace();
      logger.error(e.getMessage());
    }
  }
}
