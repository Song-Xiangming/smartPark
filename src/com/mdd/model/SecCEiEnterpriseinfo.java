package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * SecCEiEnterpriseinfo entity. @author MyEclipse Persistence Tools
 */

public class SecCEiEnterpriseinfo implements java.io.Serializable {

	// Fields

	private String enterpriseId;
	private String enterpriseName;
	private String entProfiles;
	private String registCode;
	private String regAddress;
	private String proddistCode;
	private String prodAddress;
	private String registerNo;
	private String orgCode;
	private String industryTypeCode;
	private String neiCode;
	private String adminSubCode;
	private String busLiceLevelCode;
	private String entScale;
	private String isUpScale;
	private String legalRepr;
	private String contaceTel;
	private String email;
	private String entFax;
	private String entManageStateCode;
	private Date foundDate;
	private String postCode;
	private double saleIncome;
	private double regCapital;
	private String economicTypeCode;
	private double profit;
	private double totalMoney;
	private double area;
	private BigDecimal empNum;
	private String businessScope;
	private String principal;
	private String principalLphone;
	private String principalMphone;
	private String principalEmail;
	private String safetyDirector;
	private String safetyDirectorMphone;
	private String safetyDirectorLphone;
	private String safetyDirectorEmail;
	private String isHaveSafetyOrg;
	private String occPrincipalMphone;
	private String occPrincipalLphone;
	private String occPrincipalEmail;
	private String standLevelCode;
	private String regulatoryLevelCode;
	private String regulatoryTypeCode;
	private String creditLevelCode;
	private String isFiresafetyKeyUnit;
	private String isDemonstration;
	private String isHaveOccMan;
	private String isBlackName;
	private String pareentId;
	private String pareentName;
	private String groupCompanyId;
	private String groupCompanyName;
	private String isGroupCompany;
	private String deptId;
	private String industryOrgId;
	private double entLongitude;
	private double entLatitude;
	private String safetyOrgName;
	private BigDecimal speciaNum;
	private BigDecimal fullTimeSafety;
	private BigDecimal partTimeSafety;
	private BigDecimal fullTimeEmergencyNum;
	private BigDecimal partTimeEmergencyNum;
	private BigDecimal cseNum;
	private String safeKultur;
	private String isEnabled;
	private String isNeedAudit;
	private String safeKulturAudit;
	private String enterDeptId;
	private String isActive;
	private String creator;
	private Date createTime;
	private String updator;
	private Date updateTime;

	// Constructors

	/** default constructor */
	public SecCEiEnterpriseinfo() {
		enterpriseId = "";
		enterpriseName = "";
		entProfiles = "";
		registCode = "";
		regAddress = "";
		proddistCode = "";
		prodAddress = "";
		registerNo = "";
		orgCode = "";
		industryTypeCode = "";
		neiCode = "";
		adminSubCode = "";
		busLiceLevelCode = "";
		entScale = "";
		isUpScale = "";
		legalRepr = "";
		contaceTel = "";
		email = "";
		entFax = "";
		entManageStateCode = "";
		foundDate = new Date();
		postCode = "";
		saleIncome = 0.0;
		regCapital = 0.0;
		economicTypeCode = "";
		profit = 0.0;
		totalMoney = 0.0;
		area = 0.0;
		empNum = new BigDecimal(0);
		businessScope = "";
		principal = "";
		principalLphone = "";
		principalMphone = "";
		principalEmail = "";
		safetyDirector = "";
		safetyDirectorMphone = "";
		safetyDirectorLphone = "";
		safetyDirectorEmail = "";
		isHaveSafetyOrg = "";
		occPrincipalMphone = "";
		occPrincipalLphone = "";
		occPrincipalEmail = "";
		standLevelCode = "";
		regulatoryLevelCode = "";
		regulatoryTypeCode = "";
		creditLevelCode = "";
		isFiresafetyKeyUnit = "";
		isDemonstration = "";
		isHaveOccMan = "";
		isBlackName = "";
		pareentId = "";
		pareentName = "";
		groupCompanyId = "";
		groupCompanyName = "";
		isGroupCompany = "";
		deptId = "";
		industryOrgId = "";
		entLongitude = 0.0;
		entLatitude = 0.0;
		safetyOrgName = "";
		speciaNum = new BigDecimal(0);
		fullTimeSafety = new BigDecimal(0);
		partTimeSafety = new BigDecimal(0);
		fullTimeEmergencyNum = new BigDecimal(0);
		partTimeEmergencyNum = new BigDecimal(0);
		cseNum = new BigDecimal(0);
		safeKultur = "";
		isEnabled = "";
		isNeedAudit = "";
		safeKulturAudit = "";
		enterDeptId = "";
		isActive = "";
		creator = "";
		createTime = new Date();
		updator = "";
		updateTime = new Date();
	}

