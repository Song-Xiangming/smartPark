package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * LgtPipeLocation entity. @author MyEclipse Persistence Tools
 */

public class LgtPipeLocation implements java.io.Serializable {

	// Fields

	private String id;
	private String pipeNo;
	private BigDecimal longitude;
	private BigDecimal latitude;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;
	private String pipeType;

	// Constructors

	/** default constructor */
	public LgtPipeLocation() {
		id = "";
		pipeNo = "";
		longitude = new BigDecimal(0);
		latitude = new BigDecimal(0);
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
		pipeType = "";
	}

	/** full constructor */
	public LgtPipeLocation(String pipeNo, BigDecimal longitude,
			BigDecimal latitude, String createBy, Date createTime,
			String updateBy, Date updateTime, String remove, String pipeType) {
		this.pipeNo = pipeNo;
		this.longitude = longitude;
		this.latitude = latitude;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.remove = remove;
		this.pipeType = pipeType;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPipeNo() {
		return this.pipeNo;
	}

	public void setPipeNo(String pipeNo) {
		this.pipeNo = pipeNo;
	}

	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
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

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getRemove() {
		return this.remove;
	}

	public void setRemove(String remove) {
		this.remove = remove;
	}

	public String getPipeType() {
		return this.pipeType;
	}

	public void setPipeType(String pipeType) {
		this.pipeType = pipeType;
	}

}