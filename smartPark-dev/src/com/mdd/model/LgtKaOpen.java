package com.mdd.model;

import java.util.Date;

/**
 * LgtKaOpen entity. @author MyEclipse Persistence Tools
 */

public class LgtKaOpen implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private Date createTime;
	private String lat;
	private String lng;

	// Constructors

	/** default constructor */
	public LgtKaOpen() {
		id="";
		name="";
		createTime=new Date();
		lat="";
		lng="";
	}

	/** full constructor */
	public LgtKaOpen(String name, Date createTime, String lat, String lng) {
		this.name = name;
		this.createTime = createTime;
		this.lat = lat;
		this.lng = lng;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getLat() {
		return this.lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return this.lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

}