	/** full constructor */
	public SecCEiEnterpriseinfo(String enterpriseName, String entProfiles,
			String registCode, String regAddress, String proddistCode,
			String prodAddress, String registerNo, String orgCode,
			String industryTypeCode, String neiCode, String adminSubCode,
			String busLiceLevelCode, String entScale, String isUpScale,
			String legalRepr, String contaceTel, String email, String entFax,
			String entManageStateCode, Date foundDate, String postCode,
			double saleIncome, double regCapital, String economicTypeCode,
			double profit, double totalMoney, double area, BigDecimal empNum,
			String businessScope, String principal, String principalLphone,
			String principalMphone, String principalEmail,
			String safetyDirector, String safetyDirectorMphone,
			String safetyDirectorLphone, String safetyDirectorEmail,
			String isHaveSafetyOrg, String occPrincipalMphone,
			String occPrincipalLphone, String occPrincipalEmail,
			String standLevelCode, String regulatoryLevelCode,
			String regulatoryTypeCode, String creditLevelCode,
			String isFiresafetyKeyUnit, String isDemonstration,
			String isHaveOccMan, String isBlackName, String pareentId,
			String pareentName, String groupCompanyId, String groupCompanyName,
			String isGroupCompany, String deptId, String industryOrgId,
			double entLongitude, double entLatitude, String safetyOrgName,
			BigDecimal speciaNum, BigDecimal fullTimeSafety,
			BigDecimal partTimeSafety, BigDecimal fullTimeEmergencyNum,
			BigDecimal partTimeEmergencyNum, BigDecimal cseNum,
			String safeKultur, String isEnabled, String isNeedAudit,
			String safeKulturAudit, String enterDeptId, String isActive,
			String creator, Date createTime, String updator, Date updateTime) {
		this.enterpriseName = enterpriseName;
		this.entProfiles = entProfiles;
		this.registCode = registCode;
		this.regAddress = regAddress;
		this.proddistCode = proddistCode;
		this.prodAddress = prodAddress;
		this.registerNo = registerNo;
		this.orgCode = orgCode;
		this.industryTypeCode = industryTypeCode;
		this.neiCode = neiCode;
		this.adminSubCode = adminSubCode;
		this.busLiceLevelCode = busLiceLevelCode;
		this.entScale = entScale;
		this.isUpScale = isUpScale;
		this.legalRepr = legalRepr;
		this.contaceTel = contaceTel;
		this.email = email;
		this.entFax = entFax;
		this.entManageStateCode = entManageStateCode;
		this.foundDate = foundDate;
		this.postCode = postCode;
		this.saleIncome = saleIncome;
		this.regCapital = regCapital;
		this.economicTypeCode = economicTypeCode;
		this.profit = profit;
		this.totalMoney = totalMoney;
		this.area = area;
		this.empNum = empNum;
		this.businessScope = businessScope;
		this.principal = principal;
		this.principalLphone = principalLphone;
		this.principalMphone = principalMphone;
		this.principalEmail = principalEmail;
		this.safetyDirector = safetyDirector;
		this.safetyDirectorMphone = safetyDirectorMphone;
		this.safetyDirectorLphone = safetyDirectorLphone;
		this.safetyDirectorEmail = safetyDirectorEmail;
		this.isHaveSafetyOrg = isHaveSafetyOrg;
		this.occPrincipalMphone = occPrincipalMphone;
		this.occPrincipalLphone = occPrincipalLphone;
		this.occPrincipalEmail = occPrincipalEmail;
		this.standLevelCode = standLevelCode;
		this.regulatoryLevelCode = regulatoryLevelCode;
		this.regulatoryTypeCode = regulatoryTypeCode;
		this.creditLevelCode = creditLevelCode;
		this.isFiresafetyKeyUnit = isFiresafetyKeyUnit;
		this.isDemonstration = isDemonstration;
		this.isHaveOccMan = isHaveOccMan;
		this.isBlackName = isBlackName;
		this.pareentId = pareentId;
		this.pareentName = pareentName;
		this.groupCompanyId = groupCompanyId;
		this.groupCompanyName = groupCompanyName;
		this.isGroupCompany = isGroupCompany;
		this.deptId = deptId;
		this.industryOrgId = industryOrgId;
		this.entLongitude = entLongitude;
		this.entLatitude = entLatitude;
		this.safetyOrgName = safetyOrgName;
		this.speciaNum = speciaNum;
		this.fullTimeSafety = fullTimeSafety;
		this.partTimeSafety = partTimeSafety;
		this.fullTimeEmergencyNum = fullTimeEmergencyNum;
		this.partTimeEmergencyNum = partTimeEmergencyNum;
		this.cseNum = cseNum;
		this.safeKultur = safeKultur;
		this.isEnabled = isEnabled;
		this.isNeedAudit = isNeedAudit;
		this.safeKulturAudit = safeKulturAudit;
		this.enterDeptId = enterDeptId;
		this.isActive = isActive;
		this.creator = creator;
		this.createTime = createTime;
		this.updator = updator;
		this.updateTime = updateTime;
	}

