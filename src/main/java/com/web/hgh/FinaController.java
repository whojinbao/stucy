package com.web.hgh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("financial")
public class FinaController {

	/**
	 * ��ת����Ա��ֵ
	 * @return
	 */
	@RequestMapping("/member")
	public String gomember(){
		return "member";
	}
	/**
	 * ��ת��ѯ��ֵ����
	 * @return
	 */
	@RequestMapping("/search")
	public String goquermember(){
		return "search";
	}
	/**
	 * ��ת����Ա���ͳ��
	 * @return
	 */
	@RequestMapping("/Finance")
	public String queryMemberitem(){
		return "Finance";
	}
	/**
	 * ��ת����������
	 * @return
	 */
	@RequestMapping("/Personal")
	public String queryPersonan(){
		return "Personal";
	}	
	@RequestMapping("/Particulars")
	public String muban(){
		return "Particulars";
	}
}
