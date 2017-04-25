package com.mdd.model;

/**
 * LgtAlarmTimes entity. @author MyEclipse Persistence Tools
 */

public class LgtAlarmTimes implements java.io.Serializable {

	// Fields

	private String lid;
	private double enterpriseAlarmTimes;
	private double carAlarmTimes;
	private double driverAlarmTimes;

	// Constructors

	/** default constructor */
	public LgtAlarmTimes() {
		lid="";
		enterpriseAlarmTimes=0.0;
		carAlarmTimes=0.0;
		driverAlarmTimes=0.0;
	}

	/** full constructor */
	public LgtAlarmTimes(double enterpriseAlarmTimes, double carAlarmTimes,
			double driverAlarmTimes) {
		this.enterpriseAlarmTimes = enterpriseAlarmTimes;
		this.carAlarmTimes = carAlarmTimes;
		this.driverAlarmTimes = driverAlarmTimes;
	}

	// Property accessors

	public String getLid() {
		return this.lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public double getEnterpriseAlarmTimes() {
		return this.enterpriseAlarmTimes;
	}

	public void setEnterpriseAlarmTimes(double enterpriseAlarmTimes) {
		this.enterpriseAlarmTimes = enterpriseAlarmTimes;
	}

	public double getCarAlarmTimes() {
		return this.carAlarmTimes;
	}

	public void setCarAlarmTimes(double carAlarmTimes) {
		this.carAlarmTimes = carAlarmTimes;
	}

	public double getDriverAlarmTimes() {
		return this.driverAlarmTimes;
	}

	public void setDriverAlarmTimes(double driverAlarmTimes) {
		this.driverAlarmTimes = driverAlarmTimes;
	}

}