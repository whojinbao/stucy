package com.service.zf;

import java.util.List;

import com.entity.Iteminfo;


/** 
* @author ���� :֣�� 
* @version ����ʱ�䣺2017��9��1�� ����9:03:28 
* ��˵��   
*/ 
 
public interface IteminfoService {
	/**
	 * getOpenitems ����ѯ�������������Ŀ
	 * @return
	 */
    public List<Iteminfo> getIteminfos();
    /**
	 * ��ѯ������Ŀ
	 * @return
	 */
	public Iteminfo queryIteminfo(String itemId);
	/**
	 * �����Ŀ ,
	 * @param iteminfo ��Ŀ����
	 * @return
	 */
	public int addIteminfo(Iteminfo iteminfo);
}
