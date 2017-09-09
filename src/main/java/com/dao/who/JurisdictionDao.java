package com.dao.who;

import java.util.List;

import com.entity.Jurisdiction;
import com.entity.util.Page;


/**  
* @Title: JurisdictionDao.java  
* @Package com.dao.who  
* @Description: Ȩ�ޱ��Dao�ӿ� 
* @author who  
* @date 2017��9��2��  
*/  
public interface JurisdictionDao {
	
	/**
	 * @return
	 * 	����һ����������û���Ϣ���ݵ�List
	 */
	public List<Jurisdiction> queryJuri(Page pg);
	
	/**
	 * ����һ��Ȩ��
	 */
	public void disableJuri(String jurId);
	
	/**
	 * ����һ��Ȩ��
	 */
	public void enableJuri(String jurId);
	/**
	 * ��ѯȨ�޵�����
	 */
	public int queryCountJur();
	
	
}
