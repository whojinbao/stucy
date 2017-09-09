package com.service.imp.cq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.cq.ItemareaDao;
import com.entity.Itemarea;
import com.service.cq.ItemareaService;
@Service
public class ItemareaImpl implements ItemareaService{
	@Autowired
	private ItemareaDao ItemareaDao ;
	//查询每个地区有哪些项目
	public List<Itemarea> queryItemarea() {
		return ItemareaDao.queryItemarea();
	}
}
