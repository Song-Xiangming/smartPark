package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * EnergyAlarmInterval entity. @author MyEclipse Persistence Tools
 */

public class EnergyAlarmInterval implements java.io.Serializable {

	// Fields

	private String id;
	private String type;
	private BigDecimal intervalValues;
	private String createBy;
	private Date createTime;
	private String remove;

	// Constructors

	/** default constructor */
	public EnergyAlarmInterval() {
		id = "";
		type = "";
		intervalValues = new BigDecimal(0);
		createBy = "";
		createTime = new Date();
		remove = "";
	}

	/** full constructor */
	public EnergyAlarmInterval(String type, BigDecimal intervalValues,
			String createBy, Date createTime, String remove) {
		this.type = type;
		this.intervalValues = intervalValues;
		this.createBy = createBy;
		this.createTime = createTime;
		this.remove = remove;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getIntervalValues() {
		return this.intervalValues;
	}

	public void setIntervalValues(BigDecimal intervalValues) {
		this.intervalValues = intervalValues;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
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