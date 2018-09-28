package cn.org.escience.log.api.service.impl;

import cn.org.escience.log.api.mapper.GeneralMapper;
import cn.org.escience.log.api.model.General;
import cn.org.escience.log.api.model.GeneralExample;
import cn.org.escience.log.api.model.GeneralExample.Criteria;
import cn.org.escience.log.api.service.BaseService;
import cn.org.escience.log.api.service.GeneralService;
import cn.org.escience.log.api.utils.ServiceUtil;
import java.util.List;

public class GeneralServiceImpl extends BaseService implements GeneralService {

  private GeneralMapper generalMapper = sqlSession.getMapper(GeneralMapper.class);

  public GeneralServiceImpl(String database) {
    super(database);
  }

  @Override
  public List<General> findAll(List<String> dates, String type) {
    dates = ServiceUtil.checkDates(dates);

    GeneralExample example = new GeneralExample();
    switch (type){
      case "month":
        example.createCriteria().andYearMonthIn(dates);
        break;
      case "year":
        Criteria criteria = example.createCriteria();
        for (String date : dates) {
           criteria.andYearMonthLike(date);
        }
        example.or(criteria);
        break;
    }
    List<General> generals = generalMapper.selectByExample(example);
    return generals;
  }
}
