package com.service.imp.cq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.cq.IteminfoUpdateDao;
import com.entity.Iteminfo;
import com.service.cq.IteminfoUpdateService;
@Service
public class IteminfoUpdateImpl implements IteminfoUpdateService{
	/*
	 * ����������Ŀ���е�״̬(��˺�δ���)
	 */
	@Autowired
	private IteminfoUpdateDao IteminfoUpdateDao;
	@Override
	public int updateIteminfo(Iteminfo itf) {
		// TODO Auto-generated method stub
		return IteminfoUpdateDao.updateIteminfo(itf);
	}
	
}
