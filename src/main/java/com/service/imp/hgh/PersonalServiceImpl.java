package com.service.imp.hgh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.hgh.PersonalDao;
import com.service.hgh.PersonalService;
/**
 * 查询
 * 个人中心
 * @author HuGangHao
 *
 */
@Service
public class PersonalServiceImpl implements PersonalService {
	@Autowired
private PersonalDao dao;
	@Override
	public List<Map<String,Object>> queryPersonal(String userId) {
		// TODO Auto-generated method stub
		Map<String,Object> map=new HashMap<String, Object>();
		/*System.out.println(dao.queryPersonal(userId).get(0).get("COUNT"));*/
		map.put("rows",dao.queryPersonal(userId));
		return dao.queryPersonal(userId);
	}

}
