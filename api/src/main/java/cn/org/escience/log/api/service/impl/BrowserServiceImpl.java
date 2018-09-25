package cn.org.escience.log.api.service.impl;

import cn.org.escience.log.api.mapper.BrowserMapper;
import cn.org.escience.log.api.model.Browser;
import cn.org.escience.log.api.model.BrowserExample;
import cn.org.escience.log.api.service.BaseService;
import cn.org.escience.log.api.service.BrowserService;
import java.util.List;

public class BrowserServiceImpl extends BaseService implements BrowserService {

  private BrowserMapper browserMapper = sqlSession.getMapper(BrowserMapper.class);

  public BrowserServiceImpl(String database) {
    super(database);
  }

  @Override
  public List<Browser> findAll() {
    System.out.println("findAll运行");
    BrowserExample browserExample = new BrowserExample();
    System.out.println(browserExample);
    return browserMapper.selectByExample(browserExample);
  }
}
