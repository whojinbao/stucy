package com.service.zf;

import java.util.List;

import com.entity.Personinfo;

/** 
* @author 作者 :郑飞 
* @version 创建时间：2017年8月31日 上午11:12:34 
* 类说明  创业人员个人信息表的操作
*/ 
 
public interface PersoninfoService {
	/**
	 * addPersoninfo : 添加一个人的个人信息
	 * @param personinfo
	 * @return
	 */
    public int addPersoninfo(Personinfo personinfo);
    /**
     * queryPerson : 查询单个人的个人信息
     * @param userId 账号
     * @return 个人信息
     */
    public Personinfo queryPerson(String userId);
    /**
     * getPersoninfos : 得到所有注册创业人员的个人信息
     * @return List<Personinfo>
     */
    public List<Personinfo> getPersoninfos();
}
