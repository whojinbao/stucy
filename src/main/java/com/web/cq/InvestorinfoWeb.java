package com.web.cq;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.rmi.server.SocketSecurityException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.entity.Investorinfo;
import com.entity.Itemarea;
import com.entity.Itemtype;
import com.entity.Userinfo;
import com.entity.util.OpenitemInvestorinfoBoth;
import com.service.cq.InvestorinfoService;
import com.service.cq.ItemtypeService;
import com.service.cq.OpenitemInvestorinfoBothService;

@Controller
public class InvestorinfoWeb {
	/*
	 * 添加投资人的信息
	 * ?
	 * 查询单个投资人的信息
	 * 查询单个投资人投资那些项目
	 * ?
	 *查询所有投资人的信息 
	 */
	@Autowired
	private InvestorinfoService InvestorinfoService ;
	@Autowired
	private OpenitemInvestorinfoBothService OpenitemInvestorinfoBothService ;
	@RequestMapping("/addInvestorinfo")
	public String addInvestorinfo(@RequestParam("file") MultipartFile[] files,HttpServletRequest request,Investorinfo ifo){
		for(int i=0;i<files.length;i++){
				MultipartFile file =files[i];	
				ifo.setInvestorphoto(files[0].getOriginalFilename());//个人图片名
				ifo.setCompanyurl(files[1].getOriginalFilename());//公司图片名
				ifo.setCompanyphoto(files[2].getOriginalFilename());//工作证图片名
			saveFiles(file,request);
		}
	String loc=	request.getParameter("loc_province")+
				request.getParameter("loc_city")+//获取个人的家庭住址
				request.getParameter("loc_town");
	String location=request.getParameter("location1")+
			request.getParameter("location2")+
			request.getParameter("location3");//获取公司住址
		ifo.setCompanyaddress(loc);
		ifo.setInvestoraddress(location);
		InvestorinfoService.addInvestorinfo(ifo);
		return "forward:/queryAllInvestorinfo.do";
	}
	public boolean saveFiles(MultipartFile file ,HttpServletRequest request){
		//判断是否为空
		if (!file.isEmpty()) {
			String filePath = "D://二期项目//stucy//src//main//webapp//caoImage//"+ file.getOriginalFilename();
			try {
				file.transferTo(new File(filePath));//传送文件进路径(filePath)里
				return true;
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	@RequestMapping("/queryInvestorinfo")
	public String queryInvestorinfo(Model mm,HttpServletRequest request){
		Userinfo phone=(Userinfo)(request.getSession().getAttribute("phone"));
		Investorinfo lfo=InvestorinfoService.queryInvestorinfo(phone);
		List<OpenitemInvestorinfoBoth>loib=OpenitemInvestorinfoBothService.queryOpenitemInvestorinfoOnly(phone);
		mm.addAttribute("lfo",lfo);
		mm.addAttribute("loib",loib);
		mm.addAttribute("ph",phone);
		return "Cq/investorinfo";
	}
	@RequestMapping("/queryAllInvestorinfo")
	public String queryAllInvestorinfo(Model mm){
		List<Investorinfo>lfo=InvestorinfoService.queryAllInvestorinfo();
		mm.addAttribute("lfo",lfo);
		return "Cq/houtaiinvestorinfo";
	}
}
