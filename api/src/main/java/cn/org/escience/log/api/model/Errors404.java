/*
*
* Errors404.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.model;

public class Errors404 {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String url;

    /**
     * 
     */
    private Integer hits;

    /**
     * 
     */
    private String referer;

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
     * @return url 
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url 
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
     * @return referer 
     */
    public String getReferer() {
        return referer;
    }

    /**
     * 
     * @param referer 
     */
    public void setReferer(String referer) {
        this.referer = referer == null ? null : referer.trim();
    }
}