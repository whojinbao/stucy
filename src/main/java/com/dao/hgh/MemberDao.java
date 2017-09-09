package com.dao.hgh;

import java.util.List;

import com.entity.Member;
import com.entity.util.Page;

public interface MemberDao {
	public void addmember(Member mr);
	//查询满足条件的第一页数据
	public List<Member> querymember(Page page);
	//查询满足条件的所有数据的个数
	public int queryAllMember(Page page);
	
	public List<Member> querymember1(String userId);
	public void updatemember(Member mr);
}
