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
	private String   itemIntro ;//��Ŀ���
	private String   itemtypeId; //��Ŀ����
	private String   itemareaid; //��Ŀ����	
	private String   itemContent ;//��Ŀ����
	private String   itemmaterials;//��Ŀ����
	private int   itemMoney ;//��Ŀ�ʽ�
	private String itemStatus;//��Ŀ״̬��1��δ��ˣ�
	private String itemOpentime;//��Ŀ����ʱ��
	
	
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
