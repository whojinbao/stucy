package com.service.imp.who;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.who.ConsumerDao;
import com.dao.who.PartDao;
import com.entity.Consumer;
import com.entity.util.Page;
import com.service.who.ConsumerService;
/**  
* @Title: ConsumerServiceImp.java  
* @Package com.service.imp.who  
* @Description: ��̨�û���server�ӿڵ�ʵ����  
* @author who  
* @date 2017��8��31��  
*/  
@Service
public class ConsumerServiceImp implements ConsumerService {
	//Ա����Dao�ӿ�
	@Autowired
	private ConsumerDao conDao;
	//��ɫ��Dao�ӿ�
	@Autowired
	private PartDao pDao;
	/**
	 * ��ѯ���е��û���
	 */
	@Override
	public Map<String, Object> queryConsumer(Page page) {
		int startIndex = (page.getPage()-1) * page.getRows();
		int endIndex = page.getPage() * page.getRows() + 1;
		page.setStartIndex(startIndex);
		page.setEndIndex(endIndex);
		int total = conDao.getCount(page);
		List<Map<String, Object>> selectList = conDao.queryConsumer(page);
		List<Map<String, Object>> conpartList=pDao.queryConpart();
		for (int i = 0; i < selectList.size(); i++) {
			String partstr="";
			Map<String, Object> map=selectList.get(i);
			for (int j = 0; j < conpartList.size(); j++) {
				Map<String, Object> map1=conpartList.get(j);
				if(map1.get("CON_ID").equals(map.get("CON_ID"))){
					partstr=partstr+map1.get("PART_NAME")+"��";
					if((j+1)%3==0){
						partstr +="<br/>";
					}
				};
				
			}
			if(partstr!=""){
				map.put("CONPART", partstr.substring(0,partstr.length()-1));
			}
		}
		
		
		Map<String,Object> userMap = new HashMap<String,Object>();
		userMap.put("total", total);
		userMap.put("rows", selectList);
		return userMap;
	}
	
	/**
	 * ����Ա��
	 */
	@Override
	public void addConsumer(Consumer con) {
		conDao.addConsumer(con);
	}

	/**
	 * ����Ա����ɫ
	 */
	@Override
	public void updateConPart(Map<String, String> map) {
		conDao.updateConPart(map);
	}

	/**
	 * �˻���Ψһ�Բ�ѯ
	 */
	@Override
	public int queryConOnly(String user) {
		List<Map<String,Object>> list=conDao.queryConOnly(user);
		return list.size();
	}

	/**
	 * ����Ա����Ϣ
	 */
	@Override
	public void updateConsumerNew(Consumer con) {
		conDao.updateConsumerNew( con);
	}


}
