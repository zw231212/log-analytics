package cn.org.escience.log.api.web.exception;

import cn.org.escience.log.api.web.entity.response.Message;
import cn.org.escience.log.api.web.entity.response.Meta;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider //使用@Provider标识该类为一个jersey的’处理器
public class GlobalExceptionMapper implements ExceptionMapper<Exception> {

  @Override
  public Response toResponse(Exception e) {

    ResponseBuilder rb = null;
    e.printStackTrace();
    System.out.println("==========================异常控制器输出=================================================");
    Meta meta = null;
    if(e instanceof AuthorizationException){
      meta = ((AuthorizationException) e).getMeta();
    }else  if(e instanceof NotFoundException){
      meta = Message.NOT_FOUND;
    } else{
      meta = Message.error(e.toString());
    }

    rb = Response.ok(meta, MediaType.APPLICATION_JSON_TYPE);


    return rb.build();
  }
}
