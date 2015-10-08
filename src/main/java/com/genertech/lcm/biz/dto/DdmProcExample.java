package com.genertech.lcm.biz.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DdmProcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DdmProcExample() {
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

        public Criteria andProcDefKeyIsNull() {
            addCriterion("PROC_DEF_KEY is null");
            return (Criteria) this;
        }

        public Criteria andProcDefKeyIsNotNull() {
            addCriterion("PROC_DEF_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andProcDefKeyEqualTo(String value) {
            addCriterion("PROC_DEF_KEY =", value, "procDefKey");
            return (Criteria) this;
        }

        public Criteria andProcDefKeyNotEqualTo(String value) {
            addCriterion("PROC_DEF_KEY <>", value, "procDefKey");
            return (Criteria) this;
        }

        public Criteria andProcDefKeyGreaterThan(String value) {
            addCriterion("PROC_DEF_KEY >", value, "procDefKey");
            return (Criteria) this;
        }

        public Criteria andProcDefKeyGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_DEF_KEY >=", value, "procDefKey");
            return (Criteria) this;
        }

        public Criteria andProcDefKeyLessThan(String value) {
            addCriterion("PROC_DEF_KEY <", value, "procDefKey");
            return (Criteria) this;
        }

        public Criteria andProcDefKeyLessThanOrEqualTo(String value) {
            addCriterion("PROC_DEF_KEY <=", value, "procDefKey");
            return (Criteria) this;
        }

        public Criteria andProcDefKeyLike(String value) {
            addCriterion("PROC_DEF_KEY like", value, "procDefKey");
            return (Criteria) this;
        }

        public Criteria andProcDefKeyNotLike(String value) {
            addCriterion("PROC_DEF_KEY not like", value, "procDefKey");
            return (Criteria) this;
        }

        public Criteria andProcDefKeyIn(List<String> values) {
            addCriterion("PROC_DEF_KEY in", values, "procDefKey");
            return (Criteria) this;
        }

        public Criteria andProcDefKeyNotIn(List<String> values) {
            addCriterion("PROC_DEF_KEY not in", values, "procDefKey");
            return (Criteria) this;
        }

        public Criteria andProcDefKeyBetween(String value1, String value2) {
            addCriterion("PROC_DEF_KEY between", value1, value2, "procDefKey");
            return (Criteria) this;
        }

        public Criteria andProcDefKeyNotBetween(String value1, String value2) {
            addCriterion("PROC_DEF_KEY not between", value1, value2, "procDefKey");
            return (Criteria) this;
        }

        public Criteria andProcDefIdIsNull() {
            addCriterion("PROC_DEF_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcDefIdIsNotNull() {
            addCriterion("PROC_DEF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcDefIdEqualTo(String value) {
            addCriterion("PROC_DEF_ID =", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdNotEqualTo(String value) {
            addCriterion("PROC_DEF_ID <>", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdGreaterThan(String value) {
            addCriterion("PROC_DEF_ID >", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_DEF_ID >=", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdLessThan(String value) {
            addCriterion("PROC_DEF_ID <", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdLessThanOrEqualTo(String value) {
            addCriterion("PROC_DEF_ID <=", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdLike(String value) {
            addCriterion("PROC_DEF_ID like", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdNotLike(String value) {
            addCriterion("PROC_DEF_ID not like", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdIn(List<String> values) {
            addCriterion("PROC_DEF_ID in", values, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdNotIn(List<String> values) {
            addCriterion("PROC_DEF_ID not in", values, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdBetween(String value1, String value2) {
            addCriterion("PROC_DEF_ID between", value1, value2, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdNotBetween(String value1, String value2) {
            addCriterion("PROC_DEF_ID not between", value1, value2, "procDefId");
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

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("CHECK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("CHECK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("CHECK_TIME =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("CHECK_TIME <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("CHECK_TIME >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECK_TIME >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("CHECK_TIME <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("CHECK_TIME <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("CHECK_TIME in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("CHECK_TIME not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("CHECK_TIME between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("CHECK_TIME not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckUserIsNull() {
            addCriterion("CHECK_USER is null");
            return (Criteria) this;
        }

        public Criteria andCheckUserIsNotNull() {
            addCriterion("CHECK_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCheckUserEqualTo(String value) {
            addCriterion("CHECK_USER =", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserNotEqualTo(String value) {
            addCriterion("CHECK_USER <>", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserGreaterThan(String value) {
            addCriterion("CHECK_USER >", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_USER >=", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserLessThan(String value) {
            addCriterion("CHECK_USER <", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserLessThanOrEqualTo(String value) {
            addCriterion("CHECK_USER <=", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserLike(String value) {
            addCriterion("CHECK_USER like", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserNotLike(String value) {
            addCriterion("CHECK_USER not like", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserIn(List<String> values) {
            addCriterion("CHECK_USER in", values, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserNotIn(List<String> values) {
            addCriterion("CHECK_USER not in", values, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserBetween(String value1, String value2) {
            addCriterion("CHECK_USER between", value1, value2, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserNotBetween(String value1, String value2) {
            addCriterion("CHECK_USER not between", value1, value2, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkIsNull() {
            addCriterion("CHECK_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkIsNotNull() {
            addCriterion("CHECK_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkEqualTo(String value) {
            addCriterion("CHECK_REMARK =", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotEqualTo(String value) {
            addCriterion("CHECK_REMARK <>", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkGreaterThan(String value) {
            addCriterion("CHECK_REMARK >", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_REMARK >=", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkLessThan(String value) {
            addCriterion("CHECK_REMARK <", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkLessThanOrEqualTo(String value) {
            addCriterion("CHECK_REMARK <=", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkLike(String value) {
            addCriterion("CHECK_REMARK like", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotLike(String value) {
            addCriterion("CHECK_REMARK not like", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkIn(List<String> values) {
            addCriterion("CHECK_REMARK in", values, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotIn(List<String> values) {
            addCriterion("CHECK_REMARK not in", values, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkBetween(String value1, String value2) {
            addCriterion("CHECK_REMARK between", value1, value2, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotBetween(String value1, String value2) {
            addCriterion("CHECK_REMARK not between", value1, value2, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andProveTimeIsNull() {
            addCriterion("PROVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andProveTimeIsNotNull() {
            addCriterion("PROVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andProveTimeEqualTo(Date value) {
            addCriterion("PROVE_TIME =", value, "proveTime");
            return (Criteria) this;
        }

        public Criteria andProveTimeNotEqualTo(Date value) {
            addCriterion("PROVE_TIME <>", value, "proveTime");
            return (Criteria) this;
        }

        public Criteria andProveTimeGreaterThan(Date value) {
            addCriterion("PROVE_TIME >", value, "proveTime");
            return (Criteria) this;
        }

        public Criteria andProveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PROVE_TIME >=", value, "proveTime");
            return (Criteria) this;
        }

        public Criteria andProveTimeLessThan(Date value) {
            addCriterion("PROVE_TIME <", value, "proveTime");
            return (Criteria) this;
        }

        public Criteria andProveTimeLessThanOrEqualTo(Date value) {
            addCriterion("PROVE_TIME <=", value, "proveTime");
            return (Criteria) this;
        }

        public Criteria andProveTimeIn(List<Date> values) {
            addCriterion("PROVE_TIME in", values, "proveTime");
            return (Criteria) this;
        }

        public Criteria andProveTimeNotIn(List<Date> values) {
            addCriterion("PROVE_TIME not in", values, "proveTime");
            return (Criteria) this;
        }

        public Criteria andProveTimeBetween(Date value1, Date value2) {
            addCriterion("PROVE_TIME between", value1, value2, "proveTime");
            return (Criteria) this;
        }

        public Criteria andProveTimeNotBetween(Date value1, Date value2) {
            addCriterion("PROVE_TIME not between", value1, value2, "proveTime");
            return (Criteria) this;
        }

        public Criteria andProveUserIsNull() {
            addCriterion("PROVE_USER is null");
            return (Criteria) this;
        }

        public Criteria andProveUserIsNotNull() {
            addCriterion("PROVE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andProveUserEqualTo(String value) {
            addCriterion("PROVE_USER =", value, "proveUser");
            return (Criteria) this;
        }

        public Criteria andProveUserNotEqualTo(String value) {
            addCriterion("PROVE_USER <>", value, "proveUser");
            return (Criteria) this;
        }

        public Criteria andProveUserGreaterThan(String value) {
            addCriterion("PROVE_USER >", value, "proveUser");
            return (Criteria) this;
        }

        public Criteria andProveUserGreaterThanOrEqualTo(String value) {
            addCriterion("PROVE_USER >=", value, "proveUser");
            return (Criteria) this;
        }

        public Criteria andProveUserLessThan(String value) {
            addCriterion("PROVE_USER <", value, "proveUser");
            return (Criteria) this;
        }

        public Criteria andProveUserLessThanOrEqualTo(String value) {
            addCriterion("PROVE_USER <=", value, "proveUser");
            return (Criteria) this;
        }

        public Criteria andProveUserLike(String value) {
            addCriterion("PROVE_USER like", value, "proveUser");
            return (Criteria) this;
        }

        public Criteria andProveUserNotLike(String value) {
            addCriterion("PROVE_USER not like", value, "proveUser");
            return (Criteria) this;
        }

        public Criteria andProveUserIn(List<String> values) {
            addCriterion("PROVE_USER in", values, "proveUser");
            return (Criteria) this;
        }

        public Criteria andProveUserNotIn(List<String> values) {
            addCriterion("PROVE_USER not in", values, "proveUser");
            return (Criteria) this;
        }

        public Criteria andProveUserBetween(String value1, String value2) {
            addCriterion("PROVE_USER between", value1, value2, "proveUser");
            return (Criteria) this;
        }

        public Criteria andProveUserNotBetween(String value1, String value2) {
            addCriterion("PROVE_USER not between", value1, value2, "proveUser");
            return (Criteria) this;
        }

        public Criteria andProveRemarkIsNull() {
            addCriterion("PROVE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andProveRemarkIsNotNull() {
            addCriterion("PROVE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andProveRemarkEqualTo(String value) {
            addCriterion("PROVE_REMARK =", value, "proveRemark");
            return (Criteria) this;
        }

        public Criteria andProveRemarkNotEqualTo(String value) {
            addCriterion("PROVE_REMARK <>", value, "proveRemark");
            return (Criteria) this;
        }

        public Criteria andProveRemarkGreaterThan(String value) {
            addCriterion("PROVE_REMARK >", value, "proveRemark");
            return (Criteria) this;
        }

        public Criteria andProveRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("PROVE_REMARK >=", value, "proveRemark");
            return (Criteria) this;
        }

        public Criteria andProveRemarkLessThan(String value) {
            addCriterion("PROVE_REMARK <", value, "proveRemark");
            return (Criteria) this;
        }

        public Criteria andProveRemarkLessThanOrEqualTo(String value) {
            addCriterion("PROVE_REMARK <=", value, "proveRemark");
            return (Criteria) this;
        }

        public Criteria andProveRemarkLike(String value) {
            addCriterion("PROVE_REMARK like", value, "proveRemark");
            return (Criteria) this;
        }

        public Criteria andProveRemarkNotLike(String value) {
            addCriterion("PROVE_REMARK not like", value, "proveRemark");
            return (Criteria) this;
        }

        public Criteria andProveRemarkIn(List<String> values) {
            addCriterion("PROVE_REMARK in", values, "proveRemark");
            return (Criteria) this;
        }

        public Criteria andProveRemarkNotIn(List<String> values) {
            addCriterion("PROVE_REMARK not in", values, "proveRemark");
            return (Criteria) this;
        }

        public Criteria andProveRemarkBetween(String value1, String value2) {
            addCriterion("PROVE_REMARK between", value1, value2, "proveRemark");
            return (Criteria) this;
        }

        public Criteria andProveRemarkNotBetween(String value1, String value2) {
            addCriterion("PROVE_REMARK not between", value1, value2, "proveRemark");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("STATE not between", value1, value2, "state");
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