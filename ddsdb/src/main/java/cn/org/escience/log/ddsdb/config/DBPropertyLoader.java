package cn.org.escience.log.ddsdb.config;

import java.io.InputStream;
import java.util.Properties;

public class DBPropertyLoader {

  private static final String DB_CONFIG_NAME = "/db.properties";

  private static Properties properties = new Properties();

  static {
    try{
      // 使用ClassLoader加载properties配置文件生成对应的输入流
      InputStream in =DBPropertyLoader.class.getResource(DB_CONFIG_NAME).openStream();
      // 使用properties对象加载输入流
      properties.load(in);
    }catch (Exception e){
      e.printStackTrace();
    }
  }



  /**
   * 根据属性名或者属性值
   * @param key properties文件中的属性名
   * @return value properties文件中的属性值
   */
  public static String get(String key) {
    return properties.getProperty(key);
  }

  public static void main(String[] args) {
    String host = get("host");
    System.out.println(host);
  }

}
