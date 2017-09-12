package com.web.cq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Iteminfo;
import com.service.cq.IteminfoUpdateService;

@Controller
@RequestMapping("/cao")
public class IteminfoUpdateWeb {
	@Autowired
	private IteminfoUpdateService IteminfoUpdateService;
	@RequestMapping("/updateIteminfo")
	@ResponseBody
	public String updateIteminfo(Iteminfo itf){
		IteminfoUpdateService.updateIteminfo(itf);
		return "yes";
	}
	
	@RequestMapping("/goshenhelogging")
	public String goshenhelogging(){
		return "Cq/shenhelogging";
	}
}
