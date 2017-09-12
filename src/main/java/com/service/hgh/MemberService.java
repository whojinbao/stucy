package com.service.hgh;

import java.util.Map;

import com.entity.Member;
import com.entity.util.Page;

public interface MemberService {
	public void addmember(Member mr);
	public Map<String,Object> querymember(Page page);
	
}
