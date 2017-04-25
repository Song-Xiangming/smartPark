package com.mdd.model;

import java.util.Date;

/**
 * SecCEiChemical entity. @author MyEclipse Persistence Tools
 */

public class SecCEiChemical implements java.io.Serializable {

	// Fields

	private String chemicalId;
	private String enterpriseId;
	private String chemicalName;
	private String imgdNo;
	private double maxPro;
	private String mpunitCode;
	private String isToxi;
	private String isPrecursor;
	private String enterDeptId;
	private String isActive;
	private String creator;
	private Date createTime;
	private String updator;
	private Date updateTime;

	// Constructors

	/** default constructor */
	public SecCEiChemical() {
		chemicalId = "";
		enterpriseId = "";
		chemicalName = "";
		imgdNo = "";
		maxPro = 0.0;
		mpunitCode = "";
		isToxi = "";
		isPrecursor = "";
		enterDeptId = "";
		isActive = "";
		creator = "";
		createTime = new Date();
		updator = "";
		updateTime = new Date();
	}

	/** full constructor */
	public SecCEiChemical(String enterpriseId, String chemicalName,
			String imgdNo, double maxPro, String mpunitCode, String isToxi,
			String isPrecursor, String enterDeptId, String isActive,
			String creator, Date createTime, String updator, Date updateTime) {
		this.enterpriseId = enterpriseId;
		this.chemicalName = chemicalName;
		this.imgdNo = imgdNo;
		this.maxPro = maxPro;
		this.mpunitCode = mpunitCode;
		this.isToxi = isToxi;
		this.isPrecursor = isPrecursor;
		this.enterDeptId = enterDeptId;
		this.isActive = isActive;
		this.creator = creator;
		this.createTime = createTime;
		this.updator = updator;
		this.updateTime = updateTime;
	}

	// Property accessors

	public String getChemicalId() {
		return this.chemicalId;
	}

	public void setChemicalId(String chemicalId) {
		this.chemicalId = chemicalId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getChemicalName() {
		return this.chemicalName;
	}

	public void setChemicalName(String chemicalName) {
		this.chemicalName = chemicalName;
	}

	public String getImgdNo() {
		return this.imgdNo;
	}

	public void setImgdNo(String imgdNo) {
		this.imgdNo = imgdNo;
	}

	public double getMaxPro() {
		return this.maxPro;
	}

	public void setMaxPro(double maxPro) {
		this.maxPro = maxPro;
	}

	public String getMpunitCode() {
		return this.mpunitCode;
	}

	public void setMpunitCode(String mpunitCode) {
		this.mpunitCode = mpunitCode;
	}

	public String getIsToxi() {
		return this.isToxi;
	}

	public void setIsToxi(String isToxi) {
		this.isToxi = isToxi;
	}

	public String getIsPrecursor() {
		return this.isPrecursor;
	}

	public void setIsPrecursor(String isPrecursor) {
		this.isPrecursor = isPrecursor;
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