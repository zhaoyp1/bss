package com.drpeng.sec.entity;

import java.util.Date;

public class SecFunction {
    private int funcId;

    private int entClassId;

    private String funcCode;

    private String name;

    private String notes;

    private int parentId;

    private int funSeq;

    private String viewname;

    private String dllPathdll;

    private String funcImg;

    private String funcArg;

    private String funcType;

    private int state;

    private int doneCode;

    private Date createDate;

    private Date doneDate;

    private Date validDate;

    private Date expireDate;

    private int opId;

    private int orgId;

    public int getFuncId() {
        return funcId;
    }

    public void setFuncId(int funcId) {
        this.funcId = funcId;
    }

    public int getEntClassId() {
        return entClassId;
    }

    public void setEntClassId(int entClassId) {
        this.entClassId = entClassId;
    }

    public String getFuncCode() {
        return funcCode;
    }

    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode == null ? null : funcCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getFunSeq() {
        return funSeq;
    }

    public void setFunSeq(int funSeq) {
        this.funSeq = funSeq;
    }

    public String getViewname() {
        return viewname;
    }

    public void setViewname(String viewname) {
        this.viewname = viewname == null ? null : viewname.trim();
    }

    public String getDllPathdll() {
        return dllPathdll;
    }

    public void setDllPathdll(String dllPathdll) {
        this.dllPathdll = dllPathdll == null ? null : dllPathdll.trim();
    }

    public String getFuncImg() {
        return funcImg;
    }

    public void setFuncImg(String funcImg) {
        this.funcImg = funcImg == null ? null : funcImg.trim();
    }

    public String getFuncArg() {
        return funcArg;
    }

    public void setFuncArg(String funcArg) {
        this.funcArg = funcArg == null ? null : funcArg.trim();
    }

    public String getFuncType() {
        return funcType;
    }

    public void setFuncType(String funcType) {
        this.funcType = funcType == null ? null : funcType.trim();
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