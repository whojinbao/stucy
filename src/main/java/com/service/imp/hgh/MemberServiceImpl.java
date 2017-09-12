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
 * 会员操作
 * @author HuGangHao
 *
 */
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao dao;
	@Override
	public void addmember(Member mr) {
		//修改
		List<Member> mList=dao.querymember1(mr.getUserId());
		// TODO Auto-generated method stub
		//获得当前时间
		Date newdate = new Date();
		//格式
		SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
		int flg=0;
		//获得每次开通的次数
		int memberTime =Integer.parseInt(mr.getMemberTime()) ;
		int memberType =Integer.parseInt(mr.getMemberType()) ;		
		int a=memberTime*memberType;
		//判断账号是不是 第一次充值
		if(mList.size()>0){
			flg=1;
			//得到上次会员结束时间
			String stim=mList.get(0).getEndTime();			
			Date date = null;
			try {
				//String 转 date
				date = sdf.parse(stim);
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			//判断上次会员到今天是或过期
			if(newdate.getTime()<date.getTime()){
				//上次充值没有过期 再次充值  其他值顺延

				//更新可用次数
				int count=Integer.parseInt(mr.getCount());
				int counts=Integer.parseInt(mList.get(0).getCount());
				String cou=Integer.toString(count+counts);
				mr.setCount(cou);
				//更新金额
				int membermonsy=Integer.parseInt(mr.getMemberMonsy());
				int membermonsys=Integer.parseInt(mList.get(0).getMemberMonsy());
				String monsy=Integer.toString(membermonsy+membermonsys);
				mr.setMemberMonsy(monsy);
				//判断会员类型
				int membertype=Integer.parseInt(mList.get(0).getMemberType());
				int membertypes=Integer.parseInt(mr.getMemberType());			
				if(membertype==12){
					int durat=Integer.parseInt(mList.get(0).getMemberTime()) ;
					String type=Integer.toString(durat*12+memberTime);
					mr.setMemberTime(type);
					mr.setMemberType(mr.getMemberType());
				}else{
					//更新会员时长
					int b=memberTime*memberType;
					int duration=Integer.parseInt(mList.get(0).getMemberTime()) ;
					String dur=Integer.toString(b+duration);
					mr.setMemberTime(dur);		
				}
				try {
					//把第一次会员的开始时间给第二次开始时间
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
		//开始时间
		String startdate = sdf.format(newdate);
		mr.setStartTime(startdate);
		//结束时间
		Calendar cal=Calendar.getInstance();
		cal.setTime(newdate);
		cal.add(cal.MONTH, a);
		String enddate = sdf.format(cal.getTime());
		mr.setEndTime(enddate);
		//如果第一次充值直接插入
		if (flg==0) {
			dao.addmember(mr);
		}else{
			//如果不是第一次充值更新数据
			dao.updatemember(mr);
		}
	}
	@Override
	public Map<String,Object> querymember(Page page) {
		// TODO Auto-generated method stub
		//获得每页从那条数据开始的
		int startIndex = (page.getPage()-1) * page.getRows();
		//获得每页从那条数据结束
		int endIndex = page.getPage() * page.getRows() + 1;		
		page.setStartIndex(startIndex);
		page.setEndIndex(endIndex);
		//获得总条数
		List<Member> list=dao.querymember(page);
		int total=dao.queryAllMember(page);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMemberType().equals("1")) {
				list.get(i).setMemberType("月会员");
			}else{
				list.get(i).setMemberType("年会员");
			}
			if (list.get(i).getMemberContent().equals("a")){
				list.get(i).setMemberContent("项目发布");
			}else{
				list.get(i).setMemberContent("其他");
			}
		}
		Map<String ,Object> map=new HashMap<String, Object>();
		map.put("rows", list);
		map.put("total", total);
		return map;
	} 
}
