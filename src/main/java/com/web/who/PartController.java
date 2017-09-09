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
* @Description: ��̨��ɫ������
* @author who  
* @date 2017��9��1��  
*/  
@Controller
@RequestMapping("/part")
public class PartController {
	
	@Autowired
	private PartService pService;
	
	/**
	 * ��ȡ����Ա����Ϣ
	 */
	@RequestMapping("/getpart")
	@ResponseBody
	public Map<String,Object> getConsumer(Page page){
		return pService.queryPart(page);
		
	};
	
	/**
	 * ���Ա����Ϣ�����ݿ�
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
	 * ���ý��ý�ɫ
	 */
	@RequestMapping("/updatepartstatus")
	public void  updatePartStatus(@RequestBody Map<String,String> map){
		pService.updatePartStatus(map);
		
	};
	
	
	/**
	 * ����Ա��ID��ѯӵ�еĽ�ɫ
	 */
	@RequestMapping("/queryDescribe")
	public @ResponseBody String  queryDescribe(@RequestBody String str){
		return pService.queryDescribe(str);
		
	};
	
	
	/**
	 * ����Ա��Id������ӵ�еĽ�ɫ
	 */
	@RequestMapping("/updateDescribe")
	public @ResponseBody String updateDescribe(@RequestBody String str){
		Partjur partJur=JSON.parseObject(str, Partjur.class);
		pService.updateDescribe(partJur);
		return"ok";
	};
	
	
	/**
	 * ��ɫ�����ظ�����֤
	 */
	@RequestMapping("/queryallpartname")
	@ResponseBody
	public int queryAllPartName(@RequestBody String str){
		return pService.queryAllPartName(str);
	};
	/**
	 * �޸Ľ�ɫ����
	 */
	
	@RequestMapping("/updatepart")
	public void updatePart(@RequestBody Part part){
		pService.updatePart(part);
	};
}
