package com.web.cq;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@ResponseBody
	public Map<String,Object> queryItempersonIteminfo(){
		return shenheitempersonIteminfoService.queryitemperson();
	}
}
