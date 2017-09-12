package com.service.who;

import java.util.List;
import java.util.Map;

/**  
* @Title: ItemtypeService.java  
* @Package com.service.who  
* @Description: TODO(项目类型表格的Service接口)  
* @author who  
* @date 2017年9月11日  
*/  
public interface QtItemDetailService {

	public void addInvestor(Map<String, Object> map);

	public Map<String, Object> queryQtItem(String itemid);
	
	
}
