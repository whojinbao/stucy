package com.web.an;

import java.util.List;

import javax.accessibility.AccessibleRelation;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.entity.Userinfo;
import com.service.an.UserinfoService;

@Controller
@RequestMapping("/reception")
public class UserinfoController {
	@Autowired
	private UserinfoService userinfoService;
	
	@RequestMapping("/qUserinfos")
	public void qUerinofs(HttpServletRequest request,HttpServletResponse response,@RequestBody String data){
		response.setContentType("text/html;charset=utf-8");
		Userinfo user = JSON.parseObject(data,Userinfo.class);
		request.getSession().setAttribute("phone", user);
		boolean listuu = userinfoService.queryPassword(user);
		List<Userinfo> ulist = userinfoService.qUserinfos(user);
		try {
			if (listuu) {
				/**
				 * 验证成功后，把userID存入会话
				 */
				HttpSession session = request.getSession();
				session.setAttribute("qtuser", ulist.get(0));
				response.getWriter().write(JSON.toJSONString("ok"));
			}else{
				response.getWriter().write(JSON.toJSONString("error"));
			}
								
			response.getWriter().flush();
			response.getWriter().close();
		} catch (Exception e) {
			// TODO: handle exception
		}
								
	}
	@RequestMapping("/qUserinfosnew")
	public void qUerinofsnew(HttpServletRequest request,HttpServletResponse response,@RequestBody String data){
		response.setContentType("text/html;charset=utf-8");
		Userinfo user = JSON.parseObject(data,Userinfo.class);
		boolean listnew = userinfoService.qUserinfosnew(user);
		try {
			if (listnew) {
				response.getWriter().write("error");
			}else{
				response.getWriter().write("ok");
			}
								
			response.getWriter().flush();
			response.getWriter().close();
		} catch (Exception e) {
			// TODO: handle exception
		}
								
	}
	@RequestMapping("/addUserinfo")
	@ResponseBody
	public void addUserinfo(Userinfo userinfo){
		System.out.println(userinfo);
		userinfoService.addUserinfo(userinfo);
		
	}
	
	
}
