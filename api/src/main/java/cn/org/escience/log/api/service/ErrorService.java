package cn.org.escience.log.api.service;

import cn.org.escience.log.api.model.Errors;
import cn.org.escience.log.api.web.entity.vo.ErrorDetailVo;
import java.util.List;

public interface ErrorService {

  List<Errors> findAll(List<String> dates);
  ErrorDetailVo findDetailErrorPage(List<String> dates, int number, int size, int code);

}
