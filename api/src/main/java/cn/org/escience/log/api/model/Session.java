/*
*
* Session.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.model;

public class Session {
    /**
     * 
     */
    private String range;

    /**
     * 
     */
    private Integer visits;

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

    /**
     * 
     * @return visits 
     */
    public Integer getVisits() {
        return visits;
    }

    /**
     * 
     * @param visits 
     */
    public void setVisits(Integer visits) {
        this.visits = visits;
    }
}