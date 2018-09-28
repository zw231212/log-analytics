package cn.org.escience.log.api.service.impl;

import cn.org.escience.log.api.mapper.DailyMapper;
import cn.org.escience.log.api.model.Daily;
import cn.org.escience.log.api.model.DailyExample;
import cn.org.escience.log.api.model.DailyExample.Criteria;
import cn.org.escience.log.api.service.BaseService;
import cn.org.escience.log.api.service.DailyService;
import cn.org.escience.log.api.utils.ServiceUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;

public class DailyServiceImpl extends BaseService implements DailyService {

  private DailyMapper dailyMapper = sqlSession.getMapper(DailyMapper.class);

  public DailyServiceImpl(String database) {
    super(database);
  }

  @Override
  public PageInfo<Daily> findAll(List<String> dates, int number, int size, String type,
      String order) {
    dates = ServiceUtil.checkDates(dates);
    if(number < 0){
      number = 0;
    }
    if(size < 0){
      size = 10;
    }
    DailyExample example = new DailyExample();
    example.setOrderByClause(order);

    switch (type){
      case "day":
        example.createCriteria().andDayIn(dates);
        break;
      case "month":
        Criteria criteria = example.or();
        for (String date : dates) {
          criteria.andDayLike(date+"%");
        }
        break;
      case "year":
        criteria = example.or();
        for (String date : dates) {
          criteria.andDayLike(date+"%");
        }
        break;
    }

    PageHelper.startPage(number, size);

    List<Daily> dailies = dailyMapper.selectByExample(example);
    PageInfo<Daily> pageInfo = new PageInfo<>(dailies);

    return pageInfo;
  }
}
