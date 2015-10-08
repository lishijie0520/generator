package com.genertech.lcm.biz.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InfoDevExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfoDevExample() {
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

        public Criteria andDevIdIsNull() {
            addCriterion("DEV_ID is null");
            return (Criteria) this;
        }

        public Criteria andDevIdIsNotNull() {
            addCriterion("DEV_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDevIdEqualTo(String value) {
            addCriterion("DEV_ID =", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdNotEqualTo(String value) {
            addCriterion("DEV_ID <>", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdGreaterThan(String value) {
            addCriterion("DEV_ID >", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEV_ID >=", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdLessThan(String value) {
            addCriterion("DEV_ID <", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdLessThanOrEqualTo(String value) {
            addCriterion("DEV_ID <=", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdLike(String value) {
            addCriterion("DEV_ID like", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdNotLike(String value) {
            addCriterion("DEV_ID not like", value, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdIn(List<String> values) {
            addCriterion("DEV_ID in", values, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdNotIn(List<String> values) {
            addCriterion("DEV_ID not in", values, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdBetween(String value1, String value2) {
            addCriterion("DEV_ID between", value1, value2, "devId");
            return (Criteria) this;
        }

        public Criteria andDevIdNotBetween(String value1, String value2) {
            addCriterion("DEV_ID not between", value1, value2, "devId");
            return (Criteria) this;
        }

        public Criteria andDevNameIsNull() {
            addCriterion("DEV_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDevNameIsNotNull() {
            addCriterion("DEV_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDevNameEqualTo(String value) {
            addCriterion("DEV_NAME =", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotEqualTo(String value) {
            addCriterion("DEV_NAME <>", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameGreaterThan(String value) {
            addCriterion("DEV_NAME >", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEV_NAME >=", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLessThan(String value) {
            addCriterion("DEV_NAME <", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLessThanOrEqualTo(String value) {
            addCriterion("DEV_NAME <=", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLike(String value) {
            addCriterion("DEV_NAME like", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotLike(String value) {
            addCriterion("DEV_NAME not like", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameIn(List<String> values) {
            addCriterion("DEV_NAME in", values, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotIn(List<String> values) {
            addCriterion("DEV_NAME not in", values, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameBetween(String value1, String value2) {
            addCriterion("DEV_NAME between", value1, value2, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotBetween(String value1, String value2) {
            addCriterion("DEV_NAME not between", value1, value2, "devName");
            return (Criteria) this;
        }

        public Criteria andDevTypeIsNull() {
            addCriterion("DEV_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDevTypeIsNotNull() {
            addCriterion("DEV_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDevTypeEqualTo(Short value) {
            addCriterion("DEV_TYPE =", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotEqualTo(Short value) {
            addCriterion("DEV_TYPE <>", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeGreaterThan(Short value) {
            addCriterion("DEV_TYPE >", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("DEV_TYPE >=", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeLessThan(Short value) {
            addCriterion("DEV_TYPE <", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeLessThanOrEqualTo(Short value) {
            addCriterion("DEV_TYPE <=", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeIn(List<Short> values) {
            addCriterion("DEV_TYPE in", values, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotIn(List<Short> values) {
            addCriterion("DEV_TYPE not in", values, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeBetween(Short value1, Short value2) {
            addCriterion("DEV_TYPE between", value1, value2, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotBetween(Short value1, Short value2) {
            addCriterion("DEV_TYPE not between", value1, value2, "devType");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("SN is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("SN is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("SN =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("SN <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("SN >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("SN >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("SN <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("SN <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("SN like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("SN not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("SN in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("SN not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("SN between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("SN not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("PURPOSE is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("PURPOSE is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("PURPOSE =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("PURPOSE <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("PURPOSE >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("PURPOSE >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("PURPOSE <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("PURPOSE <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("PURPOSE like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("PURPOSE not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("PURPOSE in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("PURPOSE not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("PURPOSE between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("PURPOSE not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andCommonNameIsNull() {
            addCriterion("COMMON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCommonNameIsNotNull() {
            addCriterion("COMMON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCommonNameEqualTo(String value) {
            addCriterion("COMMON_NAME =", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotEqualTo(String value) {
            addCriterion("COMMON_NAME <>", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameGreaterThan(String value) {
            addCriterion("COMMON_NAME >", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMMON_NAME >=", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameLessThan(String value) {
            addCriterion("COMMON_NAME <", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameLessThanOrEqualTo(String value) {
            addCriterion("COMMON_NAME <=", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameLike(String value) {
            addCriterion("COMMON_NAME like", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotLike(String value) {
            addCriterion("COMMON_NAME not like", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameIn(List<String> values) {
            addCriterion("COMMON_NAME in", values, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotIn(List<String> values) {
            addCriterion("COMMON_NAME not in", values, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameBetween(String value1, String value2) {
            addCriterion("COMMON_NAME between", value1, value2, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotBetween(String value1, String value2) {
            addCriterion("COMMON_NAME not between", value1, value2, "commonName");
            return (Criteria) this;
        }

        public Criteria andLibDeviceNameIsNull() {
            addCriterion("LIB_DEVICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLibDeviceNameIsNotNull() {
            addCriterion("LIB_DEVICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLibDeviceNameEqualTo(String value) {
            addCriterion("LIB_DEVICE_NAME =", value, "libDeviceName");
            return (Criteria) this;
        }

        public Criteria andLibDeviceNameNotEqualTo(String value) {
            addCriterion("LIB_DEVICE_NAME <>", value, "libDeviceName");
            return (Criteria) this;
        }

        public Criteria andLibDeviceNameGreaterThan(String value) {
            addCriterion("LIB_DEVICE_NAME >", value, "libDeviceName");
            return (Criteria) this;
        }

        public Criteria andLibDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("LIB_DEVICE_NAME >=", value, "libDeviceName");
            return (Criteria) this;
        }

        public Criteria andLibDeviceNameLessThan(String value) {
            addCriterion("LIB_DEVICE_NAME <", value, "libDeviceName");
            return (Criteria) this;
        }

        public Criteria andLibDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("LIB_DEVICE_NAME <=", value, "libDeviceName");
            return (Criteria) this;
        }

        public Criteria andLibDeviceNameLike(String value) {
            addCriterion("LIB_DEVICE_NAME like", value, "libDeviceName");
            return (Criteria) this;
        }

        public Criteria andLibDeviceNameNotLike(String value) {
            addCriterion("LIB_DEVICE_NAME not like", value, "libDeviceName");
            return (Criteria) this;
        }

        public Criteria andLibDeviceNameIn(List<String> values) {
            addCriterion("LIB_DEVICE_NAME in", values, "libDeviceName");
            return (Criteria) this;
        }

        public Criteria andLibDeviceNameNotIn(List<String> values) {
            addCriterion("LIB_DEVICE_NAME not in", values, "libDeviceName");
            return (Criteria) this;
        }

        public Criteria andLibDeviceNameBetween(String value1, String value2) {
            addCriterion("LIB_DEVICE_NAME between", value1, value2, "libDeviceName");
            return (Criteria) this;
        }

        public Criteria andLibDeviceNameNotBetween(String value1, String value2) {
            addCriterion("LIB_DEVICE_NAME not between", value1, value2, "libDeviceName");
            return (Criteria) this;
        }

        public Criteria andLibDevicePasswordIsNull() {
            addCriterion("LIB_DEVICE_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andLibDevicePasswordIsNotNull() {
            addCriterion("LIB_DEVICE_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andLibDevicePasswordEqualTo(String value) {
            addCriterion("LIB_DEVICE_PASSWORD =", value, "libDevicePassword");
            return (Criteria) this;
        }

        public Criteria andLibDevicePasswordNotEqualTo(String value) {
            addCriterion("LIB_DEVICE_PASSWORD <>", value, "libDevicePassword");
            return (Criteria) this;
        }

        public Criteria andLibDevicePasswordGreaterThan(String value) {
            addCriterion("LIB_DEVICE_PASSWORD >", value, "libDevicePassword");
            return (Criteria) this;
        }

        public Criteria andLibDevicePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("LIB_DEVICE_PASSWORD >=", value, "libDevicePassword");
            return (Criteria) this;
        }

        public Criteria andLibDevicePasswordLessThan(String value) {
            addCriterion("LIB_DEVICE_PASSWORD <", value, "libDevicePassword");
            return (Criteria) this;
        }

        public Criteria andLibDevicePasswordLessThanOrEqualTo(String value) {
            addCriterion("LIB_DEVICE_PASSWORD <=", value, "libDevicePassword");
            return (Criteria) this;
        }

        public Criteria andLibDevicePasswordLike(String value) {
            addCriterion("LIB_DEVICE_PASSWORD like", value, "libDevicePassword");
            return (Criteria) this;
        }

        public Criteria andLibDevicePasswordNotLike(String value) {
            addCriterion("LIB_DEVICE_PASSWORD not like", value, "libDevicePassword");
            return (Criteria) this;
        }

        public Criteria andLibDevicePasswordIn(List<String> values) {
            addCriterion("LIB_DEVICE_PASSWORD in", values, "libDevicePassword");
            return (Criteria) this;
        }

        public Criteria andLibDevicePasswordNotIn(List<String> values) {
            addCriterion("LIB_DEVICE_PASSWORD not in", values, "libDevicePassword");
            return (Criteria) this;
        }

        public Criteria andLibDevicePasswordBetween(String value1, String value2) {
            addCriterion("LIB_DEVICE_PASSWORD between", value1, value2, "libDevicePassword");
            return (Criteria) this;
        }

        public Criteria andLibDevicePasswordNotBetween(String value1, String value2) {
            addCriterion("LIB_DEVICE_PASSWORD not between", value1, value2, "libDevicePassword");
            return (Criteria) this;
        }

        public Criteria andLibUserNameIsNull() {
            addCriterion("LIB_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLibUserNameIsNotNull() {
            addCriterion("LIB_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLibUserNameEqualTo(String value) {
            addCriterion("LIB_USER_NAME =", value, "libUserName");
            return (Criteria) this;
        }

        public Criteria andLibUserNameNotEqualTo(String value) {
            addCriterion("LIB_USER_NAME <>", value, "libUserName");
            return (Criteria) this;
        }

        public Criteria andLibUserNameGreaterThan(String value) {
            addCriterion("LIB_USER_NAME >", value, "libUserName");
            return (Criteria) this;
        }

        public Criteria andLibUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("LIB_USER_NAME >=", value, "libUserName");
            return (Criteria) this;
        }

        public Criteria andLibUserNameLessThan(String value) {
            addCriterion("LIB_USER_NAME <", value, "libUserName");
            return (Criteria) this;
        }

        public Criteria andLibUserNameLessThanOrEqualTo(String value) {
            addCriterion("LIB_USER_NAME <=", value, "libUserName");
            return (Criteria) this;
        }

        public Criteria andLibUserNameLike(String value) {
            addCriterion("LIB_USER_NAME like", value, "libUserName");
            return (Criteria) this;
        }

        public Criteria andLibUserNameNotLike(String value) {
            addCriterion("LIB_USER_NAME not like", value, "libUserName");
            return (Criteria) this;
        }

        public Criteria andLibUserNameIn(List<String> values) {
            addCriterion("LIB_USER_NAME in", values, "libUserName");
            return (Criteria) this;
        }

        public Criteria andLibUserNameNotIn(List<String> values) {
            addCriterion("LIB_USER_NAME not in", values, "libUserName");
            return (Criteria) this;
        }

        public Criteria andLibUserNameBetween(String value1, String value2) {
            addCriterion("LIB_USER_NAME between", value1, value2, "libUserName");
            return (Criteria) this;
        }

        public Criteria andLibUserNameNotBetween(String value1, String value2) {
            addCriterion("LIB_USER_NAME not between", value1, value2, "libUserName");
            return (Criteria) this;
        }

        public Criteria andLibUserPasswordIsNull() {
            addCriterion("LIB_USER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andLibUserPasswordIsNotNull() {
            addCriterion("LIB_USER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andLibUserPasswordEqualTo(String value) {
            addCriterion("LIB_USER_PASSWORD =", value, "libUserPassword");
            return (Criteria) this;
        }

        public Criteria andLibUserPasswordNotEqualTo(String value) {
            addCriterion("LIB_USER_PASSWORD <>", value, "libUserPassword");
            return (Criteria) this;
        }

        public Criteria andLibUserPasswordGreaterThan(String value) {
            addCriterion("LIB_USER_PASSWORD >", value, "libUserPassword");
            return (Criteria) this;
        }

        public Criteria andLibUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("LIB_USER_PASSWORD >=", value, "libUserPassword");
            return (Criteria) this;
        }

        public Criteria andLibUserPasswordLessThan(String value) {
            addCriterion("LIB_USER_PASSWORD <", value, "libUserPassword");
            return (Criteria) this;
        }

        public Criteria andLibUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("LIB_USER_PASSWORD <=", value, "libUserPassword");
            return (Criteria) this;
        }

        public Criteria andLibUserPasswordLike(String value) {
            addCriterion("LIB_USER_PASSWORD like", value, "libUserPassword");
            return (Criteria) this;
        }

        public Criteria andLibUserPasswordNotLike(String value) {
            addCriterion("LIB_USER_PASSWORD not like", value, "libUserPassword");
            return (Criteria) this;
        }

        public Criteria andLibUserPasswordIn(List<String> values) {
            addCriterion("LIB_USER_PASSWORD in", values, "libUserPassword");
            return (Criteria) this;
        }

        public Criteria andLibUserPasswordNotIn(List<String> values) {
            addCriterion("LIB_USER_PASSWORD not in", values, "libUserPassword");
            return (Criteria) this;
        }

        public Criteria andLibUserPasswordBetween(String value1, String value2) {
            addCriterion("LIB_USER_PASSWORD between", value1, value2, "libUserPassword");
            return (Criteria) this;
        }

        public Criteria andLibUserPasswordNotBetween(String value1, String value2) {
            addCriterion("LIB_USER_PASSWORD not between", value1, value2, "libUserPassword");
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

        public Criteria andHoldersIsNull() {
            addCriterion("HOLDERS is null");
            return (Criteria) this;
        }

        public Criteria andHoldersIsNotNull() {
            addCriterion("HOLDERS is not null");
            return (Criteria) this;
        }

        public Criteria andHoldersEqualTo(String value) {
            addCriterion("HOLDERS =", value, "holders");
            return (Criteria) this;
        }

        public Criteria andHoldersNotEqualTo(String value) {
            addCriterion("HOLDERS <>", value, "holders");
            return (Criteria) this;
        }

        public Criteria andHoldersGreaterThan(String value) {
            addCriterion("HOLDERS >", value, "holders");
            return (Criteria) this;
        }

        public Criteria andHoldersGreaterThanOrEqualTo(String value) {
            addCriterion("HOLDERS >=", value, "holders");
            return (Criteria) this;
        }

        public Criteria andHoldersLessThan(String value) {
            addCriterion("HOLDERS <", value, "holders");
            return (Criteria) this;
        }

        public Criteria andHoldersLessThanOrEqualTo(String value) {
            addCriterion("HOLDERS <=", value, "holders");
            return (Criteria) this;
        }

        public Criteria andHoldersLike(String value) {
            addCriterion("HOLDERS like", value, "holders");
            return (Criteria) this;
        }

        public Criteria andHoldersNotLike(String value) {
            addCriterion("HOLDERS not like", value, "holders");
            return (Criteria) this;
        }

        public Criteria andHoldersIn(List<String> values) {
            addCriterion("HOLDERS in", values, "holders");
            return (Criteria) this;
        }

        public Criteria andHoldersNotIn(List<String> values) {
            addCriterion("HOLDERS not in", values, "holders");
            return (Criteria) this;
        }

        public Criteria andHoldersBetween(String value1, String value2) {
            addCriterion("HOLDERS between", value1, value2, "holders");
            return (Criteria) this;
        }

        public Criteria andHoldersNotBetween(String value1, String value2) {
            addCriterion("HOLDERS not between", value1, value2, "holders");
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

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
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

        public Criteria andCreateDatetimeIsNull() {
            addCriterion("CREATE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNotNull() {
            addCriterion("CREATE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeEqualTo(Date value) {
            addCriterion("CREATE_DATETIME =", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotEqualTo(Date value) {
            addCriterion("CREATE_DATETIME <>", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThan(Date value) {
            addCriterion("CREATE_DATETIME >", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATETIME >=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThan(Date value) {
            addCriterion("CREATE_DATETIME <", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATETIME <=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIn(List<Date> values) {
            addCriterion("CREATE_DATETIME in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotIn(List<Date> values) {
            addCriterion("CREATE_DATETIME not in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATETIME between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATETIME not between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("UPDATE_USER like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("UPDATE_USER not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNull() {
            addCriterion("UPDATE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("UPDATE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(Date value) {
            addCriterion("UPDATE_DATETIME >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(Date value) {
            addCriterion("UPDATE_DATETIME <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<Date> values) {
            addCriterion("UPDATE_DATETIME in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<Date> values) {
            addCriterion("UPDATE_DATETIME not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATETIME between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATETIME not between", value1, value2, "updateDatetime");
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