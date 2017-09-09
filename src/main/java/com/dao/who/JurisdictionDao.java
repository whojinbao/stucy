package com.dao.who;

import java.util.List;

import com.entity.Jurisdiction;
import com.entity.util.Page;


/**  
* @Title: JurisdictionDao.java  
* @Package com.dao.who  
* @Description: 权限表格Dao接口 
* @author who  
* @date 2017年9月2日  
*/  
public interface JurisdictionDao {
	
	/**
	 * @return
	 * 	返回一组包含所有用户信息数据的List
	 */
	public List<Jurisdiction> queryJuri(Page pg);
	
	/**
	 * 禁用一个权限
	 */
	public void disableJuri(String jurId);
	
	/**
	 * 启用一个权限
	 */
	public void enableJuri(String jurId);
	/**
	 * 查询权限的总数
	 */
	public int queryCountJur();
	
	
}
