package cn.org.escience.log.api.web.interceptor;

import cn.org.escience.log.api.service.BaseService;
import cn.org.escience.log.api.service.ServiceManager;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.ReaderInterceptor;
import javax.ws.rs.ext.ReaderInterceptorContext;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider
public class ServiceInterceptor implements ReaderInterceptor, MethodInterceptor {

  private static final Logger logger = LoggerFactory.getLogger(ServiceInterceptor.class);

  private static ServiceManager serviceManager = ServiceManager.getInstance();

  @Context
  private UriInfo uriInfo;
  @Context
  private ServletContext ctx;
  @Context
  private ServletConfig config;

  @Override
  public Object aroundReadFrom(ReaderInterceptorContext context)
      throws IOException, WebApplicationException {
    System.out.println("Service 拦截器！");
    URI uri = uriInfo.getBaseUri();
    System.out.println(uri);
    System.out.println(uri.getPath());
    URL resource = ctx.getResource(uri.getPath());
    System.out.println(resource);
    String servletName = config.getServletName();
    System.out.println(servletName);

    Object id = context.getProperty("id");
    if(id == null || "".equals(id.toString().trim()) ){
      logger.info("service 拦截器，查询id不存在，进行拦截，不进行后续操作！");
      return false;
    }
    System.out.println("service 拦截器继续执行！");
    BaseService service = serviceManager.getService(id.toString());
    System.out.println(service);
    Object proceed = context.proceed();
    return proceed;
  }

  @Override
  public Object invoke(MethodInvocation invocation) throws Throwable {
    System.out.println("method 拦截器");
    return invocation.proceed();
  }
}
