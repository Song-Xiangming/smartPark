package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * LgtEnterprise entity. @author MyEclipse Persistence Tools
 */

public class LgtEnterprise implements java.io.Serializable {

	// Fields

	private String id;
	private String corporateNo;
	private String enterpriseName;
	private String enterpriseType;
	private String corporateRep;
	private String enterpriseIntroduce;
	private String registerOffice;
	private double logonCapital;
	private String majorBusinessRoute;
	private Date establishDate;
	private String openAccountBank;
	private String registrationNo;
	private String professionalWork;
	private String taxationNo;
	private String operateArea;
	private String address;
	private String networkAddr;
	private BigDecimal vehicleNum;
	private String telephone;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;
	private String fileId;
	private String crossDomainType;

	// Constructors

	/** default constructor */
	public LgtEnterprise() {
		id = "";
		corporateNo = "";
		enterpriseName = "";
		enterpriseType = "";
		corporateRep = "";
		enterpriseIntroduce = "";
		registerOffice = "";
		logonCapital = 0.0;
		majorBusinessRoute = "";
		establishDate = new Date();
		openAccountBank = "";
		registrationNo = "";
		professionalWork = "";
		taxationNo = "";
		operateArea = "";
		address = "";
		networkAddr = "";
		vehicleNum = new BigDecimal(0);
		telephone = "";
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
		fileId = "";
		crossDomainType = "";
	}

	/** full constructor */
	public LgtEnterprise(String corporateNo, String enterpriseName,
			String enterpriseType, String corporateRep,
			String enterpriseIntroduce, String registerOffice,
			double logonCapital, String majorBusinessRoute, Date establishDate,
			String openAccountBank, String registrationNo,
			String professionalWork, String taxationNo, String operateArea,
			String address, String networkAddr, BigDecimal vehicleNum,
			String telephone, String createBy, Date createTime,
			String updateBy, Date updateTime, String remove, String fileId,
			String crossDomainType) {
		this.corporateNo = corporateNo;
		this.enterpriseName = enterpriseName;
		this.enterpriseType = enterpriseType;
		this.corporateRep = corporateRep;
		this.enterpriseIntroduce = enterpriseIntroduce;
		this.registerOffice = registerOffice;
		this.logonCapital = logonCapital;
		this.majorBusinessRoute = majorBusinessRoute;
		this.establishDate = establishDate;
		this.openAccountBank = openAccountBank;
		this.registrationNo = registrationNo;
		this.professionalWork = professionalWork;
		this.taxationNo = taxationNo;
		this.operateArea = operateArea;
		this.address = address;
		this.networkAddr = networkAddr;
		this.vehicleNum = vehicleNum;
		this.telephone = telephone;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.remove = remove;
		this.fileId = fileId;
		this.crossDomainType = crossDomainType;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCorporateNo() {
		return this.corporateNo;
	}

	public void setCorporateNo(String corporateNo) {
		this.corporateNo = corporateNo;
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

	public String getCorporateRep() {
		return this.corporateRep;
	}

	public void setCorporateRep(String corporateRep) {
		this.corporateRep = corporateRep;
	}

	public String getEnterpriseIntroduce() {
		return this.enterpriseIntroduce;
	}

	public void setEnterpriseIntroduce(String enterpriseIntroduce) {
		this.enterpriseIntroduce = enterpriseIntroduce;
	}

	public String getRegisterOffice() {
		return this.registerOffice;
	}

	public void setRegisterOffice(String registerOffice) {
		this.registerOffice = registerOffice;
	}

	public double getLogonCapital() {
		return this.logonCapital;
	}

	public void setLogonCapital(double logonCapital) {
		this.logonCapital = logonCapital;
	}

	public String getMajorBusinessRoute() {
		return this.majorBusinessRoute;
	}

	public void setMajorBusinessRoute(String majorBusinessRoute) {
		this.majorBusinessRoute = majorBusinessRoute;
	}

	public Date getEstablishDate() {
		return this.establishDate;
	}

	public void setEstablishDate(Date establishDate) {
		this.establishDate = establishDate;
	}

	public String getOpenAccountBank() {
		return this.openAccountBank;
	}

	public void setOpenAccountBank(String openAccountBank) {
		this.openAccountBank = openAccountBank;
	}

	public String getRegistrationNo() {
		return this.registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getProfessionalWork() {
		return this.professionalWork;
	}

	public void setProfessionalWork(String professionalWork) {
		this.professionalWork = professionalWork;
	}

	public String getTaxationNo() {
		return this.taxationNo;
	}

	public void setTaxationNo(String taxationNo) {
		this.taxationNo = taxationNo;
	}

	public String getOperateArea() {
		return this.operateArea;
	}

	public void setOperateArea(String operateArea) {
		this.operateArea = operateArea;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNetworkAddr() {
		return this.networkAddr;
	}

	public void setNetworkAddr(String networkAddr) {
		this.networkAddr = networkAddr;
	}

	public BigDecimal getVehicleNum() {
		return this.vehicleNum;
	}

	public void setVehicleNum(BigDecimal vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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

	public String getFileId() {
		return this.fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getCrossDomainType() {
		return this.crossDomainType;
	}

	public void setCrossDomainType(String crossDomainType) {
		this.crossDomainType = crossDomainType;
	}

}