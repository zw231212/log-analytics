package cn.org.escience.log.api.service.impl;

import cn.org.escience.log.api.mapper.DomainMapper;
import cn.org.escience.log.api.model.Domain;
import cn.org.escience.log.api.model.DomainExample;
import cn.org.escience.log.api.service.AreaService;
import cn.org.escience.log.api.service.BaseService;
import cn.org.escience.log.api.utils.ServiceUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;

public class AreaServiceImpl extends BaseService implements AreaService {

  private DomainMapper domainMapper = sqlSession.getMapper(DomainMapper.class);

  public AreaServiceImpl(String database) {
    super(database);
  }

  @Override
  public PageInfo<Domain> findAll(List<String> dates, int number, int size) {
    dates = ServiceUtil.checkDates(dates);
    if(number < 0){
      number = 0;
    }
    if(size < 0){
      size = 10;
    }
    DomainExample example = new DomainExample();
    example.setOrderByClause("pages DESC");
    example.createCriteria().andYearMonthIn(dates);
    PageHelper.startPage(number, size);

    List<Domain> domains = domainMapper.selectByExample(example);
    PageInfo<Domain> pageInfo = new PageInfo<>(domains);

    return pageInfo;
  }
}
