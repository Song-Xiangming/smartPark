package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * EnergySupplyEnergyUnitData entity. @author MyEclipse Persistence Tools
 */

public class EnergySupplyEnergyUnitData implements java.io.Serializable {

	// Fields

	private String id;
	private String corporateCode;
	private BigDecimal useElectricValue;
	private BigDecimal useWaterValue;
	private BigDecimal useVapourValue;
	private BigDecimal useGasValue;
	private String statisticYearMon;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;
	private BigDecimal selfElectricValue;

	// Constructors

	/** default constructor */
	public EnergySupplyEnergyUnitData() {
		id = "";
		corporateCode = "";
		useElectricValue = new BigDecimal(0);
		useWaterValue = new BigDecimal(0);
		useVapourValue = new BigDecimal(0);
		useGasValue = new BigDecimal(0);
		statisticYearMon = "";
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
		selfElectricValue = new BigDecimal(0);
	}

	/** full constructor */
	public EnergySupplyEnergyUnitData(String corporateCode,
			BigDecimal useElectricValue, BigDecimal useWaterValue,
			BigDecimal useVapourValue, BigDecimal useGasValue,
			String statisticYearMon, String createBy, Date createTime,
			String updateBy, Date updateTime, String remove,
			BigDecimal selfElectricValue) {
		this.corporateCode = corporateCode;
		this.useElectricValue = useElectricValue;
		this.useWaterValue = useWaterValue;
		this.useVapourValue = useVapourValue;
		this.useGasValue = useGasValue;
		this.statisticYearMon = statisticYearMon;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.remove = remove;
		this.selfElectricValue = selfElectricValue;
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

	public BigDecimal getUseElectricValue() {
		return this.useElectricValue;
	}

	public void setUseElectricValue(BigDecimal useElectricValue) {
		this.useElectricValue = useElectricValue;
	}

	public BigDecimal getUseWaterValue() {
		return this.useWaterValue;
	}

	public void setUseWaterValue(BigDecimal useWaterValue) {
		this.useWaterValue = useWaterValue;
	}

	public BigDecimal getUseVapourValue() {
		return this.useVapourValue;
	}

	public void setUseVapourValue(BigDecimal useVapourValue) {
		this.useVapourValue = useVapourValue;
	}

	public BigDecimal getUseGasValue() {
		return this.useGasValue;
	}

	public void setUseGasValue(BigDecimal useGasValue) {
		this.useGasValue = useGasValue;
	}

	public String getStatisticYearMon() {
		return this.statisticYearMon;
	}

	public void setStatisticYearMon(String statisticYearMon) {
		this.statisticYearMon = statisticYearMon;
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

	public BigDecimal getSelfElectricValue() {
		return this.selfElectricValue;
	}

	public void setSelfElectricValue(BigDecimal selfElectricValue) {
		this.selfElectricValue = selfElectricValue;
	}

}