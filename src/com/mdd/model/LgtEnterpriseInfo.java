package com.mdd.model;

import java.util.Date;

/**
 * LgtEnterpriseInfo entity. @author MyEclipse Persistence Tools
 */

public class LgtEnterpriseInfo implements java.io.Serializable {

	// Fields

	private String lid;
	private String legalPersonCode;
	private String enterpriseName;
	private String enterpriseType;
	private String legalRepresentative;
	private String enterpriseIntroduce;
	private String registeredCapital;
	private double registrationAuthority;
	private String mainRoute;
	private Date foundingTime;
	private String bank;
	private String commercialRegistrationNo;
	private String mainBusiness;
	private String taxNo;
	private String businessArea;
	private String businessAddress;
	private String url;
	private String carNumber;
	private double telephoneNo;
	private String founder;
	private Date foundationDate;
	private String modifier;
	private Date modifyDate;
	private String logicallyDeleted;
	private String attachmentId;

	// Constructors

	/** default constructor */
	public LgtEnterpriseInfo() {
		lid = "";
		legalPersonCode = "";
		enterpriseName = "";
		enterpriseType = "";
		legalRepresentative = "";
		enterpriseIntroduce = "";
		registeredCapital = "";
		registrationAuthority = 0.0;
		mainRoute = "";
		foundingTime = new Date();
		bank = "";
		commercialRegistrationNo = "";
		mainBusiness = "";
		taxNo = "";
		businessArea = "";
		businessAddress = "";
		url = "";
		carNumber = "";
		telephoneNo = 0.0;
		founder = "";
		foundationDate = new Date();
		modifier = "";
		modifyDate = new Date();
		logicallyDeleted = "";
		attachmentId = "";
	}

	/** full constructor */
	public LgtEnterpriseInfo(String legalPersonCode, String enterpriseName,
			String enterpriseType, String legalRepresentative,
			String enterpriseIntroduce, String registeredCapital,
			double registrationAuthority, String mainRoute, Date foundingTime,
			String bank, String commercialRegistrationNo, String mainBusiness,
			String taxNo, String businessArea, String businessAddress,
			String url, String carNumber, double telephoneNo, String founder,
			Date foundationDate, String modifier, Date modifyDate,
			String logicallyDeleted, String attachmentId) {
		this.legalPersonCode = legalPersonCode;
		this.enterpriseName = enterpriseName;
		this.enterpriseType = enterpriseType;
		this.legalRepresentative = legalRepresentative;
		this.enterpriseIntroduce = enterpriseIntroduce;
		this.registeredCapital = registeredCapital;
		this.registrationAuthority = registrationAuthority;
		this.mainRoute = mainRoute;
		this.foundingTime = foundingTime;
		this.bank = bank;
		this.commercialRegistrationNo = commercialRegistrationNo;
		this.mainBusiness = mainBusiness;
		this.taxNo = taxNo;
		this.businessArea = businessArea;
		this.businessAddress = businessAddress;
		this.url = url;
		this.carNumber = carNumber;
		this.telephoneNo = telephoneNo;
		this.founder = founder;
		this.foundationDate = foundationDate;
		this.modifier = modifier;
		this.modifyDate = modifyDate;
		this.logicallyDeleted = logicallyDeleted;
		this.attachmentId = attachmentId;
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

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getEnterpriseType() {
		return this.enterpriseType;
	}

	public void setEnterpriseType(String enterpriseType) {
		this.enterpriseType = enterpriseType;
	}

	public String getLegalRepresentative() {
		return this.legalRepresentative;
	}

	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public String getEnterpriseIntroduce() {
		return this.enterpriseIntroduce;
	}

	public void setEnterpriseIntroduce(String enterpriseIntroduce) {
		this.enterpriseIntroduce = enterpriseIntroduce;
	}

	public String getRegisteredCapital() {
		return this.registeredCapital;
	}

	public void setRegisteredCapital(String registeredCapital) {
		this.registeredCapital = registeredCapital;
	}

	public double getRegistrationAuthority() {
		return this.registrationAuthority;
	}

	public void setRegistrationAuthority(double registrationAuthority) {
		this.registrationAuthority = registrationAuthority;
	}

	public String getMainRoute() {
		return this.mainRoute;
	}

	public void setMainRoute(String mainRoute) {
		this.mainRoute = mainRoute;
	}

	public Date getFoundingTime() {
		return this.foundingTime;
	}

	public void setFoundingTime(Date foundingTime) {
		this.foundingTime = foundingTime;
	}

	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getCommercialRegistrationNo() {
		return this.commercialRegistrationNo;
	}

	public void setCommercialRegistrationNo(String commercialRegistrationNo) {
		this.commercialRegistrationNo = commercialRegistrationNo;
	}

	public String getMainBusiness() {
		return this.mainBusiness;
	}

	public void setMainBusiness(String mainBusiness) {
		this.mainBusiness = mainBusiness;
	}

	public String getTaxNo() {
		return this.taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getBusinessArea() {
		return this.businessArea;
	}

	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}

	public String getBusinessAddress() {
		return this.businessAddress;
	}

	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCarNumber() {
		return this.carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public double getTelephoneNo() {
		return this.telephoneNo;
	}

	public void setTelephoneNo(double telephoneNo) {
		this.telephoneNo = telephoneNo;
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

	public String getAttachmentId() {
		return this.attachmentId;
	}

	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
	}

}