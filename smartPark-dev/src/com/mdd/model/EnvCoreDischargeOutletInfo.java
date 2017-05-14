package com.mdd.model;

import java.util.Date;

/**
 * EnvCoreDischargeOutletInfo entity. @author MyEclipse Persistence Tools
 */

public class EnvCoreDischargeOutletInfo implements java.io.Serializable {

	// Fields

	private String enterpriseId;
	private long id;
	private String name;
	private String pollutantTypeId;
	private double longitude;
	private double latitude;
	private Date activeDate;
	private String periodId;
	private byte sewageDischargeId;
	private String sewagePlantId;
	private String valleyId;
	private String industryCategoryId;
	private String dischargeLetoutLocation;
	private String soundLetoutType;
	private byte isWorkship;
	private double exceedStandardMultipe;
	private double gasLetoutHeight;
	private double radius;
	private String fuelTypeId;
	private double dischargeValue;
	private String dischargeLetoutId;
	private String dischargeLetoutTypeId;
	private String instrumentName;
	private String workshopName;
	private byte isTwoControlZones;
	private String dischargeRuleId;
	private String dischargeMonth;
	private byte dischargeType;
	private String equipmentName;
	private String burnTypeId;
	private byte burnPurpose;
	private String gasIndex;
	private byte standardLevel;
	private byte flag;
	private String remark;
	private String controlZoneId;
	private String valleyFunctionId;
	private String gasFunctionTypeId;
	private String dtuId;
	private String monitorPath;
	private double currentValue;
	private byte isAlarm;
	private double entranceDischargeValue;
	private Date storageDate;
	private double totalDischarge;
	private double concentrationOfEntrance;
	private String keyPointType;
	private double designSize;
	private double capacityOfSulfurRemoval;
	private double samplingPointHeigh;
	private String entranceId;
	private double theoreticalFlow;
	private String smallId;
	private String parentVarch;

	// Constructors

	/** default constructor */
	public EnvCoreDischargeOutletInfo() {
		enterpriseId = "";
		id = 0;
		name = "";
		pollutantTypeId = "";
		longitude = 0.0;
		latitude = 0.0;
		activeDate = new Date();
		periodId = "";
		sewageDischargeId = 0;
		sewagePlantId = "";
		valleyId = "";
		industryCategoryId = "";
		dischargeLetoutLocation = "";
		soundLetoutType = "";
		isWorkship = 0;
		exceedStandardMultipe = 0.0;
		gasLetoutHeight = 0.0;
		radius = 0.0;
		fuelTypeId = "";
		dischargeValue = 0.0;
		dischargeLetoutId = "";
		dischargeLetoutTypeId = "";
		instrumentName = "";
		workshopName = "";
		isTwoControlZones = 0;
		dischargeRuleId = "";
		dischargeMonth = "";
		dischargeType = 0;
		equipmentName = "";
		burnTypeId = "";
		burnPurpose = 0;
		gasIndex = "";
		standardLevel = 0;
		flag = 0;
		remark = "";
		controlZoneId = "";
		valleyFunctionId = "";
		gasFunctionTypeId = "";
		dtuId = "";
		monitorPath = "";
		currentValue = 0.0;
		isAlarm = 0;
		entranceDischargeValue = 0.0;
		storageDate = new Date();
		totalDischarge = 0.0;
		concentrationOfEntrance = 0.0;
		keyPointType = "";
		designSize = 0.0;
		capacityOfSulfurRemoval = 0.0;
		samplingPointHeigh = 0.0;
		entranceId = "";
		theoreticalFlow = 0.0;
		smallId = "";
		parentVarch = "";
	}

