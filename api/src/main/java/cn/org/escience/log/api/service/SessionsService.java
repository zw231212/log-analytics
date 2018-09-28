package cn.org.escience.log.api.service;

import cn.org.escience.log.api.model.Session;
import java.util.List;

public interface SessionsService {

  List<Session> findAll(List<String> dates);
}
