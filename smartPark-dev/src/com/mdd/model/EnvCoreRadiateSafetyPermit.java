package com.mdd.model;

import java.util.Date;

/**
 * EnvCoreRadiateSafetyPermit entity. @author MyEclipse Persistence Tools
 */

public class EnvCoreRadiateSafetyPermit implements java.io.Serializable {

	// Fields

	private String id;
	private String code;
	private Date certification;
	private Date expirationDate;
	private byte flag;

	// Constructors

	/** default constructor */
	public EnvCoreRadiateSafetyPermit() {
		id = "";
		code = "";
		certification = new Date();
		expirationDate = new Date();
		flag = 0;
	}

	/** full constructor */
	public EnvCoreRadiateSafetyPermit(String code, Date certification,
			Date expirationDate, byte flag) {
		this.code = code;
		this.certification = certification;
		this.expirationDate = expirationDate;
		this.flag = flag;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getCertification() {
		return this.certification;
	}

	public void setCertification(Date certification) {
		this.certification = certification;
	}

	public Date getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

}