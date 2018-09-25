package cn.org.escience.log.ddsdb;

import cn.org.escience.log.ddsdb.utils.FormatUtil;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class FormatUtilTest {

  @Test
  public void testFormat(){
      String str = "我是{name},我来自{city},今年{age}岁";
      Map<String, String> mapstring = new HashMap<>();
      mapstring.put("name", "小明");
      mapstring.put("age", "15");
      mapstring.put("city", "北京");

      for (Map.Entry<String, String> entry : mapstring.entrySet()) {
        str = str.replace("{" + entry.getKey() + "}", entry.getValue());
      }

      System.out.println("我是小明,我来自北京,今年15岁");
      System.out.println(str);
  }

  @Test
  public void test2(){
    String str = "我是{name},我来自{city},今年{age}岁,{name}";
    Map<String,Object> mapstring = new HashMap<>();
    mapstring.put("name", "小明");
    mapstring.put("age", "15");
    mapstring.put("city", "北京");
    String result = FormatUtil.stringFormat(str, mapstring);
    System.out.println(result);
  }


}
