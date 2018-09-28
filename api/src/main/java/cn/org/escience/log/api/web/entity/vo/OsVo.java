package cn.org.escience.log.api.web.entity.vo;

import cn.org.escience.log.api.model.Os;
import cn.org.escience.log.api.model.Unkos;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OsVo implements Serializable {

  private List<Os> known;
  private List<Unkos> unknown;

}
