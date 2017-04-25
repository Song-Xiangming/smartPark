package com.mdd.model;

import java.util.Date;

/**
 * EnvCoreEnterpriseInfo entity. @author MyEclipse Persistence Tools
 */

public class EnvCoreEnterpriseInfo implements java.io.Serializable {

	// Fields

	private String id;
	private String kind;
	private String type;
	private String bureauId;
	private String subordinationId;
	private String registerTypeId;
	private String enterpriseScaleId;
	private String industryCategoryId;
	private byte isKeyPoint;
	private String keyPointTypeId;
	private String valleyId;
	private String enterpriseName;
	private String enterpriseAddress;
	private String businessArea;
	private String bankName;
	private String bankAccountNumber;
	private String legalPresonCode;
	private String legalPerson;
	private String contactPerson;
	private String mailingAddress;
	private String telephoneNumber;
	private String email;
	private String envOrganization;
	private double longitude;
	private double latitude;
	private byte flag;
	private byte logoutFlag;
	private String zipCode;
	private Date commissioningTime;
	private String fax;
	private String notes;
	private String dealFactory;
	private Integer workersNumber;
	private String areaCode;
	private String remark;
	private String orgId;
	private byte isAlarm;
	private String alarmCode;
	private byte isConnected;
	private String pathOf3d;
	private Date inputTime;
	private String enterpriseCode;
	private String enterpriseImage;
	private long reuseScale;
	private String treatmentProcess;
	private String operatorId;
	private String operator;
	private String countyEnvSpecialist;
	private String enterpriseEnvSpecialist;
	private String remarkSign;
	private byte keyPointType;
	private String pinyin;
	private String rawMaterialProperties;
	private String businessNumber;
	private String organizationCode;
	private String productionCapacity;
	private String treatmentFacilities;
	private double totalIndexOf02;
	private double totalIndexOfNh3;
	private double totalIndexOfSo2;
	private double totalIndexOfNox;
	private String password;

	// Constructors

	/** default constructor */
	public EnvCoreEnterpriseInfo() {
		id = "";
		kind = "";
		type = "";
		bureauId = "";
		subordinationId = "";
		registerTypeId = "";
		enterpriseScaleId = "";
		industryCategoryId = "";
		isKeyPoint = 0;
		keyPointTypeId = "";
		valleyId = "";
		enterpriseName = "";
		enterpriseAddress = "";
		businessArea = "";
		bankName = "";
		bankAccountNumber = "";
		legalPresonCode = "";
		legalPerson = "";
		contactPerson = "";
		mailingAddress = "";
		telephoneNumber = "";
		email = "";
		envOrganization = "";
		longitude = 0.0;
		latitude = 0.0;
		flag = 0;
		logoutFlag = 0;
		zipCode = "";
		commissioningTime = new Date();
		fax = "";
		notes = "";
		dealFactory = "";
		workersNumber = 0;
		areaCode = "";
		remark = "";
		orgId = "";
		isAlarm = 0;
		alarmCode = "";
		isConnected = 0;
		pathOf3d = "";
		inputTime = new Date();
		enterpriseCode = "";
		enterpriseImage = "";
		reuseScale = 0;
		treatmentProcess = "";
		operatorId = "";
		operator = "";
		countyEnvSpecialist = "";
		enterpriseEnvSpecialist = "";
		remarkSign = "";
		keyPointType = 0;
		pinyin = "";
		rawMaterialProperties = "";
		businessNumber = "";
		organizationCode = "";
		productionCapacity = "";
		treatmentFacilities = "";
		totalIndexOf02 = 0.0;
		totalIndexOfNh3 = 0.0;
		totalIndexOfSo2 = 0.0;
		totalIndexOfNox = 0.0;
		password = "";

	}

