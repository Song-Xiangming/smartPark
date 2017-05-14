package com.mdd.model;

import java.util.Date;

/**
 * EnvCoreEmergencyPlan entity. @author MyEclipse Persistence Tools
 */

public class EnvCoreEmergencyPlan implements java.io.Serializable {

	// Fields

	private String id;
	private String enterpriseId;
	private String code;
	private String name;
	private Date generatedTime;
	private String uploadId;
	private byte flag;

	// Constructors

	/** default constructor */
	public EnvCoreEmergencyPlan() {
		id = "";
		enterpriseId = "";
		code = "";
		name = "";
		generatedTime = new Date();
		uploadId = "";
		flag = 0;
	}

	/** full constructor */
	public EnvCoreEmergencyPlan(String enterpriseId, String code, String name,
			Date generatedTime, String uploadId, byte flag) {
		this.enterpriseId = enterpriseId;
		this.code = code;
		this.name = name;
		this.generatedTime = generatedTime;
		this.uploadId = uploadId;
		this.flag = flag;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getGeneratedTime() {
		return this.generatedTime;
	}

	public void setGeneratedTime(Date generatedTime) {
		this.generatedTime = generatedTime;
	}

	public String getUploadId() {
		return this.uploadId;
	}

	public void setUploadId(String uploadId) {
		this.uploadId = uploadId;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

}