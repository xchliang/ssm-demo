package com.ssm.model;

import java.io.Serializable;

/**
 *
 */
public class User implements Serializable {
    private static final long serialVersionUID = 3770729129589070968L;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户名
     */
    private String ZSuserName;
    /**
     * 密码
     */
    private String password;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 用户状态
     */
    private Integer lockStatus;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 级别
     */
    private Integer level;

    /**
     * 机构id
     */
    private Integer orgId;

    /**
     * 机构String
     */
    private String organization;
    /**
     * 拥有角色的备注
     */
    private String roleRemark;

    /**
     * 创建该用户的userId
     */
    private Long createUserId;

    /**
     * 创建该用户的用户姓名
     */
    private String createUserName;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getZSuserName() {
        return ZSuserName;
    }

    public void setZSuserName(String zSuserName) {
        ZSuserName = zSuserName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getRoleRemark() {
        return roleRemark;
    }

    public void setRoleRemark(String roleRemark) {
        this.roleRemark = roleRemark;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

}
