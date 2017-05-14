package com.mdd.model;

/**
 * EnvCoreAreas entity. @author MyEclipse Persistence Tools
 */

public class EnvCoreAreas implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private byte elevel;
	private byte flag;
	private String remark;
	private String areaCode;

	// Constructors

	/** default constructor */
	public EnvCoreAreas() {
		id = "";
		name = "";
		remark = "";
		areaCode = "";
		elevel = 0;
		flag = 0;
	}

	/** full constructor */
	public EnvCoreAreas(String name, byte elevel, byte flag, String remark,
			String areaCode) {
		this.name = name;
		this.elevel = elevel;
		this.flag = flag;
		this.remark = remark;
		this.areaCode = areaCode;
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

	public byte getElevel() {
		return this.elevel;
	}

	public void setElevel(byte elevel) {
		this.elevel = elevel;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

}