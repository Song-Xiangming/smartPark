package com.mdd.model;

import java.util.Date;

/**
 * EnvCoreEntPollutant entity. @author MyEclipse Persistence Tools
 */

public class EnvCoreEntPollutant implements java.io.Serializable {

	// Fields

	private String enterpriseId;
	private long id;
	private String pollId;
	private String standardTypeId;
	private String industryCategoryId;
	private byte standardLevel;
	private String range;
	private double standardValue;
	private byte flag;
	private String remark;
	private String pollutantTypeId;
	private double alarmFloorLevel;
	private double alarmUpperLevel;
	private byte isAlarm;
	private double currentValue;
	private byte isChkAlm;
	private Date alarmChangeTime;
	private Date storageDate;
	private double factor;
	private String smpWayId;
	private String msrWayId;
	private double measureLower;
	private double measureUpper;
	private double zeroLetDevi;
	private double avgLetDevi;
	private double macLetDevi;
	private double avgValue;
	private byte updateFlag;
	private double standardRate;
	private byte isCheck;

	// Constructors

	/** default constructor */
	public EnvCoreEntPollutant() {
		enterpriseId = "";
		long id = 0;
		pollId = "";
		standardTypeId = "";
		industryCategoryId = "";
		standardLevel = 0;
		range = "";
		standardValue = 0.0;
		flag = 0;
		remark = "";
		pollutantTypeId = "";
		alarmFloorLevel = 0.0;
		alarmUpperLevel = 0.0;
		isAlarm = 0;
		currentValue = 0.0;
		isChkAlm = 0;
		alarmChangeTime = new Date();
		storageDate = new Date();
		factor = 0.0;
		smpWayId = "";
		msrWayId = "";
		measureLower = 0.0;
		measureUpper = 0.0;
		zeroLetDevi = 0.0;
		avgLetDevi = 0.0;
		macLetDevi = 0.0;
		avgValue = 0.0;
		updateFlag = 0;
		standardRate = 0.0;
		isCheck = 0;
	}

