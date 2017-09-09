package com.web.cq;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Investorinfo;
import com.entity.Itemarea;
import com.entity.Itemtype;
import com.entity.Userinfo;
import com.entity.util.OpenitemInvestorinfoBoth;
import com.service.cq.InvestorinfoService;
import com.service.cq.ItemareaService;
import com.service.cq.ItemtypeService;
import com.service.cq.OpenitemInvestorinfoBothService;

@Controller
public class Itemtypeweb {
	/*
	 *查询每个项目类型有哪些项目
	 *查询每个地区有哪些项目
	 *查询投资的项目
	 */
	@Autowired
	private ItemtypeService ItemtypeService;
	@Autowired
	private ItemareaService ItemareaService;
	@Autowired
	private OpenitemInvestorinfoBothService OpenitemInvestorinfoBothService;
	@Autowired
	private InvestorinfoService InvestorinfoService;
	@RequestMapping(value="/item")
	public String queryItemtype(Model mm,HttpServletRequest request){
		Userinfo phone=(Userinfo)(request.getSession().getAttribute("phone"));
		List<Itemtype> lItemtype=ItemtypeService.queryItemtype();
		List<Itemarea> lItemarea=ItemareaService.queryItemarea();
		List<OpenitemInvestorinfoBoth> lIf=OpenitemInvestorinfoBothService.queryOpenitemInvestorinfoBoth();
		List<OpenitemInvestorinfoBoth> lb=OpenitemInvestorinfoBothService.queryOpenitem();
		Investorinfo inf=InvestorinfoService.queryInvestorinfoId(phone);
		mm.addAttribute("lItemtype", lItemtype);
		mm.addAttribute("lItemarea", lItemarea);
		mm.addAttribute("lIf", lIf);
		mm.addAttribute("lb", lb);
		mm.addAttribute("pk",inf);
		return "Cq/item";
	}
	
	
}
