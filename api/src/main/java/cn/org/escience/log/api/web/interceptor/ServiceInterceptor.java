package cn.org.escience.log.api.web.interceptor;

import java.io.IOException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.ReaderInterceptor;
import javax.ws.rs.ext.ReaderInterceptorContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 这里的拦截器一直没有起作用
 */
@Provider
public class ServiceInterceptor implements ReaderInterceptor{

  private static final Logger logger = LoggerFactory.getLogger(ServiceInterceptor.class);

  @Override
  public Object aroundReadFrom(ReaderInterceptorContext context)
      throws IOException, WebApplicationException {
    System.out.println("Service 拦截器！");
    return context.proceed();
  }
}
