package com.mdd.model;

import java.util.Date;

/**
 * LgtEmergencyInfo entity. @author MyEclipse Persistence Tools
 */

public class LgtEmergencyInfo implements java.io.Serializable {

	// Fields

	private String lid;
	private String title;
	private String content;
	private String infoSource;
	private Date releaseTime;
	private String founder;
	private Date foundationDate;
	private String modifier;
	private Date modifyDate;
	private String logicallyDeleted;
	private Date pushTime;

	// Constructors

	/** default constructor */
	public LgtEmergencyInfo() {
		lid = "";
		title = "";
		content = "";
		infoSource = "";
		releaseTime = new Date();
		founder = "";
		foundationDate = new Date();
		modifier = "";
		modifyDate = new Date();
		logicallyDeleted = "";
		pushTime = new Date();
	}

	/** full constructor */
	public LgtEmergencyInfo(String title, String content, String infoSource,
			Date releaseTime, String founder, Date foundationDate,
			String modifier, Date modifyDate, String logicallyDeleted,
			Date pushTime) {
		this.title = title;
		this.content = content;
		this.infoSource = infoSource;
		this.releaseTime = releaseTime;
		this.founder = founder;
		this.foundationDate = foundationDate;
		this.modifier = modifier;
		this.modifyDate = modifyDate;
		this.logicallyDeleted = logicallyDeleted;
		this.pushTime = pushTime;
	}

	// Property accessors

	public String getLid() {
		return this.lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getInfoSource() {
		return this.infoSource;
	}

	public void setInfoSource(String infoSource) {
		this.infoSource = infoSource;
	}

	public Date getReleaseTime() {
		return this.releaseTime;
	}

	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}

	public String getFounder() {
		return this.founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public Date getFoundationDate() {
		return this.foundationDate;
	}

	public void setFoundationDate(Date foundationDate) {
		this.foundationDate = foundationDate;
	}

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getLogicallyDeleted() {
		return this.logicallyDeleted;
	}

	public void setLogicallyDeleted(String logicallyDeleted) {
		this.logicallyDeleted = logicallyDeleted;
	}

	public Date getPushTime() {
		return this.pushTime;
	}

	public void setPushTime(Date pushTime) {
		this.pushTime = pushTime;
	}

}