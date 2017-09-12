package com.service.imp.hgh;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.hgh.ParticularsDao;
import com.service.hgh.ParticularsService;
@Service
public class ParticularsServiceImpl implements ParticularsService {
	@Autowired
private ParticularsDao dao;
	@Override
	public Map<String, Object> queryParticulars() {
		Map<String,Object> map=new HashMap<String,Object>();
		System.out.println(dao.queryParticulars().get(0).get("USER_ID")+"    000000000000000000");
		map.put("rows", dao.queryParticulars());
		return map;
	}

}
