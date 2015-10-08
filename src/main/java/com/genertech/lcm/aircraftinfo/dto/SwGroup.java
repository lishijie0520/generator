package com.genertech.lcm.aircraftinfo.dto;

import java.util.Date;

public class SwGroup {
    private String id;

    private String partnoId;

    private String groupName;

    private String groupDesc;

    private Short status;

    private Date createTime;

    private String creator;

    private Short groupType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPartnoId() {
        return partnoId;
    }

    public void setPartnoId(String partnoId) {
        this.partnoId = partnoId == null ? null : partnoId.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc == null ? null : groupDesc.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Short getGroupType() {
        return groupType;
    }

    public void setGroupType(Short groupType) {
        this.groupType = groupType;
    }
}