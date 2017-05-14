package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * EnergyUseEnergyEquipment entity. @author MyEclipse Persistence Tools
 */

public class EnergyUseEnergyEquipment implements java.io.Serializable {

	// Fields

	private String id;
	private String enterpriseId;
	private String equipmentName;
	private String equipmentType;
	private BigDecimal totalTankage;
	private Date useTime;
	private String useYearLimit;
	private String status;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;

	// Constructors

	/** default constructor */
	public EnergyUseEnergyEquipment() {
		id = "";
		enterpriseId = "";
		equipmentName = "";
		equipmentType = "";
		totalTankage = new BigDecimal(0);
		useTime = new Date();
		useYearLimit = "";
		status = "";
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
	}

	/** full constructor */
	public EnergyUseEnergyEquipment(String enterpriseId, String equipmentName,
			String equipmentType, BigDecimal totalTankage, Date useTime,
			String useYearLimit, String status, String createBy,
			Date createTime, String updateBy, Date updateTime, String remove) {
		this.enterpriseId = enterpriseId;
		this.equipmentName = equipmentName;
		this.equipmentType = equipmentType;
		this.totalTankage = totalTankage;
		this.useTime = useTime;
		this.useYearLimit = useYearLimit;
		this.status = status;
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

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEquipmentName() {
		return this.equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getEquipmentType() {
		return this.equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public BigDecimal getTotalTankage() {
		return this.totalTankage;
	}

	public void setTotalTankage(BigDecimal totalTankage) {
		this.totalTankage = totalTankage;
	}

	public Date getUseTime() {
		return this.useTime;
	}

	public void setUseTime(Date useTime) {
		this.useTime = useTime;
	}

	public String getUseYearLimit() {
		return this.useYearLimit;
	}

	public void setUseYearLimit(String useYearLimit) {
		this.useYearLimit = useYearLimit;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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