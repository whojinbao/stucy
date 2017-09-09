package com.service.imp.cq;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.cq.shenheitempersonIteminfoDao;
import com.service.cq.shenheitempersonIteminfoService;
@Service
public class shenheitempersonIteminfoImpl implements shenheitempersonIteminfoService{
	/*
	 * 查询项目人和申请的项目详情
	 */
	@Autowired
	private shenheitempersonIteminfoDao shenheitempersonIteminfoDao;
	public Map<String, Object> queryitemperson() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> lm=shenheitempersonIteminfoDao.queryitemperson();
		Map<String,Object> mr=new HashMap<String,Object>();
		mr.put("total", lm.size());
		mr.put("rows", lm);
		return mr;
	}

}
