package com.entity;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年8月30日 上午8:51:38 
* 类说明 
* Openitem ：发布项目表
*/ 
 
public class Openitem {
	
	private String  itemId ;//项目编号	
	private String  itemName ;//项目名称
	private String   itemStatus ;//项目状态（集资是否完成）
	private String   starttime ;//项目发布开始时间
	private String   endtime ;//项目发布结束时间
	
	
	
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
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
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
}
