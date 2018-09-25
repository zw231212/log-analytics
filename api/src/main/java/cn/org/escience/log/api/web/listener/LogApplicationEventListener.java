package cn.org.escience.log.api.web.listener;

import java.lang.reflect.Method;
import java.net.URI;
import javax.ws.rs.ext.Provider;
import org.glassfish.jersey.server.ExtendedUriInfo;
import org.glassfish.jersey.server.model.ResourceMethod;
import org.glassfish.jersey.server.monitoring.ApplicationEvent;
import org.glassfish.jersey.server.monitoring.ApplicationEventListener;
import org.glassfish.jersey.server.monitoring.RequestEvent;
import org.glassfish.jersey.server.monitoring.RequestEvent.Type;
import org.glassfish.jersey.server.monitoring.RequestEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 这里本来想记录方法执行时间的，先记录个处理方法与处理类
 */
@Provider
public class LogApplicationEventListener implements ApplicationEventListener {

  private static final Logger logger = LoggerFactory.getLogger(LogApplicationEventListener.class);

  @Override
  public void onEvent(ApplicationEvent event) {
    
  }

  @Override
  public RequestEventListener onRequest(RequestEvent re) {
    return event -> {
      Type type = event.getType();
      switch (type){
        case RESOURCE_METHOD_FINISHED:
          logMethod(re.getUriInfo(),type);
          break;
      }
    };
  }

  private void logMethod(final ExtendedUriInfo uriInfo, Type type) {
    ResourceMethod mm = uriInfo.getMatchedResourceMethod();
    if(mm == null){
      return;
    }
    final Method method = uriInfo
        .getMatchedResourceMethod()
        .getInvocable()
        .getHandlingMethod();
    URI uri = uriInfo.getRequestUri();

    String path = uri.toString();
    String httpMethod = uriInfo.getMatchedResourceMethod().getHttpMethod();
    logger.info("请求信息 ：url:{}, method:{},请求处理类方法为：{}", path, httpMethod, method.toString());

  }
}
