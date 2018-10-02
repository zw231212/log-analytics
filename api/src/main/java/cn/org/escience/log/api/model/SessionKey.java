/*
*
* SessionKey.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
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