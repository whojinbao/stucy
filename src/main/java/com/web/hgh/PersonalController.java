package com.web.hgh;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.hgh.PersonalService;
/**
 * 个人中心查询
 * @author HuGangHao
 *
 */
@Controller
@RequestMapping("/personal")
public class PersonalController {
	@Autowired
	private PersonalService personalService;
	@RequestMapping("/queryPersonal")
	public @ResponseBody List<Map<String,Object>> queryPersonal(@RequestBody String userId){
		return personalService.queryPersonal(userId);
	}
}
