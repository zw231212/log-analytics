package cn.org.escience.log.api.service;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 服务管理类，对服务进行管理
 */
public class ServiceManager {

  private static final Logger logger = LoggerFactory.getLogger(ServiceManager.class);

  //服务管理类里面的服务的数据存储容器
  private static Map<String, Map<Class,BaseService>> services = new HashMap<>();

  //整个管理类只能有一个实例
  private ServiceManager(){ }

  public static ServiceManager getInstance(){
    return ServiceManagerHolder.smInstance;
  }

  private static class ServiceManagerHolder{
    private static final ServiceManager smInstance = new ServiceManager();
  }

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

}
