package com.dao.hgh;

import java.util.List;

import com.entity.Member;
import com.entity.util.Page;

public interface MemberDao {
	public void addmember(Member mr);
	//��ѯ���������ĵ�һҳ����
	public List<Member> querymember(Page page);
	//��ѯ�����������������ݵĸ���
	public int queryAllMember(Page page);
	
	public List<Member> querymember1(String userId);
	public void updatemember(Member mr);
}
