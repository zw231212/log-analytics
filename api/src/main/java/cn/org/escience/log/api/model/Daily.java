/*
*
* Daily.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.model;

public class Daily {
    /**
     * 
     */
    private String day;

    /**
     * 
     */
    private Integer visits;

    /**
     * 
     */
    private Integer pages;

    /**
     * 
     */
    private Integer hits;

    /**
     * 
     */
    private Long bandwidth;

    /**
     * 
     * @return day 
     */
    public String getDay() {
        return day;
    }

    /**
     * 
     * @param day 
     */
    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
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

    /**
     * 
     * @return pages 
     */
    public Integer getPages() {
        return pages;
    }

    /**
     * 
     * @param pages 
     */
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    /**
     * 
     * @return hits 
     */
    public Integer getHits() {
        return hits;
    }

    /**
     * 
     * @param hits 
     */
    public void setHits(Integer hits) {
        this.hits = hits;
    }

    /**
     * 
     * @return bandwidth 
     */
    public Long getBandwidth() {
        return bandwidth;
    }

    /**
     * 
     * @param bandwidth 
     */
    public void setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
    }
}