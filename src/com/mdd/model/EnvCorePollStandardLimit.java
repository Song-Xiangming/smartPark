package com.mdd.model;

/**
 * EnvCorePollStandardLimit entity. @author MyEclipse Persistence Tools
 */

public class EnvCorePollStandardLimit implements java.io.Serializable {

	// Fields

	private String pollutantId;
	private String pollutantType;
	private String indusrtyCategoryId;
	private double warnUpperLevel;
	private double standardValue;
	private String standardDetail;
	private byte standardCode;
	private byte flag;
	private String remark;

	// Constructors

	/** default constructor */
	public EnvCorePollStandardLimit() {
		pollutantId="";
		pollutantType="";
		indusrtyCategoryId="";
		warnUpperLevel=0.0;
		standardValue=0.0;
		standardDetail="";
		standardCode=0;
		flag=0;
		remark="";
	}

	/** full constructor */
	public EnvCorePollStandardLimit(String pollutantType,
			String indusrtyCategoryId, double warnUpperLevel,
			double standardValue, String standardDetail, byte standardCode,
			byte flag, String remark) {
		this.pollutantType = pollutantType;
		this.indusrtyCategoryId = indusrtyCategoryId;
		this.warnUpperLevel = warnUpperLevel;
		this.standardValue = standardValue;
		this.standardDetail = standardDetail;
		this.standardCode = standardCode;
		this.flag = flag;
		this.remark = remark;
	}

	// Property accessors

	public String getPollutantId() {
		return this.pollutantId;
	}

	public void setPollutantId(String pollutantId) {
		this.pollutantId = pollutantId;
	}

	public String getPollutantType() {
		return this.pollutantType;
	}

	public void setPollutantType(String pollutantType) {
		this.pollutantType = pollutantType;
	}

	public String getIndusrtyCategoryId() {
		return this.indusrtyCategoryId;
	}

	public void setIndusrtyCategoryId(String indusrtyCategoryId) {
		this.indusrtyCategoryId = indusrtyCategoryId;
	}

	public double getWarnUpperLevel() {
		return this.warnUpperLevel;
	}

	public void setWarnUpperLevel(double warnUpperLevel) {
		this.warnUpperLevel = warnUpperLevel;
	}

	public double getStandardValue() {
		return this.standardValue;
	}

	public void setStandardValue(double standardValue) {
		this.standardValue = standardValue;
	}

	public String getStandardDetail() {
		return this.standardDetail;
	}

	public void setStandardDetail(String standardDetail) {
		this.standardDetail = standardDetail;
	}

	public byte getStandardCode() {
		return this.standardCode;
	}

	public void setStandardCode(byte standardCode) {
		this.standardCode = standardCode;
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