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
* @Description: TODO(��Ŀ���ͱ��Ĵ�����)  
* @author who  
* @date 2017��9��11��  
*/
@Service
public class ItemAreaServiceImp implements ItemAreaService {
	@Autowired
	private ItemAreaDao iDao;
	/**
	 * @return ��ȡȫ���ĵ���
	 */
	@Override
	public List<Itemarea> queryItemType() {
		// TODO Auto-generated method stub
		
		return iDao.queryItemarea();
	}

}
