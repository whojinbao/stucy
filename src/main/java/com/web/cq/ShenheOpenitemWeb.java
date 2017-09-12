package com.web.cq;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Openitem;
import com.service.cq.ShenheOpenitemService;
@Controller
@RequestMapping("/cao")
public class ShenheOpenitemWeb {
	@Autowired
	private ShenheOpenitemService ShenheOpenitemService;
	@RequestMapping("/addShenheOpenitem")
	@ResponseBody
	public String addShenheOpenitem(Openitem ot) {
		Date now = new Date(); 
		System.out.println(now);
		SimpleDateFormat dateStart = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String starttime =dateStart.format(now); //获取发布的开始时间
		Long Interval=(long) (30L*24L*60L*60L*1000L);
		String Endtime=dateStart.format(now.getTime()+Interval);//获取发布的结束时间
		System.out.println(starttime);
		System.out.println(Endtime);
		ot.setStarttime(starttime);
		ot.setEndtime(Endtime);
		ShenheOpenitemService.addShenheOpenitem(ot);
		return "addShenheOpenitem";
		
	}
}
