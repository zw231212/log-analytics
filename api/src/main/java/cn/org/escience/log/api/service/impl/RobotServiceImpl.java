package cn.org.escience.log.api.service.impl;

import cn.org.escience.log.api.mapper.RobotMapper;
import cn.org.escience.log.api.model.Robot;
import cn.org.escience.log.api.model.RobotExample;
import cn.org.escience.log.api.service.BaseService;
import cn.org.escience.log.api.service.RobotService;
import cn.org.escience.log.api.utils.ServiceUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;

public class RobotServiceImpl extends BaseService implements RobotService {

  private RobotMapper robotMapper = sqlSession.getMapper(RobotMapper.class);

  public RobotServiceImpl(String database) {
    super(database);
  }

  @Override
  public PageInfo<Robot> findAll(List<String> dates, int number, int size) {
    dates = ServiceUtil.checkDates(dates);
    if(number < 0){
      number = 0;
    }
    if(size < 0){
      size = 10;
    }
    RobotExample example = new RobotExample();
    example.createCriteria().andYearMonthIn(dates);
    example.setOrderByClause("hits DESC");

    PageHelper.startPage(number, size);

    List<Robot> robots = robotMapper.selectByExample(example);
    PageInfo<Robot> pageInfo = new PageInfo<>(robots);

    return pageInfo;
  }
}
