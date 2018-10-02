/*
*
* Filetypes.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.model;

public class Filetypes extends FiletypesKey {
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