	/** full constructor */
	public EnvCoreDischargeOutletInfo(long id, String name,
			String pollutantTypeId, double longitude, double latitude,
			Date activeDate, String periodId, byte sewageDischargeId,
			String sewagePlantId, String valleyId, String industryCategoryId,
			String dischargeLetoutLocation, String soundLetoutType,
			byte isWorkship, double exceedStandardMultipe,
			double gasLetoutHeight, double radius, String fuelTypeId,
			double dischargeValue, String dischargeLetoutId,
			String dischargeLetoutTypeId, String instrumentName,
			String workshopName, byte isTwoControlZones,
			String dischargeRuleId, String dischargeMonth, byte dischargeType,
			String equipmentName, String burnTypeId, byte burnPurpose,
			String gasIndex, byte standardLevel, byte flag, String remark,
			String controlZoneId, String valleyFunctionId,
			String gasFunctionTypeId, String dtuId, String monitorPath,
			double currentValue, byte isAlarm, double entranceDischargeValue,
			Date storageDate, double totalDischarge,
			double concentrationOfEntrance, String keyPointType,
			double designSize, double capacityOfSulfurRemoval,
			double samplingPointHeigh, String entranceId,
			double theoreticalFlow, String smallId, String parentVarch) {
		this.id = id;
		this.name = name;
		this.pollutantTypeId = pollutantTypeId;
		this.longitude = longitude;
		this.latitude = latitude;
		this.activeDate = activeDate;
		this.periodId = periodId;
		this.sewageDischargeId = sewageDischargeId;
		this.sewagePlantId = sewagePlantId;
		this.valleyId = valleyId;
		this.industryCategoryId = industryCategoryId;
		this.dischargeLetoutLocation = dischargeLetoutLocation;
		this.soundLetoutType = soundLetoutType;
		this.isWorkship = isWorkship;
		this.exceedStandardMultipe = exceedStandardMultipe;
		this.gasLetoutHeight = gasLetoutHeight;
		this.radius = radius;
		this.fuelTypeId = fuelTypeId;
		this.dischargeValue = dischargeValue;
		this.dischargeLetoutId = dischargeLetoutId;
		this.dischargeLetoutTypeId = dischargeLetoutTypeId;
		this.instrumentName = instrumentName;
		this.workshopName = workshopName;
		this.isTwoControlZones = isTwoControlZones;
		this.dischargeRuleId = dischargeRuleId;
		this.dischargeMonth = dischargeMonth;
		this.dischargeType = dischargeType;
		this.equipmentName = equipmentName;
		this.burnTypeId = burnTypeId;
		this.burnPurpose = burnPurpose;
		this.gasIndex = gasIndex;
		this.standardLevel = standardLevel;
		this.flag = flag;
		this.remark = remark;
		this.controlZoneId = controlZoneId;
		this.valleyFunctionId = valleyFunctionId;
		this.gasFunctionTypeId = gasFunctionTypeId;
		this.dtuId = dtuId;
		this.monitorPath = monitorPath;
		this.currentValue = currentValue;
		this.isAlarm = isAlarm;
		this.entranceDischargeValue = entranceDischargeValue;
		this.storageDate = storageDate;
		this.totalDischarge = totalDischarge;
		this.concentrationOfEntrance = concentrationOfEntrance;
		this.keyPointType = keyPointType;
		this.designSize = designSize;
		this.capacityOfSulfurRemoval = capacityOfSulfurRemoval;
		this.samplingPointHeigh = samplingPointHeigh;
		this.entranceId = entranceId;
		this.theoreticalFlow = theoreticalFlow;
		this.smallId = smallId;
		this.parentVarch = parentVarch;
	}

	// Property accessors

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPollutantTypeId() {
		return this.pollutantTypeId;
	}

