package com.mdd.model;

/**
 * EnvCorePollutantUnit entity. @author MyEclipse Persistence Tools
 */

public class EnvCorePollutantUnit implements java.io.Serializable {

	// Fields

	private String pollutantId;
	private String pollutantType;
	private String unit;

	// Constructors

	/** default constructor */
	public EnvCorePollutantUnit() {
		pollutantId="";
		pollutantType="";
		unit="";
	}

	/** full constructor */
	public EnvCorePollutantUnit(String pollutantType, String unit) {
		this.pollutantType = pollutantType;
		this.unit = unit;
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

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}