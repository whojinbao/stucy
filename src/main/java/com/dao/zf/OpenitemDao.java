package com.dao.zf;

import java.util.List;

import com.entity.Openitem;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年8月30日 上午9:08:56 
* 类说明 
* openitemDao : 对发布的项目的数据库操作
*/ 
 
public interface OpenitemDao {
	/**
	 * getOpenitems ：查询所有已发布的项目
	 * @return
	 */
    public List<Openitem> getOpenitems();
   
    /**
     * addOpenitem ： 添加一个要发布的项目
     * @param openitem ：要发布的项目
     * @return
     */
    public int addOpenitem(Openitem openitem);
    /**
     * quertOpenitem : 查询指定项目
     * @param itemId  ：要查询项目编号
     * @return 该项目
     */
    public Openitem queryOpenitem(String itemId);
    /**
     * queryOpenitems : 查询指定人所发的项目
     * @param userId ： 发布人编号
     * @return 该项目
     */
    public List<Openitem> queryOpenitems(String userId);
}
