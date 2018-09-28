package cn.org.escience.log.api.service;

import cn.org.escience.log.api.model.General;
import java.util.List;

public interface GeneralService {

  List<General> findAll(List<String> dates,String type);

}
