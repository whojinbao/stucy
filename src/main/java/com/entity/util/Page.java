package com.entity.util;

public class Page {
	//�ڼ�ҳ
	private Integer page;
	//ÿҳ�ж�������
	private Integer rows;
	//�ڼ������ݿ�ʼ
	private int startIndex;
	//�ڼ������ݽ���
	private int endIndex;
	//ģ����ѯֵ
	private String selVal;
	
	public String getSelVal() {
		return selVal;
	}
	public void setSelVal(String selVal) {
		this.selVal = selVal;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public int getEndIndex() {
		return endIndex;
	}
	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}
	
}
