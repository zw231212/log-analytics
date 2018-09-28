package cn.org.escience.log.api.utils;

import cn.org.escience.log.ddsdb.utils.StringUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtil {

  public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
  public static final String MINUTE_PATTERN = "yyyy-MM-dd HH:mm";
  public static final String HOUR_PATTERN = "yyyy-MM-dd HH:mm:ss";
  public static final String DATE_PATTERN = "yyyy-MM-dd";
  public static final String MONTH_PATTERN = "yyyy-MM";
  public static final String YEAR_PATTERN = "yyyy";
  public static final String MINUTE_ONLY_PATTERN = "mm";
  public static final String HOUR_ONLY_PATTERN = "HH";


  /**
   * 根据其实时间参数和offset来获取这之间的全部的全部日期
   * @param begin  其实时间
   * @param offset  偏移信息量
   * @param type    时间类型
   * @return
   */
  public static List<String> getDates(String begin,Integer offset,String type){
    if(StringUtil.isNullOrBlank(type)){
      type = "month";
    }
    Date dateBegin = getDateByType(begin, type);
    System.out.println(dateBegin);
    List<String> results = new ArrayList<>();
    switch (type){
      case "year":
        Date end = dateAddYears(dateBegin, offset);
        try{
          List<Date> yearsBetween = getYearsBetween(dateBegin, end);
          for (Date date1 : yearsBetween) {
            results.add(dateFormat(date1, YEAR_PATTERN).replaceAll("-",""));
          }
        } catch (Exception e){
          e.printStackTrace();
        }
        break;
      case "month":
        end = dateAddMonths(dateBegin, offset);
        try{
          List<Date> yearsBetween = getMonthsBetween(dateBegin, end);
          for (Date date1 : yearsBetween) {
            results.add(dateFormat(date1, MONTH_PATTERN).replaceAll("-",""));
          }
        } catch (Exception e){
          e.printStackTrace();
        }
        break;
      case "day":
        end = dateAddDays(dateBegin, offset);
        try{
          List<Date> yearsBetween = getDatesBetween(dateBegin, end);
          for (Date date1 : yearsBetween) {
            results.add(dateFormat(date1, DATE_PATTERN).replaceAll("-",""));
          }
        } catch (Exception e){
          e.printStackTrace();
        }
        break;
    }
    return results;
  }

  /**
   * 根据日期字符串数据类型获取日期
   * @param dateStr
   * @param type
   * @return
   */
  public static Date getDateByType(String dateStr, String type){
    if(StringUtil.isNullOrBlank(type)){
      return new Date();
    }
    type = type.toLowerCase();
    Date date = null;
    switch (type){
      case "year":
        date = parseDateStr(dateStr,YEAR_PATTERN);
        break;
      case "month":
        date = parseDateStr(dateStr,MONTH_PATTERN);
        break;
      case "day":
        date = parseDateStr(dateStr,DATE_PATTERN);
        break;
    }
    return  date;
  }

  public static Date parseDateStr(String dateStr, String pattern){
    if(StringUtil.isNullOrBlank(pattern)){
      pattern = DATE_PATTERN;
    }
    SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
    try {
      Date date = dateFormat.parse(dateStr);
      return date;
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * 时间格式化成字符串
   * @param date Date
   * @param pattern StrUtils.DATE_TIME_PATTERN || StrUtils.DATE_PATTERN， 如果为空，则为yyyy-MM-dd
   * @return
   * @throws ParseException
   */
  public static String dateFormat(Date date, String pattern) {
    if(StringUtil.isNullOrBlank(pattern)){
      pattern = DATE_PATTERN;
    }
    SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    return sdf.format(date);
  }

  /**
   * 字符串解析成时间对象
   * @param dateTimeString String
   * @param pattern StrUtils.DATE_TIME_PATTERN || StrUtils.DATE_PATTERN，如果为空，则为yyyy-MM-dd
   * @return
   * @throws ParseException
   */
  public static Date dateParse(String dateTimeString, String pattern) throws ParseException{
    if(StringUtil.isNullOrBlank(pattern)){
      pattern = DATE_PATTERN;
    }
    SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    return sdf.parse(dateTimeString);
  }

  /**
   * 时间加减天数
   * @param startDate 要处理的时间，Null则为当前时间
   * @param days 加减的天数
   * @return Date
   */
  public static Date dateAddDays(Date startDate, int days) {
    if (startDate == null) {
      startDate = new Date();
    }
    Calendar c = Calendar.getInstance();
    c.setTime(startDate);
    c.set(Calendar.DATE, c.get(Calendar.DATE) + days);
    return c.getTime();
  }

  /**
   * 时间加减月数
   * @param startDate 要处理的时间，Null则为当前时间
   * @param months 加减的月数
   * @return Date
   */
  public static Date dateAddMonths(Date startDate, int months) {
    if (startDate == null) {
      startDate = new Date();
    }
    Calendar c = Calendar.getInstance();
    c.setTime(startDate);
    c.set(Calendar.MONTH, c.get(Calendar.MONTH) + months);
    return c.getTime();
  }

  /**
   * 时间加减年数
   * @param startDate 要处理的时间，Null则为当前时间
   * @param years 加减的年数
   * @return Date
   */
  public static Date dateAddYears(Date startDate, int years) {
    if (startDate == null) {
      startDate = new Date();
    }
    Calendar c = Calendar.getInstance();
    c.setTime(startDate);
    c.set(Calendar.YEAR, c.get(Calendar.YEAR) + years);
    return c.getTime();
  }

  /**
   * 时间比较（如果myDate>compareDate返回1，<返回-1，相等返回0）
   * @param myDate 时间
   * @param compareDate 要比较的时间
   * @return int
   */
  public static int dateCompare(Date myDate, Date compareDate) {
    Calendar myCal = Calendar.getInstance();
    Calendar compareCal = Calendar.getInstance();
    myCal.setTime(myDate);
    compareCal.setTime(compareDate);
    return myCal.compareTo(compareCal);
  }

  /**
   * 获取两个时间中最小的一个时间
   * @param date
   * @param compareDate
   * @return
   */
  public static Date dateMin(Date date, Date compareDate) {
    if(date == null){
      return compareDate;
    }
    if(compareDate == null){
      return date;
    }
    if(1 == dateCompare(date, compareDate)){
      return compareDate;
    }else if(-1 == dateCompare(date, compareDate)){
      return date;
    }
    return date;
  }

  /**
   * 获取两个时间中最大的一个时间
   * @param date
   * @param compareDate
   * @return
   */
  public static Date dateMax(Date date, Date compareDate) {
    if(date == null){
      return compareDate;
    }
    if(compareDate == null){
      return date;
    }
    if(1 == dateCompare(date, compareDate)){
      return date;
    }else if(-1 == dateCompare(date, compareDate)){
      return compareDate;
    }
    return date;
  }

  /**
   * 获取两个日期（不含时分秒）相差的天数，不包含今天
   * @param startDate
   * @param endDate
   * @return
   * @throws ParseException
   */
  public static int dateBetween(Date startDate, Date endDate) throws ParseException {
    Date dateStart = dateParse(dateFormat(startDate, DATE_PATTERN), DATE_PATTERN);
    Date dateEnd = dateParse(dateFormat(endDate, DATE_PATTERN), DATE_PATTERN);
    return (int) ((dateEnd.getTime() - dateStart.getTime())/1000/60/60/24);
  }

  /**
   * 获取两个日期（不含时分秒）相差的天数，包含今天
   * @param startDate
   * @param endDate
   * @return
   * @throws ParseException
   */
  public static int dateBetweenIncludeToday(Date startDate, Date endDate) throws ParseException {
    return dateBetween(startDate, endDate) + 1;
  }

  /**
   * 获取日期时间的年份，如2017-02-13，返回2017
   * @param date
   * @return
   */
  public static int getYear(Date date) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    return cal.get(Calendar.YEAR);
  }

  /**
   * 获取日期时间的月份，如2017年2月13日，返回2
   * @param date
   * @return
   */
  public static int getMonth(Date date) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    return cal.get(Calendar.MONTH) + 1;
  }

  /**
   * 获取日期时间的第几天（即返回日期的dd），如2017-02-13，返回13
   * @param date
   * @return
   */
  public static int getDate(Date date) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    return cal.get(Calendar.DATE);
  }

  /**
   * 获取日期时间当月的总天数，如2017-02-13，返回28
   * @param date
   * @return
   */
  public static int getDaysOfMonth(Date date) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    return cal.getActualMaximum(Calendar.DATE);
  }

  /**
   * 获取日期时间当年的总天数，如2017-02-13，返回2017年的总天数
   * @param date
   * @return
   */
  public static int getDaysOfYear(Date date) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    return cal.getActualMaximum(Calendar.DAY_OF_YEAR);
  }

  /**
   * 根据时间获取当月最大的日期
   * <li>2017-02-13，返回2017-02-28</li>
   * <li>2016-02-13，返回2016-02-29</li>
   * <li>2016-01-11，返回2016-01-31</li>
   * @param date Date
   * @return
   * @throws Exception
   */
  public static Date maxDateOfMonth(Date date) throws Exception {
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    int value = cal.getActualMaximum(Calendar.DATE);
    return dateParse(dateFormat(date, MONTH_PATTERN) + "-" + value, null);
  }

  /**
   * 获取两个日期之间的全部日期
   * @param startDate
   * @param endDate
   * @return
   * @throws Exception
   */
  public static List<Date> getDatesBetween(Date startDate, Date endDate) throws Exception {
    if (startDate.compareTo(endDate) > 0){
      throw new Exception("开始时间应该在结束时间之后");
    }
    Long spi = endDate.getTime() - startDate.getTime();
    Long step = spi / (24 * 60 * 60 * 1000);// 相隔天数
    List<Date> dateList = new ArrayList<Date>();
    dateList.add(endDate);
    for (int i = 1; i <= step; i++) {
      dateList.add(
        new Date(
          dateList.get(i - 1).getTime()- (24 * 60 * 60 * 1000)
        )
      );// 比上一天减一
     }
     return dateList;
  }
  /**
   * 获取两个日期之间的所有日期（yyyy-MM-dd）
   * @param begin
   * @param end
   * @return
   * @author XuJD
   * @date 2017-4-1
   */
  public static List<Date> getDatesBetween2(Date begin, Date end) {
    List<Date> result = new ArrayList<>();
    Calendar tempStart = Calendar.getInstance();
    tempStart.setTime(begin);
    while(begin.getTime()<=end.getTime()){
      result.add(tempStart.getTime());
      tempStart.add(Calendar.DAY_OF_YEAR, 1);
      begin = tempStart.getTime();
    }
    return result;
  }

  /**
   * 获取两个时间之间的全部月份
   * @param minDate
   * @param maxDate
   * @return
   * @throws ParseException
   */
  public static List<String> getMonthsBetween(String minDate, String maxDate) throws ParseException {
    List<String> result = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");//格式化为年月
    Calendar min = Calendar.getInstance();
    Calendar max = Calendar.getInstance();
    min.setTime(sdf.parse(minDate));
    min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);
    max.setTime(sdf.parse(maxDate));
    max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);
    Calendar curr = min;
    while (curr.before(max)) {
      result.add(sdf.format(curr.getTime()));
      curr.add(Calendar.MONTH, 1);
    }
    return result;
  }

  /**
   * 获取两个时间之间的全部年份
   * @param minDate
   * @param maxDate
   * @return
   * @throws ParseException
   */
  public static List<Date> getYearsBetween(Date minDate, Date maxDate) throws Exception {
    if (minDate.compareTo(maxDate) > 0 ){
      throw new Exception("开始时间应该在结束时间之后");
    }
    List<Date> result = new ArrayList<>();
    Calendar tempStart = Calendar.getInstance();
    tempStart.setTime(minDate);
    while(minDate.getTime() <= maxDate.getTime()){
      result.add(tempStart.getTime());
      tempStart.add(Calendar.YEAR, 1);
      minDate = tempStart.getTime();
    }
    return result;
  }

  /**
   * 获取两个时间之间的全部年份
   * @param minDate
   * @param maxDate
   * @return
   * @throws ParseException
   */
  public static List<Date> getMonthsBetween(Date minDate, Date maxDate) throws Exception {
    if (minDate.compareTo(maxDate) > 0){
      throw new Exception("开始时间应该在结束时间之后");
    }
    List<Date> result = new ArrayList<>();
    Calendar tempStart = Calendar.getInstance();
    tempStart.setTime(minDate);
    while(minDate.getTime() <= maxDate.getTime()){
      result.add(tempStart.getTime());
      tempStart.add(Calendar.MONTH, 1);
      minDate = tempStart.getTime();
    }
    return result;
  }




  public static void main(String[] args) throws Exception {
    String dateStr = "2018-07-02";
//    String dateStr2 = "2017-07-02";
//    Date date = parseDateStr(dateStr, MONTH_PATTERN);
//    System.out.println(date);
//    List<String> monthBetween = getMonthsBetween(dateStr2, dateStr);
//
//    Date date1 = dateParse("2016-09", MONTH_PATTERN);
//    Date date2 = dateParse("2018-09", MONTH_PATTERN);
//
//    System.out.println(monthBetween);
//    System.out.println(getYearsBetween(date1,date2));
//    System.out.println(getMonthsBetween(date1,date2));

    List<String> year = getDates(dateStr, 3, "year");
    List<String> month = getDates(dateStr, 10, "month");
    List<String> day = getDates(dateStr, 30, "day");
    System.out.println(year);
    System.out.println(month);
    System.out.println(day);
  }

  public static String getNow() {
    return dateFormat(new Date(), DATE_PATTERN);
  }
}
