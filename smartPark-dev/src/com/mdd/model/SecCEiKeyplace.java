package com.mdd.model;

import java.util.Date;

/**
 * SecCEiKeyplace entity. @author MyEclipse Persistence Tools
 */

public class SecCEiKeyplace implements java.io.Serializable {

	// Fields

	private String keyplaceId;
	private String enterpriseId;
	private String keyplaceName;
	private double keyplaceArea;
	private String keyplaceSite;
	private String safeEquip;
	private String declareInfo;
	private double longitude;
	private double latitude;
	private String accidentType;
	private double safeDist;
	private String affectRange;
	private String emerMeasure;
	private String attentionItem;
	private String isActive;
	private String creator;
	private Date createTime;
	private String updator;
	private Date updateTime;

	// Constructors

	/** default constructor */
	public SecCEiKeyplace() {
		keyplaceId = "";
		enterpriseId = "";
		keyplaceName = "";
		keyplaceArea = 0.0;
		keyplaceSite = "";
		safeEquip = "";
		declareInfo = "";
		longitude = 0.0;
		latitude = 0.0;
		accidentType = "";
		safeDist = 0.0;
		affectRange = "";
		emerMeasure = "";
		attentionItem = "";
		isActive = "";
		creator = "";
		createTime = new Date();
		updator = "";
		updateTime = new Date();
	}

	/** full constructor */
	public SecCEiKeyplace(String enterpriseId, String keyplaceName,
			double keyplaceArea, String keyplaceSite, String safeEquip,
			String declareInfo, double longitude, double latitude,
			String accidentType, double safeDist, String affectRange,
			String emerMeasure, String attentionItem, String isActive,
			String creator, Date createTime, String updator, Date updateTime) {
		this.enterpriseId = enterpriseId;
		this.keyplaceName = keyplaceName;
		this.keyplaceArea = keyplaceArea;
		this.keyplaceSite = keyplaceSite;
		this.safeEquip = safeEquip;
		this.declareInfo = declareInfo;
		this.longitude = longitude;
		this.latitude = latitude;
		this.accidentType = accidentType;
		this.safeDist = safeDist;
		this.affectRange = affectRange;
		this.emerMeasure = emerMeasure;
		this.attentionItem = attentionItem;
		this.isActive = isActive;
		this.creator = creator;
		this.createTime = createTime;
		this.updator = updator;
		this.updateTime = updateTime;
	}

	// Property accessors

	public String getKeyplaceId() {
		return this.keyplaceId;
	}

	public void setKeyplaceId(String keyplaceId) {
		this.keyplaceId = keyplaceId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getKeyplaceName() {
		return this.keyplaceName;
	}

	public void setKeyplaceName(String keyplaceName) {
		this.keyplaceName = keyplaceName;
	}

	public double getKeyplaceArea() {
		return this.keyplaceArea;
	}

	public void setKeyplaceArea(double keyplaceArea) {
		this.keyplaceArea = keyplaceArea;
	}

	public String getKeyplaceSite() {
		return this.keyplaceSite;
	}

	public void setKeyplaceSite(String keyplaceSite) {
		this.keyplaceSite = keyplaceSite;
	}

	public String getSafeEquip() {
		return this.safeEquip;
	}

	public void setSafeEquip(String safeEquip) {
		this.safeEquip = safeEquip;
	}

	public String getDeclareInfo() {
		return this.declareInfo;
	}

	public void setDeclareInfo(String declareInfo) {
		this.declareInfo = declareInfo;
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

	public String getAccidentType() {
		return this.accidentType;
	}

	public void setAccidentType(String accidentType) {
		this.accidentType = accidentType;
	}

	public double getSafeDist() {
		return this.safeDist;
	}

	public void setSafeDist(double safeDist) {
		this.safeDist = safeDist;
	}

	public String getAffectRange() {
		return this.affectRange;
	}

	public void setAffectRange(String affectRange) {
		this.affectRange = affectRange;
	}

	public String getEmerMeasure() {
		return this.emerMeasure;
	}

	public void setEmerMeasure(String emerMeasure) {
		this.emerMeasure = emerMeasure;
	}

	public String getAttentionItem() {
		return this.attentionItem;
	}

	public void setAttentionItem(String attentionItem) {
		this.attentionItem = attentionItem;
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