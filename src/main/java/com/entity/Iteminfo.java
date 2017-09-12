package com.entity;

import org.springframework.web.multipart.MultipartFile;

/** 
 * @author 作者郑飞: 
 * @version 创建时间：2017年8月30日 上午8:46:12 
 * 类说明 
 * Iteminfo 项目详情表
 */ 

public class Iteminfo {
	private String  itemId ;  //项目编号
	private String   userId ;  //项目申请人的账号
	private String   zName ;  //项目申请人的真实姓名	
	private String   itemName ;//项目名称
	private String   itemtypeId; //项目经营类型
	private String   itemareaId; //项目经营地区	
	private String   itemContent ;//项目内容
	private String   itemPhoto;//项目图片
	private int   itemMoney ;//项目资金
	private String itemStatus;//项目状态（0：未审核）
	private String startTime;//项目申请时间	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
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
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemtypeId() {
		return itemtypeId;
	}
	public void setItemtypeId(String itemtypeId) {
		this.itemtypeId = itemtypeId;
	}
	public String getItemareaId() {
		return itemareaId;
	}
	public void setItemareaId(String itemareaId) {
		this.itemareaId = itemareaId;
	}
	public String getItemContent() {
		return itemContent;
	}
	public void setItemContent(String itemContent) {
		this.itemContent = itemContent;
	}
	public String getItemPhoto() {
		return itemPhoto;
	}
	public void setItemPhoto(String itemPhoto) {
		this.itemPhoto = itemPhoto;
	}
	public int getItemMoney() {
		return itemMoney;
	}
	public void setItemMoney(int itemMoney) {
		this.itemMoney = itemMoney;
	}
	public String getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
}
