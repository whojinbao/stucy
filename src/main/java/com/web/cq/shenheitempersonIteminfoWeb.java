package com.web.cq;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Consumer;
import com.service.cq.shenheitempersonIteminfoService;
@Controller
@RequestMapping("/cao")
public class shenheitempersonIteminfoWeb {
	/*
	 * ��ѯ��Ŀ�˺��������Ŀ����
	 */
	@Autowired
	private shenheitempersonIteminfoService shenheitempersonIteminfoService;
	@RequestMapping("/goSeedetails")
	public String ItempersonIteminfo(){	
		return "Cq/shenheDetails";
	}
	@RequestMapping("/Seedetails")
	@ResponseBody
	public Map<String,Object> queryItempersonIteminfo(){
		return shenheitempersonIteminfoService.queryitemperson();
	}
	@RequestMapping("/hong")
	@ResponseBody
	public String query(HttpServletRequest request){
		Consumer con1=(Consumer) request.getSession().getAttribute("conUser");//��Ա������Ϣ
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//���Է�����޸����ڸ�ʽ 
		String ShenheTime = dateFormat.format( now ); //��ȡ��˵ĵ�ǰʱ��
		String str=con1.getConName()+","+con1.getConUser()+","+ShenheTime;
		return str;
	}
}
