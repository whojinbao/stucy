package com.dao.cq;

import java.util.List;

import com.entity.Investorinfo;
import com.entity.Userinfo;

public interface InvestorinfoDao {
	//���Ͷ���˵���Ϣ
			public int addInvestorinfo(Investorinfo ivesf);
			//����Ͷ���˵绰��ѯ����Ͷ���˵���Ϣ
			public Investorinfo queryInvestorinfo(Userinfo userName);
			//��ѯ����Ͷ���˵���Ϣ
			public List<Investorinfo> queryALLInvestorinfo();
			//����Ͷ���˵绰��ѯ����Ͷ���˵�id
			public Investorinfo queryInvestorinfoId(Userinfo userName);
}
