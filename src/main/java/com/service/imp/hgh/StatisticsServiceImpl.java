package com.service.imp.hgh;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.hgh.StatisticsDao;
import com.entity.Member;

import com.service.hgh.StatisticsService;
/**
 * 会员详情
 * @author HuGangHao
 *
 */
@Service
public class StatisticsServiceImpl implements StatisticsService {
	@Autowired
	private StatisticsDao dao; 	
	public void addStatistics(Member ss) {
		// TODO Auto-generated method stub
		//获得当前时间
		Date newdate = new Date();
		//格式
		SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
		String startdate = sdf.format(newdate);
		ss.setStartTime(startdate); 
		dao.addStatistics(ss);
	}

}
