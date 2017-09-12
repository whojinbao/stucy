package com.dao.zf;

import java.util.List;

import com.entity.Itemtype;
/**
 * 
 * @author 作者 :zf
 * @version 创建时间：2017年9月11日 上午9:45:13 
 * 类说明  项目类型的dao层
 */
public interface ItemtypeDao {
	/**
	 * 查询所有的项目类型
	 * @return
	 */
	public List<Itemtype> queryItemtype();
}
