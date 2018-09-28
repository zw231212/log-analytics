package cn.org.escience.log.api.service.impl;

import cn.org.escience.log.api.mapper.VisitorsMapper;
import cn.org.escience.log.api.model.Visitors;
import cn.org.escience.log.api.model.VisitorsExample;
import cn.org.escience.log.api.service.BaseService;
import cn.org.escience.log.api.service.HostService;
import cn.org.escience.log.api.utils.ServiceUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;

public class HostServiceImpl extends BaseService implements HostService {

  private VisitorsMapper visitorsMapper = sqlSession.getMapper(VisitorsMapper.class);

  public HostServiceImpl(String database) {
    super(database);
  }

  @Override
  public PageInfo<Visitors> findAll(List<String> dates, int number, int size, String order) {
    dates = ServiceUtil.checkDates(dates);
    if(number < 0){
      number = 0;
    }
    if(size < 0){
      size = 10;
    }
    VisitorsExample example = new VisitorsExample();
    example.setOrderByClause(order);

    PageHelper.startPage(number, size);

    List<Visitors> robots = visitorsMapper.selectByExample(example);
    PageInfo<Visitors> pageInfo = new PageInfo<>(robots);
    return pageInfo;
  }
}
