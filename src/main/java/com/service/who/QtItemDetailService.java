package com.service.who;

import java.util.List;
import java.util.Map;

/**  
* @Title: ItemtypeService.java  
* @Package com.service.who  
* @Description: TODO(��Ŀ���ͱ���Service�ӿ�)  
* @author who  
* @date 2017��9��11��  
*/  
public interface QtItemDetailService {

	public void addInvestor(Map<String, Object> map);

	public Map<String, Object> queryQtItem(String itemid);
	
	
}
