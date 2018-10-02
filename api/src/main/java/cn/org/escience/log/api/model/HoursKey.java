/*
*
* HoursKey.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.model;

public class HoursKey {
    /**
     * 
     */
    private String yearMonth;

    /**
     * 
     */
    private Byte hour;

    /**
     * 
     * @return year_month 
     */
    public String getYearMonth() {
        return yearMonth;
    }

    /**
     * 
     * @param yearMonth 
     */
    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth == null ? null : yearMonth.trim();
    }

    /**
     * 
     * @return hour 
     */
    public Byte getHour() {
        return hour;
    }

    /**
     * 
     * @param hour 
     */
    public void setHour(Byte hour) {
        this.hour = hour;
    }
}