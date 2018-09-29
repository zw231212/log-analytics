package cn.org.escience.log.api.service.impl;

import cn.org.escience.log.api.mapper.PagesMapper;
import cn.org.escience.log.api.model.Pages;
import cn.org.escience.log.api.model.PagesExample;
import cn.org.escience.log.api.model.PagesExample.Criteria;
import cn.org.escience.log.api.service.BaseService;
import cn.org.escience.log.api.service.PagesService;
import cn.org.escience.log.api.utils.ServiceUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;

public class PagesServiceImpl extends BaseService implements PagesService {

  private PagesMapper pagesMapper = sqlSession.getMapper(PagesMapper.class);

  public PagesServiceImpl(String database) {
    super(database);
  }

  @Override
  public PageInfo<Pages> findAll(List<String> dates, int number, int size, String action) {
    dates = ServiceUtil.checkDates(dates);
    if(number < 0){
      number = 0;
    }
    if(size < 0){
      size = 10;
    }

    PagesExample pagesExample = new PagesExample();
    Criteria criteria = pagesExample.createCriteria();
    criteria.andYearMonthIn(dates);
    switch (action){
      case "entry":
        //只查入站，也就是entry的值不能为0
        criteria.andEntryNotEqualTo(0);
        pagesExample.setOrderByClause("entry DESC");
        break;
      case "exit": //只查出站，也就是exit不为0
        criteria.andExitNotEqualTo(0);
        pagesExample.setOrderByClause("exit DESC");
        break;
      case "all":
        pagesExample.setOrderByClause("pages DESC");
        break;
    }
    PageHelper.startPage(number, size);

    List<Pages> pages = pagesMapper.selectByExample(pagesExample);

    PageInfo<Pages> pageInfo = new PageInfo<>(pages);

    return pageInfo;
  }
}
