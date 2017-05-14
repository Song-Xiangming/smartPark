package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * EnergySynthesizeEnergyUse entity. @author MyEclipse Persistence Tools
 */

public class EnergySynthesizeEnergyUse implements java.io.Serializable {

	// Fields

	private String id;
	private String corporateCode;
	private String month;
	private BigDecimal synthesizeUse;
	private BigDecimal synthesizeCollect;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;

	// Constructors

	/** default constructor */
	public EnergySynthesizeEnergyUse() {
		id = "";
		corporateCode = "";
		month = "";
		synthesizeUse = new BigDecimal(0);
		synthesizeCollect = new BigDecimal(0);
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
	}

	/** full constructor */
	public EnergySynthesizeEnergyUse(String corporateCode, String month,
			BigDecimal synthesizeUse, BigDecimal synthesizeCollect,
			String createBy, Date createTime, String updateBy, Date updateTime,
			String remove) {
		this.corporateCode = corporateCode;
		this.month = month;
		this.synthesizeUse = synthesizeUse;
		this.synthesizeCollect = synthesizeCollect;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.remove = remove;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCorporateCode() {
		return this.corporateCode;
	}

	public void setCorporateCode(String corporateCode) {
		this.corporateCode = corporateCode;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public BigDecimal getSynthesizeUse() {
		return this.synthesizeUse;
	}

	public void setSynthesizeUse(BigDecimal synthesizeUse) {
		this.synthesizeUse = synthesizeUse;
	}

	public BigDecimal getSynthesizeCollect() {
		return this.synthesizeCollect;
	}

	public void setSynthesizeCollect(BigDecimal synthesizeCollect) {
		this.synthesizeCollect = synthesizeCollect;
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

}