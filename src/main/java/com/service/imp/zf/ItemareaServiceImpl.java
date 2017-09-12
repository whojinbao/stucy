package com.service.imp.zf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.zf.ItemareaDao;
import com.entity.Itemarea;
import com.service.zf.ItemareaService;
/**
 * 
* @author 作者 :zf
* @version 创建时间：2017年9月11日 上午10:05:21 
* 类说明  项目地区的service层的实现类
 */
@Service
public class ItemareaServiceImpl implements ItemareaService {
	@Autowired
	public ItemareaDao itemareaDao;
	/**
	 * 查询所有项目地区
	 * @return
	 */
	@Override
	public List<Itemarea> queryItemarea() {
		// TODO Auto-generated method stub
		List<Itemarea> itemarealsit =itemareaDao.queryItemarea();
		return itemarealsit;
	}

}
