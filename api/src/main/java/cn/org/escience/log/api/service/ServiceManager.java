package cn.org.escience.log.api.service;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceManager {

  private static final Logger logger = LoggerFactory.getLogger(ServiceManager.class);

  private static Map<String,BaseService> services = new HashMap<>();

  private ServiceManager(){ }

  public static ServiceManager getInstance(){
    return ServiceManagerHolder.smInstance;
  }

  private static class ServiceManagerHolder{
    private static final ServiceManager smInstance = new ServiceManager();
  }

  public BaseService getService(String key){

    return services.get(key);
  }

  public boolean putService(String key, BaseService service){
    if(key == null || "".equals(key.trim())){
      logger.warn("the service key is null or empty!");
      return false;
    }
    boolean result = services.containsKey(key);
    if(result){
      logger.info("the service is in service manager!");
      return false;
    }
    if(service == null){
      logger.warn("service is null ,can not put into the services manager!");
      return false;
    }
    services.put(key, service);
    return true;
  }

}
