package com.mdd.model;

import java.util.Date;

/**
 * EnergyMeterDevice entity. @author MyEclipse Persistence Tools
 */

public class EnergyMeterDevice implements java.io.Serializable {

	// Fields

	private String id;
	private String corporateCode;
	private String equipmentName;
	private String equipmentModel;
	private String equipmentWorkType;
	private String equipmentFanufacturer;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;

	// Constructors

	/** default constructor */
	public EnergyMeterDevice() {
		id = "";
		corporateCode = "";
		equipmentName = "";
		equipmentModel = "";
		equipmentWorkType = "";
		equipmentFanufacturer = "";
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
	}

	/** full constructor */
	public EnergyMeterDevice(String corporateCode, String equipmentName,
			String equipmentModel, String equipmentWorkType,
			String equipmentFanufacturer, String createBy, Date createTime,
			String updateBy, Date updateTime, String remove) {
		this.corporateCode = corporateCode;
		this.equipmentName = equipmentName;
		this.equipmentModel = equipmentModel;
		this.equipmentWorkType = equipmentWorkType;
		this.equipmentFanufacturer = equipmentFanufacturer;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.remove = remove;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCorporateCode() {
		return this.corporateCode;
	}

	public void setCorporateCode(String corporateCode) {
		this.corporateCode = corporateCode;
	}

	public String getEquipmentName() {
		return this.equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getEquipmentModel() {
		return this.equipmentModel;
	}

	public void setEquipmentModel(String equipmentModel) {
		this.equipmentModel = equipmentModel;
	}

	public String getEquipmentWorkType() {
		return this.equipmentWorkType;
	}

	public void setEquipmentWorkType(String equipmentWorkType) {
		this.equipmentWorkType = equipmentWorkType;
	}

	public String getEquipmentFanufacturer() {
		return this.equipmentFanufacturer;
	}

	public void setEquipmentFanufacturer(String equipmentFanufacturer) {
		this.equipmentFanufacturer = equipmentFanufacturer;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getRemove() {
		return this.remove;
	}

	public void setRemove(String remove) {
		this.remove = remove;
	}

}