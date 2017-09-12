package com.web.who;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.who.QtItemDetailService;

/**  
* @Title: ConsumerController.java  
* @Package com.web.who  
* @Description: TODO(前端项目详情的控制器)
* @author who  
* @date 2017年9月11日  
*/  
@Controller
@RequestMapping("/qtitemdetail")
public class QtItemDetailController {
	/**
	 * 项目类型表格Service
	 */
	@Autowired
	private QtItemDetailService qService;
	
	@RequestMapping("/goqtitemdetail")
	public String getItemType(String itemId,String flag,HttpServletRequest request){
		request.getSession().setAttribute("qtitemId", itemId);	
		request.getSession().setAttribute("qtflag", flag);	
		return "qtitemdetail";
	}
	
	@RequestMapping("/addinvestor")
	public void addInvestor(@RequestBody Map<String,Object> map){
		qService.addInvestor(map);
	}
	
	@RequestMapping("/queryqtitem")
	@ResponseBody
	public Map<String, Object> queryQtItem(@RequestBody String Itemid){
		return qService.queryQtItem(Itemid);
	}
	
	
}
