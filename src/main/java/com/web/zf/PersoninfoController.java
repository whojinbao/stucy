package com.web.zf;

import java.util.List;
import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.entity.Personinfo;
import com.service.zf.PersoninfoService;
import com.web.fileUpload;
/**
 * 
* @author 作者 :zf
* @version 创建时间：2017年9月12日 下午3:00:38 
* 类说明   用户的个人信息的控制器
 */
@Controller
@RequestMapping("/personinfo")
public class PersoninfoController {
	@Autowired
	private PersoninfoService personinfoservice;
    /**
     * 查询所有用户的个人信息
     * @return
     */
	@RequestMapping("/personinfos")
	@ResponseBody
	public List<Personinfo> getlist(){		
		List<Personinfo> personinfos = personinfoservice.getPersoninfos();
		return personinfos;
	}
	/**
	 * 添加用户
	 * @param files
	 * @param request
	 * @param personinfo
	 */
	@RequestMapping("/addpersoninfo")
	@ResponseBody
	public void addpersoninfo(@RequestParam("file") MultipartFile[] files,HttpServletRequest request,Personinfo personinfo){
		fileUpload fileupload=new fileUpload();		
		
		String zIdCard = fileupload.saveFiles(files[0], request);	
		String fIdCard = fileupload.saveFiles(files[1], request);	
		String photo = fileupload.saveFiles(files[2], request);	
		personinfo.setzIdcard(zIdCard);
	    personinfo.setfIdcard(fIdCard);
	    personinfo.setPhoto(photo);
	
		System.out.println(personinfo.getUserId());
		System.out.println(personinfo.getTelephone());
		System.out.println(personinfo.getzName());
		System.out.println(personinfo.getAddress());
		System.out.println(personinfo.getNoIdcard());
		System.out.println(personinfo.getzIdcard());
		System.out.println(personinfo.getfIdcard());
		System.out.println(personinfo.getPhoto());
		
		personinfoservice.addPersoninfo(personinfo) ;  
	}
	/**
	 * 查询指定用户的个人信息
	 * @param userId
	 * @return
	 */
	@RequestMapping("/querypersoninfo")
	@ResponseBody
	public Personinfo querypersoninfo(@RequestBody String userId){				
		Personinfo personinfo = personinfoservice.queryPerson(userId);	
		return personinfo;
	}

}
