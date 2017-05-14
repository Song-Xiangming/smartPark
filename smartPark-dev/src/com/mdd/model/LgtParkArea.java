package com.mdd.model;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.Date;

import org.hibernate.type.ClobType;

/**
 * LgtParkArea entity. @author MyEclipse Persistence Tools
 */

public class LgtParkArea implements java.io.Serializable {

	// Fields

	private String id;
	private String point;
	private Date createTime;

	// Constructors

	/** default constructor */
	public LgtParkArea() {
		id="";
	createTime=new Date();
		point="";
	}

	/** full constructor */
	public LgtParkArea(String point, Date createTime) {
		this.point = point;
		this.createTime = createTime;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPoint() {
		return this.point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}