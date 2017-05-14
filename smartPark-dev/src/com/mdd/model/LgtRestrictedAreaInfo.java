package com.mdd.model;

import java.util.Date;

/**
 * LgtRestrictedAreaInfo entity. @author MyEclipse Persistence Tools
 */

public class LgtRestrictedAreaInfo implements java.io.Serializable {

	// Fields

	private String lid;
	private String regionalPointSet;
	private String logicallyDeleted;
	private String founder;
	private Date foundationDate;
	private String restrictName;
	private String restrictType;
	private double restrictSpeed;
	private String updatePerson;
	private Date updateTime;

	// Constructors

	/** default constructor */
	public LgtRestrictedAreaInfo() {
		lid = "";
		regionalPointSet = "";
		logicallyDeleted = "";
		founder = "";
		foundationDate = new Date();
		restrictName = "";
		restrictType = "";
		restrictSpeed = 0.0;
		updatePerson = "";
		updateTime = new Date();
	}

	/** full constructor */
	public LgtRestrictedAreaInfo(String regionalPointSet,
			String logicallyDeleted, String founder, Date foundationDate,
			String restrictName, String restrictType, double restrictSpeed,
			String updatePerson, Date updateTime) {
		this.regionalPointSet = regionalPointSet;
		this.logicallyDeleted = logicallyDeleted;
		this.founder = founder;
		this.foundationDate = foundationDate;
		this.restrictName = restrictName;
		this.restrictType = restrictType;
		this.restrictSpeed = restrictSpeed;
		this.updatePerson = updatePerson;
		this.updateTime = updateTime;
	}

	// Property accessors

	public String getLid() {
		return this.lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getRegionalPointSet() {
		return this.regionalPointSet;
	}

	public void setRegionalPointSet(String regionalPointSet) {
		this.regionalPointSet = regionalPointSet;
	}

	public String getLogicallyDeleted() {
		return this.logicallyDeleted;
	}

	public void setLogicallyDeleted(String logicallyDeleted) {
		this.logicallyDeleted = logicallyDeleted;
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

	public String getRestrictName() {
		return this.restrictName;
	}

	public void setRestrictName(String restrictName) {
		this.restrictName = restrictName;
	}

	public String getRestrictType() {
		return this.restrictType;
	}

	public void setRestrictType(String restrictType) {
		this.restrictType = restrictType;
	}

	public double getRestrictSpeed() {
		return this.restrictSpeed;
	}

	public void setRestrictSpeed(double restrictSpeed) {
		this.restrictSpeed = restrictSpeed;
	}

	public String getUpdatePerson() {
		return this.updatePerson;
	}

	public void setUpdatePerson(String updatePerson) {
		this.updatePerson = updatePerson;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}