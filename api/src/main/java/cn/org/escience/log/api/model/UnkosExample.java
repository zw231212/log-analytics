/*
*
* UnkosExample.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.model;

import java.util.ArrayList;
import java.util.List;

public class UnkosExample {
    /**
     * unkos
     */
    protected String orderByClause;

    /**
     * unkos
     */
    protected boolean distinct;

    /**
     * unkos
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated 2018-09-29
     */
    public UnkosExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated 2018-09-29
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated 2018-09-29
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated 2018-09-29
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated 2018-09-29
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated 2018-09-29
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated 2018-09-29
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated 2018-09-29
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated 2018-09-29
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated 2018-09-29
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated 2018-09-29
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * unkos 2018-09-29
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYearMonthIsNull() {
            addCriterion("`year_month` is null");
            return (Criteria) this;
        }

        public Criteria andYearMonthIsNotNull() {
            addCriterion("`year_month` is not null");
            return (Criteria) this;
        }

        public Criteria andYearMonthEqualTo(String value) {
            addCriterion("`year_month` =", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotEqualTo(String value) {
            addCriterion("`year_month` <>", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthGreaterThan(String value) {
            addCriterion("`year_month` >", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthGreaterThanOrEqualTo(String value) {
            addCriterion("`year_month` >=", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthLessThan(String value) {
            addCriterion("`year_month` <", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthLessThanOrEqualTo(String value) {
            addCriterion("`year_month` <=", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthLike(String value) {
            addCriterion("`year_month` like", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotLike(String value) {
            addCriterion("`year_month` not like", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthIn(List<String> values) {
            addCriterion("`year_month` in", values, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotIn(List<String> values) {
            addCriterion("`year_month` not in", values, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthBetween(String value1, String value2) {
            addCriterion("`year_month` between", value1, value2, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotBetween(String value1, String value2) {
            addCriterion("`year_month` not between", value1, value2, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andAgentIsNull() {
            addCriterion("agent is null");
            return (Criteria) this;
        }

        public Criteria andAgentIsNotNull() {
            addCriterion("agent is not null");
            return (Criteria) this;
        }

        public Criteria andAgentEqualTo(String value) {
            addCriterion("agent =", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotEqualTo(String value) {
            addCriterion("agent <>", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThan(String value) {
            addCriterion("agent >", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThanOrEqualTo(String value) {
            addCriterion("agent >=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThan(String value) {
            addCriterion("agent <", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThanOrEqualTo(String value) {
            addCriterion("agent <=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLike(String value) {
            addCriterion("agent like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotLike(String value) {
            addCriterion("agent not like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentIn(List<String> values) {
            addCriterion("agent in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotIn(List<String> values) {
            addCriterion("agent not in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentBetween(String value1, String value2) {
            addCriterion("agent between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotBetween(String value1, String value2) {
            addCriterion("agent not between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andLastvisitIsNull() {
            addCriterion("lastvisit is null");
            return (Criteria) this;
        }

        public Criteria andLastvisitIsNotNull() {
            addCriterion("lastvisit is not null");
            return (Criteria) this;
        }

        public Criteria andLastvisitEqualTo(String value) {
            addCriterion("lastvisit =", value, "lastvisit");
            return (Criteria) this;
        }

        public Criteria andLastvisitNotEqualTo(String value) {
            addCriterion("lastvisit <>", value, "lastvisit");
            return (Criteria) this;
        }

        public Criteria andLastvisitGreaterThan(String value) {
            addCriterion("lastvisit >", value, "lastvisit");
            return (Criteria) this;
        }

        public Criteria andLastvisitGreaterThanOrEqualTo(String value) {
            addCriterion("lastvisit >=", value, "lastvisit");
            return (Criteria) this;
        }

        public Criteria andLastvisitLessThan(String value) {
            addCriterion("lastvisit <", value, "lastvisit");
            return (Criteria) this;
        }

        public Criteria andLastvisitLessThanOrEqualTo(String value) {
            addCriterion("lastvisit <=", value, "lastvisit");
            return (Criteria) this;
        }

        public Criteria andLastvisitLike(String value) {
            addCriterion("lastvisit like", value, "lastvisit");
            return (Criteria) this;
        }

        public Criteria andLastvisitNotLike(String value) {
            addCriterion("lastvisit not like", value, "lastvisit");
            return (Criteria) this;
        }

        public Criteria andLastvisitIn(List<String> values) {
            addCriterion("lastvisit in", values, "lastvisit");
            return (Criteria) this;
        }

        public Criteria andLastvisitNotIn(List<String> values) {
            addCriterion("lastvisit not in", values, "lastvisit");
            return (Criteria) this;
        }

        public Criteria andLastvisitBetween(String value1, String value2) {
            addCriterion("lastvisit between", value1, value2, "lastvisit");
            return (Criteria) this;
        }

        public Criteria andLastvisitNotBetween(String value1, String value2) {
            addCriterion("lastvisit not between", value1, value2, "lastvisit");
            return (Criteria) this;
        }
    }

    /**
     *  * unkos
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * unkos 2018-09-29
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}