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

@Controller
@RequestMapping("/personinfo")
public class PersoninfoController {
	@Autowired
	private PersoninfoService personinfoservice;

	@RequestMapping("/personinfos")
	@ResponseBody
	public List<Personinfo> getlist(){		
		List<Personinfo> personinfos = personinfoservice.getPersoninfos();
		return personinfos;
	}
	@RequestMapping("/addpersoninfo")
	@ResponseBody
	public void addpersoninfo(@RequestParam("file") MultipartFile[] files,HttpServletRequest request,Personinfo personinfo){
		fileUpload fileupload=new fileUpload();		
	
		String photourl = fileupload.saveFiles(files[0], request);	
		String idCardurl = fileupload.saveFiles(files[1], request);	
		String stuPhoto = fileupload.saveFiles(files[2], request);	
		String schphotoUrl = fileupload.saveFiles(files[3], request);	
		
		//personinfo.setPhotoUrl(photourl);	
		//personinfo.setIdCardurl(idCardurl);	
		//personinfo.setStuPhoto(stuPhoto);	
		//personinfo.setSchphotoUrl(schphotoUrl);	
		personinfoservice.addPersoninfo(personinfo) ;  
		//System.out.println(personinfo.getPhotoUrl());
		System.out.println(personinfo.getUserId());
		System.out.println(personinfo.getTelephone());
		System.out.println(personinfo.getzName());
		System.out.println(personinfo.getAddress());
		/*System.out.println(personinfo.getIdCardnum());
		System.out.println(personinfo.getIdCardurl());
		System.out.println(personinfo.getStuPhoto());
		System.out.println(personinfo.getSchphotoUrl());*/
		
	}
	
	@RequestMapping("/querypersoninfo")
	@ResponseBody
	public Personinfo querypersoninfo(@RequestBody String userId){				
		Personinfo personinfo = personinfoservice.queryPerson(userId);	
		return personinfo;
	}

}
