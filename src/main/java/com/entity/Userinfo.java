package com.entity;

/** 
* @author ���� E-mail: 
* @version ����ʱ�䣺2017��8��30�� ����8:50:02 
* ��˵�� 
* Userinfo :��¼ʱ���û���
*/ 
 
public class Userinfo {
	private String userId;//�˺�
	private String userPassword ;//����
	private String userRole;//��ݣ�1:��ҵ�ˣ�2��Ͷ���ˣ�
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
