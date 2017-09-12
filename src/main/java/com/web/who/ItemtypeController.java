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
* @Description: TODO(��Ŀ���ͱ��Ŀ�����)
* @author who  
* @date 2017��9��11��  
*/  
@Controller
@RequestMapping("/itemtype")
public class ItemtypeController {
	/**
	 * ��Ŀ���ͱ��Service
	 */
	@Autowired 
	private ItemtypeService iService;
	
	@RequestMapping("/getitemtype")
	@ResponseBody
	public List<Itemtype> getItemType(){
	
		return iService.queryItemType();
	}
}
