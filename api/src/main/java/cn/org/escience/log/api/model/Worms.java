/*
*
* Worms.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.model;

public class Worms {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String text;

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
     */
    private String lastvisit;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return text 
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text 
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
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

    /**
     * 
     * @return lastvisit 
     */
    public String getLastvisit() {
        return lastvisit;
    }

    /**
     * 
     * @param lastvisit 
     */
    public void setLastvisit(String lastvisit) {
        this.lastvisit = lastvisit == null ? null : lastvisit.trim();
    }
}