package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * SecCEiDangsrc entity. @author MyEclipse Persistence Tools
 */

public class SecCEiDangsrc implements java.io.Serializable {

	// Fields

	private String dangsrcId;
	private String enterpriseId;
	private String dangsrcLevel;
	private String districtId;
	private String dangcellName;
	private String activeType;
	private BigDecimal presVesselNum;
	private String storagePacilityProperty;
	private BigDecimal presVessel3thNum;
	private double RValue;
	private String address;
	private String material;
	private Date lightdevLastChkDate;
	private Date lightdevValidate;
	private Date startArchiveDate;
	private Date endArchiveDate;
	private double longitude;
	private double latitude;
	private String remark;
	private String enterDeptId;
	private String isActive;
	private String creator;
	private Date createTime;
	private String updator;
	private Date updateTime;

	// Constructors

	/** default constructor */
	public SecCEiDangsrc() {
		dangsrcId = "";
		enterpriseId = "";
		dangsrcLevel = "";
		districtId = "";
		dangcellName = "";
		activeType = "";
		presVesselNum = new BigDecimal(0);
		storagePacilityProperty = "";
		presVessel3thNum = new BigDecimal(0);
		RValue = 0.0;
		address = "";
		material = "";
		lightdevLastChkDate = new Date();
		lightdevValidate = new Date();
		startArchiveDate = new Date();
		endArchiveDate = new Date();
		longitude = 0.0;
		latitude = 0.0;
		remark = "";
		enterDeptId = "";
		isActive = "";
		creator = "";
		createTime = new Date();
		updator = "";
		updateTime = new Date();
	}

	/** full constructor */
	public SecCEiDangsrc(String enterpriseId, String dangsrcLevel,
			String districtId, String dangcellName, String activeType,
			BigDecimal presVesselNum, String storagePacilityProperty,
			BigDecimal presVessel3thNum, double RValue, String address,
			String material, Date lightdevLastChkDate, Date lightdevValidate,
			Date startArchiveDate, Date endArchiveDate, double longitude,
			double latitude, String remark, String enterDeptId,
			String isActive, String creator, Date createTime, String updator,
			Date updateTime) {
		this.enterpriseId = enterpriseId;
		this.dangsrcLevel = dangsrcLevel;
		this.districtId = districtId;
		this.dangcellName = dangcellName;
		this.activeType = activeType;
		this.presVesselNum = presVesselNum;
		this.storagePacilityProperty = storagePacilityProperty;
		this.presVessel3thNum = presVessel3thNum;
		this.RValue = RValue;
		this.address = address;
		this.material = material;
		this.lightdevLastChkDate = lightdevLastChkDate;
		this.lightdevValidate = lightdevValidate;
		this.startArchiveDate = startArchiveDate;
		this.endArchiveDate = endArchiveDate;
		this.longitude = longitude;
		this.latitude = latitude;
		this.remark = remark;
		this.enterDeptId = enterDeptId;
		this.isActive = isActive;
		this.creator = creator;
		this.createTime = createTime;
		this.updator = updator;
		this.updateTime = updateTime;
	}

	// Property accessors

	public String getDangsrcId() {
		return this.dangsrcId;
	}

	public void setDangsrcId(String dangsrcId) {
		this.dangsrcId = dangsrcId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getDangsrcLevel() {
		return this.dangsrcLevel;
	}

	public void setDangsrcLevel(String dangsrcLevel) {
		this.dangsrcLevel = dangsrcLevel;
	}

	public String getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getDangcellName() {
		return this.dangcellName;
	}

	public void setDangcellName(String dangcellName) {
		this.dangcellName = dangcellName;
	}

	public String getActiveType() {
		return this.activeType;
	}

	public void setActiveType(String activeType) {
		this.activeType = activeType;
	}

	public BigDecimal getPresVesselNum() {
		return this.presVesselNum;
	}

	public void setPresVesselNum(BigDecimal presVesselNum) {
		this.presVesselNum = presVesselNum;
	}

	public String getStoragePacilityProperty() {
		return this.storagePacilityProperty;
	}

	public void setStoragePacilityProperty(String storagePacilityProperty) {
		this.storagePacilityProperty = storagePacilityProperty;
	}

	public BigDecimal getPresVessel3thNum() {
		return this.presVessel3thNum;
	}

	public void setPresVessel3thNum(BigDecimal presVessel3thNum) {
		this.presVessel3thNum = presVessel3thNum;
	}

	public double getRValue() {
		return this.RValue;
	}

	public void setRValue(double RValue) {
		this.RValue = RValue;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Date getLightdevLastChkDate() {
		return this.lightdevLastChkDate;
	}

	public void setLightdevLastChkDate(Date lightdevLastChkDate) {
		this.lightdevLastChkDate = lightdevLastChkDate;
	}

	public Date getLightdevValidate() {
		return this.lightdevValidate;
	}

	public void setLightdevValidate(Date lightdevValidate) {
		this.lightdevValidate = lightdevValidate;
	}

	public Date getStartArchiveDate() {
		return this.startArchiveDate;
	}

	public void setStartArchiveDate(Date startArchiveDate) {
		this.startArchiveDate = startArchiveDate;
	}

	public Date getEndArchiveDate() {
		return this.endArchiveDate;
	}

	public void setEndArchiveDate(Date endArchiveDate) {
		this.endArchiveDate = endArchiveDate;
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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