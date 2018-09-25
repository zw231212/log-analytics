/*
*
* Origin.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.model;

public class Origin {
    /**
     * 
     */
    private String from;

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
}