package com.mdd.model;

import java.util.Date;

/**
 * LgtPipeManage entity. @author MyEclipse Persistence Tools
 */

public class LgtPipeManage implements java.io.Serializable {

	// Fields

	private String id;
	private String pipeNo;
	private String pipeName;
	private String dangerName;
	private String dangerType;
	private String dutyPerson;
	private String telephone;
	private String pipeType;
	private String material;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;
	private String address;

	// Constructors

	/** default constructor */
	public LgtPipeManage() {
		id = "";
		pipeNo = "";
		pipeName = "";
		dangerName = "";
		dangerType = "";
		dutyPerson = "";
		telephone = "";
		pipeType = "";
		material = "";
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
		address = "";
	}

	/** full constructor */
	public LgtPipeManage(String pipeNo, String pipeName, String dangerName,
			String dangerType, String dutyPerson, String telephone,
			String pipeType, String material, String createBy, Date createTime,
			String updateBy, Date updateTime, String remove, String address) {
		this.pipeNo = pipeNo;
		this.pipeName = pipeName;
		this.dangerName = dangerName;
		this.dangerType = dangerType;
		this.dutyPerson = dutyPerson;
		this.telephone = telephone;
		this.pipeType = pipeType;
		this.material = material;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.remove = remove;
		this.address = address;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPipeNo() {
		return this.pipeNo;
	}

	public void setPipeNo(String pipeNo) {
		this.pipeNo = pipeNo;
	}

	public String getPipeName() {
		return this.pipeName;
	}

	public void setPipeName(String pipeName) {
		this.pipeName = pipeName;
	}

	public String getDangerName() {
		return this.dangerName;
	}

	public void setDangerName(String dangerName) {
		this.dangerName = dangerName;
	}

	public String getDangerType() {
		return this.dangerType;
	}

	public void setDangerType(String dangerType) {
		this.dangerType = dangerType;
	}

	public String getDutyPerson() {
		return this.dutyPerson;
	}

	public void setDutyPerson(String dutyPerson) {
		this.dutyPerson = dutyPerson;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPipeType() {
		return this.pipeType;
	}

	public void setPipeType(String pipeType) {
		this.pipeType = pipeType;
	}

	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material;
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

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}