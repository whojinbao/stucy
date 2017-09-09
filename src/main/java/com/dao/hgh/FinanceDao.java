package com.dao.hgh;

import java.util.List;
import java.util.Map;


import com.entity.util.Page;

public interface FinanceDao {
	public List<Map<String,Object>> queryFinance(Page page);
	public int queryAllFinance(Page page);
}
