package com.mdd.model;

import java.util.Date;

/**
 * EnergyTerminal entity. @author MyEclipse Persistence Tools
 */

public class EnergyTerminal implements java.io.Serializable {

	// Fields

	private String eid;
	private String ename;
	private String conn;
	private Date createTime;
	private String remove;

	// Constructors

	/** default constructor */
	public EnergyTerminal() {
		eid = "";
		ename = "";
		conn = "";
		createTime = new Date();
		remove = "";
	}

	/** full constructor */
	public EnergyTerminal(String ename, String conn, Date createTime,
			String remove) {
		this.ename = ename;
		this.conn = conn;
		this.createTime = createTime;
		this.remove = remove;
	}

	// Property accessors

	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getConn() {
		return this.conn;
	}

	public void setConn(String conn) {
		this.conn = conn;
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

}