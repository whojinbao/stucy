package com.dao.zf;

import java.util.List;

import com.entity.Personinfo;

/** 
* @author ���� E-mail: 
* @version ����ʱ�䣺2017��8��30�� ����10:01:28 
* ��˵�� 
* PersoninfoDao: �����ݿ������Ϣ��Ĳ���
*/ 
 
public interface PersoninfoDao {
	/**
	 * addPersoninfo : ���һ���˵ĸ�����Ϣ
	 * @param personinfo
	 * @return
	 */
    public int addPersoninfo(Personinfo personinfo);
    /**
     * queryPerson : ��ѯ�����˵ĸ�����Ϣ
     * @param userId �˺�
     * @return ������Ϣ
     */
    public Personinfo queryPerson(String userId);
    /**
     * getPersoninfos : �õ�����ע�ᴴҵ��Ա�ĸ�����Ϣ
     * @return List<Personinfo>
     */
    public List<Personinfo> getPersoninfos();
}
