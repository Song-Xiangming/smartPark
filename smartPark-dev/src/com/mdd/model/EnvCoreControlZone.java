package com.mdd.model;

/**
 * EnvCoreControlZone entity. @author MyEclipse Persistence Tools
 */

public class EnvCoreControlZone implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private byte flag;
	private String reamrk;

	// Constructors

	/** default constructor */
	public EnvCoreControlZone() {
		id = "";
		name = "";
		flag = 0;
		reamrk = "";
	}

	/** full constructor */
	public EnvCoreControlZone(String name, byte flag, String reamrk) {
		this.name = name;
		this.flag = flag;
		this.reamrk = reamrk;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}

	public String getReamrk() {
		return this.reamrk;
	}

	public void setReamrk(String reamrk) {
		this.reamrk = reamrk;
	}

}