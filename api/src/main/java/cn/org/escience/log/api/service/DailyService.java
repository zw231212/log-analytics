package cn.org.escience.log.api.service;

import cn.org.escience.log.api.model.Daily;
import com.github.pagehelper.PageInfo;
import java.util.List;

public interface DailyService {

  PageInfo<Daily> findAll(List<String> dates, int number, int size, String type, String order);

}
