package com.mdd.model;

import java.util.Date;

/**
 * EnergyCollectMachine entity. @author MyEclipse Persistence Tools
 */

public class EnergyCollectMachine implements java.io.Serializable {

	// Fields

	private String id;
	private String machineName;
	private String machineNum;
	private String machineStatus;
	private double longitude;
	private double latitude;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;
	private String machineAddr;
	private String machineModel;
	private String machineProtocol;
	private String machineTransmittal;
	private String machineFanufacturer;

	// Constructors

	/** default constructor */
	public EnergyCollectMachine() {
		id = "";
		machineName = "";
		machineNum = "";
		machineStatus = "";
		longitude = 0.0;
		latitude = 0.0;
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
		machineAddr = "";
		machineModel = "";
		machineProtocol = "";
		machineTransmittal = "";
		machineFanufacturer = "";
	}

	/** full constructor */
	public EnergyCollectMachine(String machineName, String machineNum,
			String machineStatus, double longitude, double latitude,
			String createBy, Date createTime, String updateBy, Date updateTime,
			String remove, String machineAddr, String machineModel,
			String machineProtocol, String machineTransmittal,
			String machineFanufacturer) {
		this.machineName = machineName;
		this.machineNum = machineNum;
		this.machineStatus = machineStatus;
		this.longitude = longitude;
		this.latitude = latitude;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.remove = remove;
		this.machineAddr = machineAddr;
		this.machineModel = machineModel;
		this.machineProtocol = machineProtocol;
		this.machineTransmittal = machineTransmittal;
		this.machineFanufacturer = machineFanufacturer;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMachineName() {
		return this.machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public String getMachineNum() {
		return this.machineNum;
	}

	public void setMachineNum(String machineNum) {
		this.machineNum = machineNum;
	}

	public String getMachineStatus() {
		return this.machineStatus;
	}

	public void setMachineStatus(String machineStatus) {
		this.machineStatus = machineStatus;
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

	public String getMachineModel() {
		return this.machineModel;
	}

	public void setMachineModel(String machineModel) {
		this.machineModel = machineModel;
	}

	public String getMachineProtocol() {
		return this.machineProtocol;
	}

	public void setMachineProtocol(String machineProtocol) {
		this.machineProtocol = machineProtocol;
	}

	public String getMachineTransmittal() {
		return this.machineTransmittal;
	}

	public void setMachineTransmittal(String machineTransmittal) {
		this.machineTransmittal = machineTransmittal;
	}

	public String getMachineFanufacturer() {
		return this.machineFanufacturer;
	}

	public void setMachineFanufacturer(String machineFanufacturer) {
		this.machineFanufacturer = machineFanufacturer;
	}

}