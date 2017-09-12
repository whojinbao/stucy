package com.web.who;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Itemtype;
import com.service.who.ItemtypeService;

/**  
* @Title: ConsumerController.java  
* @Package com.web.who  
* @Description: TODO(项目类型表格的控制器)
* @author who  
* @date 2017年9月11日  
*/  
@Controller
@RequestMapping("/itemtype")
public class ItemtypeController {
	/**
	 * 项目类型表格Service
	 */
	@Autowired 
	private ItemtypeService iService;
	
	@RequestMapping("/getitemtype")
	@ResponseBody
	public List<Itemtype> getItemType(){
	
		return iService.queryItemType();
	}
}
