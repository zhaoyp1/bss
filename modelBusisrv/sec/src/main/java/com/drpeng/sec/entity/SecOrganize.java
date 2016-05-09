package com.drpeng.sec.entity;

import java.util.Date;

public class SecOrganize {
    private int organizeId;

    private String organizeName;

    private String code;

    private int parentOrganizeId;

    private int orgRoleTypeId;

    private int districtId;

    private String shortName;

    private String englishName;

    private String email;

    private String phoneId;

    private String faxId;

    private String orgAddress;

    private String contactName;

    private String contactCardType;

    private String contactCardId;

    private String contactBillId;

    private int orgLevel;

    private int isChannel;

    private String notes;

    private int state;

    private int doneCode;

    private Date createDate;

    private Date doneDate;

    private Date validDate;

    private Date expireDate;

    private int opId;

    private int orgId;

    public int getOrganizeId() {
        return organizeId;
    }

    public void setOrganizeId(int organizeId) {
        this.organizeId = organizeId;
    }

    public String getOrganizeName() {
        return organizeName;
    }

    public void setOrganizeName(String organizeName) {
        this.organizeName = organizeName == null ? null : organizeName.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public int getParentOrganizeId() {
        return parentOrganizeId;
    }

    public void setParentOrganizeId(int parentOrganizeId) {
        this.parentOrganizeId = parentOrganizeId;
    }

    public int getOrgRoleTypeId() {
        return orgRoleTypeId;
    }

    public void setOrgRoleTypeId(int orgRoleTypeId) {
        this.orgRoleTypeId = orgRoleTypeId;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId == null ? null : phoneId.trim();
    }

    public String getFaxId() {
        return faxId;
    }

    public void setFaxId(String faxId) {
        this.faxId = faxId == null ? null : faxId.trim();
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress == null ? null : orgAddress.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactCardType() {
        return contactCardType;
    }

    public void setContactCardType(String contactCardType) {
        this.contactCardType = contactCardType == null ? null : contactCardType.trim();
    }

    public String getContactCardId() {
        return contactCardId;
    }

    public void setContactCardId(String contactCardId) {
        this.contactCardId = contactCardId == null ? null : contactCardId.trim();
    }

    public String getContactBillId() {
        return contactBillId;
    }

    public void setContactBillId(String contactBillId) {
        this.contactBillId = contactBillId == null ? null : contactBillId.trim();
    }

    public int getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(int orgLevel) {
        this.orgLevel = orgLevel;
    }

    public int getIsChannel() {
        return isChannel;
    }

    public void setIsChannel(int isChannel) {
        this.isChannel = isChannel;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
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