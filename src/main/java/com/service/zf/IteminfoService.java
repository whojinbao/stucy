package com.service.zf;

import java.util.List;

import com.entity.Iteminfo;


/** 
* @author 作者 :郑飞 
* @version 创建时间：2017年9月1日 上午9:03:28 
* 类说明   
*/ 
 
public interface IteminfoService {
	/**
	 * getOpenitems ：查询所有已申请的项目
	 * @return
	 */
    public List<Iteminfo> getIteminfos();
    /**
	 * 查询单个项目
	 * @return
	 */
	public Iteminfo queryIteminfo(String itemId);
	/**
	 * 填加项目 ,
	 * @param iteminfo 项目详情
	 * @return
	 */
	public int addIteminfo(Iteminfo iteminfo);
}
