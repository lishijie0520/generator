package com.genertech.lcm.biz.dto;

import java.util.Date;

public class InfoDev {
    private String devId;

    private String devName;

    private Short devType;

    private String sn;

    private String purpose;

    private String commonName;

    private String libDeviceName;

    private String libDevicePassword;

    private String libUserName;

    private String libUserPassword;

    private String deptId;

    private String holders;

    private Short status;

    private Date startTime;

    private Date endTime;

    private String remark;

    private String createUser;

    private Date createDatetime;

    private String updateUser;

    private Date updateDatetime;

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId == null ? null : devId.trim();
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName == null ? null : devName.trim();
    }

    public Short getDevType() {
        return devType;
    }

    public void setDevType(Short devType) {
        this.devType = devType;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName == null ? null : commonName.trim();
    }

    public String getLibDeviceName() {
        return libDeviceName;
    }

    public void setLibDeviceName(String libDeviceName) {
        this.libDeviceName = libDeviceName == null ? null : libDeviceName.trim();
    }

    public String getLibDevicePassword() {
        return libDevicePassword;
    }

    public void setLibDevicePassword(String libDevicePassword) {
        this.libDevicePassword = libDevicePassword == null ? null : libDevicePassword.trim();
    }

    public String getLibUserName() {
        return libUserName;
    }

    public void setLibUserName(String libUserName) {
        this.libUserName = libUserName == null ? null : libUserName.trim();
    }

    public String getLibUserPassword() {
        return libUserPassword;
    }

    public void setLibUserPassword(String libUserPassword) {
        this.libUserPassword = libUserPassword == null ? null : libUserPassword.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getHolders() {
        return holders;
    }

    public void setHolders(String holders) {
        this.holders = holders == null ? null : holders.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}