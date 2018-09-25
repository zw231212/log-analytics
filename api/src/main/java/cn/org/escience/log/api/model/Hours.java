/*
*
* Hours.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.model;

public class Hours {
    /**
     * 
     */
    private Byte hour;

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