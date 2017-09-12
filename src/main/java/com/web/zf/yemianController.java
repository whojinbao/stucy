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
 * @author ���� :֣�� 
 * @version ����ʱ�䣺2017��9��1�� ����8:40:46 
 * ��˵��   ҳ����ת������
 */ 
@Controller
@RequestMapping("/yemian")
public class yemianController {	
	/**
	 * ��ת���ɷ�������Ŀҳ��
	 * @return
	 */
	@RequestMapping("/openitem")
	public String goOpenitem(){
		return "openitem";
	}
	/**
	 * ��ת��ʾ�����ύ�������Ŀҳ��
	 * @return
	 */
	@RequestMapping("/iteminfo")
	public String goiteminfo(){
		return "iteminfo";
	}
	/**
	 * ��ת����ʾ������Ŀ�����˸�����Ϣҳ��
	 * @return
	 */
	@RequestMapping("/personinfo")
	public String goPersoninfo(){
		return "personinfo";
	}
	
/***** ǰ̨    *********/	
	/**
	 * ��ת��ǰ̨Ѱ����Ŀҳ��
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
	 * ��ת����ʾ��ϸ��Ŀҳ��
	 * @return
	 */
	@RequestMapping("/openitemlogin")
	public String goopenitemlogin(){
		return "openitemlogin";
	}
	
	/**
	 * ��ת����Ӵ�ҵ��Ա������Ϣҳ��
	 * @return
	 */
	@RequestMapping("/addPersoninfo")
	public String goAddPersoninfo(HttpSession session,Model model){
		/*Userinfo user = (Userinfo) session.getAttribute("user");
	    model.addAttribute("userId",userId);*/
		return "addPersoninfo";
	}
	/**
	 * ��ת����Ŀ����ҳ��
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
	 * ��ת����ʾ����������Ŀ�����˸�����Ϣҳ��
	 * @return
	 */
	@RequestMapping("/newperson")
	public String gonewPerson(){
		return "newperson";
	}
	/**
	 * ��ת����ʾ���������޸�����ҳ��
	 * @return
	 */
	@RequestMapping("/zfpassword")
	public String gopassword(){
		return "zfpassword";
	}
	/**
	 * ��ת���������ĵ���Ŀ�б�
	 * @return
	 */
	@RequestMapping("/personitemlist")
	public String gopersonitemlist(){
		return "personitemlist";
	}
	
}
