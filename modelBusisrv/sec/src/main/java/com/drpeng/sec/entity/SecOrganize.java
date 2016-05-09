package com.drpeng.sec.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SecOrganize {
    private Long organizeId;

    private String organizeName;

    private String code;

    private Long parentOrganizeId;

    private Long orgRoleTypeId;

    private BigDecimal districtId;

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

    private Short orgLevel;

    private Short isChannel;

    private String notes;

    private Short state;

    private Long doneCode;

    private Date createDate;

    private Date doneDate;

    private Date validDate;

    private Date expireDate;

    private Long opId;

    private Long orgId;

    public Long getOrganizeId() {
        return organizeId;
    }

    public void setOrganizeId(Long organizeId) {
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

    public Long getParentOrganizeId() {
        return parentOrganizeId;
    }

    public void setParentOrganizeId(Long parentOrganizeId) {
        this.parentOrganizeId = parentOrganizeId;
    }

    public Long getOrgRoleTypeId() {
        return orgRoleTypeId;
    }

    public void setOrgRoleTypeId(Long orgRoleTypeId) {
        this.orgRoleTypeId = orgRoleTypeId;
    }

    public BigDecimal getDistrictId() {
        return districtId;
    }

    public void setDistrictId(BigDecimal districtId) {
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

    public Short getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(Short orgLevel) {
        this.orgLevel = orgLevel;
    }

    public Short getIsChannel() {
        return isChannel;
    }

    public void setIsChannel(Short isChannel) {
        this.isChannel = isChannel;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Long getDoneCode() {
        return doneCode;
    }

    public void setDoneCode(Long doneCode) {
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

    public Long getOpId() {
        return opId;
    }

    public void setOpId(Long opId) {
        this.opId = opId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
}