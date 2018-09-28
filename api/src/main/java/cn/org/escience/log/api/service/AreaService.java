package cn.org.escience.log.api.service;

import cn.org.escience.log.api.model.Domain;
import com.github.pagehelper.PageInfo;
import java.util.List;

public interface AreaService {

  PageInfo<Domain> findAll(List<String> dates, int number, int size);

}
