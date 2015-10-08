package com.genertech.lcm.biz.dto;

import java.util.Date;


public class InfoForbit {
    private String swid;

    private String airplaneid;

    private String applyuser;

    private Date applytime;

    private String approveuser;

    private Date approvetime;

    private Date createtime;

    private Short state;
    
    private String swname;
    
    private String partNo;

    public String getSwid() {
        return swid;
    }

    public void setSwid(String swid) {
        this.swid = swid == null ? null : swid.trim();
    }

    public String getAirplaneid() {
        return airplaneid;
    }

    public void setAirplaneid(String airplaneid) {
        this.airplaneid = airplaneid == null ? null : airplaneid.trim();
    }

    public String getApplyuser() {
        return applyuser;
    }

    public void setApplyuser(String applyuser) {
        this.applyuser = applyuser == null ? null : applyuser.trim();
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public String getApproveuser() {
        return approveuser;
    }

    public void setApproveuser(String approveuser) {
        this.approveuser = approveuser == null ? null : approveuser.trim();
    }

    public Date getApprovetime() {
        return approvetime;
    }

    public void setApprovetime(Date approvetime) {
        this.approvetime = approvetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

	public String getSwname() {
		return swname;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setSwname(String swname) {
		this.swname = swname;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}
}