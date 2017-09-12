package com.web.who;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**  
* @Title: HtLoginController.java  
* @Package com.web.who  
* @Description: ��̨��½������ 
* @author who  
* @date 2017��8��31��  
*/  
@Controller
@RequestMapping("/htlogin")
public class HtLoginController {
	
	/**
	 * @return�˷�����ת����̨��½����
	 */
	@RequestMapping("/gologin")
	public String goLogin(){
		return "htlogin";
	}
	/**
	 * @return�˷�����ת����̨��ɫ�޸Ľ���
	 */
	@RequestMapping("/gopart")
	public String goPart(){
		return "part";
	}
	
	/**
	 * @return�˷�����ת����̨������
	 */
	@RequestMapping("/goindex")
	public String goIndex(){
		return "index";
	}
	
	/**
	 * @return�˷�����ת���û���Ϣ����
	 */
	@RequestMapping("/goconsumer")
	public String goConsumer(){
		return "consumer";
	}
	

	/**
	 * @return�˷�����ת��Ȩ�޹������
	 */
	@RequestMapping("/gojur")
	public String goJuri(){
		return "Juri";
	}
	
	
}
