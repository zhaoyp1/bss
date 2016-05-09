package com.drpeng.sec.entity;

import java.util.Date;

public class SecOperator {
    private int operatorId;

    private int staffId;

    private String code;

    private String password;

    private int securityId;

    private String recentPassword;

    private int recentPassTimes;

    private String allowChangePassword;

    private Date acctEffectDate;

    private Date acctExpireDate;

    private int lastLoginLogId;

    private int tryTimes;

    private String lockFlag;

    private Short loginChannel;

    private Date passwordValidDate;

    private int chgPasswdAlarmDays;

    private String ipmacFlag;

    private Long isVpnLoginFlag;

    private int chgPasswdFlag;

    private String isLogin;

    private String notes;

    private int cancelDays;

    private int state;

    private int doneCode;

    private Date createDate;

    private Date doneDate;

    private Date validDate;

    private Date expireDate;

    private int opId;

    private int orgId;

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
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

    public int getSecurityId() {
        return securityId;
    }

    public void setSecurityId(int securityId) {
        this.securityId = securityId;
    }

    public String getRecentPassword() {
        return recentPassword;
    }

    public void setRecentPassword(String recentPassword) {
        this.recentPassword = recentPassword == null ? null : recentPassword.trim();
    }

    public int getRecentPassTimes() {
        return recentPassTimes;
    }

    public void setRecentPassTimes(int recentPassTimes) {
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

    public int getLastLoginLogId() {
        return lastLoginLogId;
    }

    public void setLastLoginLogId(int lastLoginLogId) {
        this.lastLoginLogId = lastLoginLogId;
    }

    public int getTryTimes() {
        return tryTimes;
    }

    public void setTryTimes(int tryTimes) {
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

    public int getChgPasswdAlarmDays() {
        return chgPasswdAlarmDays;
    }

    public void setChgPasswdAlarmDays(int chgPasswdAlarmDays) {
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

    public int getChgPasswdFlag() {
        return chgPasswdFlag;
    }

    public void setChgPasswdFlag(int chgPasswdFlag) {
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

    public int getCancelDays() {
        return cancelDays;
    }

    public void setCancelDays(int cancelDays) {
        this.cancelDays = cancelDays;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getDoneCode() {
        return doneCode;
    }

    public void setDoneCode(int doneCode) {
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

    public int getOpId() {
        return opId;
    }

    public void setOpId(int opId) {
        this.opId = opId;
    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }
}