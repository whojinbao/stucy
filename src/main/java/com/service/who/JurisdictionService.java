package com.service.who;

import java.util.Map;

import com.entity.util.Page;

/**  
* @Title: JurisdictionService.java  
* @Package com.service.who  
* @Description: TODO(serviceȨ�޵����ݴ����ӿ�)  
* @author who  
* @date 2017��9��8��  
*/  
public interface JurisdictionService {
	
	/**
	 * ��ȡ����Ա����Ϣ
	 */
	public Map<String,Object> queryJuri(Page pg);
	
	/**
	 * ����һ��Ȩ��
	 */
	public void disableJuri(String jurId);
	
	/**
	 * ����һ��Ȩ��
	 */
	public void enableJuri(String jurId);
}
