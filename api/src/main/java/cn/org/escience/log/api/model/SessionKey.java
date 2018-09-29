/*
*
* SessionKey.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.model;

public class SessionKey {
    /**
     * 
     */
    private String yearMonth;

    /**
     * 
     */
    private String range;

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
     * @return range 
     */
    public String getRange() {
        return range;
    }

    /**
     * 
     * @param range 
     */
    public void setRange(String range) {
        this.range = range == null ? null : range.trim();
    }
}