package com.service.who;

import java.util.List;
import java.util.Map;

import com.entity.Itemtype;

/**  
* @Title: ItemtypeService.java  
* @Package com.service.who  
* @Description: TODO(前台数据读取的Service接口)  
* @author who  
* @date 2017年9月11日  
*/  
public interface ReadItemService {
	/**
	 * @return 获取全部已审核发布的项目类型的
	 */
	public List<Map<String,Object>> queryItem(Map<String,Object> map);
	
	/**
	 * 前端读取项目数据总数
	 */
	public int queryItemCount(Map<String,Object> map);
	
}
