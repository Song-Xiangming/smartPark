package com.mdd.model;

/**
 * LgtCarDispatch entity. @author MyEclipse Persistence Tools
 */

public class LgtCarDispatch implements java.io.Serializable {

	// Fields

	private String id;
	private String terminalTel;
	private String content;
	private String mark;
	private String msgId;
	private String msgFlowId;
	private String carrierName;
	private String remove;
	private String msgDate;

	// Constructors

	/** default constructor */
	public LgtCarDispatch() {
		id = "";
		terminalTel = "";
		content = "";
		mark = "";
		msgId = "";
		msgFlowId = "";
		carrierName = "";
		remove = "";
		msgDate = "";
	}

	/** full constructor */
	public LgtCarDispatch(String terminalTel, String content, String mark,
			String msgId, String msgFlowId, String carrierName, String remove,
			String msgDate) {
		this.terminalTel = terminalTel;
		this.content = content;
		this.mark = mark;
		this.msgId = msgId;
		this.msgFlowId = msgFlowId;
		this.carrierName = carrierName;
		this.remove = remove;
		this.msgDate = msgDate;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTerminalTel() {
		return this.terminalTel;
	}

	public void setTerminalTel(String terminalTel) {
		this.terminalTel = terminalTel;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getMsgId() {
		return this.msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getMsgFlowId() {
		return this.msgFlowId;
	}

	public void setMsgFlowId(String msgFlowId) {
		this.msgFlowId = msgFlowId;
	}

	public String getCarrierName() {
		return this.carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getRemove() {
		return this.remove;
	}

	public void setRemove(String remove) {
		this.remove = remove;
	}

	public String getMsgDate() {
		return this.msgDate;
	}

	public void setMsgDate(String msgDate) {
		this.msgDate = msgDate;
	}

}