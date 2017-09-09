package com.service.who;

import java.util.Map;

import com.entity.util.Page;

/**  
* @Title: JurisdictionService.java  
* @Package com.service.who  
* @Description: TODO(service权限的数据处理层接口)  
* @author who  
* @date 2017年9月8日  
*/  
public interface JurisdictionService {
	
	/**
	 * 获取所有员工信息
	 */
	public Map<String,Object> queryJuri(Page pg);
	
	/**
	 * 禁用一个权限
	 */
	public void disableJuri(String jurId);
	
	/**
	 * 启用一个权限
	 */
	public void enableJuri(String jurId);
}
