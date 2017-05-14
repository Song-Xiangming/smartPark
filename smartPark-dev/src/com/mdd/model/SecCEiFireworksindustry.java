package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * SecCEiFireworksindustry entity. @author MyEclipse Persistence Tools
 */

public class SecCEiFireworksindustry implements java.io.Serializable {

	// Fields

	private String fireId;
	private String enterpriseId;
	private String storageAddr;
	private String storageMode;
	private String warehouserLevel;
	private String productCategory;
	private String productLevels;
	private String productionMode;
	private String retailSpacesCategory;
	private BigDecimal technicalPersionnelNumber;
	private BigDecimal warehouserGuardPerson;
	private BigDecimal productionRiskPerson;
	private BigDecimal transportVehiclesQuantity;
	private String consumerCategory;
	private String storageCapacity;
	private String rawMaterial;
	private String enterDeptId;
	private String isActive;
	private String creator;
	private Date createTime;
	private String updator;
	private Date updateTime;

	// Constructors

	/** default constructor */
	public SecCEiFireworksindustry() {
		fireId = "";
		enterpriseId = "";
		storageAddr = "";
		storageMode = "";
		warehouserLevel = "";
		productCategory = "";
		productLevels = "";
		productionMode = "";
		retailSpacesCategory = "";
		technicalPersionnelNumber = new BigDecimal(0);
		warehouserGuardPerson = new BigDecimal(0);
		productionRiskPerson = new BigDecimal(0);
		transportVehiclesQuantity = new BigDecimal(0);
		consumerCategory = "";
		storageCapacity = "";
		rawMaterial = "";
		enterDeptId = "";
		isActive = "";
		creator = "";
		createTime = new Date();
		updator = "";
		updateTime = new Date();
	}

	/** full constructor */
	public SecCEiFireworksindustry(String enterpriseId, String storageAddr,
			String storageMode, String warehouserLevel, String productCategory,
			String productLevels, String productionMode,
			String retailSpacesCategory, BigDecimal technicalPersionnelNumber,
			BigDecimal warehouserGuardPerson, BigDecimal productionRiskPerson,
			BigDecimal transportVehiclesQuantity, String consumerCategory,
			String storageCapacity, String rawMaterial, String enterDeptId,
			String isActive, String creator, Date createTime, String updator,
			Date updateTime) {
		this.enterpriseId = enterpriseId;
		this.storageAddr = storageAddr;
		this.storageMode = storageMode;
		this.warehouserLevel = warehouserLevel;
		this.productCategory = productCategory;
		this.productLevels = productLevels;
		this.productionMode = productionMode;
		this.retailSpacesCategory = retailSpacesCategory;
		this.technicalPersionnelNumber = technicalPersionnelNumber;
		this.warehouserGuardPerson = warehouserGuardPerson;
		this.productionRiskPerson = productionRiskPerson;
		this.transportVehiclesQuantity = transportVehiclesQuantity;
		this.consumerCategory = consumerCategory;
		this.storageCapacity = storageCapacity;
		this.rawMaterial = rawMaterial;
		this.enterDeptId = enterDeptId;
		this.isActive = isActive;
		this.creator = creator;
		this.createTime = createTime;
		this.updator = updator;
		this.updateTime = updateTime;
	}

	// Property accessors

	public String getFireId() {
		return this.fireId;
	}

	public void setFireId(String fireId) {
		this.fireId = fireId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getStorageAddr() {
		return this.storageAddr;
	}

	public void setStorageAddr(String storageAddr) {
		this.storageAddr = storageAddr;
	}

	public String getStorageMode() {
		return this.storageMode;
	}

	public void setStorageMode(String storageMode) {
		this.storageMode = storageMode;
	}

	public String getWarehouserLevel() {
		return this.warehouserLevel;
	}

	public void setWarehouserLevel(String warehouserLevel) {
		this.warehouserLevel = warehouserLevel;
	}

	public String getProductCategory() {
		return this.productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductLevels() {
		return this.productLevels;
	}

	public void setProductLevels(String productLevels) {
		this.productLevels = productLevels;
	}

	public String getProductionMode() {
		return this.productionMode;
	}

	public void setProductionMode(String productionMode) {
		this.productionMode = productionMode;
	}

	public String getRetailSpacesCategory() {
		return this.retailSpacesCategory;
	}

	public void setRetailSpacesCategory(String retailSpacesCategory) {
		this.retailSpacesCategory = retailSpacesCategory;
	}

	public BigDecimal getTechnicalPersionnelNumber() {
		return this.technicalPersionnelNumber;
	}

	public void setTechnicalPersionnelNumber(
			BigDecimal technicalPersionnelNumber) {
		this.technicalPersionnelNumber = technicalPersionnelNumber;
	}

	public BigDecimal getWarehouserGuardPerson() {
		return this.warehouserGuardPerson;
	}

	public void setWarehouserGuardPerson(BigDecimal warehouserGuardPerson) {
		this.warehouserGuardPerson = warehouserGuardPerson;
	}

	public BigDecimal getProductionRiskPerson() {
		return this.productionRiskPerson;
	}

	public void setProductionRiskPerson(BigDecimal productionRiskPerson) {
		this.productionRiskPerson = productionRiskPerson;
	}

	public BigDecimal getTransportVehiclesQuantity() {
		return this.transportVehiclesQuantity;
	}

	public void setTransportVehiclesQuantity(
			BigDecimal transportVehiclesQuantity) {
		this.transportVehiclesQuantity = transportVehiclesQuantity;
	}

	public String getConsumerCategory() {
		return this.consumerCategory;
	}

	public void setConsumerCategory(String consumerCategory) {
		this.consumerCategory = consumerCategory;
	}

	public String getStorageCapacity() {
		return this.storageCapacity;
	}

	public void setStorageCapacity(String storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public String getRawMaterial() {
		return this.rawMaterial;
	}

	public void setRawMaterial(String rawMaterial) {
		this.rawMaterial = rawMaterial;
	}

	public String getEnterDeptId() {
		return this.enterDeptId;
	}

	public void setEnterDeptId(String enterDeptId) {
		this.enterDeptId = enterDeptId;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdator() {
		return this.updator;
	}

	public void setUpdator(String updator) {
		this.updator = updator;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}