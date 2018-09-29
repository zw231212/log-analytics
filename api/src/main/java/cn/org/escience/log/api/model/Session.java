/*
*
* Session.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.model;

public class Session extends SessionKey {
    /**
     * 
     */
    private Integer visits;

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
}