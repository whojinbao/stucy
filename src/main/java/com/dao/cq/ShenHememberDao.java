package com.dao.cq;

import java.util.List;
import java.util.Map;

import com.entity.Member;

public interface ShenHememberDao {
	public List<Member> queryShenHemember();//查询会员编号，会员在规定时间发布的次数，会员的到期时间和结束时间
	public int updateshenheMember(Member mm);//根据发布人编号修改该员工还可以发布的次数
	public Member queryShenHememberOnly(String map);//根据发布人编号查询该员工可以发布的次数
}
