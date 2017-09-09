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
* @Description: 后台用户表server接口的实现类  
* @author who  
* @date 2017年8月31日  
*/  
@Service
public class ConsumerServiceImp implements ConsumerService {
	//员工表Dao接口
	@Autowired
	private ConsumerDao conDao;
	//角色表Dao接口
	@Autowired
	private PartDao pDao;
	/**
	 * 查询所有的用户表
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
					partstr=partstr+map1.get("PART_NAME")+"、";
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
	 * 增加员工
	 */
	@Override
	public void addConsumer(Consumer con) {
		conDao.addConsumer(con);
	}

	/**
	 * 更新员工角色
	 */
	@Override
	public void updateConPart(Map<String, String> map) {
		conDao.updateConPart(map);
	}

	/**
	 * 账户名唯一性查询
	 */
	@Override
	public int queryConOnly(String user) {
		List<Map<String,Object>> list=conDao.queryConOnly(user);
		return list.size();
	}

	/**
	 * 更新员工信息
	 */
	@Override
	public void updateConsumerNew(Consumer con) {
		conDao.updateConsumerNew( con);
	}


}
