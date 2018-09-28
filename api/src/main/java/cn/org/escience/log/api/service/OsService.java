package cn.org.escience.log.api.service;

import cn.org.escience.log.api.web.entity.vo.OsVo;
import java.util.List;

public interface OsService {

  OsVo findAll(List<String> dates);

}
