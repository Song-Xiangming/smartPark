package com.mdd.model;

import java.util.Date;

/**
 * EnergyMessageRelEnt entity. @author MyEclipse Persistence Tools
 */

public class EnergyMessageRelEnt implements java.io.Serializable {

	// Fields

	private String eid;
	private String publishId;
	private String enterpriseId;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;
	private String readFlag;

	// Constructors

	/** default constructor */
	public EnergyMessageRelEnt() {
		eid = "";
		publishId = "";
		enterpriseId = "";
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
		readFlag = "";
	}

	/** full constructor */
	public EnergyMessageRelEnt(String publishId, String enterpriseId,
			String createBy, Date createTime, String updateBy, Date updateTime,
			String remove, String readFlag) {
		this.publishId = publishId;
		this.enterpriseId = enterpriseId;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.remove = remove;
		this.readFlag = readFlag;
	}

	// Property accessors

	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getPublishId() {
		return this.publishId;
	}

	public void setPublishId(String publishId) {
		this.publishId = publishId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
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

	public String getReadFlag() {
		return this.readFlag;
	}

	public void setReadFlag(String readFlag) {
		this.readFlag = readFlag;
	}

}