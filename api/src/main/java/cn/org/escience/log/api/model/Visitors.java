/*
*
* Visitors.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.model;

public class Visitors {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String host;

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
     */
    private String lastvisit;

    /**
     * 
     */
    private String startlastvisit;

    /**
     * 
     */
    private String lastpage;

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
     * @return host 
     */
    public String getHost() {
        return host;
    }

    /**
     * 
     * @param host 
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
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
     * @return startlastvisit 
     */
    public String getStartlastvisit() {
        return startlastvisit;
    }

    /**
     * 
     * @param startlastvisit 
     */
    public void setStartlastvisit(String startlastvisit) {
        this.startlastvisit = startlastvisit == null ? null : startlastvisit.trim();
    }

    /**
     * 
     * @return lastpage 
     */
    public String getLastpage() {
        return lastpage;
    }

    /**
     * 
     * @param lastpage 
     */
    public void setLastpage(String lastpage) {
        this.lastpage = lastpage == null ? null : lastpage.trim();
    }
}