package com.dao.who;

import java.util.List;
import java.util.Map;

import com.entity.Consumer;
import com.entity.util.Page;

/**  
* @Title: ConsumerDao.java  
* @Package com.dao.who  
* @Description: ��̨�û���Dao�ӿ�
* @author who  
* @date 2017��8��31��  
*/  
public interface ConsumerDao {
	
	/**
	 * @return
	 * 	����һ����������û���Ϣ���ݵ�List
	 */
	public List<Map<String, Object>> queryConsumer(Page page);
	
	/**
	 * ���һ��Ա�������ݿ�Consumer����
	 * @param con �������ݵ�ʵ����Consumer
	 */
	public void addConsumer(Consumer con);
	/**
	 * ��ѯԱ����Ϣ���ܸ�������������ѯ��ҳ��
	 */
	public Integer getCount(Page page);
	/**
	 * ���ý����û�
	 */
	public void updateConPart(Map<String, String> map);
	
	/**
	 * ����Ա��ID��ѯ��ӵ�е�Ȩ�� 
	 */
	public List<Map<String,Object>> queryConPartJuri(String userId);
	/**
	 * �˻���Ψһ�Բ�ѯ
	 */
	public List<Map<String,Object>> queryConOnly(String user);
	/**
	 * ����Ա����Ϣ
	 * @param con
	 */
	public void updateConsumerNew(Consumer con);
	/**
	 * shrioר���˻�����ƥ���ѯ 
	 */
	public List<Consumer> queryUser(String userName);
}
