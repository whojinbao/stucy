package com.service.imp.who;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.who.JurisdictionDao;
import com.entity.Jurisdiction;
import com.entity.util.Page;
import com.service.who.JurisdictionService;
/**  
* @Title: JurisdictionServiceImp.java  
* @Package com.service.imp.who  
* @Description: TODO(service权限的数据处理层实现类)  
* @author who  
* @date 2017年9月8日  
*/  
@Service
public class JurisdictionServiceImp implements JurisdictionService {
	@Autowired
	private JurisdictionDao jurDao;
	/**
	 * 获取所有员工信息
	 */
	@Override
	public Map<String,Object> queryJuri(Page page) {
		// TODO Auto-generated method stub
		int startIndex = (page.getPage()-1) * page.getRows();
		int endIndex = page.getPage() * page.getRows() + 1;
		page.setStartIndex(startIndex);
		page.setEndIndex(endIndex);
		List<Jurisdiction> list=jurDao.queryJuri(page);
		System.out.println(jurDao.queryCountJur());
		Map<String,Object> userMap = new HashMap<String,Object>();
		userMap.put("total", jurDao.queryCountJur());
		userMap.put("rows", list);
		return userMap;
	}
	/**
	 * 禁用用权限
	 */
	@Override
	public void disableJuri(String jurId) {
		// TODO Auto-generated method stub
		jurDao.disableJuri(jurId);
	}
	/**
	 * 启用权限
	 */
	@Override
	public void enableJuri(String jurId) {
		// TODO Auto-generated method stub
		jurDao.enableJuri(jurId);
	}


}
