package com.mdd.model;

import java.util.Date;

/**
 * EnergyTradeInfo entity. @author MyEclipse Persistence Tools
 */

public class EnergyTradeInfo implements java.io.Serializable {

	// Fields

	private String eid;
	private String corporateCode;
	private String projectName;
	private double projectUsed;
	private String etransaction;
	private String invoiceNum;
	private String auditor;
	private String auditExplain;
	private String organ;
	private String resultExplain;
	private String result;
	private Date auditTime;
	private String status;
	private String resultConfirm;
	private Date confirmTime;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;
	private double unitPrice;
	private String projectId;

	// Constructors

	/** default constructor */
	public EnergyTradeInfo() {
		eid = "";
		corporateCode = "";
		projectName = "";
		projectUsed = 0.0;
		etransaction = "";
		invoiceNum = "";
		auditor = "";
		auditExplain = "";
		organ = "";
		resultExplain = "";
		result = "";
		auditTime = new Date();
		status = "";
		resultConfirm = "";
		confirmTime = new Date();
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
		unitPrice = 0.0;
		projectId = "";
	}

	/** full constructor */
	public EnergyTradeInfo(String corporateCode, String projectName,
			double projectUsed, String etransaction, String invoiceNum,
			String auditor, String auditExplain, String organ,
			String resultExplain, String result, Date auditTime, String status,
			String resultConfirm, Date confirmTime, String createBy,
			Date createTime, String updateBy, Date updateTime, String remove,
			double unitPrice, String projectId) {
		this.corporateCode = corporateCode;
		this.projectName = projectName;
		this.projectUsed = projectUsed;
		this.etransaction = etransaction;
		this.invoiceNum = invoiceNum;
		this.auditor = auditor;
		this.auditExplain = auditExplain;
		this.organ = organ;
		this.resultExplain = resultExplain;
		this.result = result;
		this.auditTime = auditTime;
		this.status = status;
		this.resultConfirm = resultConfirm;
		this.confirmTime = confirmTime;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.remove = remove;
		this.unitPrice = unitPrice;
		this.projectId = projectId;
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

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public double getProjectUsed() {
		return this.projectUsed;
	}

	public void setProjectUsed(double projectUsed) {
		this.projectUsed = projectUsed;
	}

	public String getEtransaction() {
		return this.etransaction;
	}

	public void setEtransaction(String etransaction) {
		this.etransaction = etransaction;
	}

	public String getInvoiceNum() {
		return this.invoiceNum;
	}

	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}

	public String getAuditor() {
		return this.auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	public String getAuditExplain() {
		return this.auditExplain;
	}

	public void setAuditExplain(String auditExplain) {
		this.auditExplain = auditExplain;
	}

	public String getOrgan() {
		return this.organ;
	}

	public void setOrgan(String organ) {
		this.organ = organ;
	}

	public String getResultExplain() {
		return this.resultExplain;
	}

	public void setResultExplain(String resultExplain) {
		this.resultExplain = resultExplain;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Date getAuditTime() {
		return this.auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResultConfirm() {
		return this.resultConfirm;
	}

	public void setResultConfirm(String resultConfirm) {
		this.resultConfirm = resultConfirm;
	}

	public Date getConfirmTime() {
		return this.confirmTime;
	}

	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
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

	public double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}