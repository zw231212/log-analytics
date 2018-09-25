/*
*
* Unkbrowser.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-21
*/
package cn.org.escience.log.api.model;

public class Unkbrowser {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String agent;

    /**
     * 
     */
    private String lastvisit;

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
     * @return agent 
     */
    public String getAgent() {
        return agent;
    }

    /**
     * 
     * @param agent 
     */
    public void setAgent(String agent) {
        this.agent = agent == null ? null : agent.trim();
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
}