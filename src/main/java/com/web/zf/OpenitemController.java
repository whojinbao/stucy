package com.web.zf;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.entity.Openitem;
import com.entity.Personinfo;
import com.service.zf.OpenitemService;
import com.service.zf.PersoninfoService;

/** 
 * @author ���� ֣��: 
 * @version ����ʱ�䣺2017��8��30�� ����9:30:24 
 * ��˵��  ������Ŀ�Ŀ�����
 */ 

@Controller
@RequestMapping(value="/openitem")
public class OpenitemController {
	@Autowired
	public OpenitemService openitemservice;
	
	@Autowired
	public PersoninfoService personinfoservice;
	/**
	 * ��ѯ�����ѷ�����Ŀ
	 * @param response
	 * @param request
	 */
	@RequestMapping(value="/itemlist")		
	public @ResponseBody List<Openitem> getlist(HttpSession session){	
		List<Openitem> itemlist = openitemservice.getOpenitems();	
		return itemlist;
	}
	/**
	 * ������Ŀ
	 * @param str
	 */
	@RequestMapping("/additem")	
	public @ResponseBody void additem(@RequestBody String str){
		System.out.println(str);
		Openitem openitem =  JSON.parseObject(str, Openitem.class);
		openitemservice.addOpenitem(openitem);
					
	}
	/**
	 * ��ѯ�����ѷ�����Ŀ����ϸ��ϸ��
	 * @param itemId
	 * @param model
	 * @return
	 */
	@RequestMapping("/loginopenitem")
	public @ResponseBody Openitem getOpenitem(@RequestParam("itemId") String itemId){				
		Openitem openitem = openitemservice.queryOpenitem(itemId);      
		return openitem;
		
	}

	/**
	 * �ڸ������Ĳ�ѯ��¼�˵�������Ŀ
	 * @param userId
	 * @param model
	 * @return
	 */
	@RequestMapping("/personopenitem")
	public @ResponseBody List<Openitem> getOpenitems(HttpSession session){				
		//String userId = (String) session.getAttribute("userId");		
		List<Openitem> openitems = openitemservice.queryOpenitems("18614954003");  
		return openitems;
	}



}
