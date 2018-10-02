/*
*
* GeneralExample.java
* Copyright(C) 2017-2020 http://www.escience.org.cn
* @date 2018-10-02
*/
package cn.org.escience.log.api.model;

import java.util.ArrayList;
import java.util.List;

public class GeneralExample {
    /**
     * general
     */
    protected String orderByClause;

    /**
     * general
     */
    protected boolean distinct;

    /**
     * general
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated 2018-10-02
     */
    public GeneralExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated 2018-10-02
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated 2018-10-02
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated 2018-10-02
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated 2018-10-02
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated 2018-10-02
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated 2018-10-02
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated 2018-10-02
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated 2018-10-02
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
     * @mbg.generated 2018-10-02
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated 2018-10-02
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * general 2018-10-02
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

        public Criteria andVisitsIsNull() {
            addCriterion("visits is null");
            return (Criteria) this;
        }

        public Criteria andVisitsIsNotNull() {
            addCriterion("visits is not null");
            return (Criteria) this;
        }

        public Criteria andVisitsEqualTo(Integer value) {
            addCriterion("visits =", value, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsNotEqualTo(Integer value) {
            addCriterion("visits <>", value, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsGreaterThan(Integer value) {
            addCriterion("visits >", value, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("visits >=", value, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsLessThan(Integer value) {
            addCriterion("visits <", value, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsLessThanOrEqualTo(Integer value) {
            addCriterion("visits <=", value, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsIn(List<Integer> values) {
            addCriterion("visits in", values, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsNotIn(List<Integer> values) {
            addCriterion("visits not in", values, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsBetween(Integer value1, Integer value2) {
            addCriterion("visits between", value1, value2, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsNotBetween(Integer value1, Integer value2) {
            addCriterion("visits not between", value1, value2, "visits");
            return (Criteria) this;
        }

        public Criteria andVisitsUniqueIsNull() {
            addCriterion("visits_unique is null");
            return (Criteria) this;
        }

        public Criteria andVisitsUniqueIsNotNull() {
            addCriterion("visits_unique is not null");
            return (Criteria) this;
        }

        public Criteria andVisitsUniqueEqualTo(Integer value) {
            addCriterion("visits_unique =", value, "visitsUnique");
            return (Criteria) this;
        }

        public Criteria andVisitsUniqueNotEqualTo(Integer value) {
            addCriterion("visits_unique <>", value, "visitsUnique");
            return (Criteria) this;
        }

        public Criteria andVisitsUniqueGreaterThan(Integer value) {
            addCriterion("visits_unique >", value, "visitsUnique");
            return (Criteria) this;
        }

        public Criteria andVisitsUniqueGreaterThanOrEqualTo(Integer value) {
            addCriterion("visits_unique >=", value, "visitsUnique");
            return (Criteria) this;
        }

        public Criteria andVisitsUniqueLessThan(Integer value) {
            addCriterion("visits_unique <", value, "visitsUnique");
            return (Criteria) this;
        }

        public Criteria andVisitsUniqueLessThanOrEqualTo(Integer value) {
            addCriterion("visits_unique <=", value, "visitsUnique");
            return (Criteria) this;
        }

        public Criteria andVisitsUniqueIn(List<Integer> values) {
            addCriterion("visits_unique in", values, "visitsUnique");
            return (Criteria) this;
        }

        public Criteria andVisitsUniqueNotIn(List<Integer> values) {
            addCriterion("visits_unique not in", values, "visitsUnique");
            return (Criteria) this;
        }

        public Criteria andVisitsUniqueBetween(Integer value1, Integer value2) {
            addCriterion("visits_unique between", value1, value2, "visitsUnique");
            return (Criteria) this;
        }

        public Criteria andVisitsUniqueNotBetween(Integer value1, Integer value2) {
            addCriterion("visits_unique not between", value1, value2, "visitsUnique");
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

        public Criteria andPagesNvIsNull() {
            addCriterion("pages_nv is null");
            return (Criteria) this;
        }

        public Criteria andPagesNvIsNotNull() {
            addCriterion("pages_nv is not null");
            return (Criteria) this;
        }

        public Criteria andPagesNvEqualTo(Integer value) {
            addCriterion("pages_nv =", value, "pagesNv");
            return (Criteria) this;
        }

        public Criteria andPagesNvNotEqualTo(Integer value) {
            addCriterion("pages_nv <>", value, "pagesNv");
            return (Criteria) this;
        }

        public Criteria andPagesNvGreaterThan(Integer value) {
            addCriterion("pages_nv >", value, "pagesNv");
            return (Criteria) this;
        }

        public Criteria andPagesNvGreaterThanOrEqualTo(Integer value) {
            addCriterion("pages_nv >=", value, "pagesNv");
            return (Criteria) this;
        }

        public Criteria andPagesNvLessThan(Integer value) {
            addCriterion("pages_nv <", value, "pagesNv");
            return (Criteria) this;
        }

        public Criteria andPagesNvLessThanOrEqualTo(Integer value) {
            addCriterion("pages_nv <=", value, "pagesNv");
            return (Criteria) this;
        }

        public Criteria andPagesNvIn(List<Integer> values) {
            addCriterion("pages_nv in", values, "pagesNv");
            return (Criteria) this;
        }

        public Criteria andPagesNvNotIn(List<Integer> values) {
            addCriterion("pages_nv not in", values, "pagesNv");
            return (Criteria) this;
        }

        public Criteria andPagesNvBetween(Integer value1, Integer value2) {
            addCriterion("pages_nv between", value1, value2, "pagesNv");
            return (Criteria) this;
        }

        public Criteria andPagesNvNotBetween(Integer value1, Integer value2) {
            addCriterion("pages_nv not between", value1, value2, "pagesNv");
            return (Criteria) this;
        }

        public Criteria andHitsNvIsNull() {
            addCriterion("hits_nv is null");
            return (Criteria) this;
        }

        public Criteria andHitsNvIsNotNull() {
            addCriterion("hits_nv is not null");
            return (Criteria) this;
        }

        public Criteria andHitsNvEqualTo(Integer value) {
            addCriterion("hits_nv =", value, "hitsNv");
            return (Criteria) this;
        }

        public Criteria andHitsNvNotEqualTo(Integer value) {
            addCriterion("hits_nv <>", value, "hitsNv");
            return (Criteria) this;
        }

        public Criteria andHitsNvGreaterThan(Integer value) {
            addCriterion("hits_nv >", value, "hitsNv");
            return (Criteria) this;
        }

        public Criteria andHitsNvGreaterThanOrEqualTo(Integer value) {
            addCriterion("hits_nv >=", value, "hitsNv");
            return (Criteria) this;
        }

        public Criteria andHitsNvLessThan(Integer value) {
            addCriterion("hits_nv <", value, "hitsNv");
            return (Criteria) this;
        }

        public Criteria andHitsNvLessThanOrEqualTo(Integer value) {
            addCriterion("hits_nv <=", value, "hitsNv");
            return (Criteria) this;
        }

        public Criteria andHitsNvIn(List<Integer> values) {
            addCriterion("hits_nv in", values, "hitsNv");
            return (Criteria) this;
        }

        public Criteria andHitsNvNotIn(List<Integer> values) {
            addCriterion("hits_nv not in", values, "hitsNv");
            return (Criteria) this;
        }

        public Criteria andHitsNvBetween(Integer value1, Integer value2) {
            addCriterion("hits_nv between", value1, value2, "hitsNv");
            return (Criteria) this;
        }

        public Criteria andHitsNvNotBetween(Integer value1, Integer value2) {
            addCriterion("hits_nv not between", value1, value2, "hitsNv");
            return (Criteria) this;
        }

        public Criteria andBandwidthNvIsNull() {
            addCriterion("bandwidth_nv is null");
            return (Criteria) this;
        }

        public Criteria andBandwidthNvIsNotNull() {
            addCriterion("bandwidth_nv is not null");
            return (Criteria) this;
        }

        public Criteria andBandwidthNvEqualTo(Long value) {
            addCriterion("bandwidth_nv =", value, "bandwidthNv");
            return (Criteria) this;
        }

        public Criteria andBandwidthNvNotEqualTo(Long value) {
            addCriterion("bandwidth_nv <>", value, "bandwidthNv");
            return (Criteria) this;
        }

        public Criteria andBandwidthNvGreaterThan(Long value) {
            addCriterion("bandwidth_nv >", value, "bandwidthNv");
            return (Criteria) this;
        }

        public Criteria andBandwidthNvGreaterThanOrEqualTo(Long value) {
            addCriterion("bandwidth_nv >=", value, "bandwidthNv");
            return (Criteria) this;
        }

        public Criteria andBandwidthNvLessThan(Long value) {
            addCriterion("bandwidth_nv <", value, "bandwidthNv");
            return (Criteria) this;
        }

        public Criteria andBandwidthNvLessThanOrEqualTo(Long value) {
            addCriterion("bandwidth_nv <=", value, "bandwidthNv");
            return (Criteria) this;
        }

        public Criteria andBandwidthNvIn(List<Long> values) {
            addCriterion("bandwidth_nv in", values, "bandwidthNv");
            return (Criteria) this;
        }

        public Criteria andBandwidthNvNotIn(List<Long> values) {
            addCriterion("bandwidth_nv not in", values, "bandwidthNv");
            return (Criteria) this;
        }

        public Criteria andBandwidthNvBetween(Long value1, Long value2) {
            addCriterion("bandwidth_nv between", value1, value2, "bandwidthNv");
            return (Criteria) this;
        }

        public Criteria andBandwidthNvNotBetween(Long value1, Long value2) {
            addCriterion("bandwidth_nv not between", value1, value2, "bandwidthNv");
            return (Criteria) this;
        }

        public Criteria andHostsKnownIsNull() {
            addCriterion("hosts_known is null");
            return (Criteria) this;
        }

        public Criteria andHostsKnownIsNotNull() {
            addCriterion("hosts_known is not null");
            return (Criteria) this;
        }

        public Criteria andHostsKnownEqualTo(Integer value) {
            addCriterion("hosts_known =", value, "hostsKnown");
            return (Criteria) this;
        }

        public Criteria andHostsKnownNotEqualTo(Integer value) {
            addCriterion("hosts_known <>", value, "hostsKnown");
            return (Criteria) this;
        }

        public Criteria andHostsKnownGreaterThan(Integer value) {
            addCriterion("hosts_known >", value, "hostsKnown");
            return (Criteria) this;
        }

        public Criteria andHostsKnownGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosts_known >=", value, "hostsKnown");
            return (Criteria) this;
        }

        public Criteria andHostsKnownLessThan(Integer value) {
            addCriterion("hosts_known <", value, "hostsKnown");
            return (Criteria) this;
        }

        public Criteria andHostsKnownLessThanOrEqualTo(Integer value) {
            addCriterion("hosts_known <=", value, "hostsKnown");
            return (Criteria) this;
        }

        public Criteria andHostsKnownIn(List<Integer> values) {
            addCriterion("hosts_known in", values, "hostsKnown");
            return (Criteria) this;
        }

        public Criteria andHostsKnownNotIn(List<Integer> values) {
            addCriterion("hosts_known not in", values, "hostsKnown");
            return (Criteria) this;
        }

        public Criteria andHostsKnownBetween(Integer value1, Integer value2) {
            addCriterion("hosts_known between", value1, value2, "hostsKnown");
            return (Criteria) this;
        }

        public Criteria andHostsKnownNotBetween(Integer value1, Integer value2) {
            addCriterion("hosts_known not between", value1, value2, "hostsKnown");
            return (Criteria) this;
        }

        public Criteria andHostsUnknownIsNull() {
            addCriterion("hosts_unknown is null");
            return (Criteria) this;
        }

        public Criteria andHostsUnknownIsNotNull() {
            addCriterion("hosts_unknown is not null");
            return (Criteria) this;
        }

        public Criteria andHostsUnknownEqualTo(Integer value) {
            addCriterion("hosts_unknown =", value, "hostsUnknown");
            return (Criteria) this;
        }

        public Criteria andHostsUnknownNotEqualTo(Integer value) {
            addCriterion("hosts_unknown <>", value, "hostsUnknown");
            return (Criteria) this;
        }

        public Criteria andHostsUnknownGreaterThan(Integer value) {
            addCriterion("hosts_unknown >", value, "hostsUnknown");
            return (Criteria) this;
        }

        public Criteria andHostsUnknownGreaterThanOrEqualTo(Integer value) {
            addCriterion("hosts_unknown >=", value, "hostsUnknown");
            return (Criteria) this;
        }

        public Criteria andHostsUnknownLessThan(Integer value) {
            addCriterion("hosts_unknown <", value, "hostsUnknown");
            return (Criteria) this;
        }

        public Criteria andHostsUnknownLessThanOrEqualTo(Integer value) {
            addCriterion("hosts_unknown <=", value, "hostsUnknown");
            return (Criteria) this;
        }

        public Criteria andHostsUnknownIn(List<Integer> values) {
            addCriterion("hosts_unknown in", values, "hostsUnknown");
            return (Criteria) this;
        }

        public Criteria andHostsUnknownNotIn(List<Integer> values) {
            addCriterion("hosts_unknown not in", values, "hostsUnknown");
            return (Criteria) this;
        }

        public Criteria andHostsUnknownBetween(Integer value1, Integer value2) {
            addCriterion("hosts_unknown between", value1, value2, "hostsUnknown");
            return (Criteria) this;
        }

        public Criteria andHostsUnknownNotBetween(Integer value1, Integer value2) {
            addCriterion("hosts_unknown not between", value1, value2, "hostsUnknown");
            return (Criteria) this;
        }
    }

    /**
     *  * general
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * general 2018-10-02
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