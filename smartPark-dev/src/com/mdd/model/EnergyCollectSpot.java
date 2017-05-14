package com.mdd.model;

import java.util.Date;

/**
 * EnergyCollectSpot entity. @author MyEclipse Persistence Tools
 */

public class EnergyCollectSpot implements java.io.Serializable {

	// Fields

	private String eid;
	private String ename;
	private Date createTime;
	private String remove;
	private String coding;
	private String eerror;

	// Constructors

	/** default constructor */
	public EnergyCollectSpot() {
		eid = "";
		ename = "";
		createTime = new Date();
		remove = "";
		coding = "";
		eerror = "";

	}

	/** full constructor */
	public EnergyCollectSpot(String ename, Date createTime, String remove,
			String coding, String eerror) {
		this.ename = ename;
		this.createTime = createTime;
		this.remove = remove;
		this.coding = coding;
		this.eerror = eerror;
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

	public String getCoding() {
		return this.coding;
	}

	public void setCoding(String coding) {
		this.coding = coding;
	}

	public String getEerror() {
		return this.eerror;
	}

	public void setEerror(String eerror) {
		this.eerror = eerror;
	}

}