package com.service.who;

import java.util.List;

import com.entity.Itemtype;

/**  
* @Title: ItemtypeService.java  
* @Package com.service.who  
* @Description: TODO(��Ŀ���ͱ���Service�ӿ�)  
* @author who  
* @date 2017��9��11��  
*/  
public interface ItemtypeService {
	/**
	 * @return ��ȡȫ������Ŀ���͵�
	 */
	public List<Itemtype> queryItemType();
	
}
