package com.mdd.model;

import java.util.Date;

/**
 * LgtAlarmManage entity. @author MyEclipse Persistence Tools
 */

public class LgtAlarmManage implements java.io.Serializable {

	// Fields

	private String lid;
	private String alarmRecordNo;
	private String terminalId;
	private String licensePlateNo;
	private String shippingNoteNo;
	private String alarmType;
	private String alarmProcessingState;
	private String alarmProcessingRegister;
	private Date alarmTime;
	private String alarmDetails;
	private String founder;
	private Date foundationDate;
	private String modifier;
	private Date modifyDate;
	private String logicallyDeleted;
	private String legalPersonCode;
	private String driverInfoId;

	// Constructors

	/** default constructor */
	public LgtAlarmManage() {
		lid = "";
		alarmRecordNo = "";
		terminalId = "";
		licensePlateNo = "";
		shippingNoteNo = "";
		alarmType = "";
		alarmProcessingState = "";
		alarmProcessingRegister = "";
		alarmTime = new Date();
		alarmDetails = "";
		founder = "";
		foundationDate = new Date();
		modifier = "";
		modifyDate = new Date();
		logicallyDeleted = "";
		legalPersonCode = "";
		driverInfoId = "";
	}

	/** full constructor */
	public LgtAlarmManage(String alarmRecordNo, String terminalId,
			String licensePlateNo, String shippingNoteNo, String alarmType,
			String alarmProcessingState, String alarmProcessingRegister,
			Date alarmTime, String alarmDetails, String founder,
			Date foundationDate, String modifier, Date modifyDate,
			String logicallyDeleted, String legalPersonCode, String driverInfoId) {
		this.alarmRecordNo = alarmRecordNo;
		this.terminalId = terminalId;
		this.licensePlateNo = licensePlateNo;
		this.shippingNoteNo = shippingNoteNo;
		this.alarmType = alarmType;
		this.alarmProcessingState = alarmProcessingState;
		this.alarmProcessingRegister = alarmProcessingRegister;
		this.alarmTime = alarmTime;
		this.alarmDetails = alarmDetails;
		this.founder = founder;
		this.foundationDate = foundationDate;
		this.modifier = modifier;
		this.modifyDate = modifyDate;
		this.logicallyDeleted = logicallyDeleted;
		this.legalPersonCode = legalPersonCode;
		this.driverInfoId = driverInfoId;
	}

	// Property accessors

	public String getLid() {
		return this.lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getAlarmRecordNo() {
		return this.alarmRecordNo;
	}

	public void setAlarmRecordNo(String alarmRecordNo) {
		this.alarmRecordNo = alarmRecordNo;
	}

	public String getTerminalId() {
		return this.terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getLicensePlateNo() {
		return this.licensePlateNo;
	}

	public void setLicensePlateNo(String licensePlateNo) {
		this.licensePlateNo = licensePlateNo;
	}

	public String getShippingNoteNo() {
		return this.shippingNoteNo;
	}

	public void setShippingNoteNo(String shippingNoteNo) {
		this.shippingNoteNo = shippingNoteNo;
	}

	public String getAlarmType() {
		return this.alarmType;
	}

	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
	}

	public String getAlarmProcessingState() {
		return this.alarmProcessingState;
	}

	public void setAlarmProcessingState(String alarmProcessingState) {
		this.alarmProcessingState = alarmProcessingState;
	}

	public String getAlarmProcessingRegister() {
		return this.alarmProcessingRegister;
	}

	public void setAlarmProcessingRegister(String alarmProcessingRegister) {
		this.alarmProcessingRegister = alarmProcessingRegister;
	}

	public Date getAlarmTime() {
		return this.alarmTime;
	}

	public void setAlarmTime(Date alarmTime) {
		this.alarmTime = alarmTime;
	}

	public String getAlarmDetails() {
		return this.alarmDetails;
	}

	public void setAlarmDetails(String alarmDetails) {
		this.alarmDetails = alarmDetails;
	}

	public String getFounder() {
		return this.founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public Date getFoundationDate() {
		return this.foundationDate;
	}

	public void setFoundationDate(Date foundationDate) {
		this.foundationDate = foundationDate;
	}

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getLogicallyDeleted() {
		return this.logicallyDeleted;
	}

	public void setLogicallyDeleted(String logicallyDeleted) {
		this.logicallyDeleted = logicallyDeleted;
	}

	public String getLegalPersonCode() {
		return this.legalPersonCode;
	}

	public void setLegalPersonCode(String legalPersonCode) {
		this.legalPersonCode = legalPersonCode;
	}

	public String getDriverInfoId() {
		return this.driverInfoId;
	}

	public void setDriverInfoId(String driverInfoId) {
		this.driverInfoId = driverInfoId;
	}

}