package cn.org.escience.log.api.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 服务管理类，对服务进行管理，整个服务管理是单例的
 */
public class ServiceManager {

  private static final Logger logger = LoggerFactory.getLogger(ServiceManager.class);

  /**
   * 服务管理类里面的服务的数据存储容器
   */
  private static Map<String, Map<Class,BaseService>> services = new HashMap<>();

  private static List<SqlSession> releaseSessions = new ArrayList<>();

  /**
   * 整个管理类只能有一个实例
   */
  private ServiceManager(){ }

  public static ServiceManager getInstance(){
    return ServiceManagerHolder.smInstance;
  }

  private static class ServiceManagerHolder{
    private static final ServiceManager smInstance = new ServiceManager();
  }

  /**
   * 检查服务里是否存在相关的数据库，也就是是否被初始化了
   * @param key
   * @return
   */
  public boolean checkApiServices(String key){
    return services.containsKey(key);
  }

  /**
   * 获取服务管理类
   * @param key
   * @return
   */
  public BaseService getService(String key,Class clazz){
    Map<Class, BaseService> apiServices = services.get(key);
    if(apiServices == null || apiServices.size() == 0){
      return null;
    }
    return apiServices.get(clazz);
  }

  /**
   * 添加服务到管理类
   * @param key
   * @param service
   * @return
   */
  public boolean putService(String key, Class clazz, BaseService service){
    if(key == null || "".equals(key.trim()) ){
      logger.warn("the service key is null or empty!");
      return false;
    }
    boolean result = services.containsKey(key);
    if(result){
      logger.info("the service is in service manager!");
      return false;
    }
    if(clazz == null){
      logger.warn("service class is null!");
      return false;
    }
    if(service == null){
      logger.warn("service is null ,can not put into the services manager!");
      return false;
    }

    Map<Class, BaseService> serviceMap = services.get(key);
    if(serviceMap == null){
      serviceMap = new HashMap<>();
    }
    serviceMap.put(clazz,service);
    services.put(key, serviceMap);
    return true;
  }

  /**
   * 添加待释放的SQL session
   * @param sqlSession
   */
  public void addRelaseSession(SqlSession sqlSession){
    releaseSessions.add(sqlSession);
  }

  /**
   * 获取全部的待释放的sql session
   * @return
   */
  public List<SqlSession> getReleaseSessions() {
    return releaseSessions;
  }

  /**
   * 释放资源
   * @param sqlSession
   */
  public void releaseSession(SqlSession sqlSession){
    try {
      if(sqlSession != null){
        sqlSession.close();
      }
    }  catch (Exception e){
      e.printStackTrace();
    }
  }


  /**
   * 释放资源并情况待情况列表
   */
  public void releaseAllSessions(){
    if(releaseSessions.size() == 0){
      return;
    }
    logger.debug("released all added sql sessions!");
    releaseSessions.forEach(this::releaseSession);
    releaseSessions.clear();
  }


}
