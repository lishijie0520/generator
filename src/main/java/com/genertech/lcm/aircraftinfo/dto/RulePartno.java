package com.genertech.lcm.aircraftinfo.dto;

public class RulePartno {
    private String id;

    private String category;

    private String type;

    private String subtype;

    private String pattern;

    private String code;

    private Short seq;

    private String remark;

    private Short seqMin;

    private Short seqMax;

    private String swSubtype;

    private String ataId;

    private Short status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype == null ? null : subtype.trim();
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern == null ? null : pattern.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Short getSeq() {
        return seq;
    }

    public void setSeq(Short seq) {
        this.seq = seq;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getSeqMin() {
        return seqMin;
    }

    public void setSeqMin(Short seqMin) {
        this.seqMin = seqMin;
    }

    public Short getSeqMax() {
        return seqMax;
    }

    public void setSeqMax(Short seqMax) {
        this.seqMax = seqMax;
    }

    public String getSwSubtype() {
        return swSubtype;
    }

    public void setSwSubtype(String swSubtype) {
        this.swSubtype = swSubtype == null ? null : swSubtype.trim();
    }

    public String getAtaId() {
        return ataId;
    }

    public void setAtaId(String ataId) {
        this.ataId = ataId == null ? null : ataId.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}