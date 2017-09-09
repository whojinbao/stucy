package com.entity;

public class Member {
	//账号
	private String userId;
	//类型
	private String memberType;
	
	//内容
	private String memberContent;
	//开通时长
	private String memberTime;
	//一次金额
	private String memberMonsy;
	//会员开通时间
	private String startTime;
	//会员结束时间
	private String endTime;
	//发布次数
	private String count;
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
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
	public String getMemberTime() {
		return memberTime;
	}
	public void setMemberTime(String memberTime) {
		this.memberTime = memberTime;
	}
	public String getMemberMonsy() {
		return memberMonsy;
	}
	public void setMemberMonsy(String memberMonsy) {
		this.memberMonsy = memberMonsy;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
}
