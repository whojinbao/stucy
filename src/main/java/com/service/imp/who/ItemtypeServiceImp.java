package com.service.imp.who;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.who.ItemTypeDao;
import com.entity.Itemtype;
import com.service.who.ItemtypeService;

/**  
* @Title: ItemtypeServiceImp.java  
* @Package com.service.imp.who  
* @Description: TODO(项目类型表格的处理器)  
* @author who  
* @date 2017年9月11日  
*/
@Service
public class ItemtypeServiceImp implements ItemtypeService {
	@Autowired
	private ItemTypeDao iDao;
	/**
	 * @return 获取全部的项目类型的
	 */
	@Override
	public List<Itemtype> queryItemType() {
		// TODO Auto-generated method stub
		
		return iDao.queryItemtype();
	}

}
