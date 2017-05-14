package com.mdd.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * EnvMonitorAlarmRegistForm entity. @author MyEclipse Persistence Tools
 */

public class EnvMonitorAlarmRegistForm implements java.io.Serializable {

	// Fields

	private String enterpriseId;
	private String mn;
	private Date registerAlarmTime;
	private Date removeAlarmTime;
	private String oneHourMessage;
	private String oneHourUsername;
	private Date oneHourTime;
	private String twelveHourMessage;
	private String twelveHourUsername;
	private Date twelveHourTime;
	private String twentyfourHourMessage;
	private String twentyfourHourUsername;
	private Date twentyfourHourTme;
	private String gasFourHourMessage;
	private String gasFourHourUsername;
	private Date gasFourHourTime;
	private String sewageTwoHourMessage;
	private String sewageTwoHourUsername;
	private Date sewageTwoHourTime;
	private String result;
	private String remark;
	private byte flag;
	private BigDecimal alarmId;
	private String dischargeLetoutName;

	// Constructors

	/** default constructor */
	public EnvMonitorAlarmRegistForm() {
		enterpriseId = "";
		mn = "";
		registerAlarmTime = new Date();
		removeAlarmTime = new Date();
		oneHourMessage = "";
		oneHourUsername = "";
		oneHourTime = new Date();
		twelveHourMessage = "";
		twelveHourUsername = "";
		twelveHourTime = new Date();
		twentyfourHourMessage = "";
		twentyfourHourUsername = "";
		twentyfourHourTme = new Date();
		gasFourHourMessage = "";
		gasFourHourUsername = "";
		gasFourHourTime = new Date();
		sewageTwoHourMessage = "";
		sewageTwoHourUsername = "";
		sewageTwoHourTime = new Date();
		result = "";
		remark = "";
		flag = 0;
		alarmId = new BigDecimal(0);
		dischargeLetoutName = "";

	}

	/** full constructor */
	public EnvMonitorAlarmRegistForm(String mn, Date registerAlarmTime,
			Date removeAlarmTime, String oneHourMessage,
			String oneHourUsername, Date oneHourTime, String twelveHourMessage,
			String twelveHourUsername, Date twelveHourTime,
			String twentyfourHourMessage, String twentyfourHourUsername,
			Date twentyfourHourTme, String gasFourHourMessage,
			String gasFourHourUsername, Date gasFourHourTime,
			String sewageTwoHourMessage, String sewageTwoHourUsername,
			Date sewageTwoHourTime, String result, String remark, byte flag,
			BigDecimal alarmId, String dischargeLetoutName) {
		this.mn = mn;
		this.registerAlarmTime = registerAlarmTime;
		this.removeAlarmTime = removeAlarmTime;
		this.oneHourMessage = oneHourMessage;
		this.oneHourUsername = oneHourUsername;
		this.oneHourTime = oneHourTime;
		this.twelveHourMessage = twelveHourMessage;
		this.twelveHourUsername = twelveHourUsername;
		this.twelveHourTime = twelveHourTime;
		this.twentyfourHourMessage = twentyfourHourMessage;
		this.twentyfourHourUsername = twentyfourHourUsername;
		this.twentyfourHourTme = twentyfourHourTme;
		this.gasFourHourMessage = gasFourHourMessage;
		this.gasFourHourUsername = gasFourHourUsername;
		this.gasFourHourTime = gasFourHourTime;
		this.sewageTwoHourMessage = sewageTwoHourMessage;
		this.sewageTwoHourUsername = sewageTwoHourUsername;
		this.sewageTwoHourTime = sewageTwoHourTime;
		this.result = result;
		this.remark = remark;
		this.flag = flag;
		this.alarmId = alarmId;
		this.dischargeLetoutName = dischargeLetoutName;
	}

	// Property accessors

	public String getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getMn() {
		return this.mn;
	}

	public void setMn(String mn) {
		this.mn = mn;
	}

	public Date getRegisterAlarmTime() {
		return this.registerAlarmTime;
	}

