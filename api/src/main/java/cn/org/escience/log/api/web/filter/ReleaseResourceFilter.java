package cn.org.escience.log.api.web.filter;

import cn.org.escience.log.api.service.ServiceManager;
import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider
public class ReleaseResourceFilter  implements ContainerResponseFilter {

  private static final Logger logger = LoggerFactory.getLogger(ReleaseResourceFilter.class);

  private static ServiceManager sm = ServiceManager.getInstance();

  @Override
  public void filter(ContainerRequestContext requestContext,
      ContainerResponseContext responseContext) throws IOException {
//    sm.releaseAllSessions();
    logger.debug("资源释放信息返回过滤器");

  }
}
