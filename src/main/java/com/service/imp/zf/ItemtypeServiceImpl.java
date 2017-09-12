package com.service.imp.zf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.zf.ItemtypeDao;
import com.entity.Itemtype;
import com.service.zf.ItemtypeService;
/**
 * 
* @author 作者 :zf
* @version 创建时间：2017年9月11日 上午9:59:42 
* 类说明  项目类型的service层的实现类
 */
@Service
public class ItemtypeServiceImpl implements ItemtypeService{
	@Autowired
	public ItemtypeDao itemtypeDao;
	/**
	 * 查询所有的项目类型
	 * @return
	 */
	@Override
	public List<Itemtype> queryItemtype() {
		// TODO Auto-generated method stub
		return itemtypeDao.queryItemtype();
	}


}
