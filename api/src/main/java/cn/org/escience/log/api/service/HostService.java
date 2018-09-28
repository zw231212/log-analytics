package cn.org.escience.log.api.service;

import cn.org.escience.log.api.model.Visitors;
import com.github.pagehelper.PageInfo;
import java.util.List;

public interface HostService {

  PageInfo<Visitors> findAll(List<String> dates, int number, int size, String order);

}
