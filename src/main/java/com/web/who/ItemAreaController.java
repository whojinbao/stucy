package com.web.who;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Itemarea;
import com.service.who.ItemAreaService;

/**  
* @Title: ConsumerController.java  
* @Package com.web.who  
* @Description: TODO(����������)
* @author who  
* @date 2017��9��11��  
*/  
@Controller
@RequestMapping("/itemarea")
public class ItemAreaController {
	/**
	 * �������Service
	 */
	@Autowired 
	private ItemAreaService iService;
	
	@RequestMapping("/getitemarea")
	@ResponseBody
	public List<Itemarea> getItemType(){
		return iService.queryItemType();
	}
}
