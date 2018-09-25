/*
*
* Robot.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.model;

public class Robot {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

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
     */
    private Integer hitsrobots;

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
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    /**
     * 
     * @return hitsrobots 
     */
    public Integer getHitsrobots() {
        return hitsrobots;
    }

    /**
     * 
     * @param hitsrobots 
     */
    public void setHitsrobots(Integer hitsrobots) {
        this.hitsrobots = hitsrobots;
    }
}