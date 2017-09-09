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
* @Description: TODO(serviceȨ�޵����ݴ����ʵ����)  
* @author who  
* @date 2017��9��8��  
*/  
@Service
public class JurisdictionServiceImp implements JurisdictionService {
	@Autowired
	private JurisdictionDao jurDao;
	/**
	 * ��ȡ����Ա����Ϣ
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
	 * ������Ȩ��
	 */
	@Override
	public void disableJuri(String jurId) {
		// TODO Auto-generated method stub
		jurDao.disableJuri(jurId);
	}
	/**
	 * ����Ȩ��
	 */
	@Override
	public void enableJuri(String jurId) {
		// TODO Auto-generated method stub
		jurDao.enableJuri(jurId);
	}


}
