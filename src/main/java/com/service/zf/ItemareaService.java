package com.service.zf;

import java.util.List;

import com.entity.Itemarea;
/**
 * 
* @author 作者 :zf
* @version 创建时间：2017年9月11日 上午9:57:33 
* 类说明 项目地区的service层
 */
public interface ItemareaService {
	/**
	 * 查询所有项目地区
	 * @return
	 */
	public List<Itemarea> queryItemarea();
}
