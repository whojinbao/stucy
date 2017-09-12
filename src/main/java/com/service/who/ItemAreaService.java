package com.service.who;

import java.util.List;
import java.util.Map;

import com.entity.Itemarea;
import com.entity.Itemtype;

/**  
* @Title: ItemtypeService.java  
* @Package com.service.who  
* @Description: TODO(地区的Service接口)  
* @author who  
* @date 2017年9月11日  
*/  
public interface ItemAreaService {
	/**
	 * @return 获取全部的地区
	 */
	public List<Itemarea> queryItemType();
	
}
