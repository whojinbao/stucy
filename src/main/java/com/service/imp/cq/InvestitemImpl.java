package com.service.imp.cq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.cq.InvestitemDao;
import com.dao.cq.OpenitemInvestorinfoBothDao;
import com.entity.Investitem;
import com.entity.util.OpenitemInvestorinfoBoth;
import com.service.cq.InvestitemService;
@Service
public class InvestitemImpl implements InvestitemService{
	//鎻掑叆鎶曡祫椤圭洰琛�
		@Autowired
		private InvestitemDao InvestitemDao;
		@Autowired
		private OpenitemInvestorinfoBothDao OpenitemInvestorinfoBothDao;
		
		public int addInvestitem(Investitem intem) {
			// TODO Auto-generated method stub
			List<OpenitemInvestorinfoBoth> lb=OpenitemInvestorinfoBothDao.queryOpenitem();
			int flag=1;
			for(int i=0;i<lb.size();i++){
				if(lb.get(i).getInerstAllMoney()+intem.getInerstMoney()>lb.get(i).getItemMoney()){
					flag=0;
					break;
				}//鎶曡祫鐨勯噾棰濆姞涓婂凡鎶曡祫鐨勯噾棰濅笉鑳借秴杩囪椤圭洰鐨勯」鐩祫閲�
			}
			if(flag==0){
				return 0;
			}else{
				return InvestitemDao.addInvestitem(intem);
			}
		}
}
