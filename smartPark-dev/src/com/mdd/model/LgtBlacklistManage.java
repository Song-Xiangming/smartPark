package com.mdd.model;

import java.util.Date;

/**
 * LgtBlacklistManage entity. @author MyEclipse Persistence Tools
 */

public class LgtBlacklistManage implements java.io.Serializable {

	// Fields

	private String id;
	private String blacklistType;
	private String blacklistReason;
	private Date blacklistDate;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;
	private String corporateNo;
	private String driver;
	private String vehicle;
	private String objectType;
	private String operatePerson;
	private String identificationCardNo;

	// Constructors

	/** default constructor */
	public LgtBlacklistManage() {
		id = "";
		blacklistType = "";
		blacklistReason = "";
		blacklistDate = new Date();
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
		corporateNo = "";
		driver = "";
		vehicle = "";
		objectType = "";
		operatePerson = "";
		identificationCardNo = "";
	}

	/** full constructor */
	public LgtBlacklistManage(String blacklistType, String blacklistReason,
			Date blacklistDate, String createBy, Date createTime,
			String updateBy, Date updateTime, String remove,
			String corporateNo, String driver, String vehicle,
			String objectType, String operatePerson, String identificationCardNo) {
		this.blacklistType = blacklistType;
		this.blacklistReason = blacklistReason;
		this.blacklistDate = blacklistDate;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.remove = remove;
		this.corporateNo = corporateNo;
		this.driver = driver;
		this.vehicle = vehicle;
		this.objectType = objectType;
		this.operatePerson = operatePerson;
		this.identificationCardNo = identificationCardNo;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBlacklistType() {
		return this.blacklistType;
	}

	public void setBlacklistType(String blacklistType) {
		this.blacklistType = blacklistType;
	}

	public String getBlacklistReason() {
		return this.blacklistReason;
	}

	public void setBlacklistReason(String blacklistReason) {
		this.blacklistReason = blacklistReason;
	}

	public Date getBlacklistDate() {
		return this.blacklistDate;
	}

	public void setBlacklistDate(Date blacklistDate) {
		this.blacklistDate = blacklistDate;
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

	public String getCorporateNo() {
		return this.corporateNo;
	}

	public void setCorporateNo(String corporateNo) {
		this.corporateNo = corporateNo;
	}

	public String getDriver() {
		return this.driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getOperatePerson() {
		return this.operatePerson;
	}

	public void setOperatePerson(String operatePerson) {
		this.operatePerson = operatePerson;
	}

	public String getIdentificationCardNo() {
		return this.identificationCardNo;
	}

	public void setIdentificationCardNo(String identificationCardNo) {
		this.identificationCardNo = identificationCardNo;
	}

}