package com.dao.who;

import java.util.List;
import java.util.Map;


public interface QtItemDetailDao {
	public void addInvestor(Map<String, Object> map);

	public List<Map<String, Object>> queryQtItem(String itemId);
}
