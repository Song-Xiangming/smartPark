package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * EnergyCollectData entity. @author MyEclipse Persistence Tools
 */

public class EnergyCollectData implements java.io.Serializable {

	// Fields

	private String id;
	private String subsystemId;
	private String spotId;
	private String coding;
	private BigDecimal value;
	private Date createTime;
	private String remove;
	private Date sampleTime;

	// Constructors

	/** default constructor */
	public EnergyCollectData() {
		id = "";
		subsystemId = "";
		spotId = "";
		coding = "";
		value = new BigDecimal(0);
		createTime = new Date();
		remove = "";
		sampleTime = new Date();
	}

	/** full constructor */
	public EnergyCollectData(String subsystemId, String spotId, String coding,
			BigDecimal value, Date createTime, String remove, Date sampleTime) {
		this.subsystemId = subsystemId;
		this.spotId = spotId;
		this.coding = coding;
		this.value = value;
		this.createTime = createTime;
		this.remove = remove;
		this.sampleTime = sampleTime;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubsystemId() {
		return this.subsystemId;
	}

	public void setSubsystemId(String subsystemId) {
		this.subsystemId = subsystemId;
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

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRemove() {
		return this.remove;
	}

	public void setRemove(String remove) {
		this.remove = remove;
	}

	public Date getSampleTime() {
		return this.sampleTime;
	}

	public void setSampleTime(Date sampleTime) {
		this.sampleTime = sampleTime;
	}

}