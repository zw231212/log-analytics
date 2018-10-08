package cn.org.escience.log.api.web.filter;

import java.io.IOException;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class StaticResourcesFilter implements ContainerRequestFilter, ClientRequestFilter {

  @Override
  public void filter(ContainerRequestContext rc) throws IOException {
//    System.out.println("容器服务端静态资源过滤器");
//    System.out.println(rc.getUriInfo());
  }

  @Override
  public void filter(ClientRequestContext rc) throws IOException {
//    System.out.println("客户端请求静态资源过滤器");

  }
}
