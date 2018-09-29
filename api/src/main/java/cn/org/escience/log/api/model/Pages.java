/*
*
* Pages.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.model;

public class Pages {
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
    private Integer pages;

    /**
     * 
     */
    private Long bandwidth;

    /**
     * 
     */
    private Integer entry;

    /**
     * 
     */
    private Integer exit;

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
     * @return entry 
     */
    public Integer getEntry() {
        return entry;
    }

    /**
     * 
     * @param entry 
     */
    public void setEntry(Integer entry) {
        this.entry = entry;
    }

    /**
     * 
     * @return exit 
     */
    public Integer getExit() {
        return exit;
    }

    /**
     * 
     * @param exit 
     */
    public void setExit(Integer exit) {
        this.exit = exit;
    }
}