package com.mdd.model;

import java.util.Date;

/**
 * EnergyTradeFile entity. @author MyEclipse Persistence Tools
 */

public class EnergyTradeFile implements java.io.Serializable {

	// Fields

	private String eid;
	private String energyTradeId;
	private String fileType;
	private String fileId;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;

	// Constructors

	/** default constructor */
	public EnergyTradeFile() {
		eid="";
		energyTradeId="";
		fileType="";
		fileId="";
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
	}

	/** full constructor */
	public EnergyTradeFile(String energyTradeId, String fileType,
			String fileId, String createBy, Date createTime, String updateBy,
			Date updateTime, String remove) {
		this.energyTradeId = energyTradeId;
		this.fileType = fileType;
		this.fileId = fileId;
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

	public String getEnergyTradeId() {
		return this.energyTradeId;
	}

	public void setEnergyTradeId(String energyTradeId) {
		this.energyTradeId = energyTradeId;
	}

	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileId() {
		return this.fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
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