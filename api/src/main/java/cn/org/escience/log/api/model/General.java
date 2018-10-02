/*
*
* General.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.model;

public class General {
    /**
     * 
     */
    private String yearMonth;

    /**
     * 
     */
    private Integer visits;

    /**
     * 
     */
    private Integer visitsUnique;

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
    private Integer pagesNv;

    /**
     * 
     */
    private Integer hitsNv;

    /**
     * 
     */
    private Long bandwidthNv;

    /**
     * 
     */
    private Integer hostsKnown;

    /**
     * 
     */
    private Integer hostsUnknown;

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
     * @return visits 
     */
    public Integer getVisits() {
        return visits;
    }

    /**
     * 
     * @param visits 
     */
    public void setVisits(Integer visits) {
        this.visits = visits;
    }

    /**
     * 
     * @return visits_unique 
     */
    public Integer getVisitsUnique() {
        return visitsUnique;
    }

    /**
     * 
     * @param visitsUnique 
     */
    public void setVisitsUnique(Integer visitsUnique) {
        this.visitsUnique = visitsUnique;
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
     * @return pages_nv 
     */
    public Integer getPagesNv() {
        return pagesNv;
    }

    /**
     * 
     * @param pagesNv 
     */
    public void setPagesNv(Integer pagesNv) {
        this.pagesNv = pagesNv;
    }

    /**
     * 
     * @return hits_nv 
     */
    public Integer getHitsNv() {
        return hitsNv;
    }

    /**
     * 
     * @param hitsNv 
     */
    public void setHitsNv(Integer hitsNv) {
        this.hitsNv = hitsNv;
    }

    /**
     * 
     * @return bandwidth_nv 
     */
    public Long getBandwidthNv() {
        return bandwidthNv;
    }

    /**
     * 
     * @param bandwidthNv 
     */
    public void setBandwidthNv(Long bandwidthNv) {
        this.bandwidthNv = bandwidthNv;
    }

    /**
     * 
     * @return hosts_known 
     */
    public Integer getHostsKnown() {
        return hostsKnown;
    }

    /**
     * 
     * @param hostsKnown 
     */
    public void setHostsKnown(Integer hostsKnown) {
        this.hostsKnown = hostsKnown;
    }

    /**
     * 
     * @return hosts_unknown 
     */
    public Integer getHostsUnknown() {
        return hostsUnknown;
    }

    /**
     * 
     * @param hostsUnknown 
     */
    public void setHostsUnknown(Integer hostsUnknown) {
        this.hostsUnknown = hostsUnknown;
    }
}