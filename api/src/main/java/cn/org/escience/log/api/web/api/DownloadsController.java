package cn.org.escience.log.api.web.api;

import cn.org.escience.log.api.config.AppConstant;
import cn.org.escience.log.api.model.Domain;
import cn.org.escience.log.api.model.Downloads;
import cn.org.escience.log.api.service.AreaService;
import cn.org.escience.log.api.service.DownloadsService;
import cn.org.escience.log.api.utils.DateUtil;
import cn.org.escience.log.api.web.entity.response.APIResponse;
import cn.org.escience.log.api.web.entity.response.Message;
import cn.org.escience.log.ddsdb.utils.StringUtil;
import com.github.pagehelper.PageInfo;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * 浏览器数据查看
 */
@Path("/downloads")
public class DownloadsController {

  private DownloadsService downloadsService;


  @GET
  @Path("/list")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
  public APIResponse getAll(@QueryParam("id") String id, //这里不用管，service的注入已经在filter完成
      @QueryParam("begin") String begin,
      @DefaultValue ("month")@QueryParam("type") String type,
      @DefaultValue ("0")@QueryParam("offset") Integer offset,
      @DefaultValue ("0")@QueryParam("number") Integer number,
      @DefaultValue ("10")@QueryParam("size") Integer size,
      @DefaultValue ("downloads DESC")@QueryParam("order") String order
  ){
    if(StringUtil.isNullOrBlank(begin)){
      begin = DateUtil.getNow();
    }
    //检查参数在filter里面做了
    List<String> dates = DateUtil.getDates(begin, offset, type);

    if(!AppConstant.orders.contains(order)){
      return APIResponse.fail(Message.error("不支持的排序参数 "+order+" ,支持的排序参数有："+AppConstant.orders));
    }

    PageInfo<Downloads> pageInfo = downloadsService.findAll(dates, number, size,type,order);
    return APIResponse.ok(pageInfo);
  }

  /**
   * @return String 以 text/plain或者json 形式响应
   */
  @GET
  @Produces({MediaType.TEXT_PLAIN,MediaType.APPLICATION_JSON})
  public String getIt() {
    return "{\"id\":\"area\",\"msg\":\"查找area相关的api！\"}";
  }

}
