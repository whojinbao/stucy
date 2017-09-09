package com.dao.who;

import java.util.List;
import java.util.Map;

import com.entity.Consumer;
import com.entity.util.Page;

/**  
* @Title: ConsumerDao.java  
* @Package com.dao.who  
* @Description: 后台用户表Dao接口
* @author who  
* @date 2017年8月31日  
*/  
public interface ConsumerDao {
	
	/**
	 * @return
	 * 	返回一组包含所有用户信息数据的List
	 */
	public List<Map<String, Object>> queryConsumer(Page page);
	
	/**
	 * 添加一个员工到数据库Consumer表内
	 * @param con 包含数据的实体类Consumer
	 */
	public void addConsumer(Consumer con);
	/**
	 * 查询员工信息的总个数（含条件查询分页）
	 */
	public Integer getCount(Page page);
	/**
	 * 启用禁用用户
	 */
	public void updateConPart(Map<String, String> map);
	
	/**
	 * 根据员工ID查询所拥有的权限 
	 */
	public List<Map<String,Object>> queryConPartJuri(String userId);
	/**
	 * 账户名唯一性查询
	 */
	public List<Map<String,Object>> queryConOnly(String user);
	/**
	 * 更新员工信息
	 * @param con
	 */
	public void updateConsumerNew(Consumer con);
	/**
	 * shrio专用账户密码匹配查询 
	 */
	public List<Consumer> queryUser(String userName);
}
