package com.dao.cq;

import java.util.List;

import com.entity.Investorinfo;
import com.entity.Userinfo;

public interface InvestorinfoDao {
	//添加投资人的信息
			public int addInvestorinfo(Investorinfo ivesf);
			//根据投资人电话查询个人投资人的信息
			public Investorinfo queryInvestorinfo(Userinfo userName);
			//查询所有投资人的信息
			public List<Investorinfo> queryALLInvestorinfo();
			//根据投资人电话查询个人投资人的id
			public Investorinfo queryInvestorinfoId(Userinfo userName);
}
