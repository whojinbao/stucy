package com.entity;

/** 
* @author ���� E-mail: 
* @version ����ʱ�䣺2017��8��30�� ����8:51:38 
* ��˵�� 
* Openitem ��������Ŀ��
*/ 
 
public class Openitem {
	private String  itemId ;//��Ŀ���
	private String   itemName ;//��Ŀ����
	private String   itemIntro ;//��Ŀ���
	private String   itemtypeId; //��Ŀ����
	private String   itemareaId; //��Ŀ����	
	private String   userId ;//�������˺�
	private int   itemMoney ;//��Ŀ�ʽ�
	private String   itemStatus ;//��Ŀ״̬�������Ƿ���ɣ�
	private String   starttime ;//��Ŀ������ʼʱ��
	private String   endtime ;//��Ŀ��������ʱ��
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
