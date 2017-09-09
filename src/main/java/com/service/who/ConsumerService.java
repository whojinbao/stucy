package com.service.who;

import java.util.Map;

import com.entity.Consumer;
import com.entity.util.Page;

/**  
* @Title: ConsumerDao.java  
* @Package com.dao.who  
* @Description: 后台用户表server接口
* @author who  
* @date 2017年8月31日  
*/  
public interface ConsumerService {
	
	/**
	 * @return
	 * 	返回一组包含所有用户信息数据的List
	 */
	public Map<String, Object> queryConsumer(Page pg);
	/**
	 * 添加一个员工到数据库Consumer表内
	 * @param con 包含数据的实体类Consumer
	 * @return 成功后返回的数字
	 */
	public void addConsumer(Consumer con);
	/**
	 * 更新员工的角色信息
	 * @param map
	 */
	public void updateConPart(Map<String, String> map);
	/**
	 * 根据员工账号查询数据库是否已存在该账号
	 */
	public int queryConOnly(String user);
	/**
	 * 更新员工信息
	 * @param con
	 */
	public void updateConsumerNew(Consumer con);
}
