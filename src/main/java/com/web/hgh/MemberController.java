package com.web.hgh;


import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.entity.Member;
import com.entity.util.Page;
import com.service.hgh.MemberService;
import com.service.hgh.StatisticsService;
@Controller
@RequestMapping("member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	@Autowired
	private StatisticsService statisticsService;
	@RequestMapping("/addmember")
	@Transactional
	public void addmember(@RequestBody String data,HttpServletResponse response){
		Member mr=JSON.parseObject(data, Member.class);			
		//会员金额记录表
		statisticsService.addStatistics(mr);
		//会员详情表 
		memberService.addmember(mr);
		try {
			response.getWriter().println("ok");
			response.getWriter().flush();
			response.getWriter().close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	/**
	 * 查询充值金额和账号
	 * @param response
	 */
	@RequestMapping("querymember")
	@ResponseBody
	public Map<String,Object> querymember(Page pg){
		System.out.println(pg.getPage()+" : "+pg.getRows()+" : "+pg.getSelVal());
		return memberService.querymember(pg);
	}
}
