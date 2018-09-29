/*
*
* ScreenKey.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.model;

public class ScreenKey {
    /**
     * 
     */
    private String yearMonth;

    /**
     * 
     */
    private String size;

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
     * @return size 
     */
    public String getSize() {
        return size;
    }

    /**
     * 
     * @param size 
     */
    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }
}