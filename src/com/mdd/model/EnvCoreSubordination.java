package com.mdd.model;

/**
 * EnvCoreSubordination entity. @author MyEclipse Persistence Tools
 */

public class EnvCoreSubordination implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private byte flag;
	private String remark;
	private String sortId;

	// Constructors

	/** default constructor */
	public EnvCoreSubordination() {
		id="";
		name="";
		flag=0;
		remark="";
		sortId="";
	}

	/** full constructor */
	public EnvCoreSubordination(String name, byte flag, String remark,
			String sortId) {
		this.name = name;
		this.flag = flag;
		this.remark = remark;
		this.sortId = sortId;
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

	public String getSortId() {
		return this.sortId;
	}

	public void setSortId(String sortId) {
		this.sortId = sortId;
	}

}