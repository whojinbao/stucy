package com.service.imp.cq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.cq.OpenitemInvestorinfoBothDao;
import com.entity.Userinfo;
import com.entity.util.OpenitemInvestorinfoBoth;
import com.service.cq.OpenitemInvestorinfoBothService;

@Service
public class OpenitemInvestorinfoBothImpl implements OpenitemInvestorinfoBothService{
	/*
	 * 插入所有投资的项目
	 * 查询项目
	 * 查询单个投资的项目
	*/
	@Autowired
	private OpenitemInvestorinfoBothDao OpenitemInvestorinfoBothDao;
	@Override
	public List<OpenitemInvestorinfoBoth> queryOpenitemInvestorinfoBoth() {
		// TODO Auto-generated method stub
		return OpenitemInvestorinfoBothDao.queryOpenitemInvestorinfoBoth();
	}
	@Override
	public List<OpenitemInvestorinfoBoth> queryOpenitem() {
		List<OpenitemInvestorinfoBoth> lboth=OpenitemInvestorinfoBothDao.queryOpenitemInvestorinfoBoth();
		List<OpenitemInvestorinfoBoth> lb=OpenitemInvestorinfoBothDao.queryOpenitem();
		int money=0;
		for(int i=0;i<lb.size();i++){
			for(int j=0;j<lboth.size();j++){
				if(lb.get(i).getItemId().equals(lboth.get(j).getItemId())){
					money=lboth.get(j).getInerstMoney()+money;//获取每个项目的投资总金额;
				}
			}
			lb.get(i).setInerstAllMoney(money);
			money=0;//清空前个项目总金额，算出下个项目投资的总金额
		}
		return lb;
	}
	@Override
	public List<OpenitemInvestorinfoBoth> queryOpenitemInvestorinfoOnly(Userinfo phone) {
		// TODO Auto-generated method stub
	
		
		return OpenitemInvestorinfoBothDao.queryOpenitemInvestorinfoOnly(phone);
	}
}
