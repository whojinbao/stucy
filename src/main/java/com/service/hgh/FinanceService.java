package com.service.hgh;


import java.util.Map;

import com.entity.util.Page;

public interface FinanceService {
	public Map<String,Object> queryFinance(Page page);
	
}
