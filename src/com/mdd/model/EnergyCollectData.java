package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * EnergyCollectData entity. @author MyEclipse Persistence Tools
 */

public class EnergyCollectData implements java.io.Serializable {

	// Fields

	private String eid;
	private String uploadType;
	private String subsystemId;
	private String collectorId;
	private String dataSequence;
	private String terminalId;
	private String spotId;
	private String coding;
	private BigDecimal collectValue;
	private Date createTime;
	private Date sampleTime;
	private String remove;

	// Constructors

	/** default constructor */
	public EnergyCollectData() {
		eid = "";
		uploadType = "";
		subsystemId = "";
		collectorId = "";
		dataSequence = "";
		terminalId = "";
		spotId = "";
		coding = "";
		collectValue = new BigDecimal(0);
		createTime = new Date();
		sampleTime = new Date();
		remove = "";
	}

	/** minimal constructor */
	public EnergyCollectData(String eid) {
		this.eid = eid;
	}

	/** full constructor */
	public EnergyCollectData(String eid, String uploadType, String subsystemId,
			String collectorId, String dataSequence, String terminalId,
			String spotId, String coding, BigDecimal collectValue,
			Date createTime, Date sampleTime, String remove) {
		this.eid = eid;
		this.uploadType = uploadType;
		this.subsystemId = subsystemId;
		this.collectorId = collectorId;
		this.dataSequence = dataSequence;
		this.terminalId = terminalId;
		this.spotId = spotId;
		this.coding = coding;
		this.collectValue = collectValue;
		this.createTime = createTime;
		this.sampleTime = sampleTime;
		this.remove = remove;
	}

	// Property accessors

	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getUploadType() {
		return this.uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}

	public String getSubsystemId() {
		return this.subsystemId;
	}

	public void setSubsystemId(String subsystemId) {
		this.subsystemId = subsystemId;
	}

	public String getCollectorId() {
		return this.collectorId;
	}

	public void setCollectorId(String collectorId) {
		this.collectorId = collectorId;
	}

	public String getDataSequence() {
		return this.dataSequence;
	}

	public void setDataSequence(String dataSequence) {
		this.dataSequence = dataSequence;
	}

	public String getTerminalId() {
		return this.terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getSpotId() {
		return this.spotId;
	}

	public void setSpotId(String spotId) {
		this.spotId = spotId;
	}

	public String getCoding() {
		return this.coding;
	}

	public void setCoding(String coding) {
		this.coding = coding;
	}

	public BigDecimal getCollectValue() {
		return this.collectValue;
	}

	public void setCollectValue(BigDecimal collectValue) {
		this.collectValue = collectValue;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getSampleTime() {
		return this.sampleTime;
	}

	public void setSampleTime(Date sampleTime) {
		this.sampleTime = sampleTime;
	}

	public String getRemove() {
		return this.remove;
	}

	public void setRemove(String remove) {
		this.remove = remove;
	}

}