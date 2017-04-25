package com.mdd.model;

import java.util.Date;

/**
 * EnergyUseAuditRecord entity. @author MyEclipse Persistence Tools
 */

public class EnergyUseAuditRecord implements java.io.Serializable {

	// Fields

	private String eid;
	private String auditId;
	private String auditType;
	private String organId;
	private String auditResult;
	private String auditExplain;
	private Date auditTime;
	private Date reformTime;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;
	private String reformResult;
	private String checkExplain;

	// Constructors

	/** default constructor */
	public EnergyUseAuditRecord() {
		eid="";
		auditId="";
		auditType="";
		organId="";
		auditResult="";
		auditExplain="";
		auditTime=new Date();
		reformTime=new Date();
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
		reformResult="";
		checkExplain="";
	}

	/** full constructor */
	public EnergyUseAuditRecord(String auditId, String auditType,
			String organId, String auditResult, String auditExplain,
			Date auditTime, Date reformTime, String createBy, Date createTime,
			String updateBy, Date updateTime, String remove,
			String reformResult, String checkExplain) {
		this.auditId = auditId;
		this.auditType = auditType;
		this.organId = organId;
		this.auditResult = auditResult;
		this.auditExplain = auditExplain;
		this.auditTime = auditTime;
		this.reformTime = reformTime;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.remove = remove;
		this.reformResult = reformResult;
		this.checkExplain = checkExplain;
	}

	// Property accessors

	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getAuditId() {
		return this.auditId;
	}

	public void setAuditId(String auditId) {
		this.auditId = auditId;
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

	public String getReformResult() {
		return this.reformResult;
	}

	public void setReformResult(String reformResult) {
		this.reformResult = reformResult;
	}

	public String getCheckExplain() {
		return this.checkExplain;
	}

	public void setCheckExplain(String checkExplain) {
		this.checkExplain = checkExplain;
	}

}