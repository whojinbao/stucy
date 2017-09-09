package com.service.imp.zf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.zf.PersoninfoDao;
import com.entity.Personinfo;
import com.service.zf.PersoninfoService;

/** 
* @author 作者 :郑飞 
* @version 创建时间：2017年8月31日 上午11:31:48 
* 类说明  个人信息表的service的实现类
*/ 
@Service
public class PersoninfoServiceImpl implements PersoninfoService{
   @Autowired
	private PersoninfoDao personinfodao;
   /**
    * 添加一个新用户的个人信息
    */
	@Override
	public int addPersoninfo(Personinfo personinfo) {
		// TODO Auto-generated method stub
		int flag = personinfodao.addPersoninfo(personinfo);
		return flag;
	}
	/**
	 * 查询指定人的个人信息
	 */
	@Override
	public Personinfo queryPerson(String userId) {
		// TODO Auto-generated method stub
		Personinfo personinfo = personinfodao.queryPerson(userId);
		 
		return personinfo;
	}
   /**
    * 查询所有人的个人信息
    */
	@Override
	public List<Personinfo> getPersoninfos() {
		// TODO Auto-generated method stub
		List<Personinfo> personinfos = personinfodao.getPersoninfos();
		return personinfos;
	}

	
}
