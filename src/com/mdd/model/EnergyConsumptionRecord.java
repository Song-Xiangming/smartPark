package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * EnergyConsumptionRecord entity. @author MyEclipse Persistence Tools
 */

public class EnergyConsumptionRecord implements java.io.Serializable {

	// Fields

	private String eid;
	private String subsystemId;
	private Date sampleTime;
	private String dataOrigin;
	private String coding;
	private BigDecimal collectValue;
	private Date createTime;
	private String remove;

	// Constructors

	/** default constructor */
	public EnergyConsumptionRecord() {
		eid = "";
		subsystemId = "";
		sampleTime = new Date();
		dataOrigin = "";
		coding = "";
		collectValue = new BigDecimal(0);
		createTime = new Date();
		remove = "";
	}

	/** full constructor */
	public EnergyConsumptionRecord(String subsystemId, Date sampleTime,
			String dataOrigin, String coding, BigDecimal collectValue,
			Date createTime, String remove) {
		this.subsystemId = subsystemId;
		this.sampleTime = sampleTime;
		this.dataOrigin = dataOrigin;
		this.coding = coding;
		this.collectValue = collectValue;
		this.createTime = createTime;
		this.remove = remove;
	}

	// Property accessors

	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getSubsystemId() {
		return this.subsystemId;
	}

	public void setSubsystemId(String subsystemId) {
		this.subsystemId = subsystemId;
	}

	public Date getSampleTime() {
		return this.sampleTime;
	}

	public void setSampleTime(Date sampleTime) {
		this.sampleTime = sampleTime;
	}

	public String getDataOrigin() {
		return this.dataOrigin;
	}

	public void setDataOrigin(String dataOrigin) {
		this.dataOrigin = dataOrigin;
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

	public String getRemove() {
		return this.remove;
	}

	public void setRemove(String remove) {
		this.remove = remove;
	}

}