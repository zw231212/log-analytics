/*
*
* OriginKey.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
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