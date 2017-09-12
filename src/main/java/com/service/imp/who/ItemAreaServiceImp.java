package com.service.imp.who;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.who.ItemAreaDao;
import com.entity.Itemarea;
import com.service.who.ItemAreaService;

/**  
* @Title: ItemtypeServiceImp.java  
* @Package com.service.imp.who  
* @Description: TODO(项目类型表格的处理器)  
* @author who  
* @date 2017年9月11日  
*/
@Service
public class ItemAreaServiceImp implements ItemAreaService {
	@Autowired
	private ItemAreaDao iDao;
	/**
	 * @return 获取全部的地区
	 */
	@Override
	public List<Itemarea> queryItemType() {
		// TODO Auto-generated method stub
		
		return iDao.queryItemarea();
	}

}
