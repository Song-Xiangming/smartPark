package com.mdd.model;

import java.util.Date;

/**
 * EnvCoreLetoutStateControl entity. @author MyEclipse Persistence Tools
 */

public class EnvCoreLetoutStateControl implements java.io.Serializable {

	// Fields

	private String dischargeLetoutId;
	private Date registerYear;
	private String remarks;

	// Constructors

	/** default constructor */
	public EnvCoreLetoutStateControl() {
		dischargeLetoutId="";
		registerYear=new Date();
		remarks="";
	}

	/** full constructor */
	public EnvCoreLetoutStateControl(Date registerYear, String remarks) {
		this.registerYear = registerYear;
		this.remarks = remarks;
	}

	// Property accessors

	public String getDischargeLetoutId() {
		return this.dischargeLetoutId;
	}

	public void setDischargeLetoutId(String dischargeLetoutId) {
		this.dischargeLetoutId = dischargeLetoutId;
	}

	public Date getRegisterYear() {
		return this.registerYear;
	}

	public void setRegisterYear(Date registerYear) {
		this.registerYear = registerYear;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}