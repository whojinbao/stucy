package com.service.zf;

import java.util.List;

import com.entity.Openitem;



/** 
* @author 作者 :郑飞 
* @version 创建时间：2017年8月30日 下午7:13:19 
* 类说明 
* OpenitemService : 对发布的项目的数据的逻辑处理
*/ 
 
public interface OpenitemService {
	/**
	 * getOpenitems ：查询所有已发布的项目
	 * @return
	 */
    public List<Openitem> getOpenitems();
    /**
     * addOpenitem ： 添加一个审核通过后要发布的项目
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
