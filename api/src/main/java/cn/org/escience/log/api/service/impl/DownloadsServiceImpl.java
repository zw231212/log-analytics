package cn.org.escience.log.api.service.impl;

import cn.org.escience.log.api.mapper.DownloadsMapper;
import cn.org.escience.log.api.model.Downloads;
import cn.org.escience.log.api.model.DownloadsExample;
import cn.org.escience.log.api.model.DownloadsExample.Criteria;
import cn.org.escience.log.api.service.BaseService;
import cn.org.escience.log.api.service.DownloadsService;
import cn.org.escience.log.api.utils.ServiceUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;

public class DownloadsServiceImpl extends BaseService implements DownloadsService {

  private DownloadsMapper downloadsMapper = sqlSession.getMapper(DownloadsMapper.class);


  public DownloadsServiceImpl(String database) {
    super(database);
  }

  @Override
  public PageInfo<Downloads> findAll(List<String> dates, int number, int size, String type,
      String order) {
    dates = ServiceUtil.checkDates(dates);
    if(number < 0){
      number = 0;
    }
    if(size < 0){
      size = 10;
    }
    DownloadsExample example = new DownloadsExample();
    example.setOrderByClause(order);

    switch (type){
      case "month":
        example.createCriteria().andYearMonthIn(dates);
        break;
      case "year":
        Criteria criteria = example.or();
        for (String date : dates) {
          criteria.andYearMonthLike(date+"%");
        }
        break;
    }

    PageHelper.startPage(number, size);

    List<Downloads> downloads = downloadsMapper.selectByExample(example);
    PageInfo<Downloads> pageInfo = new PageInfo<>(downloads);

    return pageInfo;
  }
}
