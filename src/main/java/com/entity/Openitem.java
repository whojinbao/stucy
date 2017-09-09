package com.entity;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年8月30日 上午8:51:38 
* 类说明 
* Openitem ：发布项目表
*/ 
 
public class Openitem {
	private String  itemId ;//项目编号
	private String   itemName ;//项目名称
	private String   itemIntro ;//项目简介
	private String   itemtypeId; //项目类型
	private String   itemareaId; //项目地区	
	private String   userId ;//发布人账号
	private int   itemMoney ;//项目资金
	private String   itemStatus ;//项目状态（集资是否完成）
	private String   starttime ;//项目发布开始时间
	private String   endtime ;//项目发布结束时间
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
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
	public String getItemareaId() {
		return itemareaId;
	}
	public void setItemareaId(String itemareaId) {
		this.itemareaId = itemareaId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	
}
