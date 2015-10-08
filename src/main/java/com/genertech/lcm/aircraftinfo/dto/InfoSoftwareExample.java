package com.genertech.lcm.aircraftinfo.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InfoSoftwareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfoSoftwareExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPartNoIsNull() {
            addCriterion("PART_NO is null");
            return (Criteria) this;
        }

        public Criteria andPartNoIsNotNull() {
            addCriterion("PART_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPartNoEqualTo(String value) {
            addCriterion("PART_NO =", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotEqualTo(String value) {
            addCriterion("PART_NO <>", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoGreaterThan(String value) {
            addCriterion("PART_NO >", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoGreaterThanOrEqualTo(String value) {
            addCriterion("PART_NO >=", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoLessThan(String value) {
            addCriterion("PART_NO <", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoLessThanOrEqualTo(String value) {
            addCriterion("PART_NO <=", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoLike(String value) {
            addCriterion("PART_NO like", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotLike(String value) {
            addCriterion("PART_NO not like", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoIn(List<String> values) {
            addCriterion("PART_NO in", values, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotIn(List<String> values) {
            addCriterion("PART_NO not in", values, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoBetween(String value1, String value2) {
            addCriterion("PART_NO between", value1, value2, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotBetween(String value1, String value2) {
            addCriterion("PART_NO not between", value1, value2, "partNo");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Short value) {
            addCriterion("QUANTITY =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Short value) {
            addCriterion("QUANTITY <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Short value) {
            addCriterion("QUANTITY >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Short value) {
            addCriterion("QUANTITY >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Short value) {
            addCriterion("QUANTITY <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Short value) {
            addCriterion("QUANTITY <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Short> values) {
            addCriterion("QUANTITY in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Short> values) {
            addCriterion("QUANTITY not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Short value1, Short value2) {
            addCriterion("QUANTITY between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Short value1, Short value2) {
            addCriterion("QUANTITY not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andPhaseIsNull() {
            addCriterion("PHASE is null");
            return (Criteria) this;
        }

        public Criteria andPhaseIsNotNull() {
            addCriterion("PHASE is not null");
            return (Criteria) this;
        }

        public Criteria andPhaseEqualTo(String value) {
            addCriterion("PHASE =", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotEqualTo(String value) {
            addCriterion("PHASE <>", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseGreaterThan(String value) {
            addCriterion("PHASE >", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseGreaterThanOrEqualTo(String value) {
            addCriterion("PHASE >=", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLessThan(String value) {
            addCriterion("PHASE <", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLessThanOrEqualTo(String value) {
            addCriterion("PHASE <=", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLike(String value) {
            addCriterion("PHASE like", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotLike(String value) {
            addCriterion("PHASE not like", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseIn(List<String> values) {
            addCriterion("PHASE in", values, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotIn(List<String> values) {
            addCriterion("PHASE not in", values, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseBetween(String value1, String value2) {
            addCriterion("PHASE between", value1, value2, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotBetween(String value1, String value2) {
            addCriterion("PHASE not between", value1, value2, "phase");
            return (Criteria) this;
        }

        public Criteria andRevisionIsNull() {
            addCriterion("REVISION is null");
            return (Criteria) this;
        }

        public Criteria andRevisionIsNotNull() {
            addCriterion("REVISION is not null");
            return (Criteria) this;
        }

        public Criteria andRevisionEqualTo(String value) {
            addCriterion("REVISION =", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionNotEqualTo(String value) {
            addCriterion("REVISION <>", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionGreaterThan(String value) {
            addCriterion("REVISION >", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionGreaterThanOrEqualTo(String value) {
            addCriterion("REVISION >=", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionLessThan(String value) {
            addCriterion("REVISION <", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionLessThanOrEqualTo(String value) {
            addCriterion("REVISION <=", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionLike(String value) {
            addCriterion("REVISION like", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionNotLike(String value) {
            addCriterion("REVISION not like", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionIn(List<String> values) {
            addCriterion("REVISION in", values, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionNotIn(List<String> values) {
            addCriterion("REVISION not in", values, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionBetween(String value1, String value2) {
            addCriterion("REVISION between", value1, value2, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionNotBetween(String value1, String value2) {
            addCriterion("REVISION not between", value1, value2, "revision");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSubtypeIsNull() {
            addCriterion("SUBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSubtypeIsNotNull() {
            addCriterion("SUBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSubtypeEqualTo(String value) {
            addCriterion("SUBTYPE =", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotEqualTo(String value) {
            addCriterion("SUBTYPE <>", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeGreaterThan(String value) {
            addCriterion("SUBTYPE >", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeGreaterThanOrEqualTo(String value) {
            addCriterion("SUBTYPE >=", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeLessThan(String value) {
            addCriterion("SUBTYPE <", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeLessThanOrEqualTo(String value) {
            addCriterion("SUBTYPE <=", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeLike(String value) {
            addCriterion("SUBTYPE like", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotLike(String value) {
            addCriterion("SUBTYPE not like", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeIn(List<String> values) {
            addCriterion("SUBTYPE in", values, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotIn(List<String> values) {
            addCriterion("SUBTYPE not in", values, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeBetween(String value1, String value2) {
            addCriterion("SUBTYPE between", value1, value2, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotBetween(String value1, String value2) {
            addCriterion("SUBTYPE not between", value1, value2, "subtype");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSerialNameIsNull() {
            addCriterion("SERIAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSerialNameIsNotNull() {
            addCriterion("SERIAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNameEqualTo(String value) {
            addCriterion("SERIAL_NAME =", value, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameNotEqualTo(String value) {
            addCriterion("SERIAL_NAME <>", value, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameGreaterThan(String value) {
            addCriterion("SERIAL_NAME >", value, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameGreaterThanOrEqualTo(String value) {
            addCriterion("SERIAL_NAME >=", value, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameLessThan(String value) {
            addCriterion("SERIAL_NAME <", value, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameLessThanOrEqualTo(String value) {
            addCriterion("SERIAL_NAME <=", value, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameLike(String value) {
            addCriterion("SERIAL_NAME like", value, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameNotLike(String value) {
            addCriterion("SERIAL_NAME not like", value, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameIn(List<String> values) {
            addCriterion("SERIAL_NAME in", values, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameNotIn(List<String> values) {
            addCriterion("SERIAL_NAME not in", values, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameBetween(String value1, String value2) {
            addCriterion("SERIAL_NAME between", value1, value2, "serialName");
            return (Criteria) this;
        }

        public Criteria andSerialNameNotBetween(String value1, String value2) {
            addCriterion("SERIAL_NAME not between", value1, value2, "serialName");
            return (Criteria) this;
        }

        public Criteria andExpDateIsNull() {
            addCriterion("EXP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpDateIsNotNull() {
            addCriterion("EXP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpDateEqualTo(Date value) {
            addCriterion("EXP_DATE =", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotEqualTo(Date value) {
            addCriterion("EXP_DATE <>", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateGreaterThan(Date value) {
            addCriterion("EXP_DATE >", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EXP_DATE >=", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLessThan(Date value) {
            addCriterion("EXP_DATE <", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLessThanOrEqualTo(Date value) {
            addCriterion("EXP_DATE <=", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateIn(List<Date> values) {
            addCriterion("EXP_DATE in", values, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotIn(List<Date> values) {
            addCriterion("EXP_DATE not in", values, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateBetween(Date value1, Date value2) {
            addCriterion("EXP_DATE between", value1, value2, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotBetween(Date value1, Date value2) {
            addCriterion("EXP_DATE not between", value1, value2, "expDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andAtaIdIsNull() {
            addCriterion("ATA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAtaIdIsNotNull() {
            addCriterion("ATA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAtaIdEqualTo(String value) {
            addCriterion("ATA_ID =", value, "ataId");
            return (Criteria) this;
        }

        public Criteria andAtaIdNotEqualTo(String value) {
            addCriterion("ATA_ID <>", value, "ataId");
            return (Criteria) this;
        }

        public Criteria andAtaIdGreaterThan(String value) {
            addCriterion("ATA_ID >", value, "ataId");
            return (Criteria) this;
        }

        public Criteria andAtaIdGreaterThanOrEqualTo(String value) {
            addCriterion("ATA_ID >=", value, "ataId");
            return (Criteria) this;
        }

        public Criteria andAtaIdLessThan(String value) {
            addCriterion("ATA_ID <", value, "ataId");
            return (Criteria) this;
        }

        public Criteria andAtaIdLessThanOrEqualTo(String value) {
            addCriterion("ATA_ID <=", value, "ataId");
            return (Criteria) this;
        }

        public Criteria andAtaIdLike(String value) {
            addCriterion("ATA_ID like", value, "ataId");
            return (Criteria) this;
        }

        public Criteria andAtaIdNotLike(String value) {
            addCriterion("ATA_ID not like", value, "ataId");
            return (Criteria) this;
        }

        public Criteria andAtaIdIn(List<String> values) {
            addCriterion("ATA_ID in", values, "ataId");
            return (Criteria) this;
        }

        public Criteria andAtaIdNotIn(List<String> values) {
            addCriterion("ATA_ID not in", values, "ataId");
            return (Criteria) this;
        }

        public Criteria andAtaIdBetween(String value1, String value2) {
            addCriterion("ATA_ID between", value1, value2, "ataId");
            return (Criteria) this;
        }

        public Criteria andAtaIdNotBetween(String value1, String value2) {
            addCriterion("ATA_ID not between", value1, value2, "ataId");
            return (Criteria) this;
        }

        public Criteria andSwSystemIsNull() {
            addCriterion("SW_SYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andSwSystemIsNotNull() {
            addCriterion("SW_SYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andSwSystemEqualTo(String value) {
            addCriterion("SW_SYSTEM =", value, "swSystem");
            return (Criteria) this;
        }

        public Criteria andSwSystemNotEqualTo(String value) {
            addCriterion("SW_SYSTEM <>", value, "swSystem");
            return (Criteria) this;
        }

        public Criteria andSwSystemGreaterThan(String value) {
            addCriterion("SW_SYSTEM >", value, "swSystem");
            return (Criteria) this;
        }

        public Criteria andSwSystemGreaterThanOrEqualTo(String value) {
            addCriterion("SW_SYSTEM >=", value, "swSystem");
            return (Criteria) this;
        }

        public Criteria andSwSystemLessThan(String value) {
            addCriterion("SW_SYSTEM <", value, "swSystem");
            return (Criteria) this;
        }

        public Criteria andSwSystemLessThanOrEqualTo(String value) {
            addCriterion("SW_SYSTEM <=", value, "swSystem");
            return (Criteria) this;
        }

        public Criteria andSwSystemLike(String value) {
            addCriterion("SW_SYSTEM like", value, "swSystem");
            return (Criteria) this;
        }

        public Criteria andSwSystemNotLike(String value) {
            addCriterion("SW_SYSTEM not like", value, "swSystem");
            return (Criteria) this;
        }

        public Criteria andSwSystemIn(List<String> values) {
            addCriterion("SW_SYSTEM in", values, "swSystem");
            return (Criteria) this;
        }

        public Criteria andSwSystemNotIn(List<String> values) {
            addCriterion("SW_SYSTEM not in", values, "swSystem");
            return (Criteria) this;
        }

        public Criteria andSwSystemBetween(String value1, String value2) {
            addCriterion("SW_SYSTEM between", value1, value2, "swSystem");
            return (Criteria) this;
        }

        public Criteria andSwSystemNotBetween(String value1, String value2) {
            addCriterion("SW_SYSTEM not between", value1, value2, "swSystem");
            return (Criteria) this;
        }

        public Criteria andSwTypeIsNull() {
            addCriterion("SW_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSwTypeIsNotNull() {
            addCriterion("SW_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSwTypeEqualTo(String value) {
            addCriterion("SW_TYPE =", value, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeNotEqualTo(String value) {
            addCriterion("SW_TYPE <>", value, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeGreaterThan(String value) {
            addCriterion("SW_TYPE >", value, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SW_TYPE >=", value, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeLessThan(String value) {
            addCriterion("SW_TYPE <", value, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeLessThanOrEqualTo(String value) {
            addCriterion("SW_TYPE <=", value, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeLike(String value) {
            addCriterion("SW_TYPE like", value, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeNotLike(String value) {
            addCriterion("SW_TYPE not like", value, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeIn(List<String> values) {
            addCriterion("SW_TYPE in", values, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeNotIn(List<String> values) {
            addCriterion("SW_TYPE not in", values, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeBetween(String value1, String value2) {
            addCriterion("SW_TYPE between", value1, value2, "swType");
            return (Criteria) this;
        }

        public Criteria andSwTypeNotBetween(String value1, String value2) {
            addCriterion("SW_TYPE not between", value1, value2, "swType");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStatIsNull() {
            addCriterion("STAT is null");
            return (Criteria) this;
        }

        public Criteria andStatIsNotNull() {
            addCriterion("STAT is not null");
            return (Criteria) this;
        }

        public Criteria andStatEqualTo(Short value) {
            addCriterion("STAT =", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotEqualTo(Short value) {
            addCriterion("STAT <>", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatGreaterThan(Short value) {
            addCriterion("STAT >", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatGreaterThanOrEqualTo(Short value) {
            addCriterion("STAT >=", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatLessThan(Short value) {
            addCriterion("STAT <", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatLessThanOrEqualTo(Short value) {
            addCriterion("STAT <=", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatIn(List<Short> values) {
            addCriterion("STAT in", values, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotIn(List<Short> values) {
            addCriterion("STAT not in", values, "stat");
            return (Criteria) this;
        }

        public Criteria andStatBetween(Short value1, Short value2) {
            addCriterion("STAT between", value1, value2, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotBetween(Short value1, Short value2) {
            addCriterion("STAT not between", value1, value2, "stat");
            return (Criteria) this;
        }

        public Criteria andConfigVersionIsNull() {
            addCriterion("CONFIG_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andConfigVersionIsNotNull() {
            addCriterion("CONFIG_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andConfigVersionEqualTo(String value) {
            addCriterion("CONFIG_VERSION =", value, "configVersion");
            return (Criteria) this;
        }

        public Criteria andConfigVersionNotEqualTo(String value) {
            addCriterion("CONFIG_VERSION <>", value, "configVersion");
            return (Criteria) this;
        }

        public Criteria andConfigVersionGreaterThan(String value) {
            addCriterion("CONFIG_VERSION >", value, "configVersion");
            return (Criteria) this;
        }

        public Criteria andConfigVersionGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_VERSION >=", value, "configVersion");
            return (Criteria) this;
        }

        public Criteria andConfigVersionLessThan(String value) {
            addCriterion("CONFIG_VERSION <", value, "configVersion");
            return (Criteria) this;
        }

        public Criteria andConfigVersionLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_VERSION <=", value, "configVersion");
            return (Criteria) this;
        }

        public Criteria andConfigVersionLike(String value) {
            addCriterion("CONFIG_VERSION like", value, "configVersion");
            return (Criteria) this;
        }

        public Criteria andConfigVersionNotLike(String value) {
            addCriterion("CONFIG_VERSION not like", value, "configVersion");
            return (Criteria) this;
        }

        public Criteria andConfigVersionIn(List<String> values) {
            addCriterion("CONFIG_VERSION in", values, "configVersion");
            return (Criteria) this;
        }

        public Criteria andConfigVersionNotIn(List<String> values) {
            addCriterion("CONFIG_VERSION not in", values, "configVersion");
            return (Criteria) this;
        }

        public Criteria andConfigVersionBetween(String value1, String value2) {
            addCriterion("CONFIG_VERSION between", value1, value2, "configVersion");
            return (Criteria) this;
        }

        public Criteria andConfigVersionNotBetween(String value1, String value2) {
            addCriterion("CONFIG_VERSION not between", value1, value2, "configVersion");
            return (Criteria) this;
        }

        public Criteria andEffectDateIsNull() {
            addCriterion("EFFECT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEffectDateIsNotNull() {
            addCriterion("EFFECT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEffectDateEqualTo(Date value) {
            addCriterion("EFFECT_DATE =", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateNotEqualTo(Date value) {
            addCriterion("EFFECT_DATE <>", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateGreaterThan(Date value) {
            addCriterion("EFFECT_DATE >", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EFFECT_DATE >=", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateLessThan(Date value) {
            addCriterion("EFFECT_DATE <", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateLessThanOrEqualTo(Date value) {
            addCriterion("EFFECT_DATE <=", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateIn(List<Date> values) {
            addCriterion("EFFECT_DATE in", values, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateNotIn(List<Date> values) {
            addCriterion("EFFECT_DATE not in", values, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateBetween(Date value1, Date value2) {
            addCriterion("EFFECT_DATE between", value1, value2, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateNotBetween(Date value1, Date value2) {
            addCriterion("EFFECT_DATE not between", value1, value2, "effectDate");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andLruIsNull() {
            addCriterion("LRU is null");
            return (Criteria) this;
        }

        public Criteria andLruIsNotNull() {
            addCriterion("LRU is not null");
            return (Criteria) this;
        }

        public Criteria andLruEqualTo(String value) {
            addCriterion("LRU =", value, "lru");
            return (Criteria) this;
        }

        public Criteria andLruNotEqualTo(String value) {
            addCriterion("LRU <>", value, "lru");
            return (Criteria) this;
        }

        public Criteria andLruGreaterThan(String value) {
            addCriterion("LRU >", value, "lru");
            return (Criteria) this;
        }

        public Criteria andLruGreaterThanOrEqualTo(String value) {
            addCriterion("LRU >=", value, "lru");
            return (Criteria) this;
        }

        public Criteria andLruLessThan(String value) {
            addCriterion("LRU <", value, "lru");
            return (Criteria) this;
        }

        public Criteria andLruLessThanOrEqualTo(String value) {
            addCriterion("LRU <=", value, "lru");
            return (Criteria) this;
        }

        public Criteria andLruLike(String value) {
            addCriterion("LRU like", value, "lru");
            return (Criteria) this;
        }

        public Criteria andLruNotLike(String value) {
            addCriterion("LRU not like", value, "lru");
            return (Criteria) this;
        }

        public Criteria andLruIn(List<String> values) {
            addCriterion("LRU in", values, "lru");
            return (Criteria) this;
        }

        public Criteria andLruNotIn(List<String> values) {
            addCriterion("LRU not in", values, "lru");
            return (Criteria) this;
        }

        public Criteria andLruBetween(String value1, String value2) {
            addCriterion("LRU between", value1, value2, "lru");
            return (Criteria) this;
        }

        public Criteria andLruNotBetween(String value1, String value2) {
            addCriterion("LRU not between", value1, value2, "lru");
            return (Criteria) this;
        }

        public Criteria andPartnoIdIsNull() {
            addCriterion("PARTNO_ID is null");
            return (Criteria) this;
        }

        public Criteria andPartnoIdIsNotNull() {
            addCriterion("PARTNO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPartnoIdEqualTo(String value) {
            addCriterion("PARTNO_ID =", value, "partnoId");
            return (Criteria) this;
        }

        public Criteria andPartnoIdNotEqualTo(String value) {
            addCriterion("PARTNO_ID <>", value, "partnoId");
            return (Criteria) this;
        }

        public Criteria andPartnoIdGreaterThan(String value) {
            addCriterion("PARTNO_ID >", value, "partnoId");
            return (Criteria) this;
        }

        public Criteria andPartnoIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARTNO_ID >=", value, "partnoId");
            return (Criteria) this;
        }

        public Criteria andPartnoIdLessThan(String value) {
            addCriterion("PARTNO_ID <", value, "partnoId");
            return (Criteria) this;
        }

        public Criteria andPartnoIdLessThanOrEqualTo(String value) {
            addCriterion("PARTNO_ID <=", value, "partnoId");
            return (Criteria) this;
        }

        public Criteria andPartnoIdLike(String value) {
            addCriterion("PARTNO_ID like", value, "partnoId");
            return (Criteria) this;
        }

        public Criteria andPartnoIdNotLike(String value) {
            addCriterion("PARTNO_ID not like", value, "partnoId");
            return (Criteria) this;
        }

        public Criteria andPartnoIdIn(List<String> values) {
            addCriterion("PARTNO_ID in", values, "partnoId");
            return (Criteria) this;
        }

        public Criteria andPartnoIdNotIn(List<String> values) {
            addCriterion("PARTNO_ID not in", values, "partnoId");
            return (Criteria) this;
        }

        public Criteria andPartnoIdBetween(String value1, String value2) {
            addCriterion("PARTNO_ID between", value1, value2, "partnoId");
            return (Criteria) this;
        }

        public Criteria andPartnoIdNotBetween(String value1, String value2) {
            addCriterion("PARTNO_ID not between", value1, value2, "partnoId");
            return (Criteria) this;
        }

        public Criteria andPrevIdIsNull() {
            addCriterion("PREV_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrevIdIsNotNull() {
            addCriterion("PREV_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrevIdEqualTo(String value) {
            addCriterion("PREV_ID =", value, "prevId");
            return (Criteria) this;
        }

        public Criteria andPrevIdNotEqualTo(String value) {
            addCriterion("PREV_ID <>", value, "prevId");
            return (Criteria) this;
        }

        public Criteria andPrevIdGreaterThan(String value) {
            addCriterion("PREV_ID >", value, "prevId");
            return (Criteria) this;
        }

        public Criteria andPrevIdGreaterThanOrEqualTo(String value) {
            addCriterion("PREV_ID >=", value, "prevId");
            return (Criteria) this;
        }

        public Criteria andPrevIdLessThan(String value) {
            addCriterion("PREV_ID <", value, "prevId");
            return (Criteria) this;
        }

        public Criteria andPrevIdLessThanOrEqualTo(String value) {
            addCriterion("PREV_ID <=", value, "prevId");
            return (Criteria) this;
        }

        public Criteria andPrevIdLike(String value) {
            addCriterion("PREV_ID like", value, "prevId");
            return (Criteria) this;
        }

        public Criteria andPrevIdNotLike(String value) {
            addCriterion("PREV_ID not like", value, "prevId");
            return (Criteria) this;
        }

        public Criteria andPrevIdIn(List<String> values) {
            addCriterion("PREV_ID in", values, "prevId");
            return (Criteria) this;
        }

        public Criteria andPrevIdNotIn(List<String> values) {
            addCriterion("PREV_ID not in", values, "prevId");
            return (Criteria) this;
        }

        public Criteria andPrevIdBetween(String value1, String value2) {
            addCriterion("PREV_ID between", value1, value2, "prevId");
            return (Criteria) this;
        }

        public Criteria andPrevIdNotBetween(String value1, String value2) {
            addCriterion("PREV_ID not between", value1, value2, "prevId");
            return (Criteria) this;
        }

        public Criteria andIsLastIsNull() {
            addCriterion("IS_LAST is null");
            return (Criteria) this;
        }

        public Criteria andIsLastIsNotNull() {
            addCriterion("IS_LAST is not null");
            return (Criteria) this;
        }

        public Criteria andIsLastEqualTo(Short value) {
            addCriterion("IS_LAST =", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastNotEqualTo(Short value) {
            addCriterion("IS_LAST <>", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastGreaterThan(Short value) {
            addCriterion("IS_LAST >", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_LAST >=", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastLessThan(Short value) {
            addCriterion("IS_LAST <", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastLessThanOrEqualTo(Short value) {
            addCriterion("IS_LAST <=", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastIn(List<Short> values) {
            addCriterion("IS_LAST in", values, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastNotIn(List<Short> values) {
            addCriterion("IS_LAST not in", values, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastBetween(Short value1, Short value2) {
            addCriterion("IS_LAST between", value1, value2, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastNotBetween(Short value1, Short value2) {
            addCriterion("IS_LAST not between", value1, value2, "isLast");
            return (Criteria) this;
        }

        public Criteria andPropertiesIsNull() {
            addCriterion("PROPERTIES is null");
            return (Criteria) this;
        }

        public Criteria andPropertiesIsNotNull() {
            addCriterion("PROPERTIES is not null");
            return (Criteria) this;
        }

        public Criteria andPropertiesEqualTo(String value) {
            addCriterion("PROPERTIES =", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesNotEqualTo(String value) {
            addCriterion("PROPERTIES <>", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesGreaterThan(String value) {
            addCriterion("PROPERTIES >", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTIES >=", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesLessThan(String value) {
            addCriterion("PROPERTIES <", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesLessThanOrEqualTo(String value) {
            addCriterion("PROPERTIES <=", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesLike(String value) {
            addCriterion("PROPERTIES like", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesNotLike(String value) {
            addCriterion("PROPERTIES not like", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesIn(List<String> values) {
            addCriterion("PROPERTIES in", values, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesNotIn(List<String> values) {
            addCriterion("PROPERTIES not in", values, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesBetween(String value1, String value2) {
            addCriterion("PROPERTIES between", value1, value2, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesNotBetween(String value1, String value2) {
            addCriterion("PROPERTIES not between", value1, value2, "properties");
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