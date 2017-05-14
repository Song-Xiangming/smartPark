package com.mdd.model;

/**
 * EnvCorePollutant entity. @author MyEclipse Persistence Tools
 */

public class EnvCorePollutant implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String pollutantTypeId;
	private byte flag;
	private String remark;
	private double pollVal;
	private String belongId;
	private String pollCode;

	// Constructors

	/** default constructor */
	public EnvCorePollutant() {
		id = "";
		name = "";
		pollutantTypeId = "";
		flag = 0;
		remark = "";
		pollVal = 0.0;
		belongId = "";
		pollCode = "";
	}

	/** full constructor */
	public EnvCorePollutant(String name, String pollutantTypeId, byte flag,
			String remark, double pollVal, String belongId, String pollCode) {
		this.name = name;
		this.pollutantTypeId = pollutantTypeId;
		this.flag = flag;
		this.remark = remark;
		this.pollVal = pollVal;
		this.belongId = belongId;
		this.pollCode = pollCode;
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

	public String getPollutantTypeId() {
		return this.pollutantTypeId;
	}

	public void setPollutantTypeId(String pollutantTypeId) {
		this.pollutantTypeId = pollutantTypeId;
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

	public double getPollVal() {
		return this.pollVal;
	}

	public void setPollVal(double pollVal) {
		this.pollVal = pollVal;
	}

	public String getBelongId() {
		return this.belongId;
	}

	public void setBelongId(String belongId) {
		this.belongId = belongId;
	}

	public String getPollCode() {
		return this.pollCode;
	}

	public void setPollCode(String pollCode) {
		this.pollCode = pollCode;
	}

}