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
* @Description: TODO(ǰ����Ŀ����Ŀ�����)
* @author who  
* @date 2017��9��11��  
*/  
@Controller
@RequestMapping("/qtitemdetail")
public class QtItemDetailController {
	/**
	 * ��Ŀ���ͱ��Service
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
