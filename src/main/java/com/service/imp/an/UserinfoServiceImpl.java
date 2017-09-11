package com.service.imp.an;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.an.UserinfoDao;
import com.entity.Userinfo;
import com.service.an.UserinfoService;

@Service
public  class UserinfoServiceImpl implements UserinfoService{
	@Autowired
	private UserinfoDao UserinfoDao;
	
	@Override
	public List<Userinfo> qUserinfos(Userinfo uu) {
		// TODO Auto-generated method stub
		List<Userinfo> list=UserinfoDao.qUserinfos(uu.getUserId());
		if (list.size()!=0&&list.get(0).getUserPassword().equals(uu.getUserPassword())) {
		    System.out.println(list.get(0).getUserRole());
			return list;
		}
		 return null;
	}
	
	@Override
	public void addUserinfo(Userinfo tt) {
		// TODO Auto-generated method stub
		UserinfoDao.addUserinfo(tt);
		UserinfoDao.addAccount(tt);
	}
	
	public boolean qUserinfosnew(Userinfo uu) {
		// TODO Auto-generated method stub
		List<Userinfo> list=UserinfoDao.qUserinfos(uu.getUserId());
		if (list.size()!=0) {
			return false;
		}
		 return true;
	}

	@Override
	public void updateUserinfo(Userinfo tt) {
		// TODO Auto-generated method stub
		UserinfoDao.updateUserinfo(tt);
	}
	
	@Override
	public boolean queryPassword(Userinfo user){
		 List<Userinfo>	listuu=qUserinfos(user);
		if (listuu.size()==0) {
			return false;
		}else{
			if(listuu.get(0).getUserPassword().equals(user.getUserPassword())){
				return true;
			}else{
				return false;
			}
		}
	}

	@Override
	public void addAccount(Userinfo tt) {
		// TODO Auto-generated method stub
		UserinfoDao.updateUserinfo(tt);
	}

	
	
}
