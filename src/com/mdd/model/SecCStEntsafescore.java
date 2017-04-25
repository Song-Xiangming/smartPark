package com.mdd.model;

import java.util.Date;

/**
 * SecCStEntsafescore entity. @author MyEclipse Persistence Tools
 */

public class SecCStEntsafescore implements java.io.Serializable {

	// Fields

	private String safescoreId;
	private String enterpriseId;
	private String saferptName;
	private String safescoreType;
	private Date scoreDate;
	private Date validDate;
	private String scoreOrgName;
	private String result;
	private String enterDeptId;
	private String isActive;
	private String creator;
	private Date createTime;
	private String updator;
	private Date updateTime;

	// Constructors

	/** default constructor */
	public SecCStEntsafescore() {
		safescoreId = "";
		enterpriseId = "";
		saferptName = "";
		safescoreType = "";
		scoreDate = new Date();
		validDate = new Date();
		scoreOrgName = "";
		result = "";
		enterDeptId = "";
		isActive = "";
		creator = "";
		createTime = new Date();
		updator = "";
		updateTime = new Date();
	}

	/** full constructor */
	public SecCStEntsafescore(String enterpriseId, String saferptName,
			String safescoreType, Date scoreDate, Date validDate,
			String scoreOrgName, String result, String enterDeptId,
			String isActive, String creator, Date createTime, String updator,
			Date updateTime) {
		this.enterpriseId = enterpriseId;
		this.saferptName = saferptName;
		this.safescoreType = safescoreType;
		this.scoreDate = scoreDate;
		this.validDate = validDate;
		this.scoreOrgName = scoreOrgName;
		this.result = result;
		this.enterDeptId = enterDeptId;
		this.isActive = isActive;
		this.creator = creator;
		this.createTime = createTime;
		this.updator = updator;
		this.updateTime = updateTime;
	}

	// Property accessors

	public String getSafescoreId() {
		return this.safescoreId;
	}

	public void setSafescoreId(String safescoreId) {
		this.safescoreId = safescoreId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getSaferptName() {
		return this.saferptName;
	}

	public void setSaferptName(String saferptName) {
		this.saferptName = saferptName;
	}

	public String getSafescoreType() {
		return this.safescoreType;
	}

	public void setSafescoreType(String safescoreType) {
		this.safescoreType = safescoreType;
	}

	public Date getScoreDate() {
		return this.scoreDate;
	}

	public void setScoreDate(Date scoreDate) {
		this.scoreDate = scoreDate;
	}

	public Date getValidDate() {
		return this.validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

	public String getScoreOrgName() {
		return this.scoreOrgName;
	}

	public void setScoreOrgName(String scoreOrgName) {
		this.scoreOrgName = scoreOrgName;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
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