package com.entity;

import org.springframework.web.multipart.MultipartFile;

/** 
 * @author ����֣��: 
 * @version ����ʱ�䣺2017��8��30�� ����8:46:12 
 * ��˵�� 
 * Iteminfo ��Ŀ�����
 */ 

public class Iteminfo {
	private String  itemId ;  //��Ŀ���
	private String   userId ;  //��Ŀ�����˵��˺�
	private String   zName ;  //��Ŀ�����˵���ʵ����	
	private String   itemName ;//��Ŀ����
	private String   itemtypeId; //��Ŀ��Ӫ����
	private String   itemareaId; //��Ŀ��Ӫ����	
	private String   itemContent ;//��Ŀ����
	private String   itemPhoto;//��ĿͼƬ
	private int   itemMoney ;//��Ŀ�ʽ�
	private String itemStatus;//��Ŀ״̬��0��δ��ˣ�
	private String startTime;//��Ŀ����ʱ��	
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
