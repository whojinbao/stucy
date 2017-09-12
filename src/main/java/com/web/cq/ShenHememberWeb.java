package com.web.cq;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Member;
import com.service.cq.ShenHememberService;
@Controller
@RequestMapping("/cao")
public class ShenHememberWeb {
	/*
	 * ��ѯ��Ա��ţ���Ա�ڹ涨ʱ�䷢���Ĵ�������Ա�ĵ���ʱ��ͽ���ʱ��
	 */
	@Autowired
	private ShenHememberService shenHememberService;
	@RequestMapping("/queryShenHemember")
	@ResponseBody
	public String queryShenHemember(@RequestBody Map<String,Object> map) {
		if(shenHememberService.queryShenHemember(map)){
			return "xiao";
		}else{
			return "ku";
		}
	}
	@RequestMapping("/updateShenHemember")
	@ResponseBody
	public String updateShenHemember(@RequestBody Map<String,Object>map){
		String tel=(String)map.get("telephone");	
		Member mb=shenHememberService.queryShenHememberOnly(tel);//������˿ɷ����Ĵ���
		mb.setUserId(tel);
		shenHememberService.updateShenheMember(mb);//�޸ĸ��˿ɷ����Ĵ���
		return "updateShenHemember";
	}
}
