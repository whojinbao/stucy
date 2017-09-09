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
import com.service.cq.ItemareaService;
import com.service.cq.ItemtypeService;
import com.service.zf.IteminfoService;
import com.web.fileUpload;

@Controller
@RequestMapping("/Iteminfo")
public class IteminfoController {
	@Autowired
	private IteminfoService iteminfoservice;
	@Autowired
	private ItemtypeService itemtypeservice;
	@Autowired
	private ItemareaService itemareaservice;
	@RequestMapping("/itemlist")
	@ResponseBody
	public List<Iteminfo>  getlist(HttpSession session){	
		List<Iteminfo> itemlist = iteminfoservice.getIteminfos();	
		return itemlist;
	}

	@RequestMapping("/additem")
	public String additem(@RequestParam("file") MultipartFile file,HttpServletRequest request,Iteminfo iteminfo){
		System.out.println(file);	
		fileUpload fileupload=new fileUpload();
	    String itemmaterials = fileupload.saveFiles(file, request);		
		iteminfo.setItemmaterials(itemmaterials);	
		System.out.println(iteminfo.getItemName());
		System.out.println(iteminfo.getzName());
		System.out.println(iteminfo.getItemtypeId());
		System.out.println(iteminfo.getItemareaid());
		System.out.println(iteminfo.getItemIntro());
		System.out.println(iteminfo.getItemContent());
		System.out.println(iteminfo.getItemMoney());
		System.out.println(iteminfo.getItemmaterials());
		System.out.println(iteminfo.getUserId());
		System.out.println(iteminfo.getItemId());		
		iteminfoservice.addIteminfo(iteminfo);			
		return "list";
	}
	@RequestMapping("/itemtype")
	public String goitemtype(Model model){			
		List<Itemtype> itemtypelist = itemtypeservice.queryItemtype();
		List<Itemarea> itemarealist = itemareaservice.queryItemarea();
		model.addAttribute("itemtypelist", itemtypelist);
		model.addAttribute("itemarealist", itemarealist);				
	    return "addIteminfo";
}
}
