package com.mdd.model;

/**
 * EnvCoreRadioactiveSource entity. @author MyEclipse Persistence Tools
 */

public class EnvCoreRadioactiveSource implements java.io.Serializable {

	// Fields

	private String id;
	private String safeLicenceid;
	private String equipmentName;
	private String nuclideName;
	private String nuclideType;
	private double activity;
	private String activityKind;
	private String workPlace;
	private byte flag;

	// Constructors

	/** default constructor */
	public EnvCoreRadioactiveSource() {
		id="";
		safeLicenceid="";
		equipmentName="";
		nuclideName="";
		nuclideType="";
		activity=0.0;
		activityKind="";
		workPlace="";
		flag=0;
	}

	/** full constructor */
	public EnvCoreRadioactiveSource(String safeLicenceid, String equipmentName,
			String nuclideName, String nuclideType, double activity,
			String activityKind, String workPlace, byte flag) {
		this.safeLicenceid = safeLicenceid;
		this.equipmentName = equipmentName;
		this.nuclideName = nuclideName;
		this.nuclideType = nuclideType;
		this.activity = activity;
		this.activityKind = activityKind;
		this.workPlace = workPlace;
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

	public String getEquipmentName() {
		return this.equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getNuclideName() {
		return this.nuclideName;
	}

	public void setNuclideName(String nuclideName) {
		this.nuclideName = nuclideName;
	}

	public String getNuclideType() {
		return this.nuclideType;
	}

	public void setNuclideType(String nuclideType) {
		this.nuclideType = nuclideType;
	}

	public double getActivity() {
		return this.activity;
	}

	public void setActivity(double activity) {
		this.activity = activity;
	}

	public String getActivityKind() {
		return this.activityKind;
	}

	public void setActivityKind(String activityKind) {
		this.activityKind = activityKind;
	}

	public String getWorkPlace() {
		return this.workPlace;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

}