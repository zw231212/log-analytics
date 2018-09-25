package cn.org.escience.log.api.web.exception;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta implements Serializable{

    private int code = 30001;
    private String msg;

    public Meta(String msg){
        this.msg = msg;
    }
}
