package cn.org.escience.log.api.web.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

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
