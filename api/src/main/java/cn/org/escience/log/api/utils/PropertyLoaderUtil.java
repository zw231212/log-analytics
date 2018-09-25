package cn.org.escience.log.api.utils;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class PropertyLoaderUtil {

  public static Properties load(String resourcePath){
    try{
      // 使用ClassLoader加载properties配置文件生成对应的输入流
      InputStream in = PropertyLoaderUtil.class.getResourceAsStream(resourcePath);
      InputStreamReader isr = new InputStreamReader(in, "UTF-8");
      // 使用properties对象加载输入流
      Properties properties = new Properties();
      properties.load(isr);
      return properties;
    }catch (Exception e){
      e.printStackTrace();
    }
    return null;
  }

  public static void main(String[] args) {
    Properties prop = load("/application.properties");
    System.out.println("哈哈哈！");
    Enumeration<?> names = prop.propertyNames();
    while (names.hasMoreElements()){
      Object key = names.nextElement();
      System.out.print(key+"::");
      System.out.println(prop.getProperty(key.toString()));
    }
    System.out.println(new HashMap<>(prop));
  }


}
