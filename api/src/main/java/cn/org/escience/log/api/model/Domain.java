/*
*
* Domain.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.model;

public class Domain {
    /**
     * 
     */
    private String code;

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
     * @return code 
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code 
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
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