package com.service.who;

import java.util.Map;

import com.entity.Consumer;
import com.entity.util.Page;

/**  
* @Title: ConsumerDao.java  
* @Package com.dao.who  
* @Description: ��̨�û���server�ӿ�
* @author who  
* @date 2017��8��31��  
*/  
public interface ConsumerService {
	
	/**
	 * @return
	 * 	����һ����������û���Ϣ���ݵ�List
	 */
	public Map<String, Object> queryConsumer(Page pg);
	/**
	 * ���һ��Ա�������ݿ�Consumer����
	 * @param con �������ݵ�ʵ����Consumer
	 * @return �ɹ��󷵻ص�����
	 */
	public void addConsumer(Consumer con);
	/**
	 * ����Ա���Ľ�ɫ��Ϣ
	 * @param map
	 */
	public void updateConPart(Map<String, String> map);
	/**
	 * ����Ա���˺Ų�ѯ���ݿ��Ƿ��Ѵ��ڸ��˺�
	 */
	public int queryConOnly(String user);
	/**
	 * ����Ա����Ϣ
	 * @param con
	 */
	public void updateConsumerNew(Consumer con);
}
