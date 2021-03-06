package cn.org.escience.log.api.service.impl;

import cn.org.escience.log.api.mapper.BrowserMapper;
import cn.org.escience.log.api.mapper.UnkbrowserMapper;
import cn.org.escience.log.api.model.Browser;
import cn.org.escience.log.api.model.BrowserExample;
import cn.org.escience.log.api.service.BaseService;
import cn.org.escience.log.api.service.BrowserService;
import cn.org.escience.log.api.utils.ServiceUtil;
import cn.org.escience.log.api.web.entity.vo.BrowserVo;
import java.util.List;

public class BrowserServiceImpl extends BaseService implements BrowserService {

  private BrowserMapper browserMapper = sqlSession.getMapper(BrowserMapper.class);
  private UnkbrowserMapper unkbrowserMapper = sqlSession.getMapper(UnkbrowserMapper.class);

  public BrowserServiceImpl(String database) {
    super(database);
  }

  @Override
  public BrowserVo findAll(List<String> dates) {
    dates = ServiceUtil.checkDates(dates);
    BrowserExample browserExample = new BrowserExample();
//    Criteria criteria = browserExample.createCriteria();
//    for (String date : dates) {
//        if(StringUtil.isNullOrBlank(date)){
//          continue;
//        }
//        criteria.andYearMonthEqualTo(date);
//    }
//    browserExample.or(criteria);
    browserExample.createCriteria().andYearMonthIn(dates);
    browserExample.setOrderByClause("hits DESC");
    List<Browser> browsers = browserMapper.selectByExample(browserExample);
    BrowserVo browserVO = new BrowserVo();
    browserVO.setKnown(browsers);
    //查询unkbrowser相关的信息

    return browserVO;
  }
}
