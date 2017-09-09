package com.entity;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年8月30日 上午8:50:02 
* 类说明 
* Userinfo :登录时的用户表
*/ 
 
public class Userinfo {
	private String userId;//账号
	private String userPassword ;//密码
	private String userRole;//身份（1:创业人，2：投资人）
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}	
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}
