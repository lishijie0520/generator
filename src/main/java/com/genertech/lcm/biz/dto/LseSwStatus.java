package com.genertech.lcm.biz.dto;

import java.util.Date;

public class LseSwStatus {
    private String swId;

    private String swPartnumber;

    private Short status;

    private Date createTime;

    private String creator;

    private String airplaneId;

    private Short source;

    public String getSwId() {
        return swId;
    }

    public void setSwId(String swId) {
        this.swId = swId == null ? null : swId.trim();
    }

    public String getSwPartnumber() {
        return swPartnumber;
    }

    public void setSwPartnumber(String swPartnumber) {
        this.swPartnumber = swPartnumber == null ? null : swPartnumber.trim();
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

    public String getAirplaneId() {
        return airplaneId;
    }

    public void setAirplaneId(String airplaneId) {
        this.airplaneId = airplaneId == null ? null : airplaneId.trim();
    }

    public Short getSource() {
        return source;
    }

    public void setSource(Short source) {
        this.source = source;
    }
}