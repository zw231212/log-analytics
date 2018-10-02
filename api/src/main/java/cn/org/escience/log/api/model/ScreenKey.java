/*
*
* ScreenKey.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
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