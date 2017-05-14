package com.mdd.model;

/**
 * EnvCoreRegisterType entity. @author MyEclipse Persistence Tools
 */

public class EnvCoreRegisterType implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private byte flag;
	private String remark;

	// Constructors

	/** default constructor */
	public EnvCoreRegisterType() {
		id = "";
		name ="";
		flag=0;
		remark="";
	}

	/** full constructor */
	public EnvCoreRegisterType(String name, byte flag, String remark) {
		this.name = name;
		this.flag = flag;
		this.remark = remark;
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

}