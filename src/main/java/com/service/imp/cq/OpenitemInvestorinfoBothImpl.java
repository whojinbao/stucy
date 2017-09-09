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
	 * ��������Ͷ�ʵ���Ŀ
	 * ��ѯ��Ŀ
	 * ��ѯ����Ͷ�ʵ���Ŀ
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
					money=lboth.get(j).getInerstMoney()+money;//��ȡÿ����Ŀ��Ͷ���ܽ��;
				}
			}
			lb.get(i).setInerstAllMoney(money);
			money=0;//���ǰ����Ŀ�ܽ�����¸���ĿͶ�ʵ��ܽ��
		}
		return lb;
	}
	@Override
	public List<OpenitemInvestorinfoBoth> queryOpenitemInvestorinfoOnly(Userinfo phone) {
		// TODO Auto-generated method stub
	
		
		return OpenitemInvestorinfoBothDao.queryOpenitemInvestorinfoOnly(phone);
	}
}
