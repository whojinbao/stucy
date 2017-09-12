package com.service.imp.cq;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.cq.ShenHememberDao;
import com.entity.Member;
import com.service.cq.ShenHememberService;
@Service
public class ShenHememberImpl implements ShenHememberService{
	/*
	 * ��ѯ��Ա��ţ���Ա�ڹ涨ʱ�䷢���Ĵ�������Ա�ĵ���ʱ��ͽ���ʱ��
	 */
	@Autowired
	private ShenHememberDao ShenHememberDao;
	@Override
	public Boolean queryShenHemember(Map<String,Object> map) {
		// TODO Auto-generated method stub
		/*
		 *1 �жϸ����ǲ��ǻ�Ա
		 * 2����ʱ���ǲ���<��Ա����ʱ��*
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<Member> lms=ShenHememberDao.queryShenHemember();//��ȡ��Ա��ļ�¼
		int flag=0;
		for(int i=0;i<lms.size();i++){	
				try {
						Date  HuiyuanTime = sdf.parse((String)lms.get(i).getEndTime());
						Date shenQingTime = sdf.parse((String) map.get("shenQingTime"));
						int count=Integer.parseInt(lms.get(i).getCount());
						if(lms.get(i).getUserId().equals(map.get("telephone"))&& HuiyuanTime.compareTo(shenQingTime)>0 && count>0){
							flag=1;
							break;
						}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		if(flag==1){
			return true;
		}else{
			return false;
		}
		
	}
	@Override
	/*
	 *���ݷ����˱���޸ĸ�Ա�������Է����Ĵ���
	 */
	public int updateShenheMember(Member mb) {	
		int mm=Integer.parseInt(mb.getCount());
		System.out.println(mm);
		String count=Integer.toString(--mm);
		mb.setCount(count);
		return ShenHememberDao.updateshenheMember(mb);
	}
	@Override
	/*
	 * ���ݷ����˱�Ų�ѯ��Ա�����Է����Ĵ���
	 */
	public Member queryShenHememberOnly(String map) {
		// TODO Auto-generated method stub
		return ShenHememberDao.queryShenHememberOnly(map);
	}

}
