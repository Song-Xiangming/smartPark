package com.mdd.model;

import java.util.Date;

/**
 * LgtWaybillInfo entity. @author MyEclipse Persistence Tools
 */

public class LgtWaybillInfo implements java.io.Serializable {

	// Fields

	private String lid;
	private String driverId;
	private String supercargoId;
	private String chemicalEenterpriseId;
	private String lgtEnterprisesId;
	private String carId;
	private String shippingNoteNo;
	private String customerNoteNo;
	private String startingPoint;
	private String destination;
	private String dliverySection;
	private String dliverySectionPerson;
	private String waybillStatus;
	private String dliveryAddress;
	private Date dliveryTime;
	private String receivingSection;
	private String receivingSectionPerson;
	private String receivingSectionTelephone;
	private String dliverySectionTelephone;
	private String receivingAddress;
	private Date unloadTime;
	private String driver;
	private String driverPhone;
	private String driverIdNo;
	private String driverEmploymentNo;
	private String supercargo;
	private String supercargoPhone;
	private String trailerLicensePlate;
	private String supercargoNo;
	private String supercargoIdNo;
	private String licensePlateNo;
	private String note;
	private String founder;
	private Date foundationDate;
	private String modifier;
	private Date modifyDate;
	private String logicallyDeleted;

	// Constructors

	/** default constructor */
	public LgtWaybillInfo() {
		lid = "";
		driverId = "";
		supercargoId = "";
		chemicalEenterpriseId = "";
		lgtEnterprisesId = "";
		carId = "";
		shippingNoteNo = "";
		customerNoteNo = "";
		startingPoint = "";
		destination = "";
		dliverySection = "";
		dliverySectionPerson = "";
		waybillStatus = "";
		dliveryAddress = "";
		dliveryTime = new Date();
		receivingSection = "";
		receivingSectionPerson = "";
		receivingSectionTelephone = "";
		dliverySectionTelephone = "";
		receivingAddress = "";
		unloadTime = new Date();
		driver = "";
		driverPhone = "";
		driverIdNo = "";
		driverEmploymentNo = "";
		supercargo = "";
		supercargoPhone = "";
		trailerLicensePlate = "";
		supercargoNo = "";
		supercargoIdNo = "";
		licensePlateNo = "";
		note = "";
		founder = "";
		foundationDate = new Date();
		modifier = "";
		modifyDate = new Date();
		logicallyDeleted = "";
	}

	/** full constructor */
	public LgtWaybillInfo(String driverId, String supercargoId,
			String chemicalEenterpriseId, String lgtEnterprisesId,
			String carId, String shippingNoteNo, String customerNoteNo,
			String startingPoint, String destination, String dliverySection,
			String dliverySectionPerson, String waybillStatus,
			String dliveryAddress, Date dliveryTime, String receivingSection,
			String receivingSectionPerson, String receivingSectionTelephone,
			String dliverySectionTelephone, String receivingAddress,
			Date unloadTime, String driver, String driverPhone,
			String driverIdNo, String driverEmploymentNo, String supercargo,
			String supercargoPhone, String trailerLicensePlate,
			String supercargoNo, String supercargoIdNo, String licensePlateNo,
			String note, String founder, Date foundationDate, String modifier,
			Date modifyDate, String logicallyDeleted) {
		this.driverId = driverId;
		this.supercargoId = supercargoId;
		this.chemicalEenterpriseId = chemicalEenterpriseId;
		this.lgtEnterprisesId = lgtEnterprisesId;
		this.carId = carId;
		this.shippingNoteNo = shippingNoteNo;
		this.customerNoteNo = customerNoteNo;
		this.startingPoint = startingPoint;
		this.destination = destination;
		this.dliverySection = dliverySection;
		this.dliverySectionPerson = dliverySectionPerson;
		this.waybillStatus = waybillStatus;
		this.dliveryAddress = dliveryAddress;
		this.dliveryTime = dliveryTime;
		this.receivingSection = receivingSection;
		this.receivingSectionPerson = receivingSectionPerson;
		this.receivingSectionTelephone = receivingSectionTelephone;
		this.dliverySectionTelephone = dliverySectionTelephone;
		this.receivingAddress = receivingAddress;
		this.unloadTime = unloadTime;
		this.driver = driver;
		this.driverPhone = driverPhone;
		this.driverIdNo = driverIdNo;
		this.driverEmploymentNo = driverEmploymentNo;
		this.supercargo = supercargo;
		this.supercargoPhone = supercargoPhone;
		this.trailerLicensePlate = trailerLicensePlate;
		this.supercargoNo = supercargoNo;
		this.supercargoIdNo = supercargoIdNo;
		this.licensePlateNo = licensePlateNo;
		this.note = note;
		this.founder = founder;
		this.foundationDate = foundationDate;
		this.modifier = modifier;
		this.modifyDate = modifyDate;
		this.logicallyDeleted = logicallyDeleted;
	}

	// Property accessors

