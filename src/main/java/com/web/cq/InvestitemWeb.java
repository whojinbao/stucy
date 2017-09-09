package com.web.cq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.entity.Investitem;
import com.service.cq.InvestitemService;
import com.service.cq.ItemtypeService;

@Controller
public class InvestitemWeb {
	//閹绘帒鍙嗛幎鏇＄カ妞ゅ湱娲扮悰锟�	
	@Autowired
	private InvestitemService InvestitemService;
	@RequestMapping(value="/addInvestitem")
	@ResponseBody
	public String addInvestitem(@RequestBody String json){
		Investitem iv=JSON.parseObject(json, Investitem.class);
		if(InvestitemService.addInvestitem(iv)==0){
			return null;
		}else{
			return "addInvestitem";
		}
	}
	@RequestMapping(value="/ja")
	public String add(){
		
		return "Cq/renzheng";
	}
}
