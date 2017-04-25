package com.mdd.model;

/**
 * EnvCoreValley entity. @author MyEclipse Persistence Tools
 */

public class EnvCoreValley implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private byte elevel;
	private String parentId;
	private byte flag;
	private String remark;

	// Constructors

	/** default constructor */
	public EnvCoreValley() {
		id = "";
		name = "";
		elevel=0;
		parentId="";
		flag = 0;
		remark = "";
	}

	/** full constructor */
	public EnvCoreValley(String name, byte elevel, String parentId, byte flag,
			String remark) {
		this.name = name;
		this.elevel = elevel;
		this.parentId = parentId;
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

	public byte getElevel() {
		return this.elevel;
	}

	public void setElevel(byte elevel) {
		this.elevel = elevel;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
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