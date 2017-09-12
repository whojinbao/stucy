package com.web.hgh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("financial")
public class FinaController {

	/**
	 * 跳转到会员充值
	 * @return
	 */
	@RequestMapping("/member")
	public String gomember(){
		return "member";
	}
	/**
	 * 跳转查询充值详情
	 * @return
	 */
	@RequestMapping("/search")
	public String goquermember(){
		return "search";
	}
	/**
	 * 跳转到会员金额统计
	 * @return
	 */
	@RequestMapping("/Finance")
	public String queryMemberitem(){
		return "Finance";
	}
	/**
	 * 跳转到个人中心
	 * @return
	 */
	@RequestMapping("/Personal")
	public String queryPersonan(){
		return "Personal";
	}	
	@RequestMapping("/Particulars")
	public String muban(){
		return "Particulars";
	}
}
