package cn.org.escience.log.api.web.filter;

import cn.org.escience.log.api.config.AppConstant.Cros;
import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

/**
 * ContainerRequestFilter :过滤请求前.
 * ContainerResponseFilter :过滤请求后.
 * 可以加@Priority 是用于表示该过滤器的执行顺序，其中参数为long类型，对于请求过滤器，该数值越小越先执行，响应过滤器则相反。
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
