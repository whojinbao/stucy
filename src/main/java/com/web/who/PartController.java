package com.web.who;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.entity.Part;
import com.entity.Partjur;
import com.entity.util.Page;
import com.service.who.PartService;

/**  
* @Title: ConsumerController.java  
* @Package com.web.who  
* @Description: 后台角色控制器
* @author who  
* @date 2017年9月1日  
*/  
@Controller
@RequestMapping("/part")
public class PartController {
	
	@Autowired
	private PartService pService;
	
	/**
	 * 获取所有员工信息
	 */
	@RequestMapping("/getpart")
	@ResponseBody
	public Map<String,Object> getConsumer(Page page){
		return pService.queryPart(page);
		
	};
	
	/**
	 * 添加员工信息到数据库
	 */
	@RequestMapping("/addpart")
	public void addConsumer(@RequestBody String str,HttpServletRequest request,HttpServletResponse response){
		Part part=JSON.parseObject(str, Part.class);
		pService.addPart(part);
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
	 * 启用禁用角色
	 */
	@RequestMapping("/updatepartstatus")
	public void  updatePartStatus(@RequestBody Map<String,String> map){
		pService.updatePartStatus(map);
		
	};
	
	
	/**
	 * 根据员工ID查询拥有的角色
	 */
	@RequestMapping("/queryDescribe")
	public @ResponseBody String  queryDescribe(@RequestBody String str){
		return pService.queryDescribe(str);
		
	};
	
	
	/**
	 * 根据员工Id更新所拥有的角色
	 */
	@RequestMapping("/updateDescribe")
	public @ResponseBody String updateDescribe(@RequestBody String str){
		Partjur partJur=JSON.parseObject(str, Partjur.class);
		pService.updateDescribe(partJur);
		return"ok";
	};
	
	
	/**
	 * 角色名字重复性验证
	 */
	@RequestMapping("/queryallpartname")
	@ResponseBody
	public int queryAllPartName(@RequestBody String str){
		return pService.queryAllPartName(str);
	};
	/**
	 * 修改角色描述
	 */
	
	@RequestMapping("/updatepart")
	public void updatePart(@RequestBody Part part){
		pService.updatePart(part);
	};
}
