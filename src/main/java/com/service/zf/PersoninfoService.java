package com.service.zf;

import java.util.List;

import com.entity.Personinfo;

/** 
* @author ���� :֣�� 
* @version ����ʱ�䣺2017��8��31�� ����11:12:34 
* ��˵��  ��ҵ��Ա������Ϣ��Ĳ���
*/ 
 
public interface PersoninfoService {
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
