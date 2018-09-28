package cn.org.escience.log.api.service.impl;

import cn.org.escience.log.api.mapper.OsMapper;
import cn.org.escience.log.api.mapper.UnkosMapper;
import cn.org.escience.log.api.model.Os;
import cn.org.escience.log.api.model.OsExample;
import cn.org.escience.log.api.service.BaseService;
import cn.org.escience.log.api.service.OsService;
import cn.org.escience.log.api.utils.ServiceUtil;
import cn.org.escience.log.api.web.entity.vo.OsVo;
import java.util.List;

public class OsServiceImpl extends BaseService implements OsService {

  private OsMapper osMapper = sqlSession.getMapper(OsMapper.class);
  private UnkosMapper unkosMapper = sqlSession.getMapper(UnkosMapper.class);

  public OsServiceImpl(String database) {
    super(database);
  }


  @Override
  public OsVo findAll(List<String> dates) {
    dates = ServiceUtil.checkDates(dates);
    OsExample osExample = new OsExample();
    osExample.createCriteria().andYearMonthIn(dates);
    osExample.setOrderByClause("hits DESC");

    List<Os> oses = osMapper.selectByExample(osExample);

    OsVo osVo = new OsVo();
    osVo.setKnown(oses);

    //查询位置的

    return null;
  }
}
