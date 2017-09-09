package com.web.who;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.util.Page;
import com.service.who.JurisdictionService;

 
/**  
* @Title: JurisdictionController.java  
* @Package com.web.who  
* @Description: 权限控制器 
* @author who  
* @date 2017年9月8日  
*/  
@Controller
@RequestMapping("/juri")
public class JurisdictionController {
	
	@Autowired
	private JurisdictionService jurService;
	
	/**
	 * 获取所有员工信息
	 */
	@RequestMapping("/getjuri")
	@ResponseBody
	public Map<String,Object> getJuri(Page pg){
		return jurService.queryJuri(pg);
		
	};
	/**
	 * 启用权限
	 */
	@RequestMapping("/enable")
	public void enable(@RequestBody String str){
		jurService.enableJuri(str);
		
	};
	/**
	 * 禁用权限
	 */
	@RequestMapping("/disable")
	public void disable(@RequestBody String str){
		jurService.disableJuri(str);
		
	};
	
	
}
