package com.service.imp.who;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.who.ReadItemDao;
import com.service.who.ReadItemService;
@Service
public class ReadItemServiceImp implements ReadItemService {
	@Autowired
	private ReadItemDao rDao;
	@Override
	public List<Map<String, Object>> queryItem(Map<String,Object> map) {
		int startIndex = ((Integer)map.get("page")-1) * (Integer)map.get("rows");
		int endIndex = ((Integer)map.get("page")) * (Integer)map.get("rows") + 1;
		map.put("startIndex", startIndex);
		map.put("endIndex", endIndex);
		
		return rDao.queryItem(map);
	}
	@Override
	public int queryItemCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return rDao.queryItemCount(map);
	}

}
