package com.genertech.lcm.biz.dto;

import java.util.Date;

public class DdmProc {
    private String id;

    private String procDefKey;

    private String procDefId;

    private Date createTime;

    private String createUser;

    private Date checkTime;

    private String checkUser;

    private String checkRemark;

    private Date proveTime;

    private String proveUser;

    private String proveRemark;

    private Short state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProcDefKey() {
        return procDefKey;
    }

    public void setProcDefKey(String procDefKey) {
        this.procDefKey = procDefKey == null ? null : procDefKey.trim();
    }

    public String getProcDefId() {
        return procDefId;
    }

    public void setProcDefId(String procDefId) {
        this.procDefId = procDefId == null ? null : procDefId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckUser() {
        return checkUser;
    }

    public void setCheckUser(String checkUser) {
        this.checkUser = checkUser == null ? null : checkUser.trim();
    }

    public String getCheckRemark() {
        return checkRemark;
    }

    public void setCheckRemark(String checkRemark) {
        this.checkRemark = checkRemark == null ? null : checkRemark.trim();
    }

    public Date getProveTime() {
        return proveTime;
    }

    public void setProveTime(Date proveTime) {
        this.proveTime = proveTime;
    }

    public String getProveUser() {
        return proveUser;
    }

    public void setProveUser(String proveUser) {
        this.proveUser = proveUser == null ? null : proveUser.trim();
    }

    public String getProveRemark() {
        return proveRemark;
    }

    public void setProveRemark(String proveRemark) {
        this.proveRemark = proveRemark == null ? null : proveRemark.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }
}