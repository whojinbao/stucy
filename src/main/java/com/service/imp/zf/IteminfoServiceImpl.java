package com.service.imp.zf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.zf.IteminfoDao;
import com.entity.Iteminfo;
import com.service.zf.IteminfoService;

/** 
* @author 作者 :郑飞 
* @version 创建时间：2017年9月1日 上午9:12:52 
* 类说明  项目申请表的service 的实现类
*/ 
@Service 
public class IteminfoServiceImpl implements IteminfoService {
    @Autowired
    private IteminfoDao iteminfodao;
   
	@Override
	public List<Iteminfo> getIteminfos() {
		// TODO Auto-generated method stub
		List<Iteminfo> iteminfos = iteminfodao.getIteminfos();
		return iteminfos;
	}

	@Override
	public int addIteminfo(Iteminfo iteminfo) {
		// TODO Auto-generated method stub
		int flag =iteminfodao.addIteminfo(iteminfo); 
		return flag;
	}

	@Override
	public Iteminfo queryIteminfo(String itemId) {
		// TODO Auto-generated method stub
		Iteminfo iteminfo = iteminfodao.queryIteminfo(itemId);
		return iteminfo;
	}

}
