package com.mdd.model;

import java.util.Date;

/**
 * LgtCarRealTimePostion entity. @author MyEclipse Persistence Tools
 */

public class LgtCarRealTimePostion implements java.io.Serializable {

	// Fields

	private String licensePlateNo;
	private String coordinatesSourceType;
	private String status;
	private Date ltime;
	private double longitude;
	private double latitude;
	private double altitude;
	private double speed;
	private double direction;
	private double temperature;
	private double pressure;
	private double liquidLevel;
	private double tirePressure;

	// Constructors

	/** default constructor */
	public LgtCarRealTimePostion() {
		licensePlateNo = "";
		coordinatesSourceType = "";
		status = "";
		ltime = new Date();
		longitude = 0.0;
		latitude = 0.0;
		altitude = 0.0;
		speed = 0.0;
		direction = 0.0;
		temperature = 0.0;
		pressure = 0.0;
		liquidLevel = 0.0;
		tirePressure = 0.0;
	}

	/** full constructor */
	public LgtCarRealTimePostion(String coordinatesSourceType, String status,
			Date ltime, double longitude, double latitude, double altitude,
			double speed, double direction, double temperature,
			double pressure, double liquidLevel, double tirePressure) {
		this.coordinatesSourceType = coordinatesSourceType;
		this.status = status;
		this.ltime = ltime;
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
		this.speed = speed;
		this.direction = direction;
		this.temperature = temperature;
		this.pressure = pressure;
		this.liquidLevel = liquidLevel;
		this.tirePressure = tirePressure;
	}

	// Property accessors

	public String getLicensePlateNo() {
		return this.licensePlateNo;
	}

	public void setLicensePlateNo(String licensePlateNo) {
		this.licensePlateNo = licensePlateNo;
	}

	public String getCoordinatesSourceType() {
		return this.coordinatesSourceType;
	}

	public void setCoordinatesSourceType(String coordinatesSourceType) {
		this.coordinatesSourceType = coordinatesSourceType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLtime() {
		return this.ltime;
	}

	public void setLtime(Date ltime) {
		this.ltime = ltime;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getAltitude() {
		return this.altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public double getSpeed() {
		return this.speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getDirection() {
		return this.direction;
	}

	public void setDirection(double direction) {
		this.direction = direction;
	}

	public double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getPressure() {
		return this.pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public double getLiquidLevel() {
		return this.liquidLevel;
	}

	public void setLiquidLevel(double liquidLevel) {
		this.liquidLevel = liquidLevel;
	}

	public double getTirePressure() {
		return this.tirePressure;
	}

	public void setTirePressure(double tirePressure) {
		this.tirePressure = tirePressure;
	}

}