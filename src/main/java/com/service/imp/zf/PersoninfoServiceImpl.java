package com.service.imp.zf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.zf.PersoninfoDao;
import com.entity.Personinfo;
import com.service.zf.PersoninfoService;

/** 
* @author ���� :֣�� 
* @version ����ʱ�䣺2017��8��31�� ����11:31:48 
* ��˵��  ������Ϣ���service��ʵ����
*/ 
@Service
public class PersoninfoServiceImpl implements PersoninfoService{
   @Autowired
	private PersoninfoDao personinfodao;
   /**
    * ���һ�����û��ĸ�����Ϣ
    */
	@Override
	public int addPersoninfo(Personinfo personinfo) {
		// TODO Auto-generated method stub
		int flag = personinfodao.addPersoninfo(personinfo);
		return flag;
	}
	/**
	 * ��ѯָ���˵ĸ�����Ϣ
	 */
	@Override
	public Personinfo queryPerson(String userId) {
		// TODO Auto-generated method stub
		Personinfo personinfo = personinfodao.queryPerson(userId);
		 
		return personinfo;
	}
   /**
    * ��ѯ�����˵ĸ�����Ϣ
    */
	@Override
	public List<Personinfo> getPersoninfos() {
		// TODO Auto-generated method stub
		List<Personinfo> personinfos = personinfodao.getPersoninfos();
		return personinfos;
	}

	
}
