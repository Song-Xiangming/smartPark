package com.mdd.model;

import java.util.Date;

/**
 * EnergyWaterMeter entity. @author MyEclipse Persistence Tools
 */

public class EnergyWaterMeter implements java.io.Serializable {

	// Fields

	private String eid;
	private String dataRedId;
	private String waterType;
	private double waterValue;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;

	// Constructors

	/** default constructor */
	public EnergyWaterMeter() {
		eid="";
		dataRedId="";
		waterType="";
		waterValue=0.0;
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
	}

	/** full constructor */
	public EnergyWaterMeter(String dataRedId, String waterType,
			double waterValue, String createBy, Date createTime,
			String updateBy, Date updateTime, String remove) {
		this.dataRedId = dataRedId;
		this.waterType = waterType;
		this.waterValue = waterValue;
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

	public String getDataRedId() {
		return this.dataRedId;
	}

	public void setDataRedId(String dataRedId) {
		this.dataRedId = dataRedId;
	}

	public String getWaterType() {
		return this.waterType;
	}

	public void setWaterType(String waterType) {
		this.waterType = waterType;
	}

	public double getWaterValue() {
		return this.waterValue;
	}

	public void setWaterValue(double waterValue) {
		this.waterValue = waterValue;
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