/*
*
* OriginKey.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.model;

public class OriginKey {
    /**
     * 
     */
    private String yearMonth;

    /**
     * 
     */
    private String from;

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
     * @return from 
     */
    public String getFrom() {
        return from;
    }

    /**
     * 
     * @param from 
     */
    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }
}