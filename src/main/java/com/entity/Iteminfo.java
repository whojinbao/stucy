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
	private String   userId ;  //项目发布人的账号
	private String   zName ;  //项目发布人的真实姓名	
	private String   itemName ;//项目名称
	private String   itemIntro ;//项目简介
	private String   itemtypeId; //项目类型
	private String   itemareaid; //项目地区	
	private String   itemContent ;//项目内容
	private String   itemmaterials;//项目附件
	private int   itemMoney ;//项目资金
	private String itemStatus;//项目状态（1：未审核）
	private String itemOpentime;//项目申请时间
	
	
	public String getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	public String getItemOpentime() {
		return itemOpentime;
	}
	public void setItemOpentime(String itemOpentime) {
		this.itemOpentime = itemOpentime;
	}

	public String getzName() {
		return zName;
	}
	public void setzName(String zName) {
		this.zName = zName;
	}
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
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemIntro() {
		return itemIntro;
	}
	public void setItemIntro(String itemIntro) {
		this.itemIntro = itemIntro;
	}
	public String getItemtypeId() {
		return itemtypeId;
	}
	public void setItemtypeId(String itemtypeId) {
		this.itemtypeId = itemtypeId;
	}
	public String getItemareaid() {
		return itemareaid;
	}
	public void setItemareaid(String itemareaid) {
		this.itemareaid = itemareaid;
	}
	public String getItemContent() {
		return itemContent;
	}
	public void setItemContent(String itemContent) {
		this.itemContent = itemContent;
	}
	public String getItemmaterials() {
		return itemmaterials;
	}
	public void setItemmaterials(String itemmaterials) {
		this.itemmaterials = itemmaterials;
	}
	public int getItemMoney() {
		return itemMoney;
	}
	public void setItemMoney(int itemMoney) {
		this.itemMoney = itemMoney;
	}

}
