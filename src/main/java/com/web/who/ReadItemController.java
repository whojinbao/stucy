package com.web.who;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.who.ReadItemService;

@Controller
@RequestMapping("/readitem")
public class ReadItemController {
	@Autowired
	private ReadItemService rService;
	
	@RequestMapping("/getreaditem")
	@ResponseBody
	public List<Map<String, Object>> getReadItem(@RequestBody Map<String,Object> map){
		System.out.println(map+":aaaaaaaa");
		return rService.queryItem(map);
	}
	
	@RequestMapping("/getreaditemcount")
	@ResponseBody
	public Integer getReadItemCount(@RequestBody Map<String,Object> map){
		return rService.queryItemCount(map);
	}
}
