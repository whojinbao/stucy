package com.service.imp.zf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.zf.ItemareaDao;
import com.entity.Itemarea;
import com.service.zf.ItemareaService;
/**
 * 
* @author ���� :zf
* @version ����ʱ�䣺2017��9��11�� ����10:05:21 
* ��˵��  ��Ŀ������service���ʵ����
 */
@Service
public class ItemareaServiceImpl implements ItemareaService {
	@Autowired
	public ItemareaDao itemareaDao;
	/**
	 * ��ѯ������Ŀ����
	 * @return
	 */
	@Override
	public List<Itemarea> queryItemarea() {
		// TODO Auto-generated method stub
		List<Itemarea> itemarealsit =itemareaDao.queryItemarea();
		return itemarealsit;
	}

}
