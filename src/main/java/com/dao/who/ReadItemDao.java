package com.dao.who;

import java.util.List;
import java.util.Map;

/**  
* @Title: ReadItem.java  
* @Package com.dao.who  
* @Description: TODO(项目前端读取的Dao接口)  
* @author who  
* @date 2017年9月11日  
*/  
public interface ReadItemDao {
	/**
	 * 前端读取项目数据
	 * @param map 分页及条件查询参数
	 * @return 所有符合的数据
	 */
	public List<Map<String,Object>> queryItem(Map<String,Object> map);
	/**
	 * 前端读取项目数据总数
	 * @param map 分页及条件查询参数
	 * @return 所有符合的数据
	 */
	public int queryItemCount(Map<String,Object> map);
}
