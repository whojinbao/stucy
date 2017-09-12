package com.service.imp.who;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.who.QtItemDetailDao;
import com.service.who.QtItemDetailService;
@Service
public class QtItemDetailServiceImp implements QtItemDetailService {
	@Autowired
	private QtItemDetailDao dao;
	@Override
	public void addInvestor(Map<String, Object> map) {
		Date date=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time=sdf.format(date);
		System.out.println(time);
		map.put("investorTime", time);
		dao.addInvestor(map);

	}
	@Override
	public Map<String, Object> queryQtItem(String itemid) {
		Map<String, Object> map=dao.queryQtItem(itemid).get(0);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time=(String) map.get("START_TIME");
		String time1="";
		try {
			Date date=sdf.parse(time);
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyƒÍMM‘¬dd»’");
			time1=sdf1.format(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("START_TIME", time1);
		return map;
		
	}

}
