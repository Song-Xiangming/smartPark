package com.mdd.model;

import java.util.Date;

/**
 * EnvMonitorGasAlarm24hours entity. @author MyEclipse Persistence Tools
 */

public class EnvMonitorGasAlarm24hours implements java.io.Serializable {

	// Fields

	private String dtuMn;
	private Date beginTime;
	private Date endTime;
	private String pollId;
	private byte flag;
	private String remark;

	// Constructors

	/** default constructor */
	public EnvMonitorGasAlarm24hours() {
		dtuMn = "";
		beginTime = new Date();
		endTime = new Date();
		pollId = "";
		flag = 0;
		remark = "";
	}

	/** full constructor */
	public EnvMonitorGasAlarm24hours(Date beginTime, Date endTime,
			String pollId, byte flag, String remark) {
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.pollId = pollId;
		this.flag = flag;
		this.remark = remark;
	}

	// Property accessors

	public String getDtuMn() {
		return this.dtuMn;
	}

	public void setDtuMn(String dtuMn) {
		this.dtuMn = dtuMn;
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

	public String getPollId() {
		return this.pollId;
	}

	public void setPollId(String pollId) {
		this.pollId = pollId;
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

}