package com.web.hgh;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.hgh.ParticularsService;
@Controller
@RequestMapping("/Particulars")
public class ParticularsController {
	@Autowired
	private ParticularsService particularsService;
	
	@RequestMapping("/queryParticulars")
	public @ResponseBody Map<String,Object> queryParticulars(){
		System.out.println("controller.................");
		Map<String,Object> map=particularsService.queryParticulars();
		System.out.println("controller++.................");
		return map;
	}
}
