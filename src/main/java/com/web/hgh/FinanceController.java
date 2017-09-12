package com.web.hgh;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.util.Page;
import com.service.hgh.FinanceService;
@Controller
@RequestMapping("/money")
public class FinanceController {
	@Autowired
	private FinanceService fService;
	@RequestMapping("/queryFinance")
	public @ResponseBody Map<String, Object> queryFinance(Page page){
		return fService.queryFinance(page);
	}
}
