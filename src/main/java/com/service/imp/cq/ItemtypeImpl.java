package com.service.imp.cq;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.cq.ItemtypeDao;
import com.entity.Itemtype;
import com.service.cq.ItemtypeService;
@Service
public class ItemtypeImpl implements ItemtypeService{
	@Autowired
	private ItemtypeDao ItemtypeDao ;
	public List<Itemtype> queryItemtype() {
		// TODO Auto-generated method stub
		return ItemtypeDao.queryItemtype();
	}
	
}
