package com.service.cq;

import java.util.List;

import com.entity.Investorinfo;
import com.entity.Userinfo;

public interface InvestorinfoService {
	//���Ͷ���˵���Ϣ
		public int addInvestorinfo(Investorinfo ivesf);
			//��ѯ����Ͷ���˵���Ϣ
		public Investorinfo queryInvestorinfo(Userinfo userName);
			//��ѯͶ���˵���Ϣ
		public List<Investorinfo> queryAllInvestorinfo();
		//����Ͷ���˵绰��ѯ����Ͷ���˵�id
		public Investorinfo queryInvestorinfoId(Userinfo userName);
}
