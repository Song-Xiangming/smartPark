package com.mdd.model;

import java.util.Date;

/**
 * EneUseEneEquipmentFile entity. @author MyEclipse Persistence Tools
 */

public class EneUseEneEquipmentFile implements java.io.Serializable {

	// Fields

	private String id;
	private String useEnergyId;
	private String fileType;
	private String fileId;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;

	// Constructors

	/** default constructor */
	public EneUseEneEquipmentFile() {
		id = "";
		useEnergyId = "";
		fileType = "";
		fileId = "";
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
	}

	/** full constructor */
	public EneUseEneEquipmentFile(String useEnergyId, String fileType,
			String fileId, String createBy, Date createTime, String updateBy,
			Date updateTime, String remove) {
		this.useEnergyId = useEnergyId;
		this.fileType = fileType;
		this.fileId = fileId;
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

	public String getUseEnergyId() {
		return this.useEnergyId;
	}

	public void setUseEnergyId(String useEnergyId) {
		this.useEnergyId = useEnergyId;
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