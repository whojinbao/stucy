package com.web.cq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class shenheWeb {
	
	@RequestMapping("/shenhe")
		public String shenhe(){
			
			return "Cq/shenhe";
		}
}
