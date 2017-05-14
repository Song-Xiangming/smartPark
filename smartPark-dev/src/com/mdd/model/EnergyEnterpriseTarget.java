package com.mdd.model;

import java.util.Date;

/**
 * EnergyEnterpriseTarget entity. @author MyEclipse Persistence Tools
 */

public class EnergyEnterpriseTarget implements java.io.Serializable {

	// Fields

	private String eid;
	private double einitial;
	private double stock;
	private double newProject;
	private String corporateCode;
	private String eyear;
	private double realUsed;
	private String status;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;

	// Constructors

	/** default constructor */
	public EnergyEnterpriseTarget() {
		eid = "";
		einitial = 0.0;
		stock = 0.0;
		newProject = 0.0;
		corporateCode = "";
		eyear = "";
		realUsed = 0.0;
		status = "";
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
	}

	/** full constructor */
	public EnergyEnterpriseTarget(double einitial, double stock,
			double newProject, String corporateCode, String eyear,
			double realUsed, String status, String createBy, Date createTime,
			String updateBy, Date updateTime, String remove) {
		this.einitial = einitial;
		this.stock = stock;
		this.newProject = newProject;
		this.corporateCode = corporateCode;
		this.eyear = eyear;
		this.realUsed = realUsed;
		this.status = status;
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

	public double getEinitial() {
		return this.einitial;
	}

	public void setEinitial(double einitial) {
		this.einitial = einitial;
	}

	public double getStock() {
		return this.stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	public double getNewProject() {
		return this.newProject;
	}

	public void setNewProject(double newProject) {
		this.newProject = newProject;
	}

	public String getCorporateCode() {
		return this.corporateCode;
	}

	public void setCorporateCode(String corporateCode) {
		this.corporateCode = corporateCode;
	}

	public String getEyear() {
		return this.eyear;
	}

	public void setEyear(String eyear) {
		this.eyear = eyear;
	}

	public double getRealUsed() {
		return this.realUsed;
	}

	public void setRealUsed(double realUsed) {
		this.realUsed = realUsed;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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