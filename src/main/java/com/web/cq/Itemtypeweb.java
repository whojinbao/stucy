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
import com.service.cq.ItemareaService;
import com.service.cq.ItemtypeService;

@Controller
public class Itemtypeweb {
	/*
	 *��ѯÿ����Ŀ��������Щ��Ŀ
	 *��ѯÿ����������Щ��Ŀ
	 *��ѯͶ�ʵ���Ŀ
	 */
	@Autowired
	private ItemtypeService ItemtypeService;
	@Autowired
	private ItemareaService ItemareaService;
	@Autowired
	@RequestMapping(value="/item")
	public String queryItemtype(Model mm,HttpServletRequest request){
		Userinfo phone=(Userinfo)(request.getSession().getAttribute("phone"));
		List<Itemtype> lItemtype=ItemtypeService.queryItemtype();
		List<Itemarea> lItemarea=ItemareaService.queryItemarea();
		mm.addAttribute("lItemtype", lItemtype);
		mm.addAttribute("lItemarea", lItemarea);
		return "Cq/item";
	}
	
	
}
