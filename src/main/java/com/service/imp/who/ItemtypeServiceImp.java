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
* @Description: TODO(��Ŀ���ͱ��Ĵ�����)  
* @author who  
* @date 2017��9��11��  
*/
@Service
public class ItemtypeServiceImp implements ItemtypeService {
	@Autowired
	private ItemTypeDao iDao;
	/**
	 * @return ��ȡȫ������Ŀ���͵�
	 */
	@Override
	public List<Itemtype> queryItemType() {
		// TODO Auto-generated method stub
		
		return iDao.queryItemtype();
	}

}
