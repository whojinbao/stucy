package com.entity;

public class Auditinfo {
	private String   itemId ;//项目编号
	private String   auditId ;//审核人编号
	private String   auditAdvice ;//意见
	private String   isno;//是否通过
	private String   auditTime ;//审核时间
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getAuditId() {
		return auditId;
	}
	public void setAuditId(String auditId) {
		this.auditId = auditId;
	}
	public String getAuditAdvice() {
		return auditAdvice;
	}
	public void setAuditAdvice(String auditAdvice) {
		this.auditAdvice = auditAdvice;
	}
	public String getIsno() {
		return isno;
	}
	public void setIsno(String isno) {
		this.isno = isno;
	}
	public String getAuditTime() {
		return auditTime;
	}
	public void setAuditTime(String auditTime) {
		this.auditTime = auditTime;
	}
}
