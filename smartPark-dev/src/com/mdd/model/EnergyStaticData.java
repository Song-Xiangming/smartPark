package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * EnergyStaticData entity. @author MyEclipse Persistence Tools
 */

public class EnergyStaticData implements java.io.Serializable {

	// Fields

	private String id;
	private String corporateCode;
	private BigDecimal electric;
	private BigDecimal makeElectric;
	private BigDecimal water;
	private BigDecimal naturalGas;
	private BigDecimal rawCoal;
	private BigDecimal energyLose;
	private String statisticYearMon;
	private String fileId;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;

	// Constructors

	/** default constructor */
	public EnergyStaticData() {
		id = "";
		corporateCode = "";
		electric = new BigDecimal(0);
		makeElectric = new BigDecimal(0);
		water = new BigDecimal(0);
		naturalGas = new BigDecimal(0);
		rawCoal = new BigDecimal(0);
		energyLose = new BigDecimal(0);
		statisticYearMon = "";
		fileId = "";
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
	}

	/** full constructor */
	public EnergyStaticData(String corporateCode, BigDecimal electric,
			BigDecimal makeElectric, BigDecimal water, BigDecimal naturalGas,
			BigDecimal rawCoal, BigDecimal energyLose, String statisticYearMon,
			String fileId, String createBy, Date createTime, String updateBy,
			Date updateTime, String remove) {
		this.corporateCode = corporateCode;
		this.electric = electric;
		this.makeElectric = makeElectric;
		this.water = water;
		this.naturalGas = naturalGas;
		this.rawCoal = rawCoal;
		this.energyLose = energyLose;
		this.statisticYearMon = statisticYearMon;
		this.fileId = fileId;
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

	public BigDecimal getElectric() {
		return this.electric;
	}

	public void setElectric(BigDecimal electric) {
		this.electric = electric;
	}

	public BigDecimal getMakeElectric() {
		return this.makeElectric;
	}

	public void setMakeElectric(BigDecimal makeElectric) {
		this.makeElectric = makeElectric;
	}

	public BigDecimal getWater() {
		return this.water;
	}

	public void setWater(BigDecimal water) {
		this.water = water;
	}

	public BigDecimal getNaturalGas() {
		return this.naturalGas;
	}

	public void setNaturalGas(BigDecimal naturalGas) {
		this.naturalGas = naturalGas;
	}

	public BigDecimal getRawCoal() {
		return this.rawCoal;
	}

	public void setRawCoal(BigDecimal rawCoal) {
		this.rawCoal = rawCoal;
	}

	public BigDecimal getEnergyLose() {
		return this.energyLose;
	}

	public void setEnergyLose(BigDecimal energyLose) {
		this.energyLose = energyLose;
	}

	public String getStatisticYearMon() {
		return this.statisticYearMon;
	}

	public void setStatisticYearMon(String statisticYearMon) {
		this.statisticYearMon = statisticYearMon;
	}

	public String getFileId() {
		return this.fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
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