package cn.org.escience.log.api.web.entity.vo;

import com.github.pagehelper.PageInfo;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetailVo implements Serializable {

  private int code;
  private PageInfo<? extends Object> page;


}
