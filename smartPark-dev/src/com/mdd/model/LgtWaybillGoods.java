package com.mdd.model;

import java.util.Date;

/**
 * LgtWaybillGoods entity. @author MyEclipse Persistence Tools
 */

public class LgtWaybillGoods implements java.io.Serializable {

	// Fields

	private String lid;
	private String shippingNoteNo;
	private String commodityName;
	private String packaging;
	private String lnumber;
	private String weight;
	private String volume;
	private String specification;
	private String shippingNoteId;
	private String founder;
	private Date foundationDate;
	private String modifier;
	private Date modifyDate;
	private String logicallyDeleted;
	private String batch;

	// Constructors

	/** default constructor */
	public LgtWaybillGoods() {
		lid = "";
		shippingNoteNo = "";
		commodityName = "";
		packaging = "";
		lnumber = "";
		weight = "";
		volume = "";
		specification = "";
		shippingNoteId = "";
		founder = "";
		foundationDate = new Date();
		modifier = "";
		modifyDate = new Date();
		logicallyDeleted = "";
		batch = "";
	}

	/** full constructor */
	public LgtWaybillGoods(String shippingNoteNo, String commodityName,
			String packaging, String lnumber, String weight, String volume,
			String specification, String shippingNoteId, String founder,
			Date foundationDate, String modifier, Date modifyDate,
			String logicallyDeleted, String batch) {
		this.shippingNoteNo = shippingNoteNo;
		this.commodityName = commodityName;
		this.packaging = packaging;
		this.lnumber = lnumber;
		this.weight = weight;
		this.volume = volume;
		this.specification = specification;
		this.shippingNoteId = shippingNoteId;
		this.founder = founder;
		this.foundationDate = foundationDate;
		this.modifier = modifier;
		this.modifyDate = modifyDate;
		this.logicallyDeleted = logicallyDeleted;
		this.batch = batch;
	}

	// Property accessors

	public String getLid() {
		return this.lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getShippingNoteNo() {
		return this.shippingNoteNo;
	}

	public void setShippingNoteNo(String shippingNoteNo) {
		this.shippingNoteNo = shippingNoteNo;
	}

	public String getCommodityName() {
		return this.commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getPackaging() {
		return this.packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public String getLnumber() {
		return this.lnumber;
	}

	public void setLnumber(String lnumber) {
		this.lnumber = lnumber;
	}

	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getVolume() {
		return this.volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getSpecification() {
		return this.specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getShippingNoteId() {
		return this.shippingNoteId;
	}

	public void setShippingNoteId(String shippingNoteId) {
		this.shippingNoteId = shippingNoteId;
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

	public String getBatch() {
		return this.batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

}