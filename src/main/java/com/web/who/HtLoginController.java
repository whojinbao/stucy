package com.web.who;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**  
* @Title: HtLoginController.java  
* @Package com.web.who  
* @Description: 后台登陆控制器 
* @author who  
* @date 2017年8月31日  
*/  
@Controller
@RequestMapping("/htlogin")
public class HtLoginController {
	
	/**
	 * @return此方法跳转至后台登陆界面
	 */
	@RequestMapping("/gologin")
	public String goLogin(){
		return "htlogin";
	}
	/**
	 * @return此方法跳转至后台角色修改界面
	 */
	@RequestMapping("/gopart")
	public String goPart(){
		return "part";
	}
	
	/**
	 * @return此方法跳转至后台主界面
	 */
	@RequestMapping("/goindex")
	public String goIndex(){
		return "index";
	}
	
	/**
	 * @return此方法跳转至用户信息界面
	 */
	@RequestMapping("/goconsumer")
	public String goConsumer(){
		return "consumer";
	}
	

	/**
	 * @return此方法跳转至权限管理界面
	 */
	@RequestMapping("/gojur")
	public String goJuri(){
		return "Juri";
	}
	
	
}
