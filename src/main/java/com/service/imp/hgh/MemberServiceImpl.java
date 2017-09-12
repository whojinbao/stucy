package com.service.imp.hgh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.hgh.MemberDao;
import com.entity.Member;
import com.entity.util.Page;
import com.service.hgh.MemberService;
@Service
/**
 * ��Ա����
 * @author HuGangHao
 *
 */
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao dao;
	@Override
	public void addmember(Member mr) {
		//�޸�
		List<Member> mList=dao.querymember1(mr.getUserId());
		// TODO Auto-generated method stub
		//��õ�ǰʱ��
		Date newdate = new Date();
		//��ʽ
		SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
		int flg=0;
		//���ÿ�ο�ͨ�Ĵ���
		int memberTime =Integer.parseInt(mr.getMemberTime()) ;
		int memberType =Integer.parseInt(mr.getMemberType()) ;		
		int a=memberTime*memberType;
		//�ж��˺��ǲ��� ��һ�γ�ֵ
		if(mList.size()>0){
			flg=1;
			//�õ��ϴλ�Ա����ʱ��
			String stim=mList.get(0).getEndTime();			
			Date date = null;
			try {
				//String ת date
				date = sdf.parse(stim);
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			//�ж��ϴλ�Ա�������ǻ����
			if(newdate.getTime()<date.getTime()){
				//�ϴγ�ֵû�й��� �ٴγ�ֵ  ����ֵ˳��

				//���¿��ô���
				int count=Integer.parseInt(mr.getCount());
				int counts=Integer.parseInt(mList.get(0).getCount());
				String cou=Integer.toString(count+counts);
				mr.setCount(cou);
				//���½��
				int membermonsy=Integer.parseInt(mr.getMemberMonsy());
				int membermonsys=Integer.parseInt(mList.get(0).getMemberMonsy());
				String monsy=Integer.toString(membermonsy+membermonsys);
				mr.setMemberMonsy(monsy);
				//�жϻ�Ա����
				int membertype=Integer.parseInt(mList.get(0).getMemberType());
				int membertypes=Integer.parseInt(mr.getMemberType());			
				if(membertype==12){
					int durat=Integer.parseInt(mList.get(0).getMemberTime()) ;
					String type=Integer.toString(durat*12+memberTime);
					mr.setMemberTime(type);
					mr.setMemberType(mr.getMemberType());
				}else{
					//���»�Աʱ��
					int b=memberTime*memberType;
					int duration=Integer.parseInt(mList.get(0).getMemberTime()) ;
					String dur=Integer.toString(b+duration);
					mr.setMemberTime(dur);		
				}
				try {
					//�ѵ�һ�λ�Ա�Ŀ�ʼʱ����ڶ��ο�ʼʱ��
					Date startD  = sdf.parse(mList.get(0).getStartTime());
					newdate=startD;
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int tt=Integer.parseInt(mList.get(0).getMemberTime());
				a+=tt;				
			}
		}
		//��ʼʱ��
		String startdate = sdf.format(newdate);
		mr.setStartTime(startdate);
		//����ʱ��
		Calendar cal=Calendar.getInstance();
		cal.setTime(newdate);
		cal.add(cal.MONTH, a);
		String enddate = sdf.format(cal.getTime());
		mr.setEndTime(enddate);
		//�����һ�γ�ֱֵ�Ӳ���
		if (flg==0) {
			dao.addmember(mr);
		}else{
			//������ǵ�һ�γ�ֵ��������
			dao.updatemember(mr);
		}
	}
	@Override
	public Map<String,Object> querymember(Page page) {
		// TODO Auto-generated method stub
		//���ÿҳ���������ݿ�ʼ��
		int startIndex = (page.getPage()-1) * page.getRows();
		//���ÿҳ���������ݽ���
		int endIndex = page.getPage() * page.getRows() + 1;		
		page.setStartIndex(startIndex);
		page.setEndIndex(endIndex);
		//���������
		List<Member> list=dao.querymember(page);
		int total=dao.queryAllMember(page);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMemberType().equals("1")) {
				list.get(i).setMemberType("�»�Ա");
			}else{
				list.get(i).setMemberType("���Ա");
			}
			if (list.get(i).getMemberContent().equals("a")){
				list.get(i).setMemberContent("��Ŀ����");
			}else{
				list.get(i).setMemberContent("����");
			}
		}
		Map<String ,Object> map=new HashMap<String, Object>();
		map.put("rows", list);
		map.put("total", total);
		return map;
	} 
}
