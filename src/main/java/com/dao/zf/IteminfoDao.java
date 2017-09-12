package com.dao.zf;

import java.util.List;

import com.entity.Iteminfo;

/** 
* @author ���� :֣�� 
* @version ����ʱ�䣺2017��8��31�� ����9:57:00 
* ��˵�� 
* ����Ŀ�����Ĳ��� ��������Ŀ��ͬʱ����Ŀ�������룬��ѯ������Ŀ�����
*/ 
 
public interface IteminfoDao {
	/**
	 * ��ѯ������Ŀ
	 * @return
	 */
	public Iteminfo queryIteminfo(String itemId);
	/**
	 * �����Ŀ����� ,
	 * @param iteminfo ��Ŀ����
	 * @return
	 */
	public int addIteminfo(Iteminfo iteminfo);
	/**
	 * ��ѯ������������Ŀ
	 * @return
	 */
	public List<Iteminfo> getIteminfos();
}
