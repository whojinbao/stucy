package com.service.who;

import java.util.List;

import com.entity.Itemtype;

/**  
* @Title: ItemtypeService.java  
* @Package com.service.who  
* @Description: TODO(项目类型表格的Service接口)  
* @author who  
* @date 2017年9月11日  
*/  
public interface ItemtypeService {
	/**
	 * @return 获取全部的项目类型的
	 */
	public List<Itemtype> queryItemType();
	
}
