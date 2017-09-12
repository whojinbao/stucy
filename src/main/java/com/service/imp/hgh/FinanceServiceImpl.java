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
		// ���ÿҳ���������ݿ�ʼ
		int startIndex=(page.getPage()-1)*page.getRows();
		//���ÿҳ���������ݽ���
		int endIndex=page.getPage()*(page.getRows()+1);
		page.setStartIndex(startIndex);
		page.setEndIndex(endIndex);
		//��ù�����������
		List<Map<String,Object>> list=dao.queryFinance(page);
		int total=dao.queryAllFinance(page);		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("rows",list );
		map.put("total",total);
		return map;
	}

}
