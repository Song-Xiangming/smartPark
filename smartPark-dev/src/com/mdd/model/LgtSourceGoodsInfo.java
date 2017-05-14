package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * LgtSourceGoodsInfo entity. @author MyEclipse Persistence Tools
 */

public class LgtSourceGoodsInfo implements java.io.Serializable {

	// Fields

	private String id;
	private String srcGoodsId;
	private String goodsSerialNo;
	private String goodsName;
	private String pack;
	private BigDecimal amount;
	private BigDecimal weight;
	private BigDecimal unitPrice;
	private BigDecimal goodsWorth;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;

	// Constructors

	/** default constructor */
	public LgtSourceGoodsInfo() {
		id = "";
		srcGoodsId = "";
		goodsSerialNo = "";
		goodsName = "";
		pack = "";
		amount = new BigDecimal(0);
		weight = new BigDecimal(0);
		unitPrice = new BigDecimal(0);
		goodsWorth = new BigDecimal(0);
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
	}

	/** full constructor */
	public LgtSourceGoodsInfo(String srcGoodsId, String goodsSerialNo,
			String goodsName, String pack, BigDecimal amount,
			BigDecimal weight, BigDecimal unitPrice, BigDecimal goodsWorth,
			String createBy, Date createTime, String updateBy, Date updateTime,
			String remove) {
		this.srcGoodsId = srcGoodsId;
		this.goodsSerialNo = goodsSerialNo;
		this.goodsName = goodsName;
		this.pack = pack;
		this.amount = amount;
		this.weight = weight;
		this.unitPrice = unitPrice;
		this.goodsWorth = goodsWorth;
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

	public String getSrcGoodsId() {
		return this.srcGoodsId;
	}

	public void setSrcGoodsId(String srcGoodsId) {
		this.srcGoodsId = srcGoodsId;
	}

	public String getGoodsSerialNo() {
		return this.goodsSerialNo;
	}

	public void setGoodsSerialNo(String goodsSerialNo) {
		this.goodsSerialNo = goodsSerialNo;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getPack() {
		return this.pack;
	}

	public void setPack(String pack) {
		this.pack = pack;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getGoodsWorth() {
		return this.goodsWorth;
	}

	public void setGoodsWorth(BigDecimal goodsWorth) {
		this.goodsWorth = goodsWorth;
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