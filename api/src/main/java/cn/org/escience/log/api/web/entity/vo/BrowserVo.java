package cn.org.escience.log.api.web.entity.vo;

import cn.org.escience.log.api.model.Browser;
import cn.org.escience.log.api.model.Unkbrowser;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrowserVo implements Serializable {

  private List<Browser> known;
  private List<Unkbrowser> unknown;

}
