package com.mdd.model;

import java.util.Date;

/**
 * EnergyGardenTarget entity. @author MyEclipse Persistence Tools
 */

public class EnergyGardenTarget implements java.io.Serializable {

	// Fields

	private String eid;
	private String eyear;
	private double totalUsed;
	private double realUsed;
	private double edistributed;
	private String status;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;

	// Constructors

	/** default constructor */
	public EnergyGardenTarget() {
		eid = "";
		eyear = "";
		totalUsed = 0.0;
		realUsed = 0.0;
		edistributed = 0.0;
		status = "";
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
	}

	/** full constructor */
	public EnergyGardenTarget(String eyear, double totalUsed, double realUsed,
			double edistributed, String status, String createBy,
			Date createTime, String updateBy, Date updateTime, String remove) {
		this.eyear = eyear;
		this.totalUsed = totalUsed;
		this.realUsed = realUsed;
		this.edistributed = edistributed;
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

	public String getEyear() {
		return this.eyear;
	}

	public void setEyear(String eyear) {
		this.eyear = eyear;
	}

	public double getTotalUsed() {
		return this.totalUsed;
	}

	public void setTotalUsed(double totalUsed) {
		this.totalUsed = totalUsed;
	}

	public double getRealUsed() {
		return this.realUsed;
	}

	public void setRealUsed(double realUsed) {
		this.realUsed = realUsed;
	}

	public double getEdistributed() {
		return this.edistributed;
	}

	public void setEdistributed(double edistributed) {
		this.edistributed = edistributed;
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