	public void setRegisterAlarmTime(Date registerAlarmTime) {
		this.registerAlarmTime = registerAlarmTime;
	}

	public Date getRemoveAlarmTime() {
		return this.removeAlarmTime;
	}

	public void setRemoveAlarmTime(Date removeAlarmTime) {
		this.removeAlarmTime = removeAlarmTime;
	}

	public String getOneHourMessage() {
		return this.oneHourMessage;
	}

	public void setOneHourMessage(String oneHourMessage) {
		this.oneHourMessage = oneHourMessage;
	}

	public String getOneHourUsername() {
		return this.oneHourUsername;
	}

	public void setOneHourUsername(String oneHourUsername) {
		this.oneHourUsername = oneHourUsername;
	}

	public Date getOneHourTime() {
		return this.oneHourTime;
	}

	public void setOneHourTime(Date oneHourTime) {
		this.oneHourTime = oneHourTime;
	}

	public String getTwelveHourMessage() {
		return this.twelveHourMessage;
	}

	public void setTwelveHourMessage(String twelveHourMessage) {
		this.twelveHourMessage = twelveHourMessage;
	}

	public String getTwelveHourUsername() {
		return this.twelveHourUsername;
	}

	public void setTwelveHourUsername(String twelveHourUsername) {
		this.twelveHourUsername = twelveHourUsername;
	}

	public Date getTwelveHourTime() {
		return this.twelveHourTime;
	}

	public void setTwelveHourTime(Date twelveHourTime) {
		this.twelveHourTime = twelveHourTime;
	}

	public String getTwentyfourHourMessage() {
		return this.twentyfourHourMessage;
	}

	public void setTwentyfourHourMessage(String twentyfourHourMessage) {
		this.twentyfourHourMessage = twentyfourHourMessage;
	}

	public String getTwentyfourHourUsername() {
		return this.twentyfourHourUsername;
	}

	public void setTwentyfourHourUsername(String twentyfourHourUsername) {
		this.twentyfourHourUsername = twentyfourHourUsername;
	}

	public Date getTwentyfourHourTme() {
		return this.twentyfourHourTme;
	}

	public void setTwentyfourHourTme(Date twentyfourHourTme) {
		this.twentyfourHourTme = twentyfourHourTme;
	}

	public String getGasFourHourMessage() {
		return this.gasFourHourMessage;
	}

	public void setGasFourHourMessage(String gasFourHourMessage) {
		this.gasFourHourMessage = gasFourHourMessage;
	}

	public String getGasFourHourUsername() {
		return this.gasFourHourUsername;
	}

	public void setGasFourHourUsername(String gasFourHourUsername) {
		this.gasFourHourUsername = gasFourHourUsername;
	}

	public Date getGasFourHourTime() {
		return this.gasFourHourTime;
	}

	public void setGasFourHourTime(Date gasFourHourTime) {
		this.gasFourHourTime = gasFourHourTime;
	}

	public String getSewageTwoHourMessage() {
		return this.sewageTwoHourMessage;
	}

	public void setSewageTwoHourMessage(String sewageTwoHourMessage) {
		this.sewageTwoHourMessage = sewageTwoHourMessage;
	}

	public String getSewageTwoHourUsername() {
		return this.sewageTwoHourUsername;
	}

	public void setSewageTwoHourUsername(String sewageTwoHourUsername) {
		this.sewageTwoHourUsername = sewageTwoHourUsername;
	}

	public Date getSewageTwoHourTime() {
		return this.sewageTwoHourTime;
	}

	public void setSewageTwoHourTime(Date sewageTwoHourTime) {
		this.sewageTwoHourTime = sewageTwoHourTime;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public BigDecimal getAlarmId() {
		return this.alarmId;
	}

	public void setAlarmId(BigDecimal alarmId) {
		this.alarmId = alarmId;
	}

	public String getDischargeLetoutName() {
		return this.dischargeLetoutName;
	}

	public void setDischargeLetoutName(String dischargeLetoutName) {
		this.dischargeLetoutName = dischargeLetoutName;
	}

}