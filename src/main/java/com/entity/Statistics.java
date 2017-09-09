package com.entity;
//会员金额统计
public class Statistics {
	//账号
	private String userId;
	//类型
	private String memberType;
	//使用项
	private String memberContent;
	//充值金额
	private String memberMonsy;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public String getMemberContent() {
		return memberContent;
	}
	public void setMemberContent(String memberContent) {
		this.memberContent = memberContent;
	}
	public String getMemberMonsy() {
		return memberMonsy;
	}
	public void setMemberMonsy(String memberMonsy) {
		this.memberMonsy = memberMonsy;
	}
}
