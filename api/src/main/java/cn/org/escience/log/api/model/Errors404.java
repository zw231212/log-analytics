/*
*
* Errors404.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
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
    private String yearMonth;

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