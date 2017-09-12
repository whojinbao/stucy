package com.service.imp.hgh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.hgh.FinanceDao;

import com.entity.util.Page;
import com.service.hgh.FinanceService;


@Service
public class FinanceServiceImpl implements FinanceService {
	@Autowired
	private FinanceDao dao;
	@Override
	public Map<String, Object> queryFinance(Page page) {
		// TODO Auto-generated method stub
		// 获得每页从那条数据开始
		int startIndex=(page.getPage()-1)*page.getRows();
		//获得每页从那天数据结束
		int endIndex=page.getPage()*(page.getRows()+1);
		page.setStartIndex(startIndex);
		page.setEndIndex(endIndex);
		//获得共多少条数据
		List<Map<String,Object>> list=dao.queryFinance(page);
		int total=dao.queryAllFinance(page);		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("rows",list );
		map.put("total",total);
		return map;
	}

}
