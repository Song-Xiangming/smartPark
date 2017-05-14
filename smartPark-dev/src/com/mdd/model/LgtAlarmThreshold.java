package com.mdd.model;

/**
 * LgtAlarmThreshold entity. @author MyEclipse Persistence Tools
 */

public class LgtAlarmThreshold implements java.io.Serializable {

	// Fields

	private String lid;
	private double overspeedThreshold;
	private double overspeedDuration;
	private double fatigueDrivingThresholde;
	private double overtimeThresholdeValue;

	// Constructors

	/** default constructor */
	public LgtAlarmThreshold() {
		lid = "";
		overspeedThreshold = 0.0;
		overspeedDuration = 0.0;
		fatigueDrivingThresholde = 0.0;
		overtimeThresholdeValue = 0.0;
	}

	/** full constructor */
	public LgtAlarmThreshold(double overspeedThreshold,
			double overspeedDuration, double fatigueDrivingThresholde,
			double overtimeThresholdeValue) {
		this.overspeedThreshold = overspeedThreshold;
		this.overspeedDuration = overspeedDuration;
		this.fatigueDrivingThresholde = fatigueDrivingThresholde;
		this.overtimeThresholdeValue = overtimeThresholdeValue;
	}

	// Property accessors

	public String getLid() {
		return this.lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public double getOverspeedThreshold() {
		return this.overspeedThreshold;
	}

	public void setOverspeedThreshold(double overspeedThreshold) {
		this.overspeedThreshold = overspeedThreshold;
	}

	public double getOverspeedDuration() {
		return this.overspeedDuration;
	}

	public void setOverspeedDuration(double overspeedDuration) {
		this.overspeedDuration = overspeedDuration;
	}

	public double getFatigueDrivingThresholde() {
		return this.fatigueDrivingThresholde;
	}

	public void setFatigueDrivingThresholde(double fatigueDrivingThresholde) {
		this.fatigueDrivingThresholde = fatigueDrivingThresholde;
	}

	public double getOvertimeThresholdeValue() {
		return this.overtimeThresholdeValue;
	}

	public void setOvertimeThresholdeValue(double overtimeThresholdeValue) {
		this.overtimeThresholdeValue = overtimeThresholdeValue;
	}

}