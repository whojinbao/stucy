package com.web.zf;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.entity.Itemarea;
import com.entity.Iteminfo;
import com.entity.Itemtype;
import com.service.zf.ItemareaService;
import com.service.zf.IteminfoService;
import com.service.zf.ItemtypeService;
import com.web.fileUpload;
/**
 * 
 * @author ���� :zf
 * @version ����ʱ�䣺2017��9��12�� ����2:55:38 
 * ��˵��  ������Ŀ�Ŀ�����
 */
@Controller
@RequestMapping("/Iteminfo")
public class IteminfoController {
	@Autowired
	private IteminfoService iteminfoservice;
	@Autowired
	private ItemtypeService itemtypeservice;
	@Autowired
	private ItemareaService itemareaservice;
	/**
	 * ��ѯ�Ѵ�����������Ŀ
	 * @param session
	 * @return
	 */
	@RequestMapping("/itemlist")
	@ResponseBody
	public List<Iteminfo>  getlist(HttpSession session){	
		List<Iteminfo> itemlist = iteminfoservice.getIteminfos();	
		return itemlist;
	}
	/**
	 * ��ѯ������ָ����Ŀ
	 * @param session
	 * @return
	 */
	@RequestMapping("/iditeminfo")
	@ResponseBody
	public Iteminfo  getlist(String itemId,HttpSession session){	
		Iteminfo iteminfo = iteminfoservice.queryIteminfo(itemId);	
		return iteminfo;
	}
	/**
	 * ������Ŀ
	 * @return
	 */
	@RequestMapping("/additem")
	public void additem(@RequestParam("file") MultipartFile file,HttpServletRequest request,Iteminfo iteminfo){
		System.out.println(file);	
		fileUpload fileupload=new fileUpload();
		String itemmaterials = fileupload.saveFiles(file, request);		
		iteminfo.setItemPhoto(itemmaterials);	

		System.out.println(iteminfo.getItemName());
		System.out.println(iteminfo.getzName());
		System.out.println(iteminfo.getItemtypeId());
		System.out.println(iteminfo.getItemareaId());
		System.out.println(iteminfo.getItemContent());
		System.out.println(iteminfo.getItemMoney());
		System.out.println(iteminfo.getItemPhoto());
		System.out.println(iteminfo.getUserId());
		System.out.println(iteminfo.getItemId());		
		iteminfoservice.addIteminfo(iteminfo);			

	}
	/**
	 * ������Ŀʱ��ȡ��Ŀ����
	 * @return
	 */
	@RequestMapping("/itemtype")
	@ResponseBody
	public List<Itemtype> goitemtype(){			
		List<Itemtype> itemtypelist = itemtypeservice.queryItemtype();
		return itemtypelist;
	}
	/**
	 * ������Ŀʱ��ȡ��Ŀ����
	 * @return
	 */
	@RequestMapping("/itemarea")
	@ResponseBody
	public List<Itemarea> goitemarea(){				
		List<Itemarea> itemarealist = itemareaservice.queryItemarea();	
		return itemarealist;
}
}
