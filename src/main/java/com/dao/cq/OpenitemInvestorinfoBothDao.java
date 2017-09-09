package com.dao.cq;

import java.util.List;

import com.entity.Userinfo;
import com.entity.util.OpenitemInvestorinfoBoth;



public interface OpenitemInvestorinfoBothDao {
	/*
	 * 插入所有投资的项目
	 * 查询项目
	 * 查询单个投资的项目
	*/
	public List<OpenitemInvestorinfoBoth> queryOpenitemInvestorinfoBoth();
	public List<OpenitemInvestorinfoBoth> queryOpenitem();
	public List<OpenitemInvestorinfoBoth> queryOpeniteminerst();
	public List<OpenitemInvestorinfoBoth> queryOpenitemInvestorinfoOnly(Userinfo phone);
	
}
