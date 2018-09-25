package cn.org.escience.log.api.web.filter;

import cn.org.escience.log.api.config.AppConstant.Cros;
import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

/**
 * 跨域问题处理！
 */
@Provider
public class ApiServiceCorsFilter implements ContainerResponseFilter {

  public void filter(ContainerRequestContext creq, ContainerResponseContext cres)
      throws IOException {

    cres.getHeaders().add("Access-Control-Allow-Origin", Cros.allowOrigin);
    cres.getHeaders().add("Access-Control-Allow-Headers", Cros.allowHeaders);
    cres.getHeaders().add("Access-Control-Allow-Credentials", Cros.allowCredentials);
    cres.getHeaders().add("Access-Control-Allow-Methods", Cros.allowMethods);
    cres.getHeaders().add("Access-Control-Max-Age", Cros.maxAge);

  }

}
