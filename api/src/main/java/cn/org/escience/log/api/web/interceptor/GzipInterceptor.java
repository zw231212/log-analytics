package cn.org.escience.log.api.web.interceptor;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 拦截器有两种：ReaderInterceptor,WriterInterceptor.
 * they’re executed after the filters and only if a message body is present.
 * reader用的不多,writer可以用来开启gzip压缩
 */
@Provider
public class GzipInterceptor implements WriterInterceptor {

  private static final Logger logger = LoggerFactory.getLogger(GzipInterceptor.class);

  @Override
  public void aroundWriteTo(WriterInterceptorContext context)
      throws IOException, WebApplicationException {

    MultivaluedMap<String, Object> headers = context.getHeaders();
    headers.add("Content-Encoding", "gzip");
    String ContentType = context.getMediaType().toString();
    headers.add("Content-Type",ContentType+";charset=utf-8");//解决乱码问题
    final OutputStream outputStream = context.getOutputStream();
    context.setOutputStream(new GZIPOutputStream(outputStream));
    context.proceed();
    logger.info("GZIP拦截器对返回资源进行压缩");
  }
}