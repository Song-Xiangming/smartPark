package com.mdd.model;

/**
 * LgtDanCarAttRel entity. @author MyEclipse Persistence Tools
 */

public class LgtDanCarAttRel implements java.io.Serializable {

	// Fields

	private String lid;
	private String dangerousCarId;
	private String attachmentId;
	private String logicallyDeleted;

	// Constructors

	/** default constructor */
	public LgtDanCarAttRel() {
		lid="";
		dangerousCarId="";
		attachmentId="";
		logicallyDeleted="";
	}

	/** full constructor */
	public LgtDanCarAttRel(String dangerousCarId, String attachmentId,
			String logicallyDeleted) {
		this.dangerousCarId = dangerousCarId;
		this.attachmentId = attachmentId;
		this.logicallyDeleted = logicallyDeleted;
	}

	// Property accessors

	public String getLid() {
		return this.lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getDangerousCarId() {
		return this.dangerousCarId;
	}

	public void setDangerousCarId(String dangerousCarId) {
		this.dangerousCarId = dangerousCarId;
	}

	public String getAttachmentId() {
		return this.attachmentId;
	}

	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
	}

	public String getLogicallyDeleted() {
		return this.logicallyDeleted;
	}

	public void setLogicallyDeleted(String logicallyDeleted) {
		this.logicallyDeleted = logicallyDeleted;
	}

}