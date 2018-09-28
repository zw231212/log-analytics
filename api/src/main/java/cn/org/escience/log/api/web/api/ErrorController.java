package cn.org.escience.log.api.web.api;

import cn.org.escience.log.api.config.AppConstant;
import cn.org.escience.log.api.model.Errors;
import cn.org.escience.log.api.service.ErrorService;
import cn.org.escience.log.api.utils.DateUtil;
import cn.org.escience.log.api.web.entity.response.APIResponse;
import cn.org.escience.log.api.web.entity.response.Message;
import cn.org.escience.log.api.web.entity.vo.ErrorDetailVo;
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
@Path("/error")
public class ErrorController {

  private ErrorService errorService;


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
    //检查参数在filter里面做了
    List<String> dates = DateUtil.getDates(begin, offset, type);
    //因为这个错误个数有限，直接查全部了
    List<Errors> errors = errorService.findAll(dates);

    return APIResponse.successInstance(errors);
  }


  @GET
  @Path("/detail")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
  public APIResponse getDetailPage(@QueryParam("id") String id, //这里不用管，service的注入已经在filter完成
      @QueryParam("begin") String begin,
      @DefaultValue ("month")@QueryParam("type") String type,
      @DefaultValue ("0")@QueryParam("offset") Integer offset,
      @DefaultValue ("0")@QueryParam("number") Integer number,
      @DefaultValue ("10")@QueryParam("size") Integer size,
      @DefaultValue ("404")@QueryParam("code") Integer code
  ){
    if(StringUtil.isNullOrBlank(begin)){
      begin = DateUtil.getNow();
    }
    //检查参数在filter里面做了
    List<String> dates = DateUtil.getDates(begin, offset, type);

    //检查错误的类型
    if(!AppConstant.errorCodes.contains(code)){
        return APIResponse.newFailInstance(Message.error("不支持的错误类型查询："+code+"，支持的错误类型有："+AppConstant.errorCodes));
    }

    ErrorDetailVo edvo = errorService.findDetailErrorPage(dates, number, size, code);

    return APIResponse.successInstance(edvo);
  }


  /**
   * @return String 以 text/plain或者json 形式响应
   */
  @GET
  @Produces({MediaType.TEXT_PLAIN,MediaType.APPLICATION_JSON})
  public String getIt() {
    return "{\"id\":\"error\",\"msg\":\"查找error相关的api！\"}";
  }

}
