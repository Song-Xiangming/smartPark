package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * EnvMonitorAlarmLog entity. @author MyEclipse Persistence Tools
 */

public class EnvMonitorAlarmLog implements java.io.Serializable {

	// Fields

	private String mn;
	private String enterpriseId;
	private String dataType;
	private String dechargeLetoutId;
	private String pollId;
	private String pollType;
	private String commCode;
	private double dataval;
	private Date beginTime;
	private Date endTime;
	private byte status;
	private byte flag;
	private String remark;
	private BigDecimal alarmId;
	private String alarmLevel;
	private byte dataIsAviliable;

	// Constructors

	/** default constructor */
	public EnvMonitorAlarmLog() {
		mn = "";
		enterpriseId = "";
		dataType = "";
		dechargeLetoutId = "";
		pollId = "";
		pollType = "";
		commCode = "";
		dataval = 0.0;
		beginTime = new Date();
		endTime = new Date();
		status = 0;
		flag = 0;
		remark = "";
		alarmId = new BigDecimal(0);
		alarmLevel = "";
		dataIsAviliable = 0;
	}

	/** full constructor */
	public EnvMonitorAlarmLog(String enterpriseId, String dataType,
			String dechargeLetoutId, String pollId, String pollType,
			String commCode, double dataval, Date beginTime, Date endTime,
			byte status, byte flag, String remark, BigDecimal alarmId,
			String alarmLevel, byte dataIsAviliable) {
		this.enterpriseId = enterpriseId;
		this.dataType = dataType;
		this.dechargeLetoutId = dechargeLetoutId;
		this.pollId = pollId;
		this.pollType = pollType;
		this.commCode = commCode;
		this.dataval = dataval;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.status = status;
		this.flag = flag;
		this.remark = remark;
		this.alarmId = alarmId;
		this.alarmLevel = alarmLevel;
		this.dataIsAviliable = dataIsAviliable;
	}

	// Property accessors

	public String getMn() {
		return this.mn;
	}

	public void setMn(String mn) {
		this.mn = mn;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDechargeLetoutId() {
		return this.dechargeLetoutId;
	}

	public void setDechargeLetoutId(String dechargeLetoutId) {
		this.dechargeLetoutId = dechargeLetoutId;
	}

	public String getPollId() {
		return this.pollId;
	}

	public void setPollId(String pollId) {
		this.pollId = pollId;
	}

	public String getPollType() {
		return this.pollType;
	}

	public void setPollType(String pollType) {
		this.pollType = pollType;
	}

	public String getCommCode() {
		return this.commCode;
	}

	public void setCommCode(String commCode) {
		this.commCode = commCode;
	}

	public double getDataval() {
		return this.dataval;
	}

	public void setDataval(double dataval) {
		this.dataval = dataval;
	}

	public Date getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
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

	public BigDecimal getAlarmId() {
		return this.alarmId;
	}

	public void setAlarmId(BigDecimal alarmId) {
		this.alarmId = alarmId;
	}

	public String getAlarmLevel() {
		return this.alarmLevel;
	}

	public void setAlarmLevel(String alarmLevel) {
		this.alarmLevel = alarmLevel;
	}

	public byte getDataIsAviliable() {
		return this.dataIsAviliable;
	}

	public void setDataIsAviliable(byte dataIsAviliable) {
		this.dataIsAviliable = dataIsAviliable;
	}

}