	// Property accessors

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getEntProfiles() {
		return this.entProfiles;
	}

	public void setEntProfiles(String entProfiles) {
		this.entProfiles = entProfiles;
	}

	public String getRegistCode() {
		return this.registCode;
	}

	public void setRegistCode(String registCode) {
		this.registCode = registCode;
	}

	public String getRegAddress() {
		return this.regAddress;
	}

	public void setRegAddress(String regAddress) {
		this.regAddress = regAddress;
	}

	public String getProddistCode() {
		return this.proddistCode;
	}

	public void setProddistCode(String proddistCode) {
		this.proddistCode = proddistCode;
	}

	public String getProdAddress() {
		return this.prodAddress;
	}

	public void setProdAddress(String prodAddress) {
		this.prodAddress = prodAddress;
	}

	public String getRegisterNo() {
		return this.registerNo;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}

	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getIndustryTypeCode() {
		return this.industryTypeCode;
	}

	public void setIndustryTypeCode(String industryTypeCode) {
		this.industryTypeCode = industryTypeCode;
	}

	public String getNeiCode() {
		return this.neiCode;
	}

	public void setNeiCode(String neiCode) {
		this.neiCode = neiCode;
	}

	public String getAdminSubCode() {
		return this.adminSubCode;
	}

	public void setAdminSubCode(String adminSubCode) {
		this.adminSubCode = adminSubCode;
	}

	public String getBusLiceLevelCode() {
		return this.busLiceLevelCode;
	}

	public void setBusLiceLevelCode(String busLiceLevelCode) {
		this.busLiceLevelCode = busLiceLevelCode;
	}

	public String getEntScale() {
		return this.entScale;
	}

	public void setEntScale(String entScale) {
		this.entScale = entScale;
	}

	public String getIsUpScale() {
		return this.isUpScale;
	}

	public void setIsUpScale(String isUpScale) {
		this.isUpScale = isUpScale;
	}

	public String getLegalRepr() {
		return this.legalRepr;
	}

	public void setLegalRepr(String legalRepr) {
		this.legalRepr = legalRepr;
	}

	public String getContaceTel() {
		return this.contaceTel;
	}

