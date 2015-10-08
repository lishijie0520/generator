package com.genertech.lcm.aircraftinfo.dto;

import java.util.ArrayList;
import java.util.List;

public class RulePartnoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RulePartnoExample() {
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

        public Criteria andCategoryIsNull() {
            addCriterion("CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("CATEGORY =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("CATEGORY <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("CATEGORY >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("CATEGORY <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("CATEGORY like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("CATEGORY not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("CATEGORY in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("CATEGORY not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("CATEGORY between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("CATEGORY not between", value1, value2, "category");
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

        public Criteria andPatternIsNull() {
            addCriterion("PATTERN is null");
            return (Criteria) this;
        }

        public Criteria andPatternIsNotNull() {
            addCriterion("PATTERN is not null");
            return (Criteria) this;
        }

        public Criteria andPatternEqualTo(String value) {
            addCriterion("PATTERN =", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternNotEqualTo(String value) {
            addCriterion("PATTERN <>", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternGreaterThan(String value) {
            addCriterion("PATTERN >", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternGreaterThanOrEqualTo(String value) {
            addCriterion("PATTERN >=", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternLessThan(String value) {
            addCriterion("PATTERN <", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternLessThanOrEqualTo(String value) {
            addCriterion("PATTERN <=", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternLike(String value) {
            addCriterion("PATTERN like", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternNotLike(String value) {
            addCriterion("PATTERN not like", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternIn(List<String> values) {
            addCriterion("PATTERN in", values, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternNotIn(List<String> values) {
            addCriterion("PATTERN not in", values, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternBetween(String value1, String value2) {
            addCriterion("PATTERN between", value1, value2, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternNotBetween(String value1, String value2) {
            addCriterion("PATTERN not between", value1, value2, "pattern");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andSeqIsNull() {
            addCriterion("SEQ is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(Short value) {
            addCriterion("SEQ =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(Short value) {
            addCriterion("SEQ <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(Short value) {
            addCriterion("SEQ >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(Short value) {
            addCriterion("SEQ >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(Short value) {
            addCriterion("SEQ <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(Short value) {
            addCriterion("SEQ <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<Short> values) {
            addCriterion("SEQ in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<Short> values) {
            addCriterion("SEQ not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(Short value1, Short value2) {
            addCriterion("SEQ between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(Short value1, Short value2) {
            addCriterion("SEQ not between", value1, value2, "seq");
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

        public Criteria andSeqMinIsNull() {
            addCriterion("SEQ_MIN is null");
            return (Criteria) this;
        }

        public Criteria andSeqMinIsNotNull() {
            addCriterion("SEQ_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andSeqMinEqualTo(Short value) {
            addCriterion("SEQ_MIN =", value, "seqMin");
            return (Criteria) this;
        }

        public Criteria andSeqMinNotEqualTo(Short value) {
            addCriterion("SEQ_MIN <>", value, "seqMin");
            return (Criteria) this;
        }

        public Criteria andSeqMinGreaterThan(Short value) {
            addCriterion("SEQ_MIN >", value, "seqMin");
            return (Criteria) this;
        }

        public Criteria andSeqMinGreaterThanOrEqualTo(Short value) {
            addCriterion("SEQ_MIN >=", value, "seqMin");
            return (Criteria) this;
        }

        public Criteria andSeqMinLessThan(Short value) {
            addCriterion("SEQ_MIN <", value, "seqMin");
            return (Criteria) this;
        }

        public Criteria andSeqMinLessThanOrEqualTo(Short value) {
            addCriterion("SEQ_MIN <=", value, "seqMin");
            return (Criteria) this;
        }

        public Criteria andSeqMinIn(List<Short> values) {
            addCriterion("SEQ_MIN in", values, "seqMin");
            return (Criteria) this;
        }

        public Criteria andSeqMinNotIn(List<Short> values) {
            addCriterion("SEQ_MIN not in", values, "seqMin");
            return (Criteria) this;
        }

        public Criteria andSeqMinBetween(Short value1, Short value2) {
            addCriterion("SEQ_MIN between", value1, value2, "seqMin");
            return (Criteria) this;
        }

        public Criteria andSeqMinNotBetween(Short value1, Short value2) {
            addCriterion("SEQ_MIN not between", value1, value2, "seqMin");
            return (Criteria) this;
        }

        public Criteria andSeqMaxIsNull() {
            addCriterion("SEQ_MAX is null");
            return (Criteria) this;
        }

        public Criteria andSeqMaxIsNotNull() {
            addCriterion("SEQ_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andSeqMaxEqualTo(Short value) {
            addCriterion("SEQ_MAX =", value, "seqMax");
            return (Criteria) this;
        }

        public Criteria andSeqMaxNotEqualTo(Short value) {
            addCriterion("SEQ_MAX <>", value, "seqMax");
            return (Criteria) this;
        }

        public Criteria andSeqMaxGreaterThan(Short value) {
            addCriterion("SEQ_MAX >", value, "seqMax");
            return (Criteria) this;
        }

        public Criteria andSeqMaxGreaterThanOrEqualTo(Short value) {
            addCriterion("SEQ_MAX >=", value, "seqMax");
            return (Criteria) this;
        }

        public Criteria andSeqMaxLessThan(Short value) {
            addCriterion("SEQ_MAX <", value, "seqMax");
            return (Criteria) this;
        }

        public Criteria andSeqMaxLessThanOrEqualTo(Short value) {
            addCriterion("SEQ_MAX <=", value, "seqMax");
            return (Criteria) this;
        }

        public Criteria andSeqMaxIn(List<Short> values) {
            addCriterion("SEQ_MAX in", values, "seqMax");
            return (Criteria) this;
        }

        public Criteria andSeqMaxNotIn(List<Short> values) {
            addCriterion("SEQ_MAX not in", values, "seqMax");
            return (Criteria) this;
        }

        public Criteria andSeqMaxBetween(Short value1, Short value2) {
            addCriterion("SEQ_MAX between", value1, value2, "seqMax");
            return (Criteria) this;
        }

        public Criteria andSeqMaxNotBetween(Short value1, Short value2) {
            addCriterion("SEQ_MAX not between", value1, value2, "seqMax");
            return (Criteria) this;
        }

        public Criteria andSwSubtypeIsNull() {
            addCriterion("SW_SUBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSwSubtypeIsNotNull() {
            addCriterion("SW_SUBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSwSubtypeEqualTo(String value) {
            addCriterion("SW_SUBTYPE =", value, "swSubtype");
            return (Criteria) this;
        }

        public Criteria andSwSubtypeNotEqualTo(String value) {
            addCriterion("SW_SUBTYPE <>", value, "swSubtype");
            return (Criteria) this;
        }

        public Criteria andSwSubtypeGreaterThan(String value) {
            addCriterion("SW_SUBTYPE >", value, "swSubtype");
            return (Criteria) this;
        }

        public Criteria andSwSubtypeGreaterThanOrEqualTo(String value) {
            addCriterion("SW_SUBTYPE >=", value, "swSubtype");
            return (Criteria) this;
        }

        public Criteria andSwSubtypeLessThan(String value) {
            addCriterion("SW_SUBTYPE <", value, "swSubtype");
            return (Criteria) this;
        }

        public Criteria andSwSubtypeLessThanOrEqualTo(String value) {
            addCriterion("SW_SUBTYPE <=", value, "swSubtype");
            return (Criteria) this;
        }

        public Criteria andSwSubtypeLike(String value) {
            addCriterion("SW_SUBTYPE like", value, "swSubtype");
            return (Criteria) this;
        }

        public Criteria andSwSubtypeNotLike(String value) {
            addCriterion("SW_SUBTYPE not like", value, "swSubtype");
            return (Criteria) this;
        }

        public Criteria andSwSubtypeIn(List<String> values) {
            addCriterion("SW_SUBTYPE in", values, "swSubtype");
            return (Criteria) this;
        }

        public Criteria andSwSubtypeNotIn(List<String> values) {
            addCriterion("SW_SUBTYPE not in", values, "swSubtype");
            return (Criteria) this;
        }

        public Criteria andSwSubtypeBetween(String value1, String value2) {
            addCriterion("SW_SUBTYPE between", value1, value2, "swSubtype");
            return (Criteria) this;
        }

        public Criteria andSwSubtypeNotBetween(String value1, String value2) {
            addCriterion("SW_SUBTYPE not between", value1, value2, "swSubtype");
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