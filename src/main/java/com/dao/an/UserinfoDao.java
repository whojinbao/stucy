package com.dao.an;

import java.util.List;

import com.entity.Userinfo;

public interface UserinfoDao {
	public List<Userinfo> qUserinfos(String userId);
	
	public void addUserinfo(Userinfo tt);
	
    public void updateUserinfo(Userinfo userinfo);

	public void addAccount(Userinfo aa);
}
