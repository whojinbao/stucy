package com.service.cq;

import java.util.List;
import java.util.Map;

import com.entity.Member;
import com.entity.Personinfo;

public interface ShenHememberService {
	public Boolean queryShenHemember(Map<String,Object> map);//��ѯ��Ա��ţ���Ա�ڹ涨ʱ�䷢���Ĵ�������Ա�ĵ���ʱ��ͽ���ʱ��
	public int updateShenheMember(Member mb);//���ݷ����˱���޸ĸ�Ա�������Է����Ĵ���
	public Member queryShenHememberOnly(String map);//���ݷ����˱�Ų�ѯ��Ա�����Է����Ĵ���
}
