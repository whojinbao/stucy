package com.dao.zf;

import java.util.List;

import com.entity.Personinfo;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年8月30日 上午10:01:28 
* 类说明 
* PersoninfoDao: 对数据库个人信息表的操作
*/ 
 
public interface PersoninfoDao {
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
