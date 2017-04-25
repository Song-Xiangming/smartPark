package com.mdd.model;

import java.util.Date;

/**
 * LgtGoodsManageInfo entity. @author MyEclipse Persistence Tools
 */

public class LgtGoodsManageInfo implements java.io.Serializable {

	// Fields

	private String lid;
	private String invoiceNo;
	private Date deadline;
	private String deliveryAddress;
	private String dliverySection;
	private String dliverySectionTelephone;
	private String receivingAddress;
	private String receivingSection;
	private String receivingSectionTelephone;
	private String founder;
	private Date foundationDate;
	private String modifier;
	private Date modifyDate;
	private String logicallyDeleted;
	private String transactionStatus;
	private String chemicalLegalPersonCode;
	private String lgtLegalPersonCode;
	private Date releaseDate;
	private String orderNo;
	private Date orderCreationDate;
	private String startingPoint;
	private String endingPoint;
	private String deliveryPerson;
	private String receivingPerson;

	// Constructors

	/** default constructor */
	public LgtGoodsManageInfo() {
		lid = "";
		invoiceNo = "";
		deadline = new Date();
		deliveryAddress = "";
		dliverySection = "";
		dliverySectionTelephone = "";
		receivingAddress = "";
		receivingSection = "";
		receivingSectionTelephone = "";
		founder = "";
		foundationDate = new Date();
		modifier = "";
		modifyDate = new Date();
		logicallyDeleted = "";
		transactionStatus = "";
		chemicalLegalPersonCode = "";
		lgtLegalPersonCode = "";
		releaseDate = new Date();
		orderNo = "";
		orderCreationDate = new Date();
		startingPoint = "";
		endingPoint = "";
		deliveryPerson = "";
		receivingPerson = "";
	}

	/** full constructor */
	public LgtGoodsManageInfo(String invoiceNo, Date deadline,
			String deliveryAddress, String dliverySection,
			String dliverySectionTelephone, String receivingAddress,
			String receivingSection, String receivingSectionTelephone,
			String founder, Date foundationDate, String modifier,
			Date modifyDate, String logicallyDeleted, String transactionStatus,
			String chemicalLegalPersonCode, String lgtLegalPersonCode,
			Date releaseDate, String orderNo, Date orderCreationDate,
			String startingPoint, String endingPoint, String deliveryPerson,
			String receivingPerson) {
		this.invoiceNo = invoiceNo;
		this.deadline = deadline;
		this.deliveryAddress = deliveryAddress;
		this.dliverySection = dliverySection;
		this.dliverySectionTelephone = dliverySectionTelephone;
		this.receivingAddress = receivingAddress;
		this.receivingSection = receivingSection;
		this.receivingSectionTelephone = receivingSectionTelephone;
		this.founder = founder;
		this.foundationDate = foundationDate;
		this.modifier = modifier;
		this.modifyDate = modifyDate;
		this.logicallyDeleted = logicallyDeleted;
		this.transactionStatus = transactionStatus;
		this.chemicalLegalPersonCode = chemicalLegalPersonCode;
		this.lgtLegalPersonCode = lgtLegalPersonCode;
		this.releaseDate = releaseDate;
		this.orderNo = orderNo;
		this.orderCreationDate = orderCreationDate;
		this.startingPoint = startingPoint;
		this.endingPoint = endingPoint;
		this.deliveryPerson = deliveryPerson;
		this.receivingPerson = receivingPerson;
	}

	// Property accessors

	public String getLid() {
		return this.lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public Date getDeadline() {
		return this.deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public String getDeliveryAddress() {
		return this.deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getDliverySection() {
		return this.dliverySection;
	}

	public void setDliverySection(String dliverySection) {
		this.dliverySection = dliverySection;
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

	public String getReceivingSection() {
		return this.receivingSection;
	}

	public void setReceivingSection(String receivingSection) {
		this.receivingSection = receivingSection;
	}

	public String getReceivingSectionTelephone() {
		return this.receivingSectionTelephone;
	}

	public void setReceivingSectionTelephone(String receivingSectionTelephone) {
		this.receivingSectionTelephone = receivingSectionTelephone;
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

	public String getTransactionStatus() {
		return this.transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getChemicalLegalPersonCode() {
		return this.chemicalLegalPersonCode;
	}

	public void setChemicalLegalPersonCode(String chemicalLegalPersonCode) {
		this.chemicalLegalPersonCode = chemicalLegalPersonCode;
	}

	public String getLgtLegalPersonCode() {
		return this.lgtLegalPersonCode;
	}

	public void setLgtLegalPersonCode(String lgtLegalPersonCode) {
		this.lgtLegalPersonCode = lgtLegalPersonCode;
	}

	public Date getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Date getOrderCreationDate() {
		return this.orderCreationDate;
	}

	public void setOrderCreationDate(Date orderCreationDate) {
		this.orderCreationDate = orderCreationDate;
	}

	public String getStartingPoint() {
		return this.startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getEndingPoint() {
		return this.endingPoint;
	}

	public void setEndingPoint(String endingPoint) {
		this.endingPoint = endingPoint;
	}

	public String getDeliveryPerson() {
		return this.deliveryPerson;
	}

	public void setDeliveryPerson(String deliveryPerson) {
		this.deliveryPerson = deliveryPerson;
	}

	public String getReceivingPerson() {
		return this.receivingPerson;
	}

	public void setReceivingPerson(String receivingPerson) {
		this.receivingPerson = receivingPerson;
	}

}