package com.entity;

/** 
* @author 作者 : zf
* @version 创建时间：2017年8月30日 上午9:56:31 
* 类说明 
* Personinfo : 申请成为项目发布人是要填的个人信息表
*/ 
 
public class Personinfo {
	private String   userId ;//账号
	private String   zName ;//真实姓名
	private String   sex ;//性别
	private String   telephone ;//电话
	private String   address ;//地址
	private String   noIdcard ;//身份证号码
	private String   zIdcard ;//身份证图片（正）
	private String   fIdcard ;//身份证图片(反)
	private String   photo;//本人照片
	
	
	
	
	
	
	
	
	
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getzName() {
		return zName;
	}
	public void setzName(String zName) {
		this.zName = zName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getNoIdcard() {
		return noIdcard;
	}
	public void setNoIdcard(String noIdcard) {
		this.noIdcard = noIdcard;
	}
	public String getzIdcard() {
		return zIdcard;
	}
	public void setzIdcard(String zIdcard) {
		this.zIdcard = zIdcard;
	}
	public String getfIdcard() {
		return fIdcard;
	}
	public void setfIdcard(String fIdcard) {
		this.fIdcard = fIdcard;
	}
	
	
}
