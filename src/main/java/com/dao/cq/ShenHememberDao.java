package com.dao.cq;

import java.util.List;
import java.util.Map;

import com.entity.Member;

public interface ShenHememberDao {
	public List<Member> queryShenHemember();//��ѯ��Ա��ţ���Ա�ڹ涨ʱ�䷢���Ĵ�������Ա�ĵ���ʱ��ͽ���ʱ��
	public int updateshenheMember(Member mm);//���ݷ����˱���޸ĸ�Ա�������Է����Ĵ���
	public Member queryShenHememberOnly(String map);//���ݷ����˱�Ų�ѯ��Ա�����Է����Ĵ���
}
