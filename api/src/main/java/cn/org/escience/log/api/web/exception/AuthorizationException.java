package cn.org.escience.log.api.web.exception;

import cn.org.escience.log.api.web.entity.response.Message;
import cn.org.escience.log.api.web.entity.response.Meta;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 主要是检查id异常，也就是能否匹配得上数据库对于的数据库
 */
@Data
@NoArgsConstructor
public class AuthorizationException extends RuntimeException {
  private Meta meta = Message.NOT_AUTH;


  public AuthorizationException(String msg){
    this.meta.setMsg(msg);
  }
  public AuthorizationException(Meta meta){
    this.meta = meta;
  }

  @Override
  public String toString() {
    return "AuthorizationException{" +
        "msg=" + meta.getMsg() +
        '}';
  }
}