	/** full constructor */
	public EnvCoreEntPollutant(long id, String pollId, String standardTypeId,
			String industryCategoryId, byte standardLevel, String range,
			double standardValue, byte flag, String remark,
			String pollutantTypeId, double alarmFloorLevel,
			double alarmUpperLevel, byte isAlarm, double currentValue,
			byte isChkAlm, Date alarmChangeTime, Date storageDate,
			double factor, String smpWayId, String msrWayId,
			double measureLower, double measureUpper, double zeroLetDevi,
			double avgLetDevi, double macLetDevi, double avgValue,
			byte updateFlag, double standardRate, byte isCheck) {
		this.id = id;
		this.pollId = pollId;
		this.standardTypeId = standardTypeId;
		this.industryCategoryId = industryCategoryId;
		this.standardLevel = standardLevel;
		this.range = range;
		this.standardValue = standardValue;
		this.flag = flag;
		this.remark = remark;
		this.pollutantTypeId = pollutantTypeId;
		this.alarmFloorLevel = alarmFloorLevel;
		this.alarmUpperLevel = alarmUpperLevel;
		this.isAlarm = isAlarm;
		this.currentValue = currentValue;
		this.isChkAlm = isChkAlm;
		this.alarmChangeTime = alarmChangeTime;
		this.storageDate = storageDate;
		this.factor = factor;
		this.smpWayId = smpWayId;
		this.msrWayId = msrWayId;
		this.measureLower = measureLower;
		this.measureUpper = measureUpper;
		this.zeroLetDevi = zeroLetDevi;
		this.avgLetDevi = avgLetDevi;
		this.macLetDevi = macLetDevi;
		this.avgValue = avgValue;
		this.updateFlag = updateFlag;
		this.standardRate = standardRate;
		this.isCheck = isCheck;
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

	public String getPollId() {
		return this.pollId;
	}

	public void setPollId(String pollId) {
		this.pollId = pollId;
	}

	public String getStandardTypeId() {
		return this.standardTypeId;
	}

	public void setStandardTypeId(String standardTypeId) {
		this.standardTypeId = standardTypeId;
	}

	public String getIndustryCategoryId() {
		return this.industryCategoryId;
	}

	public void setIndustryCategoryId(String industryCategoryId) {
		this.industryCategoryId = industryCategoryId;
	}

	public byte getStandardLevel() {
		return this.standardLevel;
	}

	public void setStandardLevel(byte standardLevel) {
		this.standardLevel = standardLevel;
	}

	public String getRange() {
		return this.range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public double getStandardValue() {
		return this.standardValue;
	}

	public void setStandardValue(double standardValue) {
		this.standardValue = standardValue;
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

	public String getPollutantTypeId() {
		return this.pollutantTypeId;
	}

	public void setPollutantTypeId(String pollutantTypeId) {
		this.pollutantTypeId = pollutantTypeId;
	}

	public double getAlarmFloorLevel() {
		return this.alarmFloorLevel;
	}

	public void setAlarmFloorLevel(double alarmFloorLevel) {
		this.alarmFloorLevel = alarmFloorLevel;
	}

	public double getAlarmUpperLevel() {
		return this.alarmUpperLevel;
	}

	public void setAlarmUpperLevel(double alarmUpperLevel) {
		this.alarmUpperLevel = alarmUpperLevel;
	}

	public byte getIsAlarm() {
		return this.isAlarm;
	}

	public void setIsAlarm(byte isAlarm) {
		this.isAlarm = isAlarm;
	}

	public double getCurrentValue() {
		return this.currentValue;
	}

	public void setCurrentValue(double currentValue) {
		this.currentValue = currentValue;
	}

	public byte getIsChkAlm() {
		return this.isChkAlm;
	}

	public void setIsChkAlm(byte isChkAlm) {
		this.isChkAlm = isChkAlm;
	}

	public Date getAlarmChangeTime() {
		return this.alarmChangeTime;
	}

	public void setAlarmChangeTime(Date alarmChangeTime) {
		this.alarmChangeTime = alarmChangeTime;
	}

	public Date getStorageDate() {
		return this.storageDate;
	}

	public void setStorageDate(Date storageDate) {
		this.storageDate = storageDate;
	}

	public double getFactor() {
		return this.factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}

	public String getSmpWayId() {
		return this.smpWayId;
	}

	public void setSmpWayId(String smpWayId) {
		this.smpWayId = smpWayId;
	}

	public String getMsrWayId() {
		return this.msrWayId;
	}

	public void setMsrWayId(String msrWayId) {
		this.msrWayId = msrWayId;
	}

	public double getMeasureLower() {
		return this.measureLower;
	}

	public void setMeasureLower(double measureLower) {
		this.measureLower = measureLower;
	}

	public double getMeasureUpper() {
		return this.measureUpper;
	}

	public void setMeasureUpper(double measureUpper) {
		this.measureUpper = measureUpper;
	}

	public double getZeroLetDevi() {
		return this.zeroLetDevi;
	}

	public void setZeroLetDevi(double zeroLetDevi) {
		this.zeroLetDevi = zeroLetDevi;
	}

	public double getAvgLetDevi() {
		return this.avgLetDevi;
	}

	public void setAvgLetDevi(double avgLetDevi) {
		this.avgLetDevi = avgLetDevi;
	}

	public double getMacLetDevi() {
		return this.macLetDevi;
	}

	public void setMacLetDevi(double macLetDevi) {
		this.macLetDevi = macLetDevi;
	}

	public double getAvgValue() {
		return this.avgValue;
	}

	public void setAvgValue(double avgValue) {
		this.avgValue = avgValue;
	}

	public byte getUpdateFlag() {
		return this.updateFlag;
	}

	public void setUpdateFlag(byte updateFlag) {
		this.updateFlag = updateFlag;
	}

	public double getStandardRate() {
		return this.standardRate;
	}

	public void setStandardRate(double standardRate) {
		this.standardRate = standardRate;
	}

	public byte getIsCheck() {
		return this.isCheck;
	}

	public void setIsCheck(byte isCheck) {
		this.isCheck = isCheck;
	}

}