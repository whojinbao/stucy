package com.entity;

/** 
* @author ���� E-mail: 
* @version ����ʱ�䣺2017��8��30�� ����8:51:38 
* ��˵�� 
* Openitem ��������Ŀ��
*/ 
 
public class Openitem {
	
	private String  itemId ;//��Ŀ���	
	private String  itemName ;//��Ŀ����
	private String   itemStatus ;//��Ŀ״̬�������Ƿ���ɣ�
	private String   starttime ;//��Ŀ������ʼʱ��
	private String   endtime ;//��Ŀ��������ʱ��
	
	
	
	
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
