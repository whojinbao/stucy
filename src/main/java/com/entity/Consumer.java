package com.entity;

/**  
* @Title: Consumer.java  
* @Package com.entity  
* @Description: 后台用户表实体类 
* @author who  
* @date 2017年8月31日  
*/  
public class Consumer {
	private String conId ; 		//用户ID
	private String conUser ;	//用户账户名
	private String conName ;	//用户名字
	private String conPassword ;//用户密码
	private String sex ;		//性别
	private String tel ;		//电话
	private String home ;		//家庭住址
	private String idCardurl ;	//身份证图片
	private String conStatus ;	//账号状态
	
	public String getConId() {
		return conId;
	}
	public void setConId(String conId) {
		this.conId = conId;
	}
	public String getConUser() {
		return conUser;
	}
	public void setConUser(String conUser) {
		this.conUser = conUser;
	}
	public String getConPassword() {
		return conPassword;
	}
	public void setConPassword(String conPassword) {
		this.conPassword = conPassword;
	}
	public String getConName() {
		return conName;
	}
	public void setConName(String conName) {
		this.conName = conName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getIdCardurl() {
		return idCardurl;
	}
	public void setIdCardurl(String idCardurl) {
		this.idCardurl = idCardurl;
	}
	public String getConStatus() {
		return conStatus;
	}
	public void setConStatus(String conStatus) {
		this.conStatus = conStatus;
	}
	
}
