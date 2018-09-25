package cn.org.escience.log.api.web.filter;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.ext.Provider;
import org.glassfish.jersey.server.ContainerRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider
public class ServiceFilter implements ContainerRequestFilter {

  private static final Logger logger = LoggerFactory.getLogger(ServiceFilter.class);

  @Override
  public void filter(ContainerRequestContext crc) throws IOException {
    ContainerRequest request = (ContainerRequest) crc.getRequest();
//    HttpServletRequest srequest = (HttpServletRequest) request;
    System.out.println(request);

    System.out.println(request.getProperty("id"));

    Object id = crc.getProperty("id");
    if(id == null || "".equals(id.toString().trim()) ){
      logger.info("service 过滤器，查询id不存在，进行过滤，不进行后续操作！");
//      return;
    }
    System.out.println("service 过滤器继续执行！");
  }
}
