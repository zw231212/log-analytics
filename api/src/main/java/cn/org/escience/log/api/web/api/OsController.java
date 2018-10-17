package cn.org.escience.log.api.web.api;

import cn.org.escience.log.api.service.OsService;
import cn.org.escience.log.api.utils.DateUtil;
import cn.org.escience.log.api.web.entity.response.APIResponse;
import cn.org.escience.log.api.web.entity.vo.OsVo;
import cn.org.escience.log.ddsdb.utils.StringUtil;
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
@Path("/os")
public class OsController {

  private OsService osService;


  @GET
  @Path("/list")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
  public APIResponse getAll(@QueryParam("id") String id, //这里不用管，service的注入已经在filter完成
      @QueryParam("begin") String begin,
      @DefaultValue ("month")@QueryParam("type") String type,
      @DefaultValue ("0")@QueryParam("offset") Integer offset){
    if(StringUtil.isNullOrBlank(begin)){
      begin = DateUtil.getNow();
    }
    List<String> dates = DateUtil.getDates(begin, offset, type);
    OsVo osVo = osService.findAll(dates);

    return APIResponse.ok(osVo);
  }

  /**
   * @return String 以 text/plain或者json 形式响应
   */
  @GET
  @Produces({MediaType.TEXT_PLAIN,MediaType.APPLICATION_JSON})
  public String getIt() {
    return "{\"id\":\"os\",\"msg\":\"查找os相关的api！\"}";
  }

}
