package com.service.who;

import java.util.List;
import java.util.Map;

import com.entity.Itemtype;

/**  
* @Title: ItemtypeService.java  
* @Package com.service.who  
* @Description: TODO(ǰ̨���ݶ�ȡ��Service�ӿ�)  
* @author who  
* @date 2017��9��11��  
*/  
public interface ReadItemService {
	/**
	 * @return ��ȡȫ������˷�������Ŀ���͵�
	 */
	public List<Map<String,Object>> queryItem(Map<String,Object> map);
	
	/**
	 * ǰ�˶�ȡ��Ŀ��������
	 */
	public int queryItemCount(Map<String,Object> map);
	
}
