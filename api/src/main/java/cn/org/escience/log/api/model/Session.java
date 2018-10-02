/*
*
* Session.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
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