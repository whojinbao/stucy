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
* @Description: 后台员工信息控制器
* @author who  
* @date 2017年8月31日  
*/  
@Controller
@RequestMapping("/consumer")
public class ConsumerController {
	//员工信息service接口
	@Autowired
	private ConsumerService conService;
	
	//角色表service接口
	@Autowired
	private PartService pService;
	/**
	 * 获取所有员工信息
	 */
	@ResponseBody
	@RequestMapping("/getconsumer")
	public Map<String,Object> getConsumer(Page pg ){
		return conService.queryConsumer(pg);
	};
	
	/**
	 * 更新员工信息
	 * @param con
	 */
	
	@RequestMapping("/updateconsumernew")
	public void updateConsumerNew(@RequestBody Consumer con){
		 conService.updateConsumerNew(con);
	};
	
	/**
	 * 添加员工信息到数据库
	 * @param str 前台传输的json字符串
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
	 * 查询所有的权限及员工拥有的权限
	 */
	@RequestMapping("/querypartcon")
	@ResponseBody
	public List<Map<String, Object>> queryPartCon(@RequestBody String str){
		return pService.queryselPart(str);
	};
	/**
	 * 启用禁用用户
	 */
	@RequestMapping("/updateconsum")
	public void updateConsum(@RequestBody Map<String, String> str){
		conService.updateConPart(str);
	};
	/**
	 * 更改员工角色信息
	 */
	
	@RequestMapping("/updateconpart")
	public void updateConPart(@RequestBody Map<String, String> str){
		 pService.insertConPart(str);
	};
	/**
	 * 账户名唯一性查询
	 */
	
	@RequestMapping("/querycononly")
	@ResponseBody
	public int queryConOnly(@RequestBody String str){
		System.out.println(str);
		 return conService.queryConOnly(str);
	};
	
	/**
	 * 后台登陆
	 */
	@RequestMapping("/valiconsumer")
	public String valiConsumer(@RequestBody String str,HttpServletRequest request,HttpServletResponse response){
		Consumer con=JSON.parseObject(str, Consumer.class);
		con.setConName("zfff");
		request.getSession().setAttribute("conUser", con);
		Subject subject = SecurityUtils.getSubject();//未认证状态
		String pwd=con.getConPassword();
		pwd = MD5.md5(pwd);
		con.setConPassword(pwd);//MD5加密
		//构造一个用户名密码令牌
		AuthenticationToken token = new UsernamePasswordToken(con.getConUser(),con.getConPassword());
		try {
			subject.login(token);
		} catch (UnknownAccountException e) {
			e.getMessage();//没有该用户
			try {
				response.getWriter().write(JSON.toJSONString(1));
				response.getWriter().flush();
				response.getWriter().close();
			} catch (IOException e1) {
				e1.printStackTrace();
				return "error";
			}
			
		}catch(Exception e){
			e.getMessage();//用户密码错误
			
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
