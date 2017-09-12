package com.service.imp.hgh;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.hgh.StatisticsDao;
import com.entity.Member;

import com.service.hgh.StatisticsService;
/**
 * ��Ա����
 * @author HuGangHao
 *
 */
@Service
public class StatisticsServiceImpl implements StatisticsService {
	@Autowired
	private StatisticsDao dao; 	
	public void addStatistics(Member ss) {
		// TODO Auto-generated method stub
		//��õ�ǰʱ��
		Date newdate = new Date();
		//��ʽ
		SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
		String startdate = sdf.format(newdate);
		ss.setStartTime(startdate); 
		dao.addStatistics(ss);
	}

}
