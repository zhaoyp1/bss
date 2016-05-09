package com.drpeng.sec.entity;

import java.util.Date;

public class SecOperator {
    private Integer operatorId;

    private Integer staffId;

    private String code;

    private String password;

    private Integer securityId;

    private String recentPassword;

    private Integer recentPassTimes;

    private String allowChangePassword;

    private Date acctEffectDate;

    private Date acctExpireDate;

    private Integer lastLoginLogId;

    private Integer tryTimes;

    private String lockFlag;

    private Short loginChannel;

    private Date passwordValidDate;

    private Integer chgPasswdAlarmDays;

    private String ipmacFlag;

    private Long isVpnLoginFlag;

    private Integer chgPasswdFlag;

    private String isLogin;

    private String notes;

    private Integer cancelDays;

    private Integer state;

    private Integer doneCode;

    private Date createDate;

    private Date doneDate;

    private Date validDate;

    private Date expireDate;

    private Integer opId;

    private Integer orgId;

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getSecurityId() {
        return securityId;
    }

    public void setSecurityId(Integer securityId) {
        this.securityId = securityId;
    }

    public String getRecentPassword() {
        return recentPassword;
    }

    public void setRecentPassword(String recentPassword) {
        this.recentPassword = recentPassword == null ? null : recentPassword.trim();
    }

    public Integer getRecentPassTimes() {
        return recentPassTimes;
    }

    public void setRecentPassTimes(Integer recentPassTimes) {
        this.recentPassTimes = recentPassTimes;
    }

    public String getAllowChangePassword() {
        return allowChangePassword;
    }

    public void setAllowChangePassword(String allowChangePassword) {
        this.allowChangePassword = allowChangePassword == null ? null : allowChangePassword.trim();
    }

    public Date getAcctEffectDate() {
        return acctEffectDate;
    }

    public void setAcctEffectDate(Date acctEffectDate) {
        this.acctEffectDate = acctEffectDate;
    }

    public Date getAcctExpireDate() {
        return acctExpireDate;
    }

    public void setAcctExpireDate(Date acctExpireDate) {
        this.acctExpireDate = acctExpireDate;
    }

    public Integer getLastLoginLogId() {
        return lastLoginLogId;
    }

    public void setLastLoginLogId(Integer lastLoginLogId) {
        this.lastLoginLogId = lastLoginLogId;
    }

    public Integer getTryTimes() {
        return tryTimes;
    }

    public void setTryTimes(Integer tryTimes) {
        this.tryTimes = tryTimes;
    }

    public String getLockFlag() {
        return lockFlag;
    }

    public void setLockFlag(String lockFlag) {
        this.lockFlag = lockFlag == null ? null : lockFlag.trim();
    }

    public Short getLoginChannel() {
        return loginChannel;
    }

    public void setLoginChannel(Short loginChannel) {
        this.loginChannel = loginChannel;
    }

    public Date getPasswordValidDate() {
        return passwordValidDate;
    }

    public void setPasswordValidDate(Date passwordValidDate) {
        this.passwordValidDate = passwordValidDate;
    }

    public Integer getChgPasswdAlarmDays() {
        return chgPasswdAlarmDays;
    }

    public void setChgPasswdAlarmDays(Integer chgPasswdAlarmDays) {
        this.chgPasswdAlarmDays = chgPasswdAlarmDays;
    }

    public String getIpmacFlag() {
        return ipmacFlag;
    }

    public void setIpmacFlag(String ipmacFlag) {
        this.ipmacFlag = ipmacFlag == null ? null : ipmacFlag.trim();
    }

    public Long getIsVpnLoginFlag() {
        return isVpnLoginFlag;
    }

    public void setIsVpnLoginFlag(Long isVpnLoginFlag) {
        this.isVpnLoginFlag = isVpnLoginFlag;
    }

    public Integer getChgPasswdFlag() {
        return chgPasswdFlag;
    }

    public void setChgPasswdFlag(Integer chgPasswdFlag) {
        this.chgPasswdFlag = chgPasswdFlag;
    }

    public String getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(String isLogin) {
        this.isLogin = isLogin == null ? null : isLogin.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Integer getCancelDays() {
        return cancelDays;
    }

    public void setCancelDays(Integer cancelDays) {
        this.cancelDays = cancelDays;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDoneCode() {
        return doneCode;
    }

    public void setDoneCode(Integer doneCode) {
        this.doneCode = doneCode;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(Date doneDate) {
        this.doneDate = doneDate;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Integer getOpId() {
        return opId;
    }

    public void setOpId(Integer opId) {
        this.opId = opId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }
}