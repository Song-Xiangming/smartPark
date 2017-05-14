package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * LgtSourceGoods entity. @author MyEclipse Persistence Tools
 */

public class LgtSourceGoods implements java.io.Serializable {

	// Fields

	private String id;
	private String waybilllNo;
	private Date endDate;
	private String senderAddr;
	private String senderCompany;
	private String senderTel;
	private String receiverAddr;
	private String receiverCompany;
	private String receiverTel;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;
	private String tradeStatus;
	private String hgCorporateNo;
	private String wlCorporateNo;
	private Date publishDate;
	private String orderNo;
	private Date orderDate;
	private String startPoint;
	private String endPoint;
	private String senderLinker;
	private String receiverLinker;
	private String carType;
	private BigDecimal carLength;

	// Constructors

	/** default constructor */
	public LgtSourceGoods() {
		id = "";
		waybilllNo = "";
		endDate = new Date();
		senderAddr = "";
		senderCompany = "";
		senderTel = "";
		receiverAddr = "";
		receiverCompany = "";
		receiverTel = "";
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
		tradeStatus = "";
		hgCorporateNo = "";
		wlCorporateNo = "";
		publishDate = new Date();
		orderNo = "";
		orderDate = new Date();
		startPoint = "";
		endPoint = "";
		senderLinker = "";
		receiverLinker = "";
		carType = "";
		carLength = new BigDecimal(0);
	}

	/** full constructor */
	public LgtSourceGoods(String waybilllNo, Date endDate, String senderAddr,
			String senderCompany, String senderTel, String receiverAddr,
			String receiverCompany, String receiverTel, String createBy,
			Date createTime, String updateBy, Date updateTime, String remove,
			String tradeStatus, String hgCorporateNo, String wlCorporateNo,
			Date publishDate, String orderNo, Date orderDate,
			String startPoint, String endPoint, String senderLinker,
			String receiverLinker, String carType, BigDecimal carLength) {
		this.waybilllNo = waybilllNo;
		this.endDate = endDate;
		this.senderAddr = senderAddr;
		this.senderCompany = senderCompany;
		this.senderTel = senderTel;
		this.receiverAddr = receiverAddr;
		this.receiverCompany = receiverCompany;
		this.receiverTel = receiverTel;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.remove = remove;
		this.tradeStatus = tradeStatus;
		this.hgCorporateNo = hgCorporateNo;
		this.wlCorporateNo = wlCorporateNo;
		this.publishDate = publishDate;
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.senderLinker = senderLinker;
		this.receiverLinker = receiverLinker;
		this.carType = carType;
		this.carLength = carLength;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWaybilllNo() {
		return this.waybilllNo;
	}

	public void setWaybilllNo(String waybilllNo) {
		this.waybilllNo = waybilllNo;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getSenderAddr() {
		return this.senderAddr;
	}

	public void setSenderAddr(String senderAddr) {
		this.senderAddr = senderAddr;
	}

	public String getSenderCompany() {
		return this.senderCompany;
	}

	public void setSenderCompany(String senderCompany) {
		this.senderCompany = senderCompany;
	}

	public String getSenderTel() {
		return this.senderTel;
	}

	public void setSenderTel(String senderTel) {
		this.senderTel = senderTel;
	}

	public String getReceiverAddr() {
		return this.receiverAddr;
	}

	public void setReceiverAddr(String receiverAddr) {
		this.receiverAddr = receiverAddr;
	}

	public String getReceiverCompany() {
		return this.receiverCompany;
	}

	public void setReceiverCompany(String receiverCompany) {
		this.receiverCompany = receiverCompany;
	}

	public String getReceiverTel() {
		return this.receiverTel;
	}

	public void setReceiverTel(String receiverTel) {
		this.receiverTel = receiverTel;
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

	public String getTradeStatus() {
		return this.tradeStatus;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getHgCorporateNo() {
		return this.hgCorporateNo;
	}

	public void setHgCorporateNo(String hgCorporateNo) {
		this.hgCorporateNo = hgCorporateNo;
	}

	public String getWlCorporateNo() {
		return this.wlCorporateNo;
	}

	public void setWlCorporateNo(String wlCorporateNo) {
		this.wlCorporateNo = wlCorporateNo;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getStartPoint() {
		return this.startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getEndPoint() {
		return this.endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public String getSenderLinker() {
		return this.senderLinker;
	}

	public void setSenderLinker(String senderLinker) {
		this.senderLinker = senderLinker;
	}

	public String getReceiverLinker() {
		return this.receiverLinker;
	}

	public void setReceiverLinker(String receiverLinker) {
		this.receiverLinker = receiverLinker;
	}

	public String getCarType() {
		return this.carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public BigDecimal getCarLength() {
		return this.carLength;
	}

	public void setCarLength(BigDecimal carLength) {
		this.carLength = carLength;
	}

}