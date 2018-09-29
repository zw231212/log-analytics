/*
*
* FiletypesExample.java
* Copyright(C) 2017-2020 fendo鍏徃
* @date 2018-09-29
*/
package cn.org.escience.log.api.model;

import java.util.ArrayList;
import java.util.List;

public class FiletypesExample {
    /**
     * filetypes
     */
    protected String orderByClause;

    /**
     * filetypes
     */
    protected boolean distinct;

    /**
     * filetypes
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated 2018-09-29
     */
    public FiletypesExample() {
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
     * filetypes 2018-09-29
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

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`type` not between", value1, value2, "type");
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

        public Criteria andBwwithoutcompressIsNull() {
            addCriterion("bwwithoutcompress is null");
            return (Criteria) this;
        }

        public Criteria andBwwithoutcompressIsNotNull() {
            addCriterion("bwwithoutcompress is not null");
            return (Criteria) this;
        }

        public Criteria andBwwithoutcompressEqualTo(Long value) {
            addCriterion("bwwithoutcompress =", value, "bwwithoutcompress");
            return (Criteria) this;
        }

        public Criteria andBwwithoutcompressNotEqualTo(Long value) {
            addCriterion("bwwithoutcompress <>", value, "bwwithoutcompress");
            return (Criteria) this;
        }

        public Criteria andBwwithoutcompressGreaterThan(Long value) {
            addCriterion("bwwithoutcompress >", value, "bwwithoutcompress");
            return (Criteria) this;
        }

        public Criteria andBwwithoutcompressGreaterThanOrEqualTo(Long value) {
            addCriterion("bwwithoutcompress >=", value, "bwwithoutcompress");
            return (Criteria) this;
        }

        public Criteria andBwwithoutcompressLessThan(Long value) {
            addCriterion("bwwithoutcompress <", value, "bwwithoutcompress");
            return (Criteria) this;
        }

        public Criteria andBwwithoutcompressLessThanOrEqualTo(Long value) {
            addCriterion("bwwithoutcompress <=", value, "bwwithoutcompress");
            return (Criteria) this;
        }

        public Criteria andBwwithoutcompressIn(List<Long> values) {
            addCriterion("bwwithoutcompress in", values, "bwwithoutcompress");
            return (Criteria) this;
        }

        public Criteria andBwwithoutcompressNotIn(List<Long> values) {
            addCriterion("bwwithoutcompress not in", values, "bwwithoutcompress");
            return (Criteria) this;
        }

        public Criteria andBwwithoutcompressBetween(Long value1, Long value2) {
            addCriterion("bwwithoutcompress between", value1, value2, "bwwithoutcompress");
            return (Criteria) this;
        }

        public Criteria andBwwithoutcompressNotBetween(Long value1, Long value2) {
            addCriterion("bwwithoutcompress not between", value1, value2, "bwwithoutcompress");
            return (Criteria) this;
        }

        public Criteria andBwaftercompressIsNull() {
            addCriterion("bwaftercompress is null");
            return (Criteria) this;
        }

        public Criteria andBwaftercompressIsNotNull() {
            addCriterion("bwaftercompress is not null");
            return (Criteria) this;
        }

        public Criteria andBwaftercompressEqualTo(Long value) {
            addCriterion("bwaftercompress =", value, "bwaftercompress");
            return (Criteria) this;
        }

        public Criteria andBwaftercompressNotEqualTo(Long value) {
            addCriterion("bwaftercompress <>", value, "bwaftercompress");
            return (Criteria) this;
        }

        public Criteria andBwaftercompressGreaterThan(Long value) {
            addCriterion("bwaftercompress >", value, "bwaftercompress");
            return (Criteria) this;
        }

        public Criteria andBwaftercompressGreaterThanOrEqualTo(Long value) {
            addCriterion("bwaftercompress >=", value, "bwaftercompress");
            return (Criteria) this;
        }

        public Criteria andBwaftercompressLessThan(Long value) {
            addCriterion("bwaftercompress <", value, "bwaftercompress");
            return (Criteria) this;
        }

        public Criteria andBwaftercompressLessThanOrEqualTo(Long value) {
            addCriterion("bwaftercompress <=", value, "bwaftercompress");
            return (Criteria) this;
        }

        public Criteria andBwaftercompressIn(List<Long> values) {
            addCriterion("bwaftercompress in", values, "bwaftercompress");
            return (Criteria) this;
        }

        public Criteria andBwaftercompressNotIn(List<Long> values) {
            addCriterion("bwaftercompress not in", values, "bwaftercompress");
            return (Criteria) this;
        }

        public Criteria andBwaftercompressBetween(Long value1, Long value2) {
            addCriterion("bwaftercompress between", value1, value2, "bwaftercompress");
            return (Criteria) this;
        }

        public Criteria andBwaftercompressNotBetween(Long value1, Long value2) {
            addCriterion("bwaftercompress not between", value1, value2, "bwaftercompress");
            return (Criteria) this;
        }
    }

    /**
     *  * filetypes
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * filetypes 2018-09-29
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