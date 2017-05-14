package com.mdd.model;

import java.util.Date;

/**
 * EneSupEneUnitRelFile entity. @author MyEclipse Persistence Tools
 */

public class EneSupEneUnitRelFile implements java.io.Serializable {

	// Fields

	private String id;
	private String electricUnitId;
	private String fileId;
	private String fileDataType;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;

	// Constructors

	/** default constructor */
	public EneSupEneUnitRelFile() {
		id = "";
		electricUnitId = "";
		fileId = "";
		fileDataType = "";
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
	}

	/** full constructor */
	public EneSupEneUnitRelFile(String electricUnitId, String fileId,
			String fileDataType, String createBy, Date createTime,
			String updateBy, Date updateTime, String remove) {
		this.electricUnitId = electricUnitId;
		this.fileId = fileId;
		this.fileDataType = fileDataType;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.remove = remove;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getElectricUnitId() {
		return this.electricUnitId;
	}

	public void setElectricUnitId(String electricUnitId) {
		this.electricUnitId = electricUnitId;
	}

	public String getFileId() {
		return this.fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileDataType() {
		return this.fileDataType;
	}

	public void setFileDataType(String fileDataType) {
		this.fileDataType = fileDataType;
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