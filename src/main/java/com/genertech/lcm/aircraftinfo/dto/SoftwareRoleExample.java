package com.genertech.lcm.aircraftinfo.dto;

import java.util.ArrayList;
import java.util.List;

public class SoftwareRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SoftwareRoleExample() {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("ROLE_ID like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("ROLE_ID not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("DEPT_ID like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("DEPT_ID not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleIdIsNull() {
            addCriterion("APPROVAL_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleIdIsNotNull() {
            addCriterion("APPROVAL_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleIdEqualTo(String value) {
            addCriterion("APPROVAL_ROLE_ID =", value, "approvalRoleId");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleIdNotEqualTo(String value) {
            addCriterion("APPROVAL_ROLE_ID <>", value, "approvalRoleId");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleIdGreaterThan(String value) {
            addCriterion("APPROVAL_ROLE_ID >", value, "approvalRoleId");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVAL_ROLE_ID >=", value, "approvalRoleId");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleIdLessThan(String value) {
            addCriterion("APPROVAL_ROLE_ID <", value, "approvalRoleId");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleIdLessThanOrEqualTo(String value) {
            addCriterion("APPROVAL_ROLE_ID <=", value, "approvalRoleId");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleIdLike(String value) {
            addCriterion("APPROVAL_ROLE_ID like", value, "approvalRoleId");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleIdNotLike(String value) {
            addCriterion("APPROVAL_ROLE_ID not like", value, "approvalRoleId");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleIdIn(List<String> values) {
            addCriterion("APPROVAL_ROLE_ID in", values, "approvalRoleId");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleIdNotIn(List<String> values) {
            addCriterion("APPROVAL_ROLE_ID not in", values, "approvalRoleId");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleIdBetween(String value1, String value2) {
            addCriterion("APPROVAL_ROLE_ID between", value1, value2, "approvalRoleId");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleIdNotBetween(String value1, String value2) {
            addCriterion("APPROVAL_ROLE_ID not between", value1, value2, "approvalRoleId");
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