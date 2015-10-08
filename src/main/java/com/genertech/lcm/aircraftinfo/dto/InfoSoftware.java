package com.genertech.lcm.aircraftinfo.dto;

import java.util.Date;

public class InfoSoftware {
    private String id;

    private String partNo;

    private String description;

    private Short quantity;

    private String phase;

    private String revision;

    private String type;

    private String subtype;

    private String remark;

    private String serialName;

    private Date expDate;

    private Date createDate;

    private String ataId;

    private String swSystem;

    private String swType;

    private String name;

    private Short stat;

    private String configVersion;

    private Date effectDate;

    private String department;

    private String lru;

    private String partnoId;

    private String prevId;

    private Short isLast;

    private String properties;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo == null ? null : partNo.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase == null ? null : phase.trim();
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision == null ? null : revision.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSerialName() {
        return serialName;
    }

    public void setSerialName(String serialName) {
        this.serialName = serialName == null ? null : serialName.trim();
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getAtaId() {
        return ataId;
    }

    public void setAtaId(String ataId) {
        this.ataId = ataId == null ? null : ataId.trim();
    }

    public String getSwSystem() {
        return swSystem;
    }

    public void setSwSystem(String swSystem) {
        this.swSystem = swSystem == null ? null : swSystem.trim();
    }

    public String getSwType() {
        return swType;
    }

    public void setSwType(String swType) {
        this.swType = swType == null ? null : swType.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getStat() {
        return stat;
    }

    public void setStat(Short stat) {
        this.stat = stat;
    }

    public String getConfigVersion() {
        return configVersion;
    }

    public void setConfigVersion(String configVersion) {
        this.configVersion = configVersion == null ? null : configVersion.trim();
    }

    public Date getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getLru() {
        return lru;
    }

    public void setLru(String lru) {
        this.lru = lru == null ? null : lru.trim();
    }

    public String getPartnoId() {
        return partnoId;
    }

    public void setPartnoId(String partnoId) {
        this.partnoId = partnoId == null ? null : partnoId.trim();
    }

    public String getPrevId() {
        return prevId;
    }

    public void setPrevId(String prevId) {
        this.prevId = prevId == null ? null : prevId.trim();
    }

    public Short getIsLast() {
        return isLast;
    }

    public void setIsLast(Short isLast) {
        this.isLast = isLast;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties == null ? null : properties.trim();
    }
}