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
 * @author 作者 郑飞: 
 * @version 创建时间：2017年8月30日 上午9:30:24 
 * 类说明  发布项目的控制器
 */ 

@Controller
@RequestMapping(value="/openitem")
public class OpenitemController {
	@Autowired
	public OpenitemService openitemservice;
	
	@Autowired
	public PersoninfoService personinfoservice;
	/**
	 * 查询所有已发布项目
	 * @param response
	 * @param request
	 */
	@RequestMapping(value="/itemlist")		
	public @ResponseBody List<Openitem> getlist(HttpSession session){	
		List<Openitem> itemlist = openitemservice.getOpenitems();	
		return itemlist;
	}
	
	@RequestMapping("/additem")	
	public @ResponseBody void additem(@RequestBody String str){
		System.out.println(str);
		Openitem openitem =  JSON.parseObject(str, Openitem.class);
		openitemservice.addOpenitem(openitem);
					
	}
	/**
	 * 查询单个已发布项目的详细详细，
	 * @param itemId
	 * @param model
	 * @return
	 */
	@RequestMapping("/openitemlogin")
	public String getOpenitem(@RequestParam("itemId") String itemId,Model model){		
		System.out.println(itemId);
		Openitem openitem = openitemservice.queryOpenitem(itemId);      
		model.addAttribute("openitem",openitem);	
		return "openitemlogin";
	}

	/**
	 * 在个人中心查询登录人的所有项目,个人信息
	 * @param userId
	 * @param model
	 * @return
	 */
	@RequestMapping("/person")
	public String getOpenitems(@RequestParam("userId") String userId,Model model,HttpSession session){		
		List<Openitem> openitems = openitemservice.queryOpenitems(userId);   
		Personinfo person = personinfoservice.queryPerson(userId);
		session.setAttribute("person", person);
		model.addAttribute("person",person);
		model.addAttribute("openitems",openitems);	
		return "person";
	}



}
