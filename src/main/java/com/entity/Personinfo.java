package com.entity;

/** 
* @author 作者 E-mail: 
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
	private String   idCardnum ;//身份证号码
	private String   idCardurl ;//身份证图片
	private String   photoUrl  ;//本人照片
	private String   schphotoUrl ;//学信网截图
	private String   stuNum ;//学号
	private String   stuPhoto ;//学生证照片
	private String   schName ;//学校名称
	private String   schAddress;//学校地址
	private String   credit ;//信用
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
	public String getIdCardnum() {
		return idCardnum;
	}
	public void setIdCardnum(String idCardnum) {
		this.idCardnum = idCardnum;
	}
	public String getIdCardurl() {
		return idCardurl;
	}
	public void setIdCardurl(String idCardurl) {
		this.idCardurl = idCardurl;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getSchphotoUrl() {
		return schphotoUrl;
	}
	public void setSchphotoUrl(String schphotoUrl) {
		this.schphotoUrl = schphotoUrl;
	}
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	public String getStuPhoto() {
		return stuPhoto;
	}
	public void setStuPhoto(String stuPhoto) {
		this.stuPhoto = stuPhoto;
	}
	public String getSchName() {
		return schName;
	}
	public void setSchName(String schName) {
		this.schName = schName;
	}
	
	public String getSchAddress() {
		return schAddress;
	}
	public void setSchAddress(String schAddress) {
		this.schAddress = schAddress;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	
}
