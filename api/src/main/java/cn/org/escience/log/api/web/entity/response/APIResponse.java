package cn.org.escience.log.api.web.entity.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * 返回统一格式的api信息，这里对于消息的说明处理(code和msg)不行，还有查询参数的显示
 * 后续需要再进行规范化
 */
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class APIResponse implements Serializable{
    private static final int DEFAULT_CODE=Message.SUCCESS_QUERY.getCode();
    private static final int DEFAULT_ERROR_CODE=Message.EXCEPTION_QUERY.getCode();

    private Meta meta= Message.SUCCESS_QUERY;
    private Object body;
//    private long costTimeMillis;

    private APIResponse(int code,String msg,Object data){
        this.meta = new Meta(code,msg);
        this.body = data;
    }
    private APIResponse(Meta meta,Object data){
        this.meta = meta;
        this.body = data;
    }

    private static APIResponse newInstance(int code,String msg,Object data){
        return new APIResponse(code,msg,data);
    }
    private static APIResponse newInstance(Meta meta,Object data){
        return new APIResponse(meta,data);
    }

    public static APIResponse ok(Object data){
        return newInstance(Message.SUCCESS_QUERY,data);
    }
    public static APIResponse ok(String msg,Object data){
        return newInstance(DEFAULT_CODE,msg,data);
    }

    public static APIResponse fail(int code,String msg){
        return newInstance(code,msg,null);
    }

    public static APIResponse fail(Meta meta){
        return newInstance(meta,null);
    }


}
