package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * SecCEiDangerindustry entity. @author MyEclipse Persistence Tools
 */

public class SecCEiDangerindustry implements java.io.Serializable {

	// Fields

	private String dangerId;
	private String enterpriseId;
	private String storageAddr;
	private String storageMode;
	private String productionMode;
	private String rawMaterial;
	private String chemicalCategory;
	private BigDecimal dangerChemicalPersionNum;
	private BigDecimal warehouserNum;
	private double warehouserArea;
	private double storageTotalVolume;
	private String storageCapacity;
	private BigDecimal tankNum;
	private String storageFacilityProperty;
	private String businessPractice;
	private String featureAndOutput;
	private String danageArts;
	private String isRegulatoryObject;
	private String isMajorHazard;
	private String isIndustrialPark;
	private String isDangerProcess;
	private String isAutoControlSystem;
	private String isReform;
	private String enterDeptId;
	private String isActive;
	private String creator;
	private Date createTime;
	private String updator;
	private Date updateTime;

	// Constructors

	/** default constructor */
	public SecCEiDangerindustry() {
		dangerId = "";
		enterpriseId = "";
		storageAddr = "";
		storageMode = "";
		productionMode = "";
		rawMaterial = "";
		chemicalCategory = "";
		dangerChemicalPersionNum = new BigDecimal(0);
		warehouserNum = new BigDecimal(0);
		warehouserArea = 0.0;
		storageTotalVolume = 0.0;
		storageCapacity = "";
		tankNum = new BigDecimal(0);
		storageFacilityProperty = "";
		businessPractice = "";
		featureAndOutput = "";
		danageArts = "";
		isRegulatoryObject = "";
		isMajorHazard = "";
		isIndustrialPark = "";
		isDangerProcess = "";
		isAutoControlSystem = "";
		isReform = "";
		enterDeptId = "";
		isActive = "";
		creator = "";
		createTime = new Date();
		updator = "";
		updateTime = new Date();
	}

	/** full constructor */
	public SecCEiDangerindustry(String enterpriseId, String storageAddr,
			String storageMode, String productionMode, String rawMaterial,
			String chemicalCategory, BigDecimal dangerChemicalPersionNum,
			BigDecimal warehouserNum, double warehouserArea,
			double storageTotalVolume, String storageCapacity,
			BigDecimal tankNum, String storageFacilityProperty,
			String businessPractice, String featureAndOutput,
			String danageArts, String isRegulatoryObject, String isMajorHazard,
			String isIndustrialPark, String isDangerProcess,
			String isAutoControlSystem, String isReform, String enterDeptId,
			String isActive, String creator, Date createTime, String updator,
			Date updateTime) {
		this.enterpriseId = enterpriseId;
		this.storageAddr = storageAddr;
		this.storageMode = storageMode;
		this.productionMode = productionMode;
		this.rawMaterial = rawMaterial;
		this.chemicalCategory = chemicalCategory;
		this.dangerChemicalPersionNum = dangerChemicalPersionNum;
		this.warehouserNum = warehouserNum;
		this.warehouserArea = warehouserArea;
		this.storageTotalVolume = storageTotalVolume;
		this.storageCapacity = storageCapacity;
		this.tankNum = tankNum;
		this.storageFacilityProperty = storageFacilityProperty;
		this.businessPractice = businessPractice;
		this.featureAndOutput = featureAndOutput;
		this.danageArts = danageArts;
		this.isRegulatoryObject = isRegulatoryObject;
		this.isMajorHazard = isMajorHazard;
		this.isIndustrialPark = isIndustrialPark;
		this.isDangerProcess = isDangerProcess;
		this.isAutoControlSystem = isAutoControlSystem;
		this.isReform = isReform;
		this.enterDeptId = enterDeptId;
		this.isActive = isActive;
		this.creator = creator;
		this.createTime = createTime;
		this.updator = updator;
		this.updateTime = updateTime;
	}

	// Property accessors

	public String getDangerId() {
		return this.dangerId;
	}

	public void setDangerId(String dangerId) {
		this.dangerId = dangerId;
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

	public String getProductionMode() {
		return this.productionMode;
	}

	public void setProductionMode(String productionMode) {
		this.productionMode = productionMode;
	}

	public String getRawMaterial() {
		return this.rawMaterial;
	}

	public void setRawMaterial(String rawMaterial) {
		this.rawMaterial = rawMaterial;
	}

	public String getChemicalCategory() {
		return this.chemicalCategory;
	}

	public void setChemicalCategory(String chemicalCategory) {
		this.chemicalCategory = chemicalCategory;
	}

	public BigDecimal getDangerChemicalPersionNum() {
		return this.dangerChemicalPersionNum;
	}

	public void setDangerChemicalPersionNum(BigDecimal dangerChemicalPersionNum) {
		this.dangerChemicalPersionNum = dangerChemicalPersionNum;
	}

	public BigDecimal getWarehouserNum() {
		return this.warehouserNum;
	}

	public void setWarehouserNum(BigDecimal warehouserNum) {
		this.warehouserNum = warehouserNum;
	}

	public double getWarehouserArea() {
		return this.warehouserArea;
	}

	public void setWarehouserArea(double warehouserArea) {
		this.warehouserArea = warehouserArea;
	}

	public double getStorageTotalVolume() {
		return this.storageTotalVolume;
	}

	public void setStorageTotalVolume(double storageTotalVolume) {
		this.storageTotalVolume = storageTotalVolume;
	}

	public String getStorageCapacity() {
		return this.storageCapacity;
	}

	public void setStorageCapacity(String storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public BigDecimal getTankNum() {
		return this.tankNum;
	}

	public void setTankNum(BigDecimal tankNum) {
		this.tankNum = tankNum;
	}

	public String getStorageFacilityProperty() {
		return this.storageFacilityProperty;
	}

	public void setStorageFacilityProperty(String storageFacilityProperty) {
		this.storageFacilityProperty = storageFacilityProperty;
	}

	public String getBusinessPractice() {
		return this.businessPractice;
	}

	public void setBusinessPractice(String businessPractice) {
		this.businessPractice = businessPractice;
	}

	public String getFeatureAndOutput() {
		return this.featureAndOutput;
	}

	public void setFeatureAndOutput(String featureAndOutput) {
		this.featureAndOutput = featureAndOutput;
	}

	public String getDanageArts() {
		return this.danageArts;
	}

	public void setDanageArts(String danageArts) {
		this.danageArts = danageArts;
	}

	public String getIsRegulatoryObject() {
		return this.isRegulatoryObject;
	}

	public void setIsRegulatoryObject(String isRegulatoryObject) {
		this.isRegulatoryObject = isRegulatoryObject;
	}

	public String getIsMajorHazard() {
		return this.isMajorHazard;
	}

	public void setIsMajorHazard(String isMajorHazard) {
		this.isMajorHazard = isMajorHazard;
	}

	public String getIsIndustrialPark() {
		return this.isIndustrialPark;
	}

	public void setIsIndustrialPark(String isIndustrialPark) {
		this.isIndustrialPark = isIndustrialPark;
	}

	public String getIsDangerProcess() {
		return this.isDangerProcess;
	}

	public void setIsDangerProcess(String isDangerProcess) {
		this.isDangerProcess = isDangerProcess;
	}

	public String getIsAutoControlSystem() {
		return this.isAutoControlSystem;
	}

	public void setIsAutoControlSystem(String isAutoControlSystem) {
		this.isAutoControlSystem = isAutoControlSystem;
	}

	public String getIsReform() {
		return this.isReform;
	}

	public void setIsReform(String isReform) {
		this.isReform = isReform;
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