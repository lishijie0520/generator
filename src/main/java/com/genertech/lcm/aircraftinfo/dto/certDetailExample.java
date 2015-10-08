package com.genertech.lcm.aircraftinfo.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class certDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public certDetailExample() {
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

        public Criteria andCertapprovedateIsNull() {
            addCriterion("CERTAPPROVEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCertapprovedateIsNotNull() {
            addCriterion("CERTAPPROVEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCertapprovedateEqualTo(Date value) {
            addCriterion("CERTAPPROVEDATE =", value, "certapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertapprovedateNotEqualTo(Date value) {
            addCriterion("CERTAPPROVEDATE <>", value, "certapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertapprovedateGreaterThan(Date value) {
            addCriterion("CERTAPPROVEDATE >", value, "certapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertapprovedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CERTAPPROVEDATE >=", value, "certapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertapprovedateLessThan(Date value) {
            addCriterion("CERTAPPROVEDATE <", value, "certapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertapprovedateLessThanOrEqualTo(Date value) {
            addCriterion("CERTAPPROVEDATE <=", value, "certapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertapprovedateIn(List<Date> values) {
            addCriterion("CERTAPPROVEDATE in", values, "certapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertapprovedateNotIn(List<Date> values) {
            addCriterion("CERTAPPROVEDATE not in", values, "certapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertapprovedateBetween(Date value1, Date value2) {
            addCriterion("CERTAPPROVEDATE between", value1, value2, "certapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertapprovedateNotBetween(Date value1, Date value2) {
            addCriterion("CERTAPPROVEDATE not between", value1, value2, "certapprovedate");
            return (Criteria) this;
        }

        public Criteria andCertrejectdateIsNull() {
            addCriterion("CERTREJECTDATE is null");
            return (Criteria) this;
        }

        public Criteria andCertrejectdateIsNotNull() {
            addCriterion("CERTREJECTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCertrejectdateEqualTo(Date value) {
            addCriterion("CERTREJECTDATE =", value, "certrejectdate");
            return (Criteria) this;
        }

        public Criteria andCertrejectdateNotEqualTo(Date value) {
            addCriterion("CERTREJECTDATE <>", value, "certrejectdate");
            return (Criteria) this;
        }

        public Criteria andCertrejectdateGreaterThan(Date value) {
            addCriterion("CERTREJECTDATE >", value, "certrejectdate");
            return (Criteria) this;
        }

        public Criteria andCertrejectdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CERTREJECTDATE >=", value, "certrejectdate");
            return (Criteria) this;
        }

        public Criteria andCertrejectdateLessThan(Date value) {
            addCriterion("CERTREJECTDATE <", value, "certrejectdate");
            return (Criteria) this;
        }

        public Criteria andCertrejectdateLessThanOrEqualTo(Date value) {
            addCriterion("CERTREJECTDATE <=", value, "certrejectdate");
            return (Criteria) this;
        }

        public Criteria andCertrejectdateIn(List<Date> values) {
            addCriterion("CERTREJECTDATE in", values, "certrejectdate");
            return (Criteria) this;
        }

        public Criteria andCertrejectdateNotIn(List<Date> values) {
            addCriterion("CERTREJECTDATE not in", values, "certrejectdate");
            return (Criteria) this;
        }

        public Criteria andCertrejectdateBetween(Date value1, Date value2) {
            addCriterion("CERTREJECTDATE between", value1, value2, "certrejectdate");
            return (Criteria) this;
        }

        public Criteria andCertrejectdateNotBetween(Date value1, Date value2) {
            addCriterion("CERTREJECTDATE not between", value1, value2, "certrejectdate");
            return (Criteria) this;
        }

        public Criteria andCertsigndateIsNull() {
            addCriterion("CERTSIGNDATE is null");
            return (Criteria) this;
        }

        public Criteria andCertsigndateIsNotNull() {
            addCriterion("CERTSIGNDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCertsigndateEqualTo(Date value) {
            addCriterion("CERTSIGNDATE =", value, "certsigndate");
            return (Criteria) this;
        }

        public Criteria andCertsigndateNotEqualTo(Date value) {
            addCriterion("CERTSIGNDATE <>", value, "certsigndate");
            return (Criteria) this;
        }

        public Criteria andCertsigndateGreaterThan(Date value) {
            addCriterion("CERTSIGNDATE >", value, "certsigndate");
            return (Criteria) this;
        }

        public Criteria andCertsigndateGreaterThanOrEqualTo(Date value) {
            addCriterion("CERTSIGNDATE >=", value, "certsigndate");
            return (Criteria) this;
        }

        public Criteria andCertsigndateLessThan(Date value) {
            addCriterion("CERTSIGNDATE <", value, "certsigndate");
            return (Criteria) this;
        }

        public Criteria andCertsigndateLessThanOrEqualTo(Date value) {
            addCriterion("CERTSIGNDATE <=", value, "certsigndate");
            return (Criteria) this;
        }

        public Criteria andCertsigndateIn(List<Date> values) {
            addCriterion("CERTSIGNDATE in", values, "certsigndate");
            return (Criteria) this;
        }

        public Criteria andCertsigndateNotIn(List<Date> values) {
            addCriterion("CERTSIGNDATE not in", values, "certsigndate");
            return (Criteria) this;
        }

        public Criteria andCertsigndateBetween(Date value1, Date value2) {
            addCriterion("CERTSIGNDATE between", value1, value2, "certsigndate");
            return (Criteria) this;
        }

        public Criteria andCertsigndateNotBetween(Date value1, Date value2) {
            addCriterion("CERTSIGNDATE not between", value1, value2, "certsigndate");
            return (Criteria) this;
        }

        public Criteria andCertserialnumberIsNull() {
            addCriterion("CERTSERIALNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCertserialnumberIsNotNull() {
            addCriterion("CERTSERIALNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCertserialnumberEqualTo(String value) {
            addCriterion("CERTSERIALNUMBER =", value, "certserialnumber");
            return (Criteria) this;
        }

        public Criteria andCertserialnumberNotEqualTo(String value) {
            addCriterion("CERTSERIALNUMBER <>", value, "certserialnumber");
            return (Criteria) this;
        }

        public Criteria andCertserialnumberGreaterThan(String value) {
            addCriterion("CERTSERIALNUMBER >", value, "certserialnumber");
            return (Criteria) this;
        }

        public Criteria andCertserialnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CERTSERIALNUMBER >=", value, "certserialnumber");
            return (Criteria) this;
        }

        public Criteria andCertserialnumberLessThan(String value) {
            addCriterion("CERTSERIALNUMBER <", value, "certserialnumber");
            return (Criteria) this;
        }

        public Criteria andCertserialnumberLessThanOrEqualTo(String value) {
            addCriterion("CERTSERIALNUMBER <=", value, "certserialnumber");
            return (Criteria) this;
        }

        public Criteria andCertserialnumberLike(String value) {
            addCriterion("CERTSERIALNUMBER like", value, "certserialnumber");
            return (Criteria) this;
        }

        public Criteria andCertserialnumberNotLike(String value) {
            addCriterion("CERTSERIALNUMBER not like", value, "certserialnumber");
            return (Criteria) this;
        }

        public Criteria andCertserialnumberIn(List<String> values) {
            addCriterion("CERTSERIALNUMBER in", values, "certserialnumber");
            return (Criteria) this;
        }

        public Criteria andCertserialnumberNotIn(List<String> values) {
            addCriterion("CERTSERIALNUMBER not in", values, "certserialnumber");
            return (Criteria) this;
        }

        public Criteria andCertserialnumberBetween(String value1, String value2) {
            addCriterion("CERTSERIALNUMBER between", value1, value2, "certserialnumber");
            return (Criteria) this;
        }

        public Criteria andCertserialnumberNotBetween(String value1, String value2) {
            addCriterion("CERTSERIALNUMBER not between", value1, value2, "certserialnumber");
            return (Criteria) this;
        }

        public Criteria andCertnotbeforeIsNull() {
            addCriterion("CERTNOTBEFORE is null");
            return (Criteria) this;
        }

        public Criteria andCertnotbeforeIsNotNull() {
            addCriterion("CERTNOTBEFORE is not null");
            return (Criteria) this;
        }

        public Criteria andCertnotbeforeEqualTo(Date value) {
            addCriterion("CERTNOTBEFORE =", value, "certnotbefore");
            return (Criteria) this;
        }

        public Criteria andCertnotbeforeNotEqualTo(Date value) {
            addCriterion("CERTNOTBEFORE <>", value, "certnotbefore");
            return (Criteria) this;
        }

        public Criteria andCertnotbeforeGreaterThan(Date value) {
            addCriterion("CERTNOTBEFORE >", value, "certnotbefore");
            return (Criteria) this;
        }

        public Criteria andCertnotbeforeGreaterThanOrEqualTo(Date value) {
            addCriterion("CERTNOTBEFORE >=", value, "certnotbefore");
            return (Criteria) this;
        }

        public Criteria andCertnotbeforeLessThan(Date value) {
            addCriterion("CERTNOTBEFORE <", value, "certnotbefore");
            return (Criteria) this;
        }

        public Criteria andCertnotbeforeLessThanOrEqualTo(Date value) {
            addCriterion("CERTNOTBEFORE <=", value, "certnotbefore");
            return (Criteria) this;
        }

        public Criteria andCertnotbeforeIn(List<Date> values) {
            addCriterion("CERTNOTBEFORE in", values, "certnotbefore");
            return (Criteria) this;
        }

        public Criteria andCertnotbeforeNotIn(List<Date> values) {
            addCriterion("CERTNOTBEFORE not in", values, "certnotbefore");
            return (Criteria) this;
        }

        public Criteria andCertnotbeforeBetween(Date value1, Date value2) {
            addCriterion("CERTNOTBEFORE between", value1, value2, "certnotbefore");
            return (Criteria) this;
        }

        public Criteria andCertnotbeforeNotBetween(Date value1, Date value2) {
            addCriterion("CERTNOTBEFORE not between", value1, value2, "certnotbefore");
            return (Criteria) this;
        }

        public Criteria andCertnotafterIsNull() {
            addCriterion("CERTNOTAFTER is null");
            return (Criteria) this;
        }

        public Criteria andCertnotafterIsNotNull() {
            addCriterion("CERTNOTAFTER is not null");
            return (Criteria) this;
        }

        public Criteria andCertnotafterEqualTo(Date value) {
            addCriterion("CERTNOTAFTER =", value, "certnotafter");
            return (Criteria) this;
        }

        public Criteria andCertnotafterNotEqualTo(Date value) {
            addCriterion("CERTNOTAFTER <>", value, "certnotafter");
            return (Criteria) this;
        }

        public Criteria andCertnotafterGreaterThan(Date value) {
            addCriterion("CERTNOTAFTER >", value, "certnotafter");
            return (Criteria) this;
        }

        public Criteria andCertnotafterGreaterThanOrEqualTo(Date value) {
            addCriterion("CERTNOTAFTER >=", value, "certnotafter");
            return (Criteria) this;
        }

        public Criteria andCertnotafterLessThan(Date value) {
            addCriterion("CERTNOTAFTER <", value, "certnotafter");
            return (Criteria) this;
        }

        public Criteria andCertnotafterLessThanOrEqualTo(Date value) {
            addCriterion("CERTNOTAFTER <=", value, "certnotafter");
            return (Criteria) this;
        }

        public Criteria andCertnotafterIn(List<Date> values) {
            addCriterion("CERTNOTAFTER in", values, "certnotafter");
            return (Criteria) this;
        }

        public Criteria andCertnotafterNotIn(List<Date> values) {
            addCriterion("CERTNOTAFTER not in", values, "certnotafter");
            return (Criteria) this;
        }

        public Criteria andCertnotafterBetween(Date value1, Date value2) {
            addCriterion("CERTNOTAFTER between", value1, value2, "certnotafter");
            return (Criteria) this;
        }

        public Criteria andCertnotafterNotBetween(Date value1, Date value2) {
            addCriterion("CERTNOTAFTER not between", value1, value2, "certnotafter");
            return (Criteria) this;
        }

        public Criteria andIssuerhashIsNull() {
            addCriterion("ISSUERHASH is null");
            return (Criteria) this;
        }

        public Criteria andIssuerhashIsNotNull() {
            addCriterion("ISSUERHASH is not null");
            return (Criteria) this;
        }

        public Criteria andIssuerhashEqualTo(String value) {
            addCriterion("ISSUERHASH =", value, "issuerhash");
            return (Criteria) this;
        }

        public Criteria andIssuerhashNotEqualTo(String value) {
            addCriterion("ISSUERHASH <>", value, "issuerhash");
            return (Criteria) this;
        }

        public Criteria andIssuerhashGreaterThan(String value) {
            addCriterion("ISSUERHASH >", value, "issuerhash");
            return (Criteria) this;
        }

        public Criteria andIssuerhashGreaterThanOrEqualTo(String value) {
            addCriterion("ISSUERHASH >=", value, "issuerhash");
            return (Criteria) this;
        }

        public Criteria andIssuerhashLessThan(String value) {
            addCriterion("ISSUERHASH <", value, "issuerhash");
            return (Criteria) this;
        }

        public Criteria andIssuerhashLessThanOrEqualTo(String value) {
            addCriterion("ISSUERHASH <=", value, "issuerhash");
            return (Criteria) this;
        }

        public Criteria andIssuerhashLike(String value) {
            addCriterion("ISSUERHASH like", value, "issuerhash");
            return (Criteria) this;
        }

        public Criteria andIssuerhashNotLike(String value) {
            addCriterion("ISSUERHASH not like", value, "issuerhash");
            return (Criteria) this;
        }

        public Criteria andIssuerhashIn(List<String> values) {
            addCriterion("ISSUERHASH in", values, "issuerhash");
            return (Criteria) this;
        }

        public Criteria andIssuerhashNotIn(List<String> values) {
            addCriterion("ISSUERHASH not in", values, "issuerhash");
            return (Criteria) this;
        }

        public Criteria andIssuerhashBetween(String value1, String value2) {
            addCriterion("ISSUERHASH between", value1, value2, "issuerhash");
            return (Criteria) this;
        }

        public Criteria andIssuerhashNotBetween(String value1, String value2) {
            addCriterion("ISSUERHASH not between", value1, value2, "issuerhash");
            return (Criteria) this;
        }

        public Criteria andIssuerdnIsNull() {
            addCriterion("ISSUERDN is null");
            return (Criteria) this;
        }

        public Criteria andIssuerdnIsNotNull() {
            addCriterion("ISSUERDN is not null");
            return (Criteria) this;
        }

        public Criteria andIssuerdnEqualTo(String value) {
            addCriterion("ISSUERDN =", value, "issuerdn");
            return (Criteria) this;
        }

        public Criteria andIssuerdnNotEqualTo(String value) {
            addCriterion("ISSUERDN <>", value, "issuerdn");
            return (Criteria) this;
        }

        public Criteria andIssuerdnGreaterThan(String value) {
            addCriterion("ISSUERDN >", value, "issuerdn");
            return (Criteria) this;
        }

        public Criteria andIssuerdnGreaterThanOrEqualTo(String value) {
            addCriterion("ISSUERDN >=", value, "issuerdn");
            return (Criteria) this;
        }

        public Criteria andIssuerdnLessThan(String value) {
            addCriterion("ISSUERDN <", value, "issuerdn");
            return (Criteria) this;
        }

        public Criteria andIssuerdnLessThanOrEqualTo(String value) {
            addCriterion("ISSUERDN <=", value, "issuerdn");
            return (Criteria) this;
        }

        public Criteria andIssuerdnLike(String value) {
            addCriterion("ISSUERDN like", value, "issuerdn");
            return (Criteria) this;
        }

        public Criteria andIssuerdnNotLike(String value) {
            addCriterion("ISSUERDN not like", value, "issuerdn");
            return (Criteria) this;
        }

        public Criteria andIssuerdnIn(List<String> values) {
            addCriterion("ISSUERDN in", values, "issuerdn");
            return (Criteria) this;
        }

        public Criteria andIssuerdnNotIn(List<String> values) {
            addCriterion("ISSUERDN not in", values, "issuerdn");
            return (Criteria) this;
        }

        public Criteria andIssuerdnBetween(String value1, String value2) {
            addCriterion("ISSUERDN between", value1, value2, "issuerdn");
            return (Criteria) this;
        }

        public Criteria andIssuerdnNotBetween(String value1, String value2) {
            addCriterion("ISSUERDN not between", value1, value2, "issuerdn");
            return (Criteria) this;
        }

        public Criteria andSubjecthashIsNull() {
            addCriterion("SUBJECTHASH is null");
            return (Criteria) this;
        }

        public Criteria andSubjecthashIsNotNull() {
            addCriterion("SUBJECTHASH is not null");
            return (Criteria) this;
        }

        public Criteria andSubjecthashEqualTo(String value) {
            addCriterion("SUBJECTHASH =", value, "subjecthash");
            return (Criteria) this;
        }

        public Criteria andSubjecthashNotEqualTo(String value) {
            addCriterion("SUBJECTHASH <>", value, "subjecthash");
            return (Criteria) this;
        }

        public Criteria andSubjecthashGreaterThan(String value) {
            addCriterion("SUBJECTHASH >", value, "subjecthash");
            return (Criteria) this;
        }

        public Criteria andSubjecthashGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECTHASH >=", value, "subjecthash");
            return (Criteria) this;
        }

        public Criteria andSubjecthashLessThan(String value) {
            addCriterion("SUBJECTHASH <", value, "subjecthash");
            return (Criteria) this;
        }

        public Criteria andSubjecthashLessThanOrEqualTo(String value) {
            addCriterion("SUBJECTHASH <=", value, "subjecthash");
            return (Criteria) this;
        }

        public Criteria andSubjecthashLike(String value) {
            addCriterion("SUBJECTHASH like", value, "subjecthash");
            return (Criteria) this;
        }

        public Criteria andSubjecthashNotLike(String value) {
            addCriterion("SUBJECTHASH not like", value, "subjecthash");
            return (Criteria) this;
        }

        public Criteria andSubjecthashIn(List<String> values) {
            addCriterion("SUBJECTHASH in", values, "subjecthash");
            return (Criteria) this;
        }

        public Criteria andSubjecthashNotIn(List<String> values) {
            addCriterion("SUBJECTHASH not in", values, "subjecthash");
            return (Criteria) this;
        }

        public Criteria andSubjecthashBetween(String value1, String value2) {
            addCriterion("SUBJECTHASH between", value1, value2, "subjecthash");
            return (Criteria) this;
        }

        public Criteria andSubjecthashNotBetween(String value1, String value2) {
            addCriterion("SUBJECTHASH not between", value1, value2, "subjecthash");
            return (Criteria) this;
        }

        public Criteria andSubjectdnIsNull() {
            addCriterion("SUBJECTDN is null");
            return (Criteria) this;
        }

        public Criteria andSubjectdnIsNotNull() {
            addCriterion("SUBJECTDN is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectdnEqualTo(String value) {
            addCriterion("SUBJECTDN =", value, "subjectdn");
            return (Criteria) this;
        }

        public Criteria andSubjectdnNotEqualTo(String value) {
            addCriterion("SUBJECTDN <>", value, "subjectdn");
            return (Criteria) this;
        }

        public Criteria andSubjectdnGreaterThan(String value) {
            addCriterion("SUBJECTDN >", value, "subjectdn");
            return (Criteria) this;
        }

        public Criteria andSubjectdnGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECTDN >=", value, "subjectdn");
            return (Criteria) this;
        }

        public Criteria andSubjectdnLessThan(String value) {
            addCriterion("SUBJECTDN <", value, "subjectdn");
            return (Criteria) this;
        }

        public Criteria andSubjectdnLessThanOrEqualTo(String value) {
            addCriterion("SUBJECTDN <=", value, "subjectdn");
            return (Criteria) this;
        }

        public Criteria andSubjectdnLike(String value) {
            addCriterion("SUBJECTDN like", value, "subjectdn");
            return (Criteria) this;
        }

        public Criteria andSubjectdnNotLike(String value) {
            addCriterion("SUBJECTDN not like", value, "subjectdn");
            return (Criteria) this;
        }

        public Criteria andSubjectdnIn(List<String> values) {
            addCriterion("SUBJECTDN in", values, "subjectdn");
            return (Criteria) this;
        }

        public Criteria andSubjectdnNotIn(List<String> values) {
            addCriterion("SUBJECTDN not in", values, "subjectdn");
            return (Criteria) this;
        }

        public Criteria andSubjectdnBetween(String value1, String value2) {
            addCriterion("SUBJECTDN between", value1, value2, "subjectdn");
            return (Criteria) this;
        }

        public Criteria andSubjectdnNotBetween(String value1, String value2) {
            addCriterion("SUBJECTDN not between", value1, value2, "subjectdn");
            return (Criteria) this;
        }

        public Criteria andSuspenddateIsNull() {
            addCriterion("SUSPENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andSuspenddateIsNotNull() {
            addCriterion("SUSPENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSuspenddateEqualTo(Date value) {
            addCriterion("SUSPENDDATE =", value, "suspenddate");
            return (Criteria) this;
        }

        public Criteria andSuspenddateNotEqualTo(Date value) {
            addCriterion("SUSPENDDATE <>", value, "suspenddate");
            return (Criteria) this;
        }

        public Criteria andSuspenddateGreaterThan(Date value) {
            addCriterion("SUSPENDDATE >", value, "suspenddate");
            return (Criteria) this;
        }

        public Criteria andSuspenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("SUSPENDDATE >=", value, "suspenddate");
            return (Criteria) this;
        }

        public Criteria andSuspenddateLessThan(Date value) {
            addCriterion("SUSPENDDATE <", value, "suspenddate");
            return (Criteria) this;
        }

        public Criteria andSuspenddateLessThanOrEqualTo(Date value) {
            addCriterion("SUSPENDDATE <=", value, "suspenddate");
            return (Criteria) this;
        }

        public Criteria andSuspenddateIn(List<Date> values) {
            addCriterion("SUSPENDDATE in", values, "suspenddate");
            return (Criteria) this;
        }

        public Criteria andSuspenddateNotIn(List<Date> values) {
            addCriterion("SUSPENDDATE not in", values, "suspenddate");
            return (Criteria) this;
        }

        public Criteria andSuspenddateBetween(Date value1, Date value2) {
            addCriterion("SUSPENDDATE between", value1, value2, "suspenddate");
            return (Criteria) this;
        }

        public Criteria andSuspenddateNotBetween(Date value1, Date value2) {
            addCriterion("SUSPENDDATE not between", value1, value2, "suspenddate");
            return (Criteria) this;
        }

        public Criteria andRevokedateIsNull() {
            addCriterion("REVOKEDATE is null");
            return (Criteria) this;
        }

        public Criteria andRevokedateIsNotNull() {
            addCriterion("REVOKEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRevokedateEqualTo(Date value) {
            addCriterion("REVOKEDATE =", value, "revokedate");
            return (Criteria) this;
        }

        public Criteria andRevokedateNotEqualTo(Date value) {
            addCriterion("REVOKEDATE <>", value, "revokedate");
            return (Criteria) this;
        }

        public Criteria andRevokedateGreaterThan(Date value) {
            addCriterion("REVOKEDATE >", value, "revokedate");
            return (Criteria) this;
        }

        public Criteria andRevokedateGreaterThanOrEqualTo(Date value) {
            addCriterion("REVOKEDATE >=", value, "revokedate");
            return (Criteria) this;
        }

        public Criteria andRevokedateLessThan(Date value) {
            addCriterion("REVOKEDATE <", value, "revokedate");
            return (Criteria) this;
        }

        public Criteria andRevokedateLessThanOrEqualTo(Date value) {
            addCriterion("REVOKEDATE <=", value, "revokedate");
            return (Criteria) this;
        }

        public Criteria andRevokedateIn(List<Date> values) {
            addCriterion("REVOKEDATE in", values, "revokedate");
            return (Criteria) this;
        }

        public Criteria andRevokedateNotIn(List<Date> values) {
            addCriterion("REVOKEDATE not in", values, "revokedate");
            return (Criteria) this;
        }

        public Criteria andRevokedateBetween(Date value1, Date value2) {
            addCriterion("REVOKEDATE between", value1, value2, "revokedate");
            return (Criteria) this;
        }

        public Criteria andRevokedateNotBetween(Date value1, Date value2) {
            addCriterion("REVOKEDATE not between", value1, value2, "revokedate");
            return (Criteria) this;
        }

        public Criteria andRevokereasonIsNull() {
            addCriterion("REVOKEREASON is null");
            return (Criteria) this;
        }

        public Criteria andRevokereasonIsNotNull() {
            addCriterion("REVOKEREASON is not null");
            return (Criteria) this;
        }

        public Criteria andRevokereasonEqualTo(String value) {
            addCriterion("REVOKEREASON =", value, "revokereason");
            return (Criteria) this;
        }

        public Criteria andRevokereasonNotEqualTo(String value) {
            addCriterion("REVOKEREASON <>", value, "revokereason");
            return (Criteria) this;
        }

        public Criteria andRevokereasonGreaterThan(String value) {
            addCriterion("REVOKEREASON >", value, "revokereason");
            return (Criteria) this;
        }

        public Criteria andRevokereasonGreaterThanOrEqualTo(String value) {
            addCriterion("REVOKEREASON >=", value, "revokereason");
            return (Criteria) this;
        }

        public Criteria andRevokereasonLessThan(String value) {
            addCriterion("REVOKEREASON <", value, "revokereason");
            return (Criteria) this;
        }

        public Criteria andRevokereasonLessThanOrEqualTo(String value) {
            addCriterion("REVOKEREASON <=", value, "revokereason");
            return (Criteria) this;
        }

        public Criteria andRevokereasonLike(String value) {
            addCriterion("REVOKEREASON like", value, "revokereason");
            return (Criteria) this;
        }

        public Criteria andRevokereasonNotLike(String value) {
            addCriterion("REVOKEREASON not like", value, "revokereason");
            return (Criteria) this;
        }

        public Criteria andRevokereasonIn(List<String> values) {
            addCriterion("REVOKEREASON in", values, "revokereason");
            return (Criteria) this;
        }

        public Criteria andRevokereasonNotIn(List<String> values) {
            addCriterion("REVOKEREASON not in", values, "revokereason");
            return (Criteria) this;
        }

        public Criteria andRevokereasonBetween(String value1, String value2) {
            addCriterion("REVOKEREASON between", value1, value2, "revokereason");
            return (Criteria) this;
        }

        public Criteria andRevokereasonNotBetween(String value1, String value2) {
            addCriterion("REVOKEREASON not between", value1, value2, "revokereason");
            return (Criteria) this;
        }

        public Criteria andRenewaldateIsNull() {
            addCriterion("RENEWALDATE is null");
            return (Criteria) this;
        }

        public Criteria andRenewaldateIsNotNull() {
            addCriterion("RENEWALDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRenewaldateEqualTo(Date value) {
            addCriterion("RENEWALDATE =", value, "renewaldate");
            return (Criteria) this;
        }

        public Criteria andRenewaldateNotEqualTo(Date value) {
            addCriterion("RENEWALDATE <>", value, "renewaldate");
            return (Criteria) this;
        }

        public Criteria andRenewaldateGreaterThan(Date value) {
            addCriterion("RENEWALDATE >", value, "renewaldate");
            return (Criteria) this;
        }

        public Criteria andRenewaldateGreaterThanOrEqualTo(Date value) {
            addCriterion("RENEWALDATE >=", value, "renewaldate");
            return (Criteria) this;
        }

        public Criteria andRenewaldateLessThan(Date value) {
            addCriterion("RENEWALDATE <", value, "renewaldate");
            return (Criteria) this;
        }

        public Criteria andRenewaldateLessThanOrEqualTo(Date value) {
            addCriterion("RENEWALDATE <=", value, "renewaldate");
            return (Criteria) this;
        }

        public Criteria andRenewaldateIn(List<Date> values) {
            addCriterion("RENEWALDATE in", values, "renewaldate");
            return (Criteria) this;
        }

        public Criteria andRenewaldateNotIn(List<Date> values) {
            addCriterion("RENEWALDATE not in", values, "renewaldate");
            return (Criteria) this;
        }

        public Criteria andRenewaldateBetween(Date value1, Date value2) {
            addCriterion("RENEWALDATE between", value1, value2, "renewaldate");
            return (Criteria) this;
        }

        public Criteria andRenewaldateNotBetween(Date value1, Date value2) {
            addCriterion("RENEWALDATE not between", value1, value2, "renewaldate");
            return (Criteria) this;
        }

        public Criteria andRenewalprevidIsNull() {
            addCriterion("RENEWALPREVID is null");
            return (Criteria) this;
        }

        public Criteria andRenewalprevidIsNotNull() {
            addCriterion("RENEWALPREVID is not null");
            return (Criteria) this;
        }

        public Criteria andRenewalprevidEqualTo(Short value) {
            addCriterion("RENEWALPREVID =", value, "renewalprevid");
            return (Criteria) this;
        }

        public Criteria andRenewalprevidNotEqualTo(Short value) {
            addCriterion("RENEWALPREVID <>", value, "renewalprevid");
            return (Criteria) this;
        }

        public Criteria andRenewalprevidGreaterThan(Short value) {
            addCriterion("RENEWALPREVID >", value, "renewalprevid");
            return (Criteria) this;
        }

        public Criteria andRenewalprevidGreaterThanOrEqualTo(Short value) {
            addCriterion("RENEWALPREVID >=", value, "renewalprevid");
            return (Criteria) this;
        }

        public Criteria andRenewalprevidLessThan(Short value) {
            addCriterion("RENEWALPREVID <", value, "renewalprevid");
            return (Criteria) this;
        }

        public Criteria andRenewalprevidLessThanOrEqualTo(Short value) {
            addCriterion("RENEWALPREVID <=", value, "renewalprevid");
            return (Criteria) this;
        }

        public Criteria andRenewalprevidIn(List<Short> values) {
            addCriterion("RENEWALPREVID in", values, "renewalprevid");
            return (Criteria) this;
        }

        public Criteria andRenewalprevidNotIn(List<Short> values) {
            addCriterion("RENEWALPREVID not in", values, "renewalprevid");
            return (Criteria) this;
        }

        public Criteria andRenewalprevidBetween(Short value1, Short value2) {
            addCriterion("RENEWALPREVID between", value1, value2, "renewalprevid");
            return (Criteria) this;
        }

        public Criteria andRenewalprevidNotBetween(Short value1, Short value2) {
            addCriterion("RENEWALPREVID not between", value1, value2, "renewalprevid");
            return (Criteria) this;
        }

        public Criteria andReqoverridevalidityIsNull() {
            addCriterion("REQOVERRIDEVALIDITY is null");
            return (Criteria) this;
        }

        public Criteria andReqoverridevalidityIsNotNull() {
            addCriterion("REQOVERRIDEVALIDITY is not null");
            return (Criteria) this;
        }

        public Criteria andReqoverridevalidityEqualTo(Date value) {
            addCriterion("REQOVERRIDEVALIDITY =", value, "reqoverridevalidity");
            return (Criteria) this;
        }

        public Criteria andReqoverridevalidityNotEqualTo(Date value) {
            addCriterion("REQOVERRIDEVALIDITY <>", value, "reqoverridevalidity");
            return (Criteria) this;
        }

        public Criteria andReqoverridevalidityGreaterThan(Date value) {
            addCriterion("REQOVERRIDEVALIDITY >", value, "reqoverridevalidity");
            return (Criteria) this;
        }

        public Criteria andReqoverridevalidityGreaterThanOrEqualTo(Date value) {
            addCriterion("REQOVERRIDEVALIDITY >=", value, "reqoverridevalidity");
            return (Criteria) this;
        }

        public Criteria andReqoverridevalidityLessThan(Date value) {
            addCriterion("REQOVERRIDEVALIDITY <", value, "reqoverridevalidity");
            return (Criteria) this;
        }

        public Criteria andReqoverridevalidityLessThanOrEqualTo(Date value) {
            addCriterion("REQOVERRIDEVALIDITY <=", value, "reqoverridevalidity");
            return (Criteria) this;
        }

        public Criteria andReqoverridevalidityIn(List<Date> values) {
            addCriterion("REQOVERRIDEVALIDITY in", values, "reqoverridevalidity");
            return (Criteria) this;
        }

        public Criteria andReqoverridevalidityNotIn(List<Date> values) {
            addCriterion("REQOVERRIDEVALIDITY not in", values, "reqoverridevalidity");
            return (Criteria) this;
        }

        public Criteria andReqoverridevalidityBetween(Date value1, Date value2) {
            addCriterion("REQOVERRIDEVALIDITY between", value1, value2, "reqoverridevalidity");
            return (Criteria) this;
        }

        public Criteria andReqoverridevalidityNotBetween(Date value1, Date value2) {
            addCriterion("REQOVERRIDEVALIDITY not between", value1, value2, "reqoverridevalidity");
            return (Criteria) this;
        }

        public Criteria andCertIdIsNull() {
            addCriterion("CERT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCertIdIsNotNull() {
            addCriterion("CERT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCertIdEqualTo(String value) {
            addCriterion("CERT_ID =", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotEqualTo(String value) {
            addCriterion("CERT_ID <>", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdGreaterThan(String value) {
            addCriterion("CERT_ID >", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_ID >=", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdLessThan(String value) {
            addCriterion("CERT_ID <", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdLessThanOrEqualTo(String value) {
            addCriterion("CERT_ID <=", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdLike(String value) {
            addCriterion("CERT_ID like", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotLike(String value) {
            addCriterion("CERT_ID not like", value, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdIn(List<String> values) {
            addCriterion("CERT_ID in", values, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotIn(List<String> values) {
            addCriterion("CERT_ID not in", values, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdBetween(String value1, String value2) {
            addCriterion("CERT_ID between", value1, value2, "certId");
            return (Criteria) this;
        }

        public Criteria andCertIdNotBetween(String value1, String value2) {
            addCriterion("CERT_ID not between", value1, value2, "certId");
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