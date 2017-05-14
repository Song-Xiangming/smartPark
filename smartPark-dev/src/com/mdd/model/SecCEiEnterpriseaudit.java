package com.mdd.model;

import java.util.Date;

/**
 * SecCEiEnterpriseaudit entity. @author MyEclipse Persistence Tools
 */

public class SecCEiEnterpriseaudit implements java.io.Serializable {

	// Fields

	private String auditId;
	private String enterpriseId;
	private String townAuditStatus;
	private String townAuditIdea;
	private String townAuditPsnName;
	private Date townAuditDate;
	private String countyAuditStatus;
	private String countyAuditIdea;
	private String countyAuditPsnName;
	private Date countyAuditDate;
	private String enterDeptId;
	private String isActive;
	private String creator;
	private Date createTime;
	private String updator;
	private Date updateTime;

	// Constructors

	/** default constructor */
	public SecCEiEnterpriseaudit() {
		auditId = "";
		enterpriseId = "";
		townAuditStatus = "";
		townAuditIdea = "";
		townAuditPsnName = "";
		townAuditDate = new Date();
		countyAuditStatus = "";
		countyAuditIdea = "";
		countyAuditPsnName = "";
		countyAuditDate = new Date();
		enterDeptId = "";
		isActive = "";
		creator = "";
		createTime = new Date();
		updator = "";
		updateTime = new Date();
	}

	/** full constructor */
	public SecCEiEnterpriseaudit(String enterpriseId, String townAuditStatus,
			String townAuditIdea, String townAuditPsnName, Date townAuditDate,
			String countyAuditStatus, String countyAuditIdea,
			String countyAuditPsnName, Date countyAuditDate,
			String enterDeptId, String isActive, String creator,
			Date createTime, String updator, Date updateTime) {
		this.enterpriseId = enterpriseId;
		this.townAuditStatus = townAuditStatus;
		this.townAuditIdea = townAuditIdea;
		this.townAuditPsnName = townAuditPsnName;
		this.townAuditDate = townAuditDate;
		this.countyAuditStatus = countyAuditStatus;
		this.countyAuditIdea = countyAuditIdea;
		this.countyAuditPsnName = countyAuditPsnName;
		this.countyAuditDate = countyAuditDate;
		this.enterDeptId = enterDeptId;
		this.isActive = isActive;
		this.creator = creator;
		this.createTime = createTime;
		this.updator = updator;
		this.updateTime = updateTime;
	}

	// Property accessors

	public String getAuditId() {
		return this.auditId;
	}

	public void setAuditId(String auditId) {
		this.auditId = auditId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getTownAuditStatus() {
		return this.townAuditStatus;
	}

	public void setTownAuditStatus(String townAuditStatus) {
		this.townAuditStatus = townAuditStatus;
	}

	public String getTownAuditIdea() {
		return this.townAuditIdea;
	}

	public void setTownAuditIdea(String townAuditIdea) {
		this.townAuditIdea = townAuditIdea;
	}

	public String getTownAuditPsnName() {
		return this.townAuditPsnName;
	}

	public void setTownAuditPsnName(String townAuditPsnName) {
		this.townAuditPsnName = townAuditPsnName;
	}

	public Date getTownAuditDate() {
		return this.townAuditDate;
	}

	public void setTownAuditDate(Date townAuditDate) {
		this.townAuditDate = townAuditDate;
	}

	public String getCountyAuditStatus() {
		return this.countyAuditStatus;
	}

	public void setCountyAuditStatus(String countyAuditStatus) {
		this.countyAuditStatus = countyAuditStatus;
	}

	public String getCountyAuditIdea() {
		return this.countyAuditIdea;
	}

	public void setCountyAuditIdea(String countyAuditIdea) {
		this.countyAuditIdea = countyAuditIdea;
	}

	public String getCountyAuditPsnName() {
		return this.countyAuditPsnName;
	}

	public void setCountyAuditPsnName(String countyAuditPsnName) {
		this.countyAuditPsnName = countyAuditPsnName;
	}

	public Date getCountyAuditDate() {
		return this.countyAuditDate;
	}

	public void setCountyAuditDate(Date countyAuditDate) {
		this.countyAuditDate = countyAuditDate;
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