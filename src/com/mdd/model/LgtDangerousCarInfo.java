package com.mdd.model;

import java.util.Date;

/**
 * LgtDangerousCarInfo entity. @author MyEclipse Persistence Tools
 */

public class LgtDangerousCarInfo implements java.io.Serializable {

	// Fields

	private String lid;
	private String legalPersonCode;
	private String enterpriseId;
	private String terminalId;
	private String licensePlateNo;
	private String vehicleBrand;
	private String vehicleBrandType;
	private String vehicleColor;
	private String vehicleType;
	private String vehicleDisplacement;
	private String engineNo;
	private String crossDomainType;
	private String chassisNo;
	private String founder;
	private Date foundationDate;
	private String modifier;
	private Date modifyDate;
	private String logicallyDeleted;
	private String carOnlineStatues;
	private String enterpriseName;
	private String carNo;

	// Constructors

	/** default constructor */
	public LgtDangerousCarInfo() {
		lid = "";
		legalPersonCode = "";
		enterpriseId = "";
		terminalId = "";
		licensePlateNo = "";
		vehicleBrand = "";
		vehicleBrandType = "";
		vehicleColor = "";
		vehicleType = "";
		vehicleDisplacement = "";
		engineNo = "";
		crossDomainType = "";
		chassisNo = "";
		founder = "";
		foundationDate = new Date();
		modifier = "";
		modifyDate = new Date();
		logicallyDeleted = "";
		carOnlineStatues = "";
		enterpriseName = "";
		carNo = "";
	}

	/** full constructor */
	public LgtDangerousCarInfo(String legalPersonCode, String enterpriseId,
			String terminalId, String licensePlateNo, String vehicleBrand,
			String vehicleBrandType, String vehicleColor, String vehicleType,
			String vehicleDisplacement, String engineNo,
			String crossDomainType, String chassisNo, String founder,
			Date foundationDate, String modifier, Date modifyDate,
			String logicallyDeleted, String carOnlineStatues,
			String enterpriseName, String carNo) {
		this.legalPersonCode = legalPersonCode;
		this.enterpriseId = enterpriseId;
		this.terminalId = terminalId;
		this.licensePlateNo = licensePlateNo;
		this.vehicleBrand = vehicleBrand;
		this.vehicleBrandType = vehicleBrandType;
		this.vehicleColor = vehicleColor;
		this.vehicleType = vehicleType;
		this.vehicleDisplacement = vehicleDisplacement;
		this.engineNo = engineNo;
		this.crossDomainType = crossDomainType;
		this.chassisNo = chassisNo;
		this.founder = founder;
		this.foundationDate = foundationDate;
		this.modifier = modifier;
		this.modifyDate = modifyDate;
		this.logicallyDeleted = logicallyDeleted;
		this.carOnlineStatues = carOnlineStatues;
		this.enterpriseName = enterpriseName;
		this.carNo = carNo;
	}

	// Property accessors

	public String getLid() {
		return this.lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getLegalPersonCode() {
		return this.legalPersonCode;
	}

	public void setLegalPersonCode(String legalPersonCode) {
		this.legalPersonCode = legalPersonCode;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
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

	public String getVehicleBrand() {
		return this.vehicleBrand;
	}

	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public String getVehicleBrandType() {
		return this.vehicleBrandType;
	}

	public void setVehicleBrandType(String vehicleBrandType) {
		this.vehicleBrandType = vehicleBrandType;
	}

	public String getVehicleColor() {
		return this.vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleDisplacement() {
		return this.vehicleDisplacement;
	}

	public void setVehicleDisplacement(String vehicleDisplacement) {
		this.vehicleDisplacement = vehicleDisplacement;
	}

	public String getEngineNo() {
		return this.engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getCrossDomainType() {
		return this.crossDomainType;
	}

	public void setCrossDomainType(String crossDomainType) {
		this.crossDomainType = crossDomainType;
	}

	public String getChassisNo() {
		return this.chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
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

	public String getCarOnlineStatues() {
		return this.carOnlineStatues;
	}

	public void setCarOnlineStatues(String carOnlineStatues) {
		this.carOnlineStatues = carOnlineStatues;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getCarNo() {
		return this.carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

}