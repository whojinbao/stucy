package com.service.imp.zf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.zf.OpenitemDao;
import com.entity.Openitem;
import com.service.zf.OpenitemService;



/** 
* @author ���� :֣�� 
* @version ����ʱ�䣺2017��9��1�� ����4:36:08 
* ��˵�� OpenitemServiceImpl : OpenitemService ��ʵ����
*/ 
 
@Service
public class OpenitemServiceImpl implements OpenitemService {
    @Autowired
	private OpenitemDao openitemDao;
    /**
	 * getOpenitems ����ѯ�����ѷ�������Ŀ
	 * @return
	 */
	@Override
	public List<Openitem> getOpenitems() {
		// TODO Auto-generated method stub
		List<Openitem> openitems = openitemDao.getOpenitems();
		return openitems;
	}
	 /**
     * addOpenitem �� ���һ��Ҫ��������Ŀ
     * @param openitem ��Ҫ��������Ŀ
     * @return
     */  
	@Override
	public int addOpenitem(Openitem openitem) {
		// TODO Auto-generated method stub
		int flag = openitemDao.addOpenitem(openitem);
		return flag;
	}
	/**
	 * ��ѯָ����Ŀ
	 * itemId ָ����Ŀ�ı��
	 */
	@Override
	public Openitem queryOpenitem(String itemId) {
		// TODO Auto-generated method stub
		Openitem openitem = openitemDao.queryOpenitem(itemId);
		return openitem;
	}
	
	/**
	 * ��ѯָ���˷�����Ŀ
	 * userId �����˵ı��
	 */
	@Override
	public List<Openitem> queryOpenitems(String userId) {
		// TODO Auto-generated method stub
		List<Openitem> openitems = openitemDao.queryOpenitems(userId);
		return openitems;
	}

}
