/*
*
* Searchwords.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.model;

public class Searchwords {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String words;

    /**
     * 
     */
    private Integer hits;

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
     * @return words 
     */
    public String getWords() {
        return words;
    }

    /**
     * 
     * @param words 
     */
    public void setWords(String words) {
        this.words = words == null ? null : words.trim();
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
}