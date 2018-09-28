package cn.org.escience.log.api.service;

import cn.org.escience.log.api.model.Robot;
import com.github.pagehelper.PageInfo;
import java.util.List;

public interface RobotService {

  PageInfo<Robot> findAll(List<String> dates, int number, int size);

}
