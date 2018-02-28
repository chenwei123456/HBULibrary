package com.hbu.entity;

/**
 * Created by chenwei on 2017/11/24.
 */
public class Admin {

    private Long adminId;

    private String adminName;

    private String adminPassword;

    private String userType;

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "Admin{" + "adminId=" + adminId + ", adminName='" + adminName + '\'' + ", adminPassword='" + adminPassword + '\'' + ", userType='" + userType + '\'' + '}';
    }
}
