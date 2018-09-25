/*
*
* Screen.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.model;

public class Screen {
    /**
     * 
     */
    private String size;

    /**
     * 
     */
    private Integer hits;

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