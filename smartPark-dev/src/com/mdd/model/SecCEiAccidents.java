package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * SecCEiAccidents entity. @author MyEclipse Persistence Tools
 */

public class SecCEiAccidents implements java.io.Serializable {

	// Fields

	private String acciId;
	private String enterpriseId;
	private String accGrade;
	private String accCategory;
	private Date accTime;
	private String accNature;
	private String accPlace;
	private BigDecimal injurieNum;
	private BigDecimal heavilyHurtNum;
	private BigDecimal deathToll;
	private double directEcoLoss;
	private String accDesc;
	private String accCause;
	private String measureTaken;
	private String responsibleOrg;
	private String respPerson;
	private String dealSituation;
	private String unitLegitimacy;
	private double longitude;
	private double latitude;
	private String outId;
	private String enterDeptId;
	private String isActive;
	private String creator;
	private Date createTime;
	private String updator;
	private Date updateTime;

	// Constructors

	/** default constructor */
	public SecCEiAccidents() {
		acciId = "";
		enterpriseId = "";
		accGrade = "";
		accCategory = "";
		accTime = new Date();
		accNature = "";
		accPlace = "";
		injurieNum = new BigDecimal(0);
		heavilyHurtNum = new BigDecimal(0);
		deathToll = new BigDecimal(0);
		directEcoLoss = 0.0;
		accDesc = "";
		accCause = "";
		measureTaken = "";
		responsibleOrg = "";
		respPerson = "";
		dealSituation = "";
		unitLegitimacy = "";
		longitude = 0.0;
		latitude = 0.0;
		outId = "";
		enterDeptId = "";
		isActive = "";
		creator = "";
		createTime = new Date();
		updator = "";
		updateTime = new Date();
	}

	/** full constructor */
	public SecCEiAccidents(String enterpriseId, String accGrade,
			String accCategory, Date accTime, String accNature,
			String accPlace, BigDecimal injurieNum, BigDecimal heavilyHurtNum,
			BigDecimal deathToll, double directEcoLoss, String accDesc,
			String accCause, String measureTaken, String responsibleOrg,
			String respPerson, String dealSituation, String unitLegitimacy,
			double longitude, double latitude, String outId,
			String enterDeptId, String isActive, String creator,
			Date createTime, String updator, Date updateTime) {
		this.enterpriseId = enterpriseId;
		this.accGrade = accGrade;
		this.accCategory = accCategory;
		this.accTime = accTime;
		this.accNature = accNature;
		this.accPlace = accPlace;
		this.injurieNum = injurieNum;
		this.heavilyHurtNum = heavilyHurtNum;
		this.deathToll = deathToll;
		this.directEcoLoss = directEcoLoss;
		this.accDesc = accDesc;
		this.accCause = accCause;
		this.measureTaken = measureTaken;
		this.responsibleOrg = responsibleOrg;
		this.respPerson = respPerson;
		this.dealSituation = dealSituation;
		this.unitLegitimacy = unitLegitimacy;
		this.longitude = longitude;
		this.latitude = latitude;
		this.outId = outId;
		this.enterDeptId = enterDeptId;
		this.isActive = isActive;
		this.creator = creator;
		this.createTime = createTime;
		this.updator = updator;
		this.updateTime = updateTime;
	}

	// Property accessors

	public String getAcciId() {
		return this.acciId;
	}

	public void setAcciId(String acciId) {
		this.acciId = acciId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getAccGrade() {
		return this.accGrade;
	}

	public void setAccGrade(String accGrade) {
		this.accGrade = accGrade;
	}

	public String getAccCategory() {
		return this.accCategory;
	}

	public void setAccCategory(String accCategory) {
		this.accCategory = accCategory;
	}

	public Date getAccTime() {
		return this.accTime;
	}

	public void setAccTime(Date accTime) {
		this.accTime = accTime;
	}

	public String getAccNature() {
		return this.accNature;
	}

	public void setAccNature(String accNature) {
		this.accNature = accNature;
	}

	public String getAccPlace() {
		return this.accPlace;
	}

	public void setAccPlace(String accPlace) {
		this.accPlace = accPlace;
	}

	public BigDecimal getInjurieNum() {
		return this.injurieNum;
	}

	public void setInjurieNum(BigDecimal injurieNum) {
		this.injurieNum = injurieNum;
	}

	public BigDecimal getHeavilyHurtNum() {
		return this.heavilyHurtNum;
	}

	public void setHeavilyHurtNum(BigDecimal heavilyHurtNum) {
		this.heavilyHurtNum = heavilyHurtNum;
	}

	public BigDecimal getDeathToll() {
		return this.deathToll;
	}

	public void setDeathToll(BigDecimal deathToll) {
		this.deathToll = deathToll;
	}

	public double getDirectEcoLoss() {
		return this.directEcoLoss;
	}

	public void setDirectEcoLoss(double directEcoLoss) {
		this.directEcoLoss = directEcoLoss;
	}

	public String getAccDesc() {
		return this.accDesc;
	}

	public void setAccDesc(String accDesc) {
		this.accDesc = accDesc;
	}

	public String getAccCause() {
		return this.accCause;
	}

	public void setAccCause(String accCause) {
		this.accCause = accCause;
	}

	public String getMeasureTaken() {
		return this.measureTaken;
	}

	public void setMeasureTaken(String measureTaken) {
		this.measureTaken = measureTaken;
	}

	public String getResponsibleOrg() {
		return this.responsibleOrg;
	}

	public void setResponsibleOrg(String responsibleOrg) {
		this.responsibleOrg = responsibleOrg;
	}

	public String getRespPerson() {
		return this.respPerson;
	}

	public void setRespPerson(String respPerson) {
		this.respPerson = respPerson;
	}

	public String getDealSituation() {
		return this.dealSituation;
	}

	public void setDealSituation(String dealSituation) {
		this.dealSituation = dealSituation;
	}

	public String getUnitLegitimacy() {
		return this.unitLegitimacy;
	}

	public void setUnitLegitimacy(String unitLegitimacy) {
		this.unitLegitimacy = unitLegitimacy;
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

	public String getOutId() {
		return this.outId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
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