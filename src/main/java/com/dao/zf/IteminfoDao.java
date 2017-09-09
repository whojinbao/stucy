package com.dao.zf;

import java.util.List;

import com.entity.Iteminfo;

/** 
* @author 作者 :郑飞 
* @version 创建时间：2017年8月31日 上午9:57:00 
* 类说明 
* 对项目详情表的操作 ，申请项目是同时把项目详情表插入，查询单个项目详情表
*/ 
 
public interface IteminfoDao {
	/**
	 * 查询单个项目
	 * @return
	 */
	public Iteminfo queryIteminfo(String itemId);
	/**
	 * 填加项目详情表 ,
	 * @param iteminfo 项目详情
	 * @return
	 */
	public int addIteminfo(Iteminfo iteminfo);
	/**
	 * 查询所有已申请项目
	 * @return
	 */
	public List<Iteminfo> getIteminfos();
}
