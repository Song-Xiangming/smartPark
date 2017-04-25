package com.mdd.model;

/**
 * LgtVehicleScheduling entity. @author MyEclipse Persistence Tools
 */

public class LgtVehicleScheduling implements java.io.Serializable {

	// Fields

	private String lid;
	private String terminalId;
	private String carInfo;
	private String mark;
	private String logicallyDeleted;

	// Constructors

	/** default constructor */
	public LgtVehicleScheduling() {
		lid="";
		terminalId="";
		carInfo="";
		mark="";
		logicallyDeleted="";
	}

	/** full constructor */
	public LgtVehicleScheduling(String terminalId, String carInfo, String mark,
			String logicallyDeleted) {
		this.terminalId = terminalId;
		this.carInfo = carInfo;
		this.mark = mark;
		this.logicallyDeleted = logicallyDeleted;
	}

	// Property accessors

	public String getLid() {
		return this.lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getTerminalId() {
		return this.terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getCarInfo() {
		return this.carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}

	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getLogicallyDeleted() {
		return this.logicallyDeleted;
	}

	public void setLogicallyDeleted(String logicallyDeleted) {
		this.logicallyDeleted = logicallyDeleted;
	}

}