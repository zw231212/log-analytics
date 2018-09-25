package cn.org.escience.log.api.config;

import cn.org.escience.log.api.utils.PropertyLoaderUtil;
import java.util.Properties;

public class ApplicationConfiguration {
  
  private static final String APP_CONFIG_NAME = "/application.properties";

  private static Properties properties = PropertyLoaderUtil.load(APP_CONFIG_NAME);



  /**
   * 根据属性名或者属性值
   * @param key properties文件中的属性名
   * @return value properties文件中的属性值
   */
  public static String get(String key) {
    return properties.getProperty(key);
  }

}
