package com.mdd.model;

/**
 * EnvCoreRayDevice entity. @author MyEclipse Persistence Tools
 */

public class EnvCoreRayDevice implements java.io.Serializable {

	// Fields

	private String id;
	private String safeLicenceid;
	private String name;
	private String type;
	private double num;
	private String activityKind;
	private String workplace;
	private byte flag;

	// Constructors

	/** default constructor */
	public EnvCoreRayDevice() {
		id="";
		safeLicenceid="";
		name="";
		type="";
		num=0.0;
		activityKind="";
		workplace="";
		flag=0;
	}

	/** full constructor */
	public EnvCoreRayDevice(String safeLicenceid, String name, String type,
			double num, String activityKind, String workplace, byte flag) {
		this.safeLicenceid = safeLicenceid;
		this.name = name;
		this.type = type;
		this.num = num;
		this.activityKind = activityKind;
		this.workplace = workplace;
		this.flag = flag;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSafeLicenceid() {
		return this.safeLicenceid;
	}

	public void setSafeLicenceid(String safeLicenceid) {
		this.safeLicenceid = safeLicenceid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getNum() {
		return this.num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	public String getActivityKind() {
		return this.activityKind;
	}

	public void setActivityKind(String activityKind) {
		this.activityKind = activityKind;
	}

	public String getWorkplace() {
		return this.workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

}