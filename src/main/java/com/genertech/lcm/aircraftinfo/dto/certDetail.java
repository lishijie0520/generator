package com.genertech.lcm.aircraftinfo.dto;

import java.util.Date;

public class certDetail {
    private String id;

    private Date certapprovedate;

    private Date certrejectdate;

    private Date certsigndate;

    private String certserialnumber;

    private Date certnotbefore;

    private Date certnotafter;

    private String issuerhash;

    private String issuerdn;

    private String subjecthash;

    private String subjectdn;

    private Date suspenddate;

    private Date revokedate;

    private String revokereason;

    private Date renewaldate;

    private Short renewalprevid;

    private Date reqoverridevalidity;

    private String certId;

    private Short status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCertapprovedate() {
        return certapprovedate;
    }

    public void setCertapprovedate(Date certapprovedate) {
        this.certapprovedate = certapprovedate;
    }

    public Date getCertrejectdate() {
        return certrejectdate;
    }

    public void setCertrejectdate(Date certrejectdate) {
        this.certrejectdate = certrejectdate;
    }

    public Date getCertsigndate() {
        return certsigndate;
    }

    public void setCertsigndate(Date certsigndate) {
        this.certsigndate = certsigndate;
    }

    public String getCertserialnumber() {
        return certserialnumber;
    }

    public void setCertserialnumber(String certserialnumber) {
        this.certserialnumber = certserialnumber == null ? null : certserialnumber.trim();
    }

    public Date getCertnotbefore() {
        return certnotbefore;
    }

    public void setCertnotbefore(Date certnotbefore) {
        this.certnotbefore = certnotbefore;
    }

    public Date getCertnotafter() {
        return certnotafter;
    }

    public void setCertnotafter(Date certnotafter) {
        this.certnotafter = certnotafter;
    }

    public String getIssuerhash() {
        return issuerhash;
    }

    public void setIssuerhash(String issuerhash) {
        this.issuerhash = issuerhash == null ? null : issuerhash.trim();
    }

    public String getIssuerdn() {
        return issuerdn;
    }

    public void setIssuerdn(String issuerdn) {
        this.issuerdn = issuerdn == null ? null : issuerdn.trim();
    }

    public String getSubjecthash() {
        return subjecthash;
    }

    public void setSubjecthash(String subjecthash) {
        this.subjecthash = subjecthash == null ? null : subjecthash.trim();
    }

    public String getSubjectdn() {
        return subjectdn;
    }

    public void setSubjectdn(String subjectdn) {
        this.subjectdn = subjectdn == null ? null : subjectdn.trim();
    }

    public Date getSuspenddate() {
        return suspenddate;
    }

    public void setSuspenddate(Date suspenddate) {
        this.suspenddate = suspenddate;
    }

    public Date getRevokedate() {
        return revokedate;
    }

    public void setRevokedate(Date revokedate) {
        this.revokedate = revokedate;
    }

    public String getRevokereason() {
        return revokereason;
    }

    public void setRevokereason(String revokereason) {
        this.revokereason = revokereason == null ? null : revokereason.trim();
    }

    public Date getRenewaldate() {
        return renewaldate;
    }

    public void setRenewaldate(Date renewaldate) {
        this.renewaldate = renewaldate;
    }

    public Short getRenewalprevid() {
        return renewalprevid;
    }

    public void setRenewalprevid(Short renewalprevid) {
        this.renewalprevid = renewalprevid;
    }

    public Date getReqoverridevalidity() {
        return reqoverridevalidity;
    }

    public void setReqoverridevalidity(Date reqoverridevalidity) {
        this.reqoverridevalidity = reqoverridevalidity;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId == null ? null : certId.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}