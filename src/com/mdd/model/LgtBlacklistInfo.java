package com.mdd.model;

import java.util.Date;

/**
 * LgtBlacklistInfo entity. @author MyEclipse Persistence Tools
 */

public class LgtBlacklistInfo implements java.io.Serializable {

	// Fields

	private String lid;
	private String shieldingType;
	private String shieldingReason;
	private Date shieldingTime;
	private String founder;
	private Date foundationDate;
	private String modifier;
	private Date modifyDate;
	private String logicallyDeleted;
	private String legalPersonCode;
	private String driver;
	private String driverLicense;
	private String ltype;
	private String operator;

	// Constructors

	/** default constructor */
	public LgtBlacklistInfo() {
		lid = "";
		shieldingType = "";
		shieldingReason = "";
		shieldingTime = new Date();
		founder = "";
		foundationDate = new Date();
		modifier = "";
		modifyDate = new Date();
		logicallyDeleted = "";
		legalPersonCode = "";
		driver = "";
		driverLicense = "";
		ltype = "";
		operator = "";
	}

	/** full constructor */
	public LgtBlacklistInfo(String shieldingType, String shieldingReason,
			Date shieldingTime, String founder, Date foundationDate,
			String modifier, Date modifyDate, String logicallyDeleted,
			String legalPersonCode, String driver, String driverLicense,
			String ltype, String operator) {
		this.shieldingType = shieldingType;
		this.shieldingReason = shieldingReason;
		this.shieldingTime = shieldingTime;
		this.founder = founder;
		this.foundationDate = foundationDate;
		this.modifier = modifier;
		this.modifyDate = modifyDate;
		this.logicallyDeleted = logicallyDeleted;
		this.legalPersonCode = legalPersonCode;
		this.driver = driver;
		this.driverLicense = driverLicense;
		this.ltype = ltype;
		this.operator = operator;
	}

	// Property accessors

	public String getLid() {
		return this.lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getShieldingType() {
		return this.shieldingType;
	}

	public void setShieldingType(String shieldingType) {
		this.shieldingType = shieldingType;
	}

	public String getShieldingReason() {
		return this.shieldingReason;
	}

	public void setShieldingReason(String shieldingReason) {
		this.shieldingReason = shieldingReason;
	}

	public Date getShieldingTime() {
		return this.shieldingTime;
	}

	public void setShieldingTime(Date shieldingTime) {
		this.shieldingTime = shieldingTime;
	}

	public String getFounder() {
		return this.founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public Date getFoundationDate() {
		return this.foundationDate;
	}

	public void setFoundationDate(Date foundationDate) {
		this.foundationDate = foundationDate;
	}

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getLogicallyDeleted() {
		return this.logicallyDeleted;
	}

	public void setLogicallyDeleted(String logicallyDeleted) {
		this.logicallyDeleted = logicallyDeleted;
	}

	public String getLegalPersonCode() {
		return this.legalPersonCode;
	}

	public void setLegalPersonCode(String legalPersonCode) {
		this.legalPersonCode = legalPersonCode;
	}

	public String getDriver() {
		return this.driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getDriverLicense() {
		return this.driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	public String getLtype() {
		return this.ltype;
	}

	public void setLtype(String ltype) {
		this.ltype = ltype;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

}