	public String getLid() {
		return this.lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getDriverId() {
		return this.driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getSupercargoId() {
		return this.supercargoId;
	}

	public void setSupercargoId(String supercargoId) {
		this.supercargoId = supercargoId;
	}

	public String getChemicalEenterpriseId() {
		return this.chemicalEenterpriseId;
	}

	public void setChemicalEenterpriseId(String chemicalEenterpriseId) {
		this.chemicalEenterpriseId = chemicalEenterpriseId;
	}

	public String getLgtEnterprisesId() {
		return this.lgtEnterprisesId;
	}

	public void setLgtEnterprisesId(String lgtEnterprisesId) {
		this.lgtEnterprisesId = lgtEnterprisesId;
	}

	public String getCarId() {
		return this.carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getShippingNoteNo() {
		return this.shippingNoteNo;
	}

	public void setShippingNoteNo(String shippingNoteNo) {
		this.shippingNoteNo = shippingNoteNo;
	}

	public String getCustomerNoteNo() {
		return this.customerNoteNo;
	}

	public void setCustomerNoteNo(String customerNoteNo) {
		this.customerNoteNo = customerNoteNo;
	}

	public String getStartingPoint() {
		return this.startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDliverySection() {
		return this.dliverySection;
	}

	public void setDliverySection(String dliverySection) {
		this.dliverySection = dliverySection;
	}

	public String getDliverySectionPerson() {
		return this.dliverySectionPerson;
	}

	public void setDliverySectionPerson(String dliverySectionPerson) {
		this.dliverySectionPerson = dliverySectionPerson;
	}

	public String getWaybillStatus() {
		return this.waybillStatus;
	}

	public void setWaybillStatus(String waybillStatus) {
		this.waybillStatus = waybillStatus;
	}

	public String getDliveryAddress() {
		return this.dliveryAddress;
	}

	public void setDliveryAddress(String dliveryAddress) {
		this.dliveryAddress = dliveryAddress;
	}

	public Date getDliveryTime() {
		return this.dliveryTime;
	}

	public void setDliveryTime(Date dliveryTime) {
		this.dliveryTime = dliveryTime;
	}

	public String getReceivingSection() {
		return this.receivingSection;
	}

	public void setReceivingSection(String receivingSection) {
		this.receivingSection = receivingSection;
	}

	public String getReceivingSectionPerson() {
		return this.receivingSectionPerson;
	}

	public void setReceivingSectionPerson(String receivingSectionPerson) {
		this.receivingSectionPerson = receivingSectionPerson;
	}

	public String getReceivingSectionTelephone() {
		return this.receivingSectionTelephone;
	}

	public void setReceivingSectionTelephone(String receivingSectionTelephone) {
		this.receivingSectionTelephone = receivingSectionTelephone;
	}

	public String getDliverySectionTelephone() {
		return this.dliverySectionTelephone;
	}

	public void setDliverySectionTelephone(String dliverySectionTelephone) {
		this.dliverySectionTelephone = dliverySectionTelephone;
	}

	public String getReceivingAddress() {
		return this.receivingAddress;
	}

	public void setReceivingAddress(String receivingAddress) {
		this.receivingAddress = receivingAddress;
	}

	public Date getUnloadTime() {
		return this.unloadTime;
	}

	public void setUnloadTime(Date unloadTime) {
		this.unloadTime = unloadTime;
	}

	public String getDriver() {
		return this.driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getDriverPhone() {
		return this.driverPhone;
	}

	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}

	public String getDriverIdNo() {
		return this.driverIdNo;
	}

	public void setDriverIdNo(String driverIdNo) {
		this.driverIdNo = driverIdNo;
	}

	public String getDriverEmploymentNo() {
		return this.driverEmploymentNo;
	}

	public void setDriverEmploymentNo(String driverEmploymentNo) {
		this.driverEmploymentNo = driverEmploymentNo;
	}

	public String getSupercargo() {
		return this.supercargo;
	}

	public void setSupercargo(String supercargo) {
		this.supercargo = supercargo;
	}

	public String getSupercargoPhone() {
		return this.supercargoPhone;
	}

	public void setSupercargoPhone(String supercargoPhone) {
		this.supercargoPhone = supercargoPhone;
	}

	public String getTrailerLicensePlate() {
		return this.trailerLicensePlate;
	}

	public void setTrailerLicensePlate(String trailerLicensePlate) {
		this.trailerLicensePlate = trailerLicensePlate;
	}

	public String getSupercargoNo() {
		return this.supercargoNo;
	}

	public void setSupercargoNo(String supercargoNo) {
		this.supercargoNo = supercargoNo;
	}

	public String getSupercargoIdNo() {
		return this.supercargoIdNo;
	}

	public void setSupercargoIdNo(String supercargoIdNo) {
		this.supercargoIdNo = supercargoIdNo;
	}

	public String getLicensePlateNo() {
		return this.licensePlateNo;
	}

	public void setLicensePlateNo(String licensePlateNo) {
		this.licensePlateNo = licensePlateNo;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
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

}