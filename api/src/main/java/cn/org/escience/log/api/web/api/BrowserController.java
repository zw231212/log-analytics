package cn.org.escience.log.api.web.api;

import cn.org.escience.log.api.config.AppConstant;
import cn.org.escience.log.api.model.Browser;
import cn.org.escience.log.api.service.BrowserService;
import cn.org.escience.log.api.utils.DateUtil;
import cn.org.escience.log.api.web.entity.response.APIResponse;
import cn.org.escience.log.api.web.entity.response.Message;
import cn.org.escience.log.api.web.entity.vo.BrowserVO;
import cn.org.escience.log.ddsdb.utils.StringUtil;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
public class BrowserController{

  private BrowserService browserService;


  @GET
  @Path("/list")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
  public APIResponse getAll(@QueryParam("id") String id, //这里不用管，service的注入已经在filter完成
      @QueryParam("begin") String begin,
      @QueryParam("type") String type,
      @DefaultValue ("0")@QueryParam("offset") Integer offset){
    if(StringUtil.isNullOrBlank(begin)){
      begin = DateUtil.getNow();
    }
    //检查参数
    if(offset < 0){
      return APIResponse.newFailInstance(Message.error("偏移量不能为负数！"));
    }

    if(!AppConstant.queryTypes.contains(type)){
      return APIResponse.newFailInstance(Message.error("未知的查询类型 "+type+" ，查询类型是："+AppConstant.queryTypes));
    }

    List<String> dates = DateUtil.getDates(begin, offset, type);

    return null;
  }

  /**
   * 方法处理 HTTP GET 请求，默认的browser首页方法。返回的对象以"text/plain或者json"媒体类型
   * 给客户端
   * @return String 以 text/plain或者json 形式响应
   */
  @GET
  @Produces({MediaType.TEXT_PLAIN,MediaType.APPLICATION_JSON})
  public String getIt() {
    System.out.println("info");
    return "{\"id\":\"browser\",\"msg\":\"查找browser相关的api！\"}";
  }

}
