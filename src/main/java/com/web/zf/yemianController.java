package com.web.zf;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Itemarea;
import com.entity.Itemtype;
import com.entity.Personinfo;
import com.entity.Userinfo;
import com.service.an.UserinfoService;
import com.service.cq.ItemareaService;
import com.service.cq.ItemtypeService;
import com.service.zf.PersoninfoService;

/** 
 * @author 作者 :郑飞 
 * @version 创建时间：2017年9月1日 上午8:40:46 
 * 类说明   页面跳转控制器
 */ 
@Controller
@RequestMapping("/yemian")
public class yemianController {
	@Autowired
	public ItemtypeService itemtypeservice;
	@Autowired
	public ItemareaService itemareaservice;
	@Autowired
	public PersoninfoService personinfoservice;
	@Autowired
	public UserinfoService userinfoservice;
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
		List<Itemtype> itemtypelist = itemtypeservice.queryItemtype();
		List<Itemarea> itemarealist = itemareaservice.queryItemarea();
		Userinfo user = (Userinfo) session.getAttribute("qtuser");
		String userId = user.getUserId();	
		String role = user.getUserRole();
		System.out.println(userId+"role"+role);
		model.addAttribute("userId", userId);
		model.addAttribute("userRole", role);
		model.addAttribute("itemtypelist", itemtypelist);
		model.addAttribute("itemarealist", itemarealist);		
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
		Userinfo user = (Userinfo) session.getAttribute("user");
		String userId = user.getUserId();
		user.setUserRole("1");//修改身份为创业人
		userinfoservice.updateUserinfo(user);
	    model.addAttribute("userId",userId);
		return "addPersoninfo";
	}
	/**
	 * 跳转到项目申请页面
	 * @return
	 */
	@RequestMapping("/addIteminfo")
	public String goaddIteminfo(Model model,HttpSession session){
		List<Itemtype> itemtypelist = itemtypeservice.queryItemtype();
		List<Itemarea> itemarealist = itemareaservice.queryItemarea();
		Userinfo user = (Userinfo) session.getAttribute("user");
		String userId = user.getUserId();	
	    Personinfo person = (Personinfo) session.getAttribute("person");
		model.addAttribute("zName", person.getzName());
		model.addAttribute("userId", userId);		
		model.addAttribute("itemtypelist", itemtypelist);
		model.addAttribute("itemarealist", itemarealist);	
		return "addIteminfo";
	}
	
	
	
}