	public void setPollutantTypeId(String pollutantTypeId) {
		this.pollutantTypeId = pollutantTypeId;
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

	public Date getActiveDate() {
		return this.activeDate;
	}

	public void setActiveDate(Date activeDate) {
		this.activeDate = activeDate;
	}

	public String getPeriodId() {
		return this.periodId;
	}

	public void setPeriodId(String periodId) {
		this.periodId = periodId;
	}

	public byte getSewageDischargeId() {
		return this.sewageDischargeId;
	}

	public void setSewageDischargeId(byte sewageDischargeId) {
		this.sewageDischargeId = sewageDischargeId;
	}

	public String getSewagePlantId() {
		return this.sewagePlantId;
	}

	public void setSewagePlantId(String sewagePlantId) {
		this.sewagePlantId = sewagePlantId;
	}

	public String getValleyId() {
		return this.valleyId;
	}

	public void setValleyId(String valleyId) {
		this.valleyId = valleyId;
	}

	public String getIndustryCategoryId() {
		return this.industryCategoryId;
	}

	public void setIndustryCategoryId(String industryCategoryId) {
		this.industryCategoryId = industryCategoryId;
	}

	public String getDischargeLetoutLocation() {
		return this.dischargeLetoutLocation;
	}

	public void setDischargeLetoutLocation(String dischargeLetoutLocation) {
		this.dischargeLetoutLocation = dischargeLetoutLocation;
	}

	public String getSoundLetoutType() {
		return this.soundLetoutType;
	}

	public void setSoundLetoutType(String soundLetoutType) {
		this.soundLetoutType = soundLetoutType;
	}

	public byte getIsWorkship() {
		return this.isWorkship;
	}

	public void setIsWorkship(byte isWorkship) {
		this.isWorkship = isWorkship;
	}

	public double getExceedStandardMultipe() {
		return this.exceedStandardMultipe;
	}

	public void setExceedStandardMultipe(double exceedStandardMultipe) {
		this.exceedStandardMultipe = exceedStandardMultipe;
	}

	public double getGasLetoutHeight() {
		return this.gasLetoutHeight;
	}

	public void setGasLetoutHeight(double gasLetoutHeight) {
		this.gasLetoutHeight = gasLetoutHeight;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getFuelTypeId() {
		return this.fuelTypeId;
	}

	public void setFuelTypeId(String fuelTypeId) {
		this.fuelTypeId = fuelTypeId;
	}

	public double getDischargeValue() {
		return this.dischargeValue;
	}

	public void setDischargeValue(double dischargeValue) {
		this.dischargeValue = dischargeValue;
	}

	public String getDischargeLetoutId() {
		return this.dischargeLetoutId;
	}

	public void setDischargeLetoutId(String dischargeLetoutId) {
		this.dischargeLetoutId = dischargeLetoutId;
	}

	public String getDischargeLetoutTypeId() {
		return this.dischargeLetoutTypeId;
	}

	public void setDischargeLetoutTypeId(String dischargeLetoutTypeId) {
		this.dischargeLetoutTypeId = dischargeLetoutTypeId;
	}

	public String getInstrumentName() {
		return this.instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	public String getWorkshopName() {
		return this.workshopName;
	}

	public void setWorkshopName(String workshopName) {
		this.workshopName = workshopName;
	}

	public byte getIsTwoControlZones() {
		return this.isTwoControlZones;
	}

	public void setIsTwoControlZones(byte isTwoControlZones) {
		this.isTwoControlZones = isTwoControlZones;
	}

	public String getDischargeRuleId() {
		return this.dischargeRuleId;
	}

	public void setDischargeRuleId(String dischargeRuleId) {
		this.dischargeRuleId = dischargeRuleId;
	}

	public String getDischargeMonth() {
		return this.dischargeMonth;
	}

	public void setDischargeMonth(String dischargeMonth) {
		this.dischargeMonth = dischargeMonth;
	}

	public byte getDischargeType() {
		return this.dischargeType;
	}

	public void setDischargeType(byte dischargeType) {
		this.dischargeType = dischargeType;
	}

	public String getEquipmentName() {
		return this.equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getBurnTypeId() {
		return this.burnTypeId;
	}

	public void setBurnTypeId(String burnTypeId) {
		this.burnTypeId = burnTypeId;
	}

	public byte getBurnPurpose() {
		return this.burnPurpose;
	}

	public void setBurnPurpose(byte burnPurpose) {
		this.burnPurpose = burnPurpose;
	}

	public String getGasIndex() {
		return this.gasIndex;
	}

	public void setGasIndex(String gasIndex) {
		this.gasIndex = gasIndex;
	}

	public byte getStandardLevel() {
		return this.standardLevel;
	}

	public void setStandardLevel(byte standardLevel) {
		this.standardLevel = standardLevel;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getControlZoneId() {
		return this.controlZoneId;
	}

	public void setControlZoneId(String controlZoneId) {
		this.controlZoneId = controlZoneId;
	}

	public String getValleyFunctionId() {
		return this.valleyFunctionId;
	}

	public void setValleyFunctionId(String valleyFunctionId) {
		this.valleyFunctionId = valleyFunctionId;
	}

	public String getGasFunctionTypeId() {
		return this.gasFunctionTypeId;
	}

	public void setGasFunctionTypeId(String gasFunctionTypeId) {
		this.gasFunctionTypeId = gasFunctionTypeId;
	}

	public String getDtuId() {
		return this.dtuId;
	}

	public void setDtuId(String dtuId) {
		this.dtuId = dtuId;
	}

	public String getMonitorPath() {
		return this.monitorPath;
	}

	public void setMonitorPath(String monitorPath) {
		this.monitorPath = monitorPath;
	}

	public double getCurrentValue() {
		return this.currentValue;
	}

	public void setCurrentValue(double currentValue) {
		this.currentValue = currentValue;
	}

	public byte getIsAlarm() {
		return this.isAlarm;
	}

	public void setIsAlarm(byte isAlarm) {
		this.isAlarm = isAlarm;
	}

	public double getEntranceDischargeValue() {
		return this.entranceDischargeValue;
	}

	public void setEntranceDischargeValue(double entranceDischargeValue) {
		this.entranceDischargeValue = entranceDischargeValue;
	}

	public Date getStorageDate() {
		return this.storageDate;
	}

	public void setStorageDate(Date storageDate) {
		this.storageDate = storageDate;
	}

	public double getTotalDischarge() {
		return this.totalDischarge;
	}

	public void setTotalDischarge(double totalDischarge) {
		this.totalDischarge = totalDischarge;
	}

	public double getConcentrationOfEntrance() {
		return this.concentrationOfEntrance;
	}

	public void setConcentrationOfEntrance(double concentrationOfEntrance) {
		this.concentrationOfEntrance = concentrationOfEntrance;
	}

	public String getKeyPointType() {
		return this.keyPointType;
	}

	public void setKeyPointType(String keyPointType) {
		this.keyPointType = keyPointType;
	}

	public double getDesignSize() {
		return this.designSize;
	}

	public void setDesignSize(double designSize) {
		this.designSize = designSize;
	}

	public double getCapacityOfSulfurRemoval() {
		return this.capacityOfSulfurRemoval;
	}

	public void setCapacityOfSulfurRemoval(double capacityOfSulfurRemoval) {
		this.capacityOfSulfurRemoval = capacityOfSulfurRemoval;
	}

	public double getSamplingPointHeigh() {
		return this.samplingPointHeigh;
	}

	public void setSamplingPointHeigh(double samplingPointHeigh) {
		this.samplingPointHeigh = samplingPointHeigh;
	}

	public String getEntranceId() {
		return this.entranceId;
	}

	public void setEntranceId(String entranceId) {
		this.entranceId = entranceId;
	}

	public double getTheoreticalFlow() {
		return this.theoreticalFlow;
	}

	public void setTheoreticalFlow(double theoreticalFlow) {
		this.theoreticalFlow = theoreticalFlow;
	}

	public String getSmallId() {
		return this.smallId;
	}

	public void setSmallId(String smallId) {
		this.smallId = smallId;
	}

	public String getParentVarch() {
		return this.parentVarch;
	}

	public void setParentVarch(String parentVarch) {
		this.parentVarch = parentVarch;
	}

}