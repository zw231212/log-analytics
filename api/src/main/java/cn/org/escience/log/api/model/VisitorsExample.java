/*
*
* VisitorsExample.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.model;

import java.util.ArrayList;
import java.util.List;

public class VisitorsExample {
    /**
     * visitors
     */
    protected String orderByClause;

    /**
     * visitors
     */
    protected boolean distinct;

    /**
     * visitors
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated 2018-09-29
     */
    public VisitorsExample() {
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
     * visitors 2018-09-29
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

        public Criteria andHostIsNull() {
            addCriterion("`host` is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("`host` is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("`host` =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("`host` <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("`host` >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("`host` >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("`host` <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("`host` <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("`host` like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("`host` not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("`host` in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("`host` not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("`host` between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("`host` not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andPagesIsNull() {
            addCriterion("pages is null");
            return (Criteria) this;
        }

        public Criteria andPagesIsNotNull() {
            addCriterion("pages is not null");
            return (Criteria) this;
        }

        public Criteria andPagesEqualTo(Integer value) {
            addCriterion("pages =", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotEqualTo(Integer value) {
            addCriterion("pages <>", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThan(Integer value) {
            addCriterion("pages >", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("pages >=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThan(Integer value) {
            addCriterion("pages <", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThanOrEqualTo(Integer value) {
            addCriterion("pages <=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesIn(List<Integer> values) {
            addCriterion("pages in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotIn(List<Integer> values) {
            addCriterion("pages not in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesBetween(Integer value1, Integer value2) {
            addCriterion("pages between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotBetween(Integer value1, Integer value2) {
            addCriterion("pages not between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andHitsIsNull() {
            addCriterion("hits is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("hits is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(Integer value) {
            addCriterion("hits =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(Integer value) {
            addCriterion("hits <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(Integer value) {
            addCriterion("hits >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("hits >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(Integer value) {
            addCriterion("hits <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(Integer value) {
            addCriterion("hits <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<Integer> values) {
            addCriterion("hits in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<Integer> values) {
            addCriterion("hits not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(Integer value1, Integer value2) {
            addCriterion("hits between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("hits not between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andBandwidthIsNull() {
            addCriterion("bandwidth is null");
            return (Criteria) this;
        }

        public Criteria andBandwidthIsNotNull() {
            addCriterion("bandwidth is not null");
            return (Criteria) this;
        }

        public Criteria andBandwidthEqualTo(Long value) {
            addCriterion("bandwidth =", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthNotEqualTo(Long value) {
            addCriterion("bandwidth <>", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthGreaterThan(Long value) {
            addCriterion("bandwidth >", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthGreaterThanOrEqualTo(Long value) {
            addCriterion("bandwidth >=", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthLessThan(Long value) {
            addCriterion("bandwidth <", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthLessThanOrEqualTo(Long value) {
            addCriterion("bandwidth <=", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthIn(List<Long> values) {
            addCriterion("bandwidth in", values, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthNotIn(List<Long> values) {
            addCriterion("bandwidth not in", values, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthBetween(Long value1, Long value2) {
            addCriterion("bandwidth between", value1, value2, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthNotBetween(Long value1, Long value2) {
            addCriterion("bandwidth not between", value1, value2, "bandwidth");
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

        public Criteria andStartlastvisitIsNull() {
            addCriterion("startlastvisit is null");
            return (Criteria) this;
        }

        public Criteria andStartlastvisitIsNotNull() {
            addCriterion("startlastvisit is not null");
            return (Criteria) this;
        }

        public Criteria andStartlastvisitEqualTo(String value) {
            addCriterion("startlastvisit =", value, "startlastvisit");
            return (Criteria) this;
        }

        public Criteria andStartlastvisitNotEqualTo(String value) {
            addCriterion("startlastvisit <>", value, "startlastvisit");
            return (Criteria) this;
        }

        public Criteria andStartlastvisitGreaterThan(String value) {
            addCriterion("startlastvisit >", value, "startlastvisit");
            return (Criteria) this;
        }

        public Criteria andStartlastvisitGreaterThanOrEqualTo(String value) {
            addCriterion("startlastvisit >=", value, "startlastvisit");
            return (Criteria) this;
        }

        public Criteria andStartlastvisitLessThan(String value) {
            addCriterion("startlastvisit <", value, "startlastvisit");
            return (Criteria) this;
        }

        public Criteria andStartlastvisitLessThanOrEqualTo(String value) {
            addCriterion("startlastvisit <=", value, "startlastvisit");
            return (Criteria) this;
        }

        public Criteria andStartlastvisitLike(String value) {
            addCriterion("startlastvisit like", value, "startlastvisit");
            return (Criteria) this;
        }

        public Criteria andStartlastvisitNotLike(String value) {
            addCriterion("startlastvisit not like", value, "startlastvisit");
            return (Criteria) this;
        }

        public Criteria andStartlastvisitIn(List<String> values) {
            addCriterion("startlastvisit in", values, "startlastvisit");
            return (Criteria) this;
        }

        public Criteria andStartlastvisitNotIn(List<String> values) {
            addCriterion("startlastvisit not in", values, "startlastvisit");
            return (Criteria) this;
        }

        public Criteria andStartlastvisitBetween(String value1, String value2) {
            addCriterion("startlastvisit between", value1, value2, "startlastvisit");
            return (Criteria) this;
        }

        public Criteria andStartlastvisitNotBetween(String value1, String value2) {
            addCriterion("startlastvisit not between", value1, value2, "startlastvisit");
            return (Criteria) this;
        }

        public Criteria andLastpageIsNull() {
            addCriterion("lastpage is null");
            return (Criteria) this;
        }

        public Criteria andLastpageIsNotNull() {
            addCriterion("lastpage is not null");
            return (Criteria) this;
        }

        public Criteria andLastpageEqualTo(String value) {
            addCriterion("lastpage =", value, "lastpage");
            return (Criteria) this;
        }

        public Criteria andLastpageNotEqualTo(String value) {
            addCriterion("lastpage <>", value, "lastpage");
            return (Criteria) this;
        }

        public Criteria andLastpageGreaterThan(String value) {
            addCriterion("lastpage >", value, "lastpage");
            return (Criteria) this;
        }

        public Criteria andLastpageGreaterThanOrEqualTo(String value) {
            addCriterion("lastpage >=", value, "lastpage");
            return (Criteria) this;
        }

        public Criteria andLastpageLessThan(String value) {
            addCriterion("lastpage <", value, "lastpage");
            return (Criteria) this;
        }

        public Criteria andLastpageLessThanOrEqualTo(String value) {
            addCriterion("lastpage <=", value, "lastpage");
            return (Criteria) this;
        }

        public Criteria andLastpageLike(String value) {
            addCriterion("lastpage like", value, "lastpage");
            return (Criteria) this;
        }

        public Criteria andLastpageNotLike(String value) {
            addCriterion("lastpage not like", value, "lastpage");
            return (Criteria) this;
        }

        public Criteria andLastpageIn(List<String> values) {
            addCriterion("lastpage in", values, "lastpage");
            return (Criteria) this;
        }

        public Criteria andLastpageNotIn(List<String> values) {
            addCriterion("lastpage not in", values, "lastpage");
            return (Criteria) this;
        }

        public Criteria andLastpageBetween(String value1, String value2) {
            addCriterion("lastpage between", value1, value2, "lastpage");
            return (Criteria) this;
        }

        public Criteria andLastpageNotBetween(String value1, String value2) {
            addCriterion("lastpage not between", value1, value2, "lastpage");
            return (Criteria) this;
        }
    }

    /**
     *  * visitors
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * visitors 2018-09-29
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