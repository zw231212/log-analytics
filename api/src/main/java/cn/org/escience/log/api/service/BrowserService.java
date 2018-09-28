package cn.org.escience.log.api.service;

import cn.org.escience.log.api.web.entity.vo.BrowserVO;
import java.util.List;

public interface BrowserService {

  BrowserVO findAll(List<String> dates);

}
