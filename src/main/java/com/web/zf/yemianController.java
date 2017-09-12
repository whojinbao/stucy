package com.web.zf;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.an.UserinfoService;
import com.service.zf.ItemareaService;
import com.service.zf.ItemtypeService;
import com.service.zf.PersoninfoService;

/** 
 * @author 作者 :郑飞 
 * @version 创建时间：2017年9月1日 上午8:40:46 
 * 类说明   页面跳转控制器
 */ 
@Controller
@RequestMapping("/yemian")
public class yemianController {	
	/**
	 * 跳转到可发布的项目页面
	 * @return
	 */
	@RequestMapping("/openitem")
	public String goOpenitem(){
		return "openitem";
	}
	/**
	 * 跳转显示所有提交申请的项目页面
	 * @return
	 */
	@RequestMapping("/iteminfo")
	public String goiteminfo(){
		return "iteminfo";
	}
	/**
	 * 跳转到显示所有项目发布人个人信息页面
	 * @return
	 */
	@RequestMapping("/personinfo")
	public String goPersoninfo(){
		return "personinfo";
	}
	
/***** 前台    *********/	
	/**
	 * 跳转到前台寻找项目页面
	 * @return
	 */
	@RequestMapping("/list")
	public String golist(Model model,HttpSession session){
		/*
		Userinfo user = (Userinfo) session.getAttribute("qtuser");
		String userId = user.getUserId();	
		String role = user.getUserRole();
		System.out.println(userId+"role"+role);
		model.addAttribute("userId", userId);
		model.addAttribute("userRole", role);
		*/
		return "list";
	}
	/**
	 * 跳转到显示详细项目页面
	 * @return
	 */
	@RequestMapping("/openitemlogin")
	public String goopenitemlogin(){
		return "openitemlogin";
	}
	
	/**
	 * 跳转到添加创业人员个人信息页面
	 * @return
	 */
	@RequestMapping("/addPersoninfo")
	public String goAddPersoninfo(HttpSession session,Model model){
		/*Userinfo user = (Userinfo) session.getAttribute("user");
	    model.addAttribute("userId",userId);*/
		return "addPersoninfo";
	}
	/**
	 * 跳转到项目申请页面
	 * @return
	 */
	@RequestMapping("/addIteminfo")
	public String goaddIteminfo(Model model,HttpSession session){
	/*	
		Userinfo user = (Userinfo) session.getAttribute("user");
		String userId = user.getUserId();	
	    Personinfo person = (Personinfo) session.getAttribute("person");
		model.addAttribute("zName", person.getzName());
		model.addAttribute("userId", userId);		
		*/	
		return "addIteminfo";
	}
	/**
	 * 跳转到显示个人中心项目发布人个人信息页面
	 * @return
	 */
	@RequestMapping("/newperson")
	public String gonewPerson(){
		return "newperson";
	}
	/**
	 * 跳转到显示个人中心修改密码页面
	 * @return
	 */
	@RequestMapping("/zfpassword")
	public String gopassword(){
		return "zfpassword";
	}
	/**
	 * 跳转到个人中心的项目列表
	 * @return
	 */
	@RequestMapping("/personitemlist")
	public String gopersonitemlist(){
		return "personitemlist";
	}
	
}
