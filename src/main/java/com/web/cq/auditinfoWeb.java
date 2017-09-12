package com.web.cq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Auditinfo;
import com.service.cq.auditinfoService;

@Controller
@RequestMapping("/cao")
public class auditinfoWeb {
	/*
	 * Ìí¼ÓÉóºË¼ÇÂ¼±í
	 */
	@Autowired
	private auditinfoService auditinfoService;
	@RequestMapping("/addAuditinfo")
	@ResponseBody
	public String addAuditinfo(Auditinfo af) {	
		 auditinfoService.addAuditinfo(af);
		 return "yes";
	}
}
