package cn.org.escience.log.api.utils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ServiceUtil {

  /**
   * 检查输入的日期
   * @param dates
   * @return
   */
  public static List<String> checkDates(List<String> dates){
    if(dates == null){
      dates = new ArrayList<>();
    }
    if(dates.size() == 0){
      Calendar calendar = Calendar.getInstance();
      int year = calendar.get(Calendar.YEAR);
      int month = calendar.get(Calendar.MONTH);
      dates.add(year+""+month);
    }
    return dates;
  }

}
