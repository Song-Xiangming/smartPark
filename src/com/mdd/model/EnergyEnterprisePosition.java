package com.mdd.model;

import java.util.Date;

/**
 * EnergyEnterprisePosition entity. @author MyEclipse Persistence Tools
 */

public class EnergyEnterprisePosition implements java.io.Serializable {

	// Fields

	private String eid;
	private String enterpriseId;
	private double longitude;
	private double latitude;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;

	// Constructors

	/** default constructor */
	public EnergyEnterprisePosition() {
		eid = "";
		enterpriseId = "";
		longitude = 0.0;
		latitude = 0.0;
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
	}

	/** full constructor */
	public EnergyEnterprisePosition(String enterpriseId, double longitude,
			double latitude, String createBy, Date createTime, String updateBy,
			Date updateTime, String remove) {
		this.enterpriseId = enterpriseId;
		this.longitude = longitude;
		this.latitude = latitude;
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

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
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