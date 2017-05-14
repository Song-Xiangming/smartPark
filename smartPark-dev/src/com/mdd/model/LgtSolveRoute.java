package com.mdd.model;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.Date;

/**
 * LgtSolveRoute entity. @author MyEclipse Persistence Tools
 */

public class LgtSolveRoute implements java.io.Serializable {

	// Fields

	private String id;
	private String points;
	private Date createTime;
	private String remove;
	private String carrierName;
	private String waybillId;

	// Constructors

	/** default constructor */
	public LgtSolveRoute() {
		id = "";
		points = "";
		createTime = new Date();
		remove = "";
		carrierName = "";
		waybillId = "";
	}

	/** full constructor */
	public LgtSolveRoute(String points, Date createTime, String remove,
			String carrierName, String waybillId) {
		this.points = points;
		this.createTime = createTime;
		this.remove = remove;
		this.carrierName = carrierName;
		this.waybillId = waybillId;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPoints() {
		return this.points;
	}

	public void setPoints(String points) {
		this.points = points;
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

	public String getCarrierName() {
		return this.carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getWaybillId() {
		return this.waybillId;
	}

	public void setWaybillId(String waybillId) {
		this.waybillId = waybillId;
	}

}