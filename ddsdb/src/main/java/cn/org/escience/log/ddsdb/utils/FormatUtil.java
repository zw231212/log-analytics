package cn.org.escience.log.ddsdb.utils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatUtil {

  //替换字符串中{}中的占位符，默认的格式
  private static final Pattern DEFAULT_PATTERN = Pattern.compile("\\{(.*?)\\}");
  private static Matcher matcher;


  /**
   * 格式化字符串 字符串中使用{key}表示占位符
   * @param source 需要匹配的字符串
   * @param params 参数集
   * @return
   */
  public static String stringFormat(String source, Map<String, Object> params) {
    String tagerStr = source;
    if (params == null){
      return tagerStr;
    }
    matcher = DEFAULT_PATTERN.matcher(tagerStr);
    while (matcher.find()) {
      String key = matcher.group();
      String keyclone = key.substring(1, key.length() - 1).trim();
      Object value = params.get(keyclone);
      if (value != null){
        tagerStr = tagerStr.replace(key, value.toString());
      }
    }
    return tagerStr;
  }

  /**
   * 格式化字符串 字符串中使用{key}表示占位符 利用反射 自动获取对象属性值 (必须有get方法)
   * @param sourStr 需要匹配的字符串
   * @param obj 参数对象
   * @return
   */
  public static String objectFormat(String sourStr, Object obj) {
    String tagerStr = sourStr;
    if (obj == null){
      return tagerStr;
    }
    matcher = DEFAULT_PATTERN.matcher(tagerStr);
    PropertyDescriptor pd;
    Method getMethod;
    // 匹配{}中间的内容 包括括号
    while (matcher.find()) {
      String key = matcher.group();
      String keyclone = key.substring(1, key.length() - 1).trim();
      try {
        pd = new PropertyDescriptor(keyclone, obj.getClass());
        // 获得get方法
        getMethod = pd.getReadMethod();
        Object value = getMethod.invoke(obj);
        if (value != null){
          tagerStr = tagerStr.replace(key, value.toString());
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return tagerStr;
  }
  /**
   * 格式化字符串 (替换所有) 字符串中使用{key}表示占位符
   * @param sourStr 需要匹配的字符串
   * @param params 参数集
   * @return
   */
//  public static String stringFormatAll(String sourStr, Map<String, Object> params) {
//    String tagerStr = sourStr;
//    if (params == null){
//      return tagerStr;
//    }
//    matcher = DEFAULT_PATTERN.matcher(tagerStr);
//    while (matcher.find()) {
//      String key = matcher.group();
//      String keyclone = key.substring(1, key.length() - 1).trim();
//      Object value = params.get(keyclone);
//      if (value != null){
//        tagerStr = tagerStr.replace(key, value.toString());
//      }
//    }
//    return tagerStr;
//  }

}
