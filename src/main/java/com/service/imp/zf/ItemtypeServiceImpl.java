package com.service.imp.zf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.zf.ItemtypeDao;
import com.entity.Itemtype;
import com.service.zf.ItemtypeService;
/**
 * 
* @author ���� :zf
* @version ����ʱ�䣺2017��9��11�� ����9:59:42 
* ��˵��  ��Ŀ���͵�service���ʵ����
 */
@Service
public class ItemtypeServiceImpl implements ItemtypeService{
	@Autowired
	public ItemtypeDao itemtypeDao;
	/**
	 * ��ѯ���е���Ŀ����
	 * @return
	 */
	@Override
	public List<Itemtype> queryItemtype() {
		// TODO Auto-generated method stub
		return itemtypeDao.queryItemtype();
	}


}
