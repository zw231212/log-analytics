/*
*
* Filetypes.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.model;

public class Filetypes {
    /**
     * 
     */
    private String type;

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
    private Long bwwithoutcompress;

    /**
     * 
     */
    private Long bwaftercompress;

    /**
     * 
     * @return type 
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type 
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
     * @return bwwithoutcompress 
     */
    public Long getBwwithoutcompress() {
        return bwwithoutcompress;
    }

    /**
     * 
     * @param bwwithoutcompress 
     */
    public void setBwwithoutcompress(Long bwwithoutcompress) {
        this.bwwithoutcompress = bwwithoutcompress;
    }

    /**
     * 
     * @return bwaftercompress 
     */
    public Long getBwaftercompress() {
        return bwaftercompress;
    }

    /**
     * 
     * @param bwaftercompress 
     */
    public void setBwaftercompress(Long bwaftercompress) {
        this.bwaftercompress = bwaftercompress;
    }
}