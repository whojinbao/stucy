package com.dao.who;

import java.util.List;
import java.util.Map;

/**  
* @Title: ReadItem.java  
* @Package com.dao.who  
* @Description: TODO(��Ŀǰ�˶�ȡ��Dao�ӿ�)  
* @author who  
* @date 2017��9��11��  
*/  
public interface ReadItemDao {
	/**
	 * ǰ�˶�ȡ��Ŀ����
	 * @param map ��ҳ��������ѯ����
	 * @return ���з��ϵ�����
	 */
	public List<Map<String,Object>> queryItem(Map<String,Object> map);
	/**
	 * ǰ�˶�ȡ��Ŀ��������
	 * @param map ��ҳ��������ѯ����
	 * @return ���з��ϵ�����
	 */
	public int queryItemCount(Map<String,Object> map);
}
