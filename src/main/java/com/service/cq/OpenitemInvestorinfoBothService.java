package com.service.cq;

import java.util.List;

import com.entity.Userinfo;
import com.entity.util.OpenitemInvestorinfoBoth;


public interface OpenitemInvestorinfoBothService {
	/*
	 * ��������Ͷ�ʵ���Ŀ
	 * ��ѯ��Ŀ
	 * ��ѯ����Ͷ�ʵ���Ŀ
	*/
	public List<OpenitemInvestorinfoBoth> queryOpenitemInvestorinfoBoth();
	public List<OpenitemInvestorinfoBoth> queryOpenitem();
	public List<OpenitemInvestorinfoBoth> queryOpenitemInvestorinfoOnly(Userinfo userName);
}