	public void setContaceTel(String contaceTel) {
		this.contaceTel = contaceTel;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEntFax() {
		return this.entFax;
	}

	public void setEntFax(String entFax) {
		this.entFax = entFax;
	}

	public String getEntManageStateCode() {
		return this.entManageStateCode;
	}

	public void setEntManageStateCode(String entManageStateCode) {
		this.entManageStateCode = entManageStateCode;
	}

	public Date getFoundDate() {
		return this.foundDate;
	}

	public void setFoundDate(Date foundDate) {
		this.foundDate = foundDate;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public double getSaleIncome() {
		return this.saleIncome;
	}

	public void setSaleIncome(double saleIncome) {
		this.saleIncome = saleIncome;
	}

	public double getRegCapital() {
		return this.regCapital;
	}

	public void setRegCapital(double regCapital) {
		this.regCapital = regCapital;
	}

	public String getEconomicTypeCode() {
		return this.economicTypeCode;
	}

	public void setEconomicTypeCode(String economicTypeCode) {
		this.economicTypeCode = economicTypeCode;
	}

	public double getProfit() {
		return this.profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public double getTotalMoney() {
		return this.totalMoney;
	}

	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}

	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public BigDecimal getEmpNum() {
		return this.empNum;
	}

	public void setEmpNum(BigDecimal empNum) {
		this.empNum = empNum;
	}

	public String getBusinessScope() {
		return this.businessScope;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

	public String getPrincipal() {
		return this.principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getPrincipalLphone() {
		return this.principalLphone;
	}

	public void setPrincipalLphone(String principalLphone) {
		this.principalLphone = principalLphone;
	}

	public String getPrincipalMphone() {
		return this.principalMphone;
	}

	public void setPrincipalMphone(String principalMphone) {
		this.principalMphone = principalMphone;
	}

	public String getPrincipalEmail() {
		return this.principalEmail;
	}

	public void setPrincipalEmail(String principalEmail) {
		this.principalEmail = principalEmail;
	}

	public String getSafetyDirector() {
		return this.safetyDirector;
	}

	public void setSafetyDirector(String safetyDirector) {
		this.safetyDirector = safetyDirector;
	}

	public String getSafetyDirectorMphone() {
		return this.safetyDirectorMphone;
	}

	public void setSafetyDirectorMphone(String safetyDirectorMphone) {
		this.safetyDirectorMphone = safetyDirectorMphone;
	}

	public String getSafetyDirectorLphone() {
		return this.safetyDirectorLphone;
	}

	public void setSafetyDirectorLphone(String safetyDirectorLphone) {
		this.safetyDirectorLphone = safetyDirectorLphone;
	}

	public String getSafetyDirectorEmail() {
		return this.safetyDirectorEmail;
	}

	public void setSafetyDirectorEmail(String safetyDirectorEmail) {
		this.safetyDirectorEmail = safetyDirectorEmail;
	}

	public String getIsHaveSafetyOrg() {
		return this.isHaveSafetyOrg;
	}

	public void setIsHaveSafetyOrg(String isHaveSafetyOrg) {
		this.isHaveSafetyOrg = isHaveSafetyOrg;
	}

	public String getOccPrincipalMphone() {
		return this.occPrincipalMphone;
	}

	public void setOccPrincipalMphone(String occPrincipalMphone) {
		this.occPrincipalMphone = occPrincipalMphone;
	}

	public String getOccPrincipalLphone() {
		return this.occPrincipalLphone;
	}

	public void setOccPrincipalLphone(String occPrincipalLphone) {
		this.occPrincipalLphone = occPrincipalLphone;
	}

	public String getOccPrincipalEmail() {
		return this.occPrincipalEmail;
	}

	public void setOccPrincipalEmail(String occPrincipalEmail) {
		this.occPrincipalEmail = occPrincipalEmail;
	}

	public String getStandLevelCode() {
		return this.standLevelCode;
	}

	public void setStandLevelCode(String standLevelCode) {
		this.standLevelCode = standLevelCode;
	}

	public String getRegulatoryLevelCode() {
		return this.regulatoryLevelCode;
	}

	public void setRegulatoryLevelCode(String regulatoryLevelCode) {
		this.regulatoryLevelCode = regulatoryLevelCode;
	}

	public String getRegulatoryTypeCode() {
		return this.regulatoryTypeCode;
	}

	public void setRegulatoryTypeCode(String regulatoryTypeCode) {
		this.regulatoryTypeCode = regulatoryTypeCode;
	}

	public String getCreditLevelCode() {
		return this.creditLevelCode;
	}

	public void setCreditLevelCode(String creditLevelCode) {
		this.creditLevelCode = creditLevelCode;
	}

	public String getIsFiresafetyKeyUnit() {
		return this.isFiresafetyKeyUnit;
	}

	public void setIsFiresafetyKeyUnit(String isFiresafetyKeyUnit) {
		this.isFiresafetyKeyUnit = isFiresafetyKeyUnit;
	}

	public String getIsDemonstration() {
		return this.isDemonstration;
	}

	public void setIsDemonstration(String isDemonstration) {
		this.isDemonstration = isDemonstration;
	}

	public String getIsHaveOccMan() {
		return this.isHaveOccMan;
	}

	public void setIsHaveOccMan(String isHaveOccMan) {
		this.isHaveOccMan = isHaveOccMan;
	}

	public String getIsBlackName() {
		return this.isBlackName;
	}

	public void setIsBlackName(String isBlackName) {
		this.isBlackName = isBlackName;
	}

	public String getPareentId() {
		return this.pareentId;
	}

	public void setPareentId(String pareentId) {
		this.pareentId = pareentId;
	}

	public String getPareentName() {
		return this.pareentName;
	}

	public void setPareentName(String pareentName) {
		this.pareentName = pareentName;
	}

	public String getGroupCompanyId() {
		return this.groupCompanyId;
	}

	public void setGroupCompanyId(String groupCompanyId) {
		this.groupCompanyId = groupCompanyId;
	}

	public String getGroupCompanyName() {
		return this.groupCompanyName;
	}

	public void setGroupCompanyName(String groupCompanyName) {
		this.groupCompanyName = groupCompanyName;
	}

	public String getIsGroupCompany() {
		return this.isGroupCompany;
	}

	public void setIsGroupCompany(String isGroupCompany) {
		this.isGroupCompany = isGroupCompany;
	}

	public String getDeptId() {
		return this.deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getIndustryOrgId() {
		return this.industryOrgId;
	}

	public void setIndustryOrgId(String industryOrgId) {
		this.industryOrgId = industryOrgId;
	}

	public double getEntLongitude() {
		return this.entLongitude;
	}

	public void setEntLongitude(double entLongitude) {
		this.entLongitude = entLongitude;
	}

	public double getEntLatitude() {
		return this.entLatitude;
	}

	public void setEntLatitude(double entLatitude) {
		this.entLatitude = entLatitude;
	}

	public String getSafetyOrgName() {
		return this.safetyOrgName;
	}

	public void setSafetyOrgName(String safetyOrgName) {
		this.safetyOrgName = safetyOrgName;
	}

	public BigDecimal getSpeciaNum() {
		return this.speciaNum;
	}

	public void setSpeciaNum(BigDecimal speciaNum) {
		this.speciaNum = speciaNum;
	}

	public BigDecimal getFullTimeSafety() {
		return this.fullTimeSafety;
	}

	public void setFullTimeSafety(BigDecimal fullTimeSafety) {
		this.fullTimeSafety = fullTimeSafety;
	}

	public BigDecimal getPartTimeSafety() {
		return this.partTimeSafety;
	}

	public void setPartTimeSafety(BigDecimal partTimeSafety) {
		this.partTimeSafety = partTimeSafety;
	}

	public BigDecimal getFullTimeEmergencyNum() {
		return this.fullTimeEmergencyNum;
	}

	public void setFullTimeEmergencyNum(BigDecimal fullTimeEmergencyNum) {
		this.fullTimeEmergencyNum = fullTimeEmergencyNum;
	}

	public BigDecimal getPartTimeEmergencyNum() {
		return this.partTimeEmergencyNum;
	}

	public void setPartTimeEmergencyNum(BigDecimal partTimeEmergencyNum) {
		this.partTimeEmergencyNum = partTimeEmergencyNum;
	}

	public BigDecimal getCseNum() {
		return this.cseNum;
	}

	public void setCseNum(BigDecimal cseNum) {
		this.cseNum = cseNum;
	}

	public String getSafeKultur() {
		return this.safeKultur;
	}

	public void setSafeKultur(String safeKultur) {
		this.safeKultur = safeKultur;
	}

	public String getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getIsNeedAudit() {
		return this.isNeedAudit;
	}

	public void setIsNeedAudit(String isNeedAudit) {
		this.isNeedAudit = isNeedAudit;
	}

	public String getSafeKulturAudit() {
		return this.safeKulturAudit;
	}

	public void setSafeKulturAudit(String safeKulturAudit) {
		this.safeKulturAudit = safeKulturAudit;
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