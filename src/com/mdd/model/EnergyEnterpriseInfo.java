package com.mdd.model;

import java.util.Date;

/**
 * EnergyEnterpriseInfo entity. @author MyEclipse Persistence Tools
 */

public class EnergyEnterpriseInfo implements java.io.Serializable {

	// Fields

	private String eid;
	private String corporateCode;
	private String ename;
	private String tradeTypeCode;
	private String tradeClassCode;
	private String addr;
	private String tel;
	private String email;
	private String brief;
	private String createBy;
	private Date createTime;
	private String updateBy;
	private Date updateTime;
	private String remove;
	private String corporatePerson;
	private double transformerVolume;
	private double generateElectricityPower;

	// Constructors

	/** default constructor */
	public EnergyEnterpriseInfo() {
		eid = "";
		corporateCode = "";
		corporatePerson = "";
		ename = "";
		tradeClassCode = "";
		tradeTypeCode = "";
		addr = "";
		tel = "";
		email = "";
		brief = "";
		createBy = "";
		createTime = new Date();
		updateBy = "";
		updateTime = new Date();
		remove = "";
		transformerVolume = 0.0;
		generateElectricityPower = 0.0;
	}

	/** full constructor */
	public EnergyEnterpriseInfo(String corporateCode, String ename,
			String tradeTypeCode, String tradeClassCode, String addr,
			String tel, String email, String brief, String createBy,
			Date createTime, String updateBy, Date updateTime, String remove,
			String corporatePerson, double transformerVolume,
			double generateElectricityPower) {
		this.corporateCode = corporateCode;
		this.ename = ename;
		this.tradeTypeCode = tradeTypeCode;
		this.tradeClassCode = tradeClassCode;
		this.addr = addr;
		this.tel = tel;
		this.email = email;
		this.brief = brief;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.remove = remove;
		this.corporatePerson = corporatePerson;
		this.transformerVolume = transformerVolume;
		this.generateElectricityPower = generateElectricityPower;
	}

	// Property accessors

	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getCorporateCode() {
		return this.corporateCode;
	}

	public void setCorporateCode(String corporateCode) {
		this.corporateCode = corporateCode;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getTradeTypeCode() {
		return this.tradeTypeCode;
	}

	public void setTradeTypeCode(String tradeTypeCode) {
		this.tradeTypeCode = tradeTypeCode;
	}

	public String getTradeClassCode() {
		return this.tradeClassCode;
	}

	public void setTradeClassCode(String tradeClassCode) {
		this.tradeClassCode = tradeClassCode;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBrief() {
		return this.brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
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

	public String getCorporatePerson() {
		return this.corporatePerson;
	}

	public void setCorporatePerson(String corporatePerson) {
		this.corporatePerson = corporatePerson;
	}

	public double getTransformerVolume() {
		return this.transformerVolume;
	}

	public void setTransformerVolume(double transformerVolume) {
		this.transformerVolume = transformerVolume;
	}

	public double getGenerateElectricityPower() {
		return this.generateElectricityPower;
	}

	public void setGenerateElectricityPower(double generateElectricityPower) {
		this.generateElectricityPower = generateElectricityPower;
	}

}