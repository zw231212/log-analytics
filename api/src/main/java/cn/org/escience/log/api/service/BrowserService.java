package cn.org.escience.log.api.service;

import cn.org.escience.log.api.web.entity.vo.BrowserVo;
import java.util.List;

public interface BrowserService {

  BrowserVo findAll(List<String> dates);

}
