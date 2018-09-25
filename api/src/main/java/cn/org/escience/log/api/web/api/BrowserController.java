package cn.org.escience.log.api.web.api;

import cn.org.escience.log.api.model.Browser;
import cn.org.escience.log.api.service.BrowserService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import org.eclipse.jetty.server.Request;

/**
 * 测试查看是否能够走通到数据库
 */
@Path("/browser")
public class BrowserController {


  @Context
  private UriInfo uriInfo;
  @Context
  private Request request;

  private BrowserService browserService;


  @GET
  @Path("/list/{id}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
  public String getAll(@PathParam("id") String id,
      @QueryParam("begin") String begin,
      @QueryParam("end") String end
  ){

    System.out.println(uriInfo.getMatchedResources());
    System.out.println(request);
    System.out.println(id);
    System.out.println(begin);
    System.out.println(end);
    List<Browser> all = browserService.findAll();
    System.out.println(all);
    return "{\"id\":"+id+",\"name\":\"zzq!欢迎光临：baidu.com\"}";
  }

  /**
   * 方法处理 HTTP GET 请求。返回的对象以"text/plain"媒体类型
   * 给客户端
   * @return String 以 text/plain 形式响应
   */
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getIt() {
    System.out.println("info");
    return "Got it!";
  }

}
