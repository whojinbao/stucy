package com.service.an;

import java.util.List;

import com.entity.Userinfo;

public interface UserinfoService {
	public List<Userinfo> qUserinfos(Userinfo uu);
	public void addUserinfo(Userinfo tt);
	public boolean qUserinfosnew(Userinfo user);
	
    public void updateUserinfo(Userinfo tt);//ÐÞ¸ÄÉí·Ý
	public void addAccount(Userinfo tt);
	boolean queryPassword(Userinfo user);
	
}
