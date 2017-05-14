package com.mdd.model;

import java.util.Date;

/**
 * SecCEiSecucheck entity. @author MyEclipse Persistence Tools
 */

public class SecCEiSecucheck implements java.io.Serializable {

	// Fields

	private String eiCheckId;
	private String enterpriseId;
	private Date checkDate;
	private String checkTypeCode;
	private String checker;
	private String remark;
	private String dateCollectCode;
	private String entryMobileImei;
	private String enterDeptId;
	private String isActive;
	private String creator;
	private Date createTime;
	private String updator;
	private Date updateTime;

	// Constructors

	/** default constructor */
	public SecCEiSecucheck() {
		eiCheckId = "";
		enterpriseId = "";
		checkDate = new Date();
		checkTypeCode = "";
		checker = "";
		remark = "";
		dateCollectCode = "";
		entryMobileImei = "";
		enterDeptId = "";
		isActive = "";
		creator = "";
		createTime = new Date();
		updator = "";
		updateTime = new Date();
	}

	/** full constructor */
	public SecCEiSecucheck(String enterpriseId, Date checkDate,
			String checkTypeCode, String checker, String remark,
			String dateCollectCode, String entryMobileImei, String enterDeptId,
			String isActive, String creator, Date createTime, String updator,
			Date updateTime) {
		this.enterpriseId = enterpriseId;
		this.checkDate = checkDate;
		this.checkTypeCode = checkTypeCode;
		this.checker = checker;
		this.remark = remark;
		this.dateCollectCode = dateCollectCode;
		this.entryMobileImei = entryMobileImei;
		this.enterDeptId = enterDeptId;
		this.isActive = isActive;
		this.creator = creator;
		this.createTime = createTime;
		this.updator = updator;
		this.updateTime = updateTime;
	}

	// Property accessors

	public String getEiCheckId() {
		return this.eiCheckId;
	}

	public void setEiCheckId(String eiCheckId) {
		this.eiCheckId = eiCheckId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public Date getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public String getCheckTypeCode() {
		return this.checkTypeCode;
	}

	public void setCheckTypeCode(String checkTypeCode) {
		this.checkTypeCode = checkTypeCode;
	}

	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDateCollectCode() {
		return this.dateCollectCode;
	}

	public void setDateCollectCode(String dateCollectCode) {
		this.dateCollectCode = dateCollectCode;
	}

	public String getEntryMobileImei() {
		return this.entryMobileImei;
	}

	public void setEntryMobileImei(String entryMobileImei) {
		this.entryMobileImei = entryMobileImei;
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