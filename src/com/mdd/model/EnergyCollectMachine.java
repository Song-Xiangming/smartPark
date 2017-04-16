package com.mdd.model;

import java.util.Date;

/**
 * EnergyCollectMachine entity. @author MyEclipse Persistence Tools
 */

public class EnergyCollectMachine implements java.io.Serializable {

	// Fields

	private String eid;
	private String machineName;
	private String machineType;
	private String machineCode;
	private double longitude;
	private double latitude;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;
	private String machineAddr;

	// Constructors

	/** default constructor */
	public EnergyCollectMachine() {
		eid = "";
		machineName = "";
		machineType = "";
		machineCode = "";
		longitude = 0.00;
		latitude = 0.00;
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
		machineAddr = "";
	}

	/** minimal constructor */
	public EnergyCollectMachine(String eid) {
		this.eid = eid;
	}

	/** full constructor */
	public EnergyCollectMachine(String eid, String machineName,
			String machineType, String machineCode, double longitude,
			double latitude, String createBy, Date createTime, String updateBy,
			Date updateTime, String remove, String machineAddr) {
		this.eid = eid;
		this.machineName = machineName;
		this.machineType = machineType;
		this.machineCode = machineCode;
		this.longitude = longitude;
		this.latitude = latitude;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.remove = remove;
		this.machineAddr = machineAddr;
	}

	// Property accessors

	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getMachineName() {
		return this.machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public String getMachineType() {
		return this.machineType;
	}

	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	public String getMachineCode() {
		return this.machineCode;
	}

	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
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

	public String getMachineAddr() {
		return this.machineAddr;
	}

	public void setMachineAddr(String machineAddr) {
		this.machineAddr = machineAddr;
	}

}