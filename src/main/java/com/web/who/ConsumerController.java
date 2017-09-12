package com.web.who;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.entity.Consumer;
import com.entity.util.MD5;
import com.entity.util.Page;
import com.service.who.ConsumerService;
import com.service.who.PartService;

/**  
* @Title: ConsumerController.java  
* @Package com.web.who  
* @Description: ��̨Ա����Ϣ������
* @author who  
* @date 2017��8��31��  
*/  
@Controller
@RequestMapping("/consumer")
public class ConsumerController {
	//Ա����Ϣservice�ӿ�
	@Autowired
	private ConsumerService conService;
	
	//��ɫ��service�ӿ�
	@Autowired
	private PartService pService;
	/**
	 * ��ȡ����Ա����Ϣ
	 */
	@ResponseBody
	@RequestMapping("/getconsumer")
	public Map<String,Object> getConsumer(Page pg ){
		return conService.queryConsumer(pg);
	};
	
	/**
	 * ����Ա����Ϣ
	 * @param con
	 */
	
	@RequestMapping("/updateconsumernew")
	public void updateConsumerNew(@RequestBody Consumer con){
		 conService.updateConsumerNew(con);
	};
	
	/**
	 * ���Ա����Ϣ�����ݿ�
	 * @param str ǰ̨�����json�ַ���
	 * @param request
	 * @param response
	 */
	@RequestMapping("/addconsumer")
	public void addConsumer(@RequestBody String str,HttpServletRequest request,HttpServletResponse response){
		Consumer con=JSON.parseObject(str, Consumer.class);
		conService.addConsumer(con);
		try {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().print(JSON.toJSONString("ok"));
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e) {
			
		}
	};
	/**
	 * ��ѯ���е�Ȩ�޼�Ա��ӵ�е�Ȩ��
	 */
	@RequestMapping("/querypartcon")
	@ResponseBody
	public List<Map<String, Object>> queryPartCon(@RequestBody String str){
		return pService.queryselPart(str);
	};
	/**
	 * ���ý����û�
	 */
	@RequestMapping("/updateconsum")
	public void updateConsum(@RequestBody Map<String, String> str){
		conService.updateConPart(str);
	};
	/**
	 * ����Ա����ɫ��Ϣ
	 */
	
	@RequestMapping("/updateconpart")
	public void updateConPart(@RequestBody Map<String, String> str){
		 pService.insertConPart(str);
	};
	/**
	 * �˻���Ψһ�Բ�ѯ
	 */
	
	@RequestMapping("/querycononly")
	@ResponseBody
	public int queryConOnly(@RequestBody String str){
		System.out.println(str);
		 return conService.queryConOnly(str);
	};
	
	/**
	 * ��̨��½
	 */
	@RequestMapping("/valiconsumer")
	public String valiConsumer(@RequestBody String str,HttpServletRequest request,HttpServletResponse response){
		Consumer con=JSON.parseObject(str, Consumer.class);
		con.setConName("zfff");
		request.getSession().setAttribute("conUser", con);
		Subject subject = SecurityUtils.getSubject();//δ��֤״̬
		String pwd=con.getConPassword();
		pwd = MD5.md5(pwd);
		con.setConPassword(pwd);//MD5����
		//����һ���û�����������
		AuthenticationToken token = new UsernamePasswordToken(con.getConUser(),con.getConPassword());
		try {
			subject.login(token);
		} catch (UnknownAccountException e) {
			e.getMessage();//û�и��û�
			try {
				response.getWriter().write(JSON.toJSONString(1));
				response.getWriter().flush();
				response.getWriter().close();
			} catch (IOException e1) {
				e1.printStackTrace();
				return "error";
			}
			
		}catch(Exception e){
			e.getMessage();//�û��������
			
			try {
				response.getWriter().write(JSON.toJSONString(2));
				response.getWriter().flush();
				response.getWriter().close();
			} catch (IOException e1) {
				e1.printStackTrace();
				return "error";
			}
		}
		try {
			response.getWriter().write(JSON.toJSONString(3));
			response.getWriter().flush();
			response.getWriter().close();
		} catch (IOException e1) {
			e1.printStackTrace();
			return "error";
		}
		
		return "error";
	};
}
