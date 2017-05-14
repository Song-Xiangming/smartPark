package com.mdd.model;

import java.util.Date;

/**
 * EnergyUseAudit entity. @author MyEclipse Persistence Tools
 */

public class EnergyUseAudit implements java.io.Serializable {

	// Fields

	private String eid;
	private String corporateCode;
	private String auditType;
	private String organId;
	private String auditResult;
	private String auditExplain;
	private Date auditTime;
	private Date reviewTime;
	private Date reformTime;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;

	// Constructors

	/** default constructor */
	public EnergyUseAudit() {
		eid = "";
		corporateCode = "";
		auditType = "";
		organId = "";
		auditResult = "";
		auditExplain = "";
		auditTime = new Date();
		reviewTime = new Date();
		reformTime = new Date();
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
	}

	/** full constructor */
	public EnergyUseAudit(String corporateCode, String auditType,
			String organId, String auditResult, String auditExplain,
			Date auditTime, Date reviewTime, Date reformTime, String createBy,
			Date createTime, String updateBy, Date updateTime, String remove) {
		this.corporateCode = corporateCode;
		this.auditType = auditType;
		this.organId = organId;
		this.auditResult = auditResult;
		this.auditExplain = auditExplain;
		this.auditTime = auditTime;
		this.reviewTime = reviewTime;
		this.reformTime = reformTime;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.remove = remove;
	}

	// Property accessors

	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getCorporateCode() {
		return this.corporateCode;
	}

	public void setCorporateCode(String corporateCode) {
		this.corporateCode = corporateCode;
	}

	public String getAuditType() {
		return this.auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getOrganId() {
		return this.organId;
	}

	public void setOrganId(String organId) {
		this.organId = organId;
	}

	public String getAuditResult() {
		return this.auditResult;
	}

	public void setAuditResult(String auditResult) {
		this.auditResult = auditResult;
	}

	public String getAuditExplain() {
		return this.auditExplain;
	}

	public void setAuditExplain(String auditExplain) {
		this.auditExplain = auditExplain;
	}

	public Date getAuditTime() {
		return this.auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public Date getReviewTime() {
		return this.reviewTime;
	}

	public void setReviewTime(Date reviewTime) {
		this.reviewTime = reviewTime;
	}

	public Date getReformTime() {
		return this.reformTime;
	}

	public void setReformTime(Date reformTime) {
		this.reformTime = reformTime;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getRemove() {
		return this.remove;
	}

	public void setRemove(String remove) {
		this.remove = remove;
	}

}