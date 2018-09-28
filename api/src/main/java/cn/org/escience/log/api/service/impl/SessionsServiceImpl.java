package cn.org.escience.log.api.service.impl;

import cn.org.escience.log.api.mapper.SessionMapper;
import cn.org.escience.log.api.model.Session;
import cn.org.escience.log.api.model.SessionExample;
import cn.org.escience.log.api.service.BaseService;
import cn.org.escience.log.api.service.SessionsService;
import cn.org.escience.log.api.utils.ServiceUtil;
import java.util.List;

public class SessionsServiceImpl extends BaseService implements SessionsService {

  private SessionMapper sessionMapper = sqlSession.getMapper(SessionMapper.class);

  public SessionsServiceImpl(String database) {
    super(database);
  }

  @Override
  public List<Session> findAll(List<String> dates) {
    dates = ServiceUtil.checkDates(dates);
    SessionExample sessionExample = new SessionExample();
    sessionExample.setOrderByClause("hits DESC");
    List<Session> sessions = sessionMapper.selectByExample(sessionExample);
    return sessions;
  }
}
