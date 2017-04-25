package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * LgtGoodsSourceInfo entity. @author MyEclipse Persistence Tools
 */

public class LgtGoodsSourceInfo implements java.io.Serializable {

	// Fields

	private String lid;
	private String goodsSourceSendedId;
	private String goodsNo;
	private String goodsName;
	private String packaging;
	private BigDecimal lnumber;
	private double weight;
	private double unitPrice;
	private double goodsValue;
	private String vehicleNeeded;
	private double vehicleLenthNeeded;
	private String founder;
	private Date foundationDate;
	private String modifier;
	private Date modifyDate;
	private String logicallyDeleted;
	private double volume;

	// Constructors

	/** default constructor */
	public LgtGoodsSourceInfo() {
		lid = "";
		goodsSourceSendedId = "";
		goodsNo = "";
		goodsName = "";
		packaging = "";
		lnumber = new BigDecimal(0);
		weight = 0.0;
		unitPrice = 0.0;
		goodsValue = 0.0;
		vehicleNeeded = "";
		vehicleLenthNeeded = 0.0;
		founder = "";
		foundationDate = new Date();
		modifier = "";
		modifyDate = new Date();
		logicallyDeleted = "";
		volume = 0.0;
	}

	/** full constructor */
	public LgtGoodsSourceInfo(String goodsSourceSendedId, String goodsNo,
			String goodsName, String packaging, BigDecimal lnumber,
			double weight, double unitPrice, double goodsValue,
			String vehicleNeeded, double vehicleLenthNeeded, String founder,
			Date foundationDate, String modifier, Date modifyDate,
			String logicallyDeleted, double volume) {
		this.goodsSourceSendedId = goodsSourceSendedId;
		this.goodsNo = goodsNo;
		this.goodsName = goodsName;
		this.packaging = packaging;
		this.lnumber = lnumber;
		this.weight = weight;
		this.unitPrice = unitPrice;
		this.goodsValue = goodsValue;
		this.vehicleNeeded = vehicleNeeded;
		this.vehicleLenthNeeded = vehicleLenthNeeded;
		this.founder = founder;
		this.foundationDate = foundationDate;
		this.modifier = modifier;
		this.modifyDate = modifyDate;
		this.logicallyDeleted = logicallyDeleted;
		this.volume = volume;
	}

	// Property accessors

	public String getLid() {
		return this.lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getGoodsSourceSendedId() {
		return this.goodsSourceSendedId;
	}

	public void setGoodsSourceSendedId(String goodsSourceSendedId) {
		this.goodsSourceSendedId = goodsSourceSendedId;
	}

	public String getGoodsNo() {
		return this.goodsNo;
	}

	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getPackaging() {
		return this.packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public BigDecimal getLnumber() {
		return this.lnumber;
	}

	public void setLnumber(BigDecimal lnumber) {
		this.lnumber = lnumber;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getGoodsValue() {
		return this.goodsValue;
	}

	public void setGoodsValue(double goodsValue) {
		this.goodsValue = goodsValue;
	}

	public String getVehicleNeeded() {
		return this.vehicleNeeded;
	}

	public void setVehicleNeeded(String vehicleNeeded) {
		this.vehicleNeeded = vehicleNeeded;
	}

	public double getVehicleLenthNeeded() {
		return this.vehicleLenthNeeded;
	}

	public void setVehicleLenthNeeded(double vehicleLenthNeeded) {
		this.vehicleLenthNeeded = vehicleLenthNeeded;
	}

	public String getFounder() {
		return this.founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public Date getFoundationDate() {
		return this.foundationDate;
	}

	public void setFoundationDate(Date foundationDate) {
		this.foundationDate = foundationDate;
	}

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getLogicallyDeleted() {
		return this.logicallyDeleted;
	}

	public void setLogicallyDeleted(String logicallyDeleted) {
		this.logicallyDeleted = logicallyDeleted;
	}

	public double getVolume() {
		return this.volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

}