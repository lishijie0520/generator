package com.genertech.lcm.aircraftinfo.dto;

public class SoftwareRole {
    private String partnoId;

    private String roleId;

    private String deptId;

    private String approvalRoleId;

    public String getPartnoId() {
        return partnoId;
    }

    public void setPartnoId(String partnoId) {
        this.partnoId = partnoId == null ? null : partnoId.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getApprovalRoleId() {
        return approvalRoleId;
    }

    public void setApprovalRoleId(String approvalRoleId) {
        this.approvalRoleId = approvalRoleId == null ? null : approvalRoleId.trim();
    }
}