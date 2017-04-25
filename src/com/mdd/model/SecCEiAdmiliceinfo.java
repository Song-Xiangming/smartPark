package com.mdd.model;

import java.util.Date;

/**
 * SecCEiAdmiliceinfo entity. @author MyEclipse Persistence Tools
 */

public class SecCEiAdmiliceinfo implements java.io.Serializable {

	// Fields

	private String admiLiceId;
	private String enterpriseId;
	private String admiLiceNo;
	private String admiLiceProjectsCode;
	private String admiLiceTypeCode;
	private Date issueDate;
	private Date limitDate;
	private Date revocationDate;
	private String liceOrgName;
	private String liceStatus;
	private String admiLiceScope;
	private String remark;
	private String principal;
	private String industryCategory1st;
	private String economicTypeCode;
	private String storeUpLimitIssue;
	private String storeAddress;
	private String regAddress;
	private String enterDeptId;
	private String isActive;
	private String creator;
	private Date createTime;
	private String updator;
	private Date updateTime;

	// Constructors

	/** default constructor */
	public SecCEiAdmiliceinfo() {
		admiLiceId = "";
		enterpriseId = "";
		admiLiceNo = "";
		admiLiceProjectsCode = "";
		admiLiceTypeCode = "";
		issueDate = new Date();
		limitDate = new Date();
		revocationDate = new Date();
		liceOrgName = "";
		liceStatus = "";
		admiLiceScope = "";
		remark = "";
		principal = "";
		industryCategory1st = "";
		economicTypeCode = "";
		storeUpLimitIssue = "";
		storeAddress = "";
		regAddress = "";
		enterDeptId = "";
		isActive = "";
		creator = "";
		createTime = new Date();
		updator = "";
		updateTime = new Date();
	}

	/** full constructor */
	public SecCEiAdmiliceinfo(String enterpriseId, String admiLiceNo,
			String admiLiceProjectsCode, String admiLiceTypeCode,
			Date issueDate, Date limitDate, Date revocationDate,
			String liceOrgName, String liceStatus, String admiLiceScope,
			String remark, String principal, String industryCategory1st,
			String economicTypeCode, String storeUpLimitIssue,
			String storeAddress, String regAddress, String enterDeptId,
			String isActive, String creator, Date createTime, String updator,
			Date updateTime) {
		this.enterpriseId = enterpriseId;
		this.admiLiceNo = admiLiceNo;
		this.admiLiceProjectsCode = admiLiceProjectsCode;
		this.admiLiceTypeCode = admiLiceTypeCode;
		this.issueDate = issueDate;
		this.limitDate = limitDate;
		this.revocationDate = revocationDate;
		this.liceOrgName = liceOrgName;
		this.liceStatus = liceStatus;
		this.admiLiceScope = admiLiceScope;
		this.remark = remark;
		this.principal = principal;
		this.industryCategory1st = industryCategory1st;
		this.economicTypeCode = economicTypeCode;
		this.storeUpLimitIssue = storeUpLimitIssue;
		this.storeAddress = storeAddress;
		this.regAddress = regAddress;
		this.enterDeptId = enterDeptId;
		this.isActive = isActive;
		this.creator = creator;
		this.createTime = createTime;
		this.updator = updator;
		this.updateTime = updateTime;
	}

	// Property accessors

	public String getAdmiLiceId() {
		return this.admiLiceId;
	}

	public void setAdmiLiceId(String admiLiceId) {
		this.admiLiceId = admiLiceId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getAdmiLiceNo() {
		return this.admiLiceNo;
	}

	public void setAdmiLiceNo(String admiLiceNo) {
		this.admiLiceNo = admiLiceNo;
	}

	public String getAdmiLiceProjectsCode() {
		return this.admiLiceProjectsCode;
	}

	public void setAdmiLiceProjectsCode(String admiLiceProjectsCode) {
		this.admiLiceProjectsCode = admiLiceProjectsCode;
	}

	public String getAdmiLiceTypeCode() {
		return this.admiLiceTypeCode;
	}

	public void setAdmiLiceTypeCode(String admiLiceTypeCode) {
		this.admiLiceTypeCode = admiLiceTypeCode;
	}

	public Date getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getLimitDate() {
		return this.limitDate;
	}

	public void setLimitDate(Date limitDate) {
		this.limitDate = limitDate;
	}

	public Date getRevocationDate() {
		return this.revocationDate;
	}

	public void setRevocationDate(Date revocationDate) {
		this.revocationDate = revocationDate;
	}

	public String getLiceOrgName() {
		return this.liceOrgName;
	}

	public void setLiceOrgName(String liceOrgName) {
		this.liceOrgName = liceOrgName;
	}

	public String getLiceStatus() {
		return this.liceStatus;
	}

	public void setLiceStatus(String liceStatus) {
		this.liceStatus = liceStatus;
	}

	public String getAdmiLiceScope() {
		return this.admiLiceScope;
	}

	public void setAdmiLiceScope(String admiLiceScope) {
		this.admiLiceScope = admiLiceScope;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPrincipal() {
		return this.principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getIndustryCategory1st() {
		return this.industryCategory1st;
	}

	public void setIndustryCategory1st(String industryCategory1st) {
		this.industryCategory1st = industryCategory1st;
	}

	public String getEconomicTypeCode() {
		return this.economicTypeCode;
	}

	public void setEconomicTypeCode(String economicTypeCode) {
		this.economicTypeCode = economicTypeCode;
	}

	public String getStoreUpLimitIssue() {
		return this.storeUpLimitIssue;
	}

	public void setStoreUpLimitIssue(String storeUpLimitIssue) {
		this.storeUpLimitIssue = storeUpLimitIssue;
	}

	public String getStoreAddress() {
		return this.storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getRegAddress() {
		return this.regAddress;
	}

	public void setRegAddress(String regAddress) {
		this.regAddress = regAddress;
	}

	public String getEnterDeptId() {
		return this.enterDeptId;
	}

	public void setEnterDeptId(String enterDeptId) {
		this.enterDeptId = enterDeptId;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdator() {
		return this.updator;
	}

	public void setUpdator(String updator) {
		this.updator = updator;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}