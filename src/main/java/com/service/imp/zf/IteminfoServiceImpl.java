package com.service.imp.zf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.zf.IteminfoDao;
import com.entity.Iteminfo;
import com.service.zf.IteminfoService;

/** 
* @author ���� :֣�� 
* @version ����ʱ�䣺2017��9��1�� ����9:12:52 
* ��˵��  ��Ŀ������service ��ʵ����
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
