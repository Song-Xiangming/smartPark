package com.mdd.model;

import java.util.Date;

/**
 * SecCEiStand entity. @author MyEclipse Persistence Tools
 */

public class SecCEiStand implements java.io.Serializable {

	// Fields

	private String standId;
	private String enterpriseId;
	private String wssCretificateCode;
	private String wssLevel;
	private String professionalList;
	private Date issueCertificatesDate;
	private Date expirationDate;
	private String wssCretificateStatus;
	private Date revocationDate;
	private String standSafetyName;
	private String awardingSafetyName;
	private String organizeDepName;
	private String eaaDepName;
	private String remark;
	private String enterDeptId;
	private String isActive;
	private String creator;
	private Date createTime;
	private String updator;
	private Date updateTime;

	// Constructors

	/** default constructor */
	public SecCEiStand() {
		standId = "";
		enterpriseId = "";
		wssCretificateCode = "";
		wssLevel = "";
		professionalList = "";
		issueCertificatesDate = new Date();
		expirationDate = new Date();
		wssCretificateStatus = "";
		revocationDate = new Date();
		standSafetyName = "";
		awardingSafetyName = "";
		organizeDepName = "";
		eaaDepName = "";
		remark = "";
		enterDeptId = "";
		isActive = "";
		creator = "";
		createTime = new Date();
		updator = "";
		updateTime = new Date();

	}

	/** full constructor */
	public SecCEiStand(String enterpriseId, String wssCretificateCode,
			String wssLevel, String professionalList,
			Date issueCertificatesDate, Date expirationDate,
			String wssCretificateStatus, Date revocationDate,
			String standSafetyName, String awardingSafetyName,
			String organizeDepName, String eaaDepName, String remark,
			String enterDeptId, String isActive, String creator,
			Date createTime, String updator, Date updateTime) {
		this.enterpriseId = enterpriseId;
		this.wssCretificateCode = wssCretificateCode;
		this.wssLevel = wssLevel;
		this.professionalList = professionalList;
		this.issueCertificatesDate = issueCertificatesDate;
		this.expirationDate = expirationDate;
		this.wssCretificateStatus = wssCretificateStatus;
		this.revocationDate = revocationDate;
		this.standSafetyName = standSafetyName;
		this.awardingSafetyName = awardingSafetyName;
		this.organizeDepName = organizeDepName;
		this.eaaDepName = eaaDepName;
		this.remark = remark;
		this.enterDeptId = enterDeptId;
		this.isActive = isActive;
		this.creator = creator;
		this.createTime = createTime;
		this.updator = updator;
		this.updateTime = updateTime;
	}

	// Property accessors

	public String getStandId() {
		return this.standId;
	}

	public void setStandId(String standId) {
		this.standId = standId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getWssCretificateCode() {
		return this.wssCretificateCode;
	}

	public void setWssCretificateCode(String wssCretificateCode) {
		this.wssCretificateCode = wssCretificateCode;
	}

	public String getWssLevel() {
		return this.wssLevel;
	}

	public void setWssLevel(String wssLevel) {
		this.wssLevel = wssLevel;
	}

	public String getProfessionalList() {
		return this.professionalList;
	}

	public void setProfessionalList(String professionalList) {
		this.professionalList = professionalList;
	}

	public Date getIssueCertificatesDate() {
		return this.issueCertificatesDate;
	}

	public void setIssueCertificatesDate(Date issueCertificatesDate) {
		this.issueCertificatesDate = issueCertificatesDate;
	}

	public Date getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getWssCretificateStatus() {
		return this.wssCretificateStatus;
	}

	public void setWssCretificateStatus(String wssCretificateStatus) {
		this.wssCretificateStatus = wssCretificateStatus;
	}

	public Date getRevocationDate() {
		return this.revocationDate;
	}

	public void setRevocationDate(Date revocationDate) {
		this.revocationDate = revocationDate;
	}

	public String getStandSafetyName() {
		return this.standSafetyName;
	}

	public void setStandSafetyName(String standSafetyName) {
		this.standSafetyName = standSafetyName;
	}

	public String getAwardingSafetyName() {
		return this.awardingSafetyName;
	}

	public void setAwardingSafetyName(String awardingSafetyName) {
		this.awardingSafetyName = awardingSafetyName;
	}

	public String getOrganizeDepName() {
		return this.organizeDepName;
	}

	public void setOrganizeDepName(String organizeDepName) {
		this.organizeDepName = organizeDepName;
	}

	public String getEaaDepName() {
		return this.eaaDepName;
	}

	public void setEaaDepName(String eaaDepName) {
		this.eaaDepName = eaaDepName;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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