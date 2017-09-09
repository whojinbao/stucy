package com.service.imp.cq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.cq.InvestorinfoDao;
import com.entity.Investorinfo;
import com.entity.Userinfo;
import com.service.cq.InvestorinfoService;
@Service
public class InvestorinfoImpl implements InvestorinfoService{
	@Autowired
	private InvestorinfoDao InvestorinfoDao;
	/*
	 * 添加投资人的信息
	 */
	public int addInvestorinfo(Investorinfo ivesf) {
			return InvestorinfoDao.addInvestorinfo(ivesf);
	}
	@Override
	/*
	 *查询投资人的信息
	 */
	public Investorinfo queryInvestorinfo(Userinfo userName) {
		// TODO Auto-generated method stub
		return InvestorinfoDao.queryInvestorinfo(userName);
	}
	@Override
	public List<Investorinfo> queryAllInvestorinfo() {
		// TODO Auto-generated method stub
		return InvestorinfoDao.queryALLInvestorinfo();
	}
	@Override
	public Investorinfo queryInvestorinfoId(Userinfo userName) {
		// TODO Auto-generated method stub
		return InvestorinfoDao.queryInvestorinfoId(userName);
	}
}
