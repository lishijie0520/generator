package com.genertech.lcm.biz.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LseSwStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LseSwStatusExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andSwIdIsNull() {
            addCriterion("SW_ID is null");
            return (Criteria) this;
        }

        public Criteria andSwIdIsNotNull() {
            addCriterion("SW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSwIdEqualTo(String value) {
            addCriterion("SW_ID =", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdNotEqualTo(String value) {
            addCriterion("SW_ID <>", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdGreaterThan(String value) {
            addCriterion("SW_ID >", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdGreaterThanOrEqualTo(String value) {
            addCriterion("SW_ID >=", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdLessThan(String value) {
            addCriterion("SW_ID <", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdLessThanOrEqualTo(String value) {
            addCriterion("SW_ID <=", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdLike(String value) {
            addCriterion("SW_ID like", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdNotLike(String value) {
            addCriterion("SW_ID not like", value, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdIn(List<String> values) {
            addCriterion("SW_ID in", values, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdNotIn(List<String> values) {
            addCriterion("SW_ID not in", values, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdBetween(String value1, String value2) {
            addCriterion("SW_ID between", value1, value2, "swId");
            return (Criteria) this;
        }

        public Criteria andSwIdNotBetween(String value1, String value2) {
            addCriterion("SW_ID not between", value1, value2, "swId");
            return (Criteria) this;
        }

        public Criteria andSwPartnumberIsNull() {
            addCriterion("SW_PARTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSwPartnumberIsNotNull() {
            addCriterion("SW_PARTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSwPartnumberEqualTo(String value) {
            addCriterion("SW_PARTNUMBER =", value, "swPartnumber");
            return (Criteria) this;
        }

        public Criteria andSwPartnumberNotEqualTo(String value) {
            addCriterion("SW_PARTNUMBER <>", value, "swPartnumber");
            return (Criteria) this;
        }

        public Criteria andSwPartnumberGreaterThan(String value) {
            addCriterion("SW_PARTNUMBER >", value, "swPartnumber");
            return (Criteria) this;
        }

        public Criteria andSwPartnumberGreaterThanOrEqualTo(String value) {
            addCriterion("SW_PARTNUMBER >=", value, "swPartnumber");
            return (Criteria) this;
        }

        public Criteria andSwPartnumberLessThan(String value) {
            addCriterion("SW_PARTNUMBER <", value, "swPartnumber");
            return (Criteria) this;
        }

        public Criteria andSwPartnumberLessThanOrEqualTo(String value) {
            addCriterion("SW_PARTNUMBER <=", value, "swPartnumber");
            return (Criteria) this;
        }

        public Criteria andSwPartnumberLike(String value) {
            addCriterion("SW_PARTNUMBER like", value, "swPartnumber");
            return (Criteria) this;
        }

        public Criteria andSwPartnumberNotLike(String value) {
            addCriterion("SW_PARTNUMBER not like", value, "swPartnumber");
            return (Criteria) this;
        }

        public Criteria andSwPartnumberIn(List<String> values) {
            addCriterion("SW_PARTNUMBER in", values, "swPartnumber");
            return (Criteria) this;
        }

        public Criteria andSwPartnumberNotIn(List<String> values) {
            addCriterion("SW_PARTNUMBER not in", values, "swPartnumber");
            return (Criteria) this;
        }

        public Criteria andSwPartnumberBetween(String value1, String value2) {
            addCriterion("SW_PARTNUMBER between", value1, value2, "swPartnumber");
            return (Criteria) this;
        }

        public Criteria andSwPartnumberNotBetween(String value1, String value2) {
            addCriterion("SW_PARTNUMBER not between", value1, value2, "swPartnumber");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdIsNull() {
            addCriterion("AIRPLANE_ID is null");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdIsNotNull() {
            addCriterion("AIRPLANE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdEqualTo(String value) {
            addCriterion("AIRPLANE_ID =", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdNotEqualTo(String value) {
            addCriterion("AIRPLANE_ID <>", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdGreaterThan(String value) {
            addCriterion("AIRPLANE_ID >", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdGreaterThanOrEqualTo(String value) {
            addCriterion("AIRPLANE_ID >=", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdLessThan(String value) {
            addCriterion("AIRPLANE_ID <", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdLessThanOrEqualTo(String value) {
            addCriterion("AIRPLANE_ID <=", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdLike(String value) {
            addCriterion("AIRPLANE_ID like", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdNotLike(String value) {
            addCriterion("AIRPLANE_ID not like", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdIn(List<String> values) {
            addCriterion("AIRPLANE_ID in", values, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdNotIn(List<String> values) {
            addCriterion("AIRPLANE_ID not in", values, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdBetween(String value1, String value2) {
            addCriterion("AIRPLANE_ID between", value1, value2, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdNotBetween(String value1, String value2) {
            addCriterion("AIRPLANE_ID not between", value1, value2, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Short value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Short value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Short value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Short value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Short value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Short value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Short> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Short> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Short value1, Short value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Short value1, Short value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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