	/** full constructor */
	public EnvCoreEnterpriseInfo(String kind, String type, String bureauId,
			String subordinationId, String registerTypeId,
			String enterpriseScaleId, String industryCategoryId,
			byte isKeyPoint, String keyPointTypeId, String valleyId,
			String enterpriseName, String enterpriseAddress,
			String businessArea, String bankName, String bankAccountNumber,
			String legalPresonCode, String legalPerson, String contactPerson,
			String mailingAddress, String telephoneNumber, String email,
			String envOrganization, double longitude, double latitude,
			byte flag, byte logoutFlag, String zipCode, Date commissioningTime,
			String fax, String notes, String dealFactory,
			Integer workersNumber, String areaCode, String remark,
			String orgId, byte isAlarm, String alarmCode, byte isConnected,
			String pathOf3d, Date inputTime, String enterpriseCode,
			String enterpriseImage, long reuseScale, String treatmentProcess,
			String operatorId, String operator, String countyEnvSpecialist,
			String enterpriseEnvSpecialist, String remarkSign,
			byte keyPointType, String pinyin, String rawMaterialProperties,
			String businessNumber, String organizationCode,
			String productionCapacity, String treatmentFacilities,
			double totalIndexOf02, double totalIndexOfNh3,
			double totalIndexOfSo2, double totalIndexOfNox, String password) {
		this.kind = kind;
		this.type = type;
		this.bureauId = bureauId;
		this.subordinationId = subordinationId;
		this.registerTypeId = registerTypeId;
		this.enterpriseScaleId = enterpriseScaleId;
		this.industryCategoryId = industryCategoryId;
		this.isKeyPoint = isKeyPoint;
		this.keyPointTypeId = keyPointTypeId;
		this.valleyId = valleyId;
		this.enterpriseName = enterpriseName;
		this.enterpriseAddress = enterpriseAddress;
		this.businessArea = businessArea;
		this.bankName = bankName;
		this.bankAccountNumber = bankAccountNumber;
		this.legalPresonCode = legalPresonCode;
		this.legalPerson = legalPerson;
		this.contactPerson = contactPerson;
		this.mailingAddress = mailingAddress;
		this.telephoneNumber = telephoneNumber;
		this.email = email;
		this.envOrganization = envOrganization;
		this.longitude = longitude;
		this.latitude = latitude;
		this.flag = flag;
		this.logoutFlag = logoutFlag;
		this.zipCode = zipCode;
		this.commissioningTime = commissioningTime;
		this.fax = fax;
		this.notes = notes;
		this.dealFactory = dealFactory;
		this.workersNumber = workersNumber;
		this.areaCode = areaCode;
		this.remark = remark;
		this.orgId = orgId;
		this.isAlarm = isAlarm;
		this.alarmCode = alarmCode;
		this.isConnected = isConnected;
		this.pathOf3d = pathOf3d;
		this.inputTime = inputTime;
		this.enterpriseCode = enterpriseCode;
		this.enterpriseImage = enterpriseImage;
		this.reuseScale = reuseScale;
		this.treatmentProcess = treatmentProcess;
		this.operatorId = operatorId;
		this.operator = operator;
		this.countyEnvSpecialist = countyEnvSpecialist;
		this.enterpriseEnvSpecialist = enterpriseEnvSpecialist;
		this.remarkSign = remarkSign;
		this.keyPointType = keyPointType;
		this.pinyin = pinyin;
		this.rawMaterialProperties = rawMaterialProperties;
		this.businessNumber = businessNumber;
		this.organizationCode = organizationCode;
		this.productionCapacity = productionCapacity;
		this.treatmentFacilities = treatmentFacilities;
		this.totalIndexOf02 = totalIndexOf02;
		this.totalIndexOfNh3 = totalIndexOfNh3;
		this.totalIndexOfSo2 = totalIndexOfSo2;
		this.totalIndexOfNox = totalIndexOfNox;
		this.password = password;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKind() {
		return this.kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBureauId() {
		return this.bureauId;
	}

	public void setBureauId(String bureauId) {
		this.bureauId = bureauId;
	}

	public String getSubordinationId() {
		return this.subordinationId;
	}

	public void setSubordinationId(String subordinationId) {
		this.subordinationId = subordinationId;
	}

	public String getRegisterTypeId() {
		return this.registerTypeId;
	}

	public void setRegisterTypeId(String registerTypeId) {
		this.registerTypeId = registerTypeId;
	}

	public String getEnterpriseScaleId() {
		return this.enterpriseScaleId;
	}

	public void setEnterpriseScaleId(String enterpriseScaleId) {
		this.enterpriseScaleId = enterpriseScaleId;
	}

	public String getIndustryCategoryId() {
		return this.industryCategoryId;
	}

	public void setIndustryCategoryId(String industryCategoryId) {
		this.industryCategoryId = industryCategoryId;
	}

	public byte getIsKeyPoint() {
		return this.isKeyPoint;
	}

	public void setIsKeyPoint(byte isKeyPoint) {
		this.isKeyPoint = isKeyPoint;
	}

	public String getKeyPointTypeId() {
		return this.keyPointTypeId;
	}

	public void setKeyPointTypeId(String keyPointTypeId) {
		this.keyPointTypeId = keyPointTypeId;
	}

	public String getValleyId() {
		return this.valleyId;
	}

	public void setValleyId(String valleyId) {
		this.valleyId = valleyId;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getEnterpriseAddress() {
		return this.enterpriseAddress;
	}

	public void setEnterpriseAddress(String enterpriseAddress) {
		this.enterpriseAddress = enterpriseAddress;
	}

	public String getBusinessArea() {
		return this.businessArea;
	}

	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAccountNumber() {
		return this.bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getLegalPresonCode() {
		return this.legalPresonCode;
	}

	public void setLegalPresonCode(String legalPresonCode) {
		this.legalPresonCode = legalPresonCode;
	}

	public String getLegalPerson() {
		return this.legalPerson;
	}

	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}

	public String getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getMailingAddress() {
		return this.mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getTelephoneNumber() {
		return this.telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEnvOrganization() {
		return this.envOrganization;
	}

	public void setEnvOrganization(String envOrganization) {
		this.envOrganization = envOrganization;
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

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public byte getLogoutFlag() {
		return this.logoutFlag;
	}

	public void setLogoutFlag(byte logoutFlag) {
		this.logoutFlag = logoutFlag;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Date getCommissioningTime() {
		return this.commissioningTime;
	}

	public void setCommissioningTime(Date commissioningTime) {
		this.commissioningTime = commissioningTime;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getDealFactory() {
		return this.dealFactory;
	}

	public void setDealFactory(String dealFactory) {
		this.dealFactory = dealFactory;
	}

	public Integer getWorkersNumber() {
		return this.workersNumber;
	}

	public void setWorkersNumber(Integer workersNumber) {
		this.workersNumber = workersNumber;
	}

	public String getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public byte getIsAlarm() {
		return this.isAlarm;
	}

	public void setIsAlarm(byte isAlarm) {
		this.isAlarm = isAlarm;
	}

	public String getAlarmCode() {
		return this.alarmCode;
	}

	public void setAlarmCode(String alarmCode) {
		this.alarmCode = alarmCode;
	}

	public byte getIsConnected() {
		return this.isConnected;
	}

	public void setIsConnected(byte isConnected) {
		this.isConnected = isConnected;
	}

	public String getPathOf3d() {
		return this.pathOf3d;
	}

	public void setPathOf3d(String pathOf3d) {
		this.pathOf3d = pathOf3d;
	}

	public Date getInputTime() {
		return this.inputTime;
	}

	public void setInputTime(Date inputTime) {
		this.inputTime = inputTime;
	}

	public String getEnterpriseCode() {
		return this.enterpriseCode;
	}

	public void setEnterpriseCode(String enterpriseCode) {
		this.enterpriseCode = enterpriseCode;
	}

	public String getEnterpriseImage() {
		return this.enterpriseImage;
	}

	public void setEnterpriseImage(String enterpriseImage) {
		this.enterpriseImage = enterpriseImage;
	}

	public long getReuseScale() {
		return this.reuseScale;
	}

	public void setReuseScale(long reuseScale) {
		this.reuseScale = reuseScale;
	}

	public String getTreatmentProcess() {
		return this.treatmentProcess;
	}

	public void setTreatmentProcess(String treatmentProcess) {
		this.treatmentProcess = treatmentProcess;
	}

	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getCountyEnvSpecialist() {
		return this.countyEnvSpecialist;
	}

	public void setCountyEnvSpecialist(String countyEnvSpecialist) {
		this.countyEnvSpecialist = countyEnvSpecialist;
	}

	public String getEnterpriseEnvSpecialist() {
		return this.enterpriseEnvSpecialist;
	}

	public void setEnterpriseEnvSpecialist(String enterpriseEnvSpecialist) {
		this.enterpriseEnvSpecialist = enterpriseEnvSpecialist;
	}

	public String getRemarkSign() {
		return this.remarkSign;
	}

	public void setRemarkSign(String remarkSign) {
		this.remarkSign = remarkSign;
	}

	public byte getKeyPointType() {
		return this.keyPointType;
	}

	public void setKeyPointType(byte keyPointType) {
		this.keyPointType = keyPointType;
	}

	public String getPinyin() {
		return this.pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public String getRawMaterialProperties() {
		return this.rawMaterialProperties;
	}

	public void setRawMaterialProperties(String rawMaterialProperties) {
		this.rawMaterialProperties = rawMaterialProperties;
	}

	public String getBusinessNumber() {
		return this.businessNumber;
	}

	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
	}

	public String getOrganizationCode() {
		return this.organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getProductionCapacity() {
		return this.productionCapacity;
	}

	public void setProductionCapacity(String productionCapacity) {
		this.productionCapacity = productionCapacity;
	}

	public String getTreatmentFacilities() {
		return this.treatmentFacilities;
	}

	public void setTreatmentFacilities(String treatmentFacilities) {
		this.treatmentFacilities = treatmentFacilities;
	}

	public double getTotalIndexOf02() {
		return this.totalIndexOf02;
	}

	public void setTotalIndexOf02(double totalIndexOf02) {
		this.totalIndexOf02 = totalIndexOf02;
	}

	public double getTotalIndexOfNh3() {
		return this.totalIndexOfNh3;
	}

	public void setTotalIndexOfNh3(double totalIndexOfNh3) {
		this.totalIndexOfNh3 = totalIndexOfNh3;
	}

	public double getTotalIndexOfSo2() {
		return this.totalIndexOfSo2;
	}

	public void setTotalIndexOfSo2(double totalIndexOfSo2) {
		this.totalIndexOfSo2 = totalIndexOfSo2;
	}

	public double getTotalIndexOfNox() {
		return this.totalIndexOfNox;
	}

	public void setTotalIndexOfNox(double totalIndexOfNox) {
		this.totalIndexOfNox = totalIndexOfNox;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}