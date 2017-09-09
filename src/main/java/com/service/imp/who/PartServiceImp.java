package com.service.imp.who;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.who.PartDao;
import com.entity.Part;
import com.entity.Partjur;
import com.entity.util.Page;
import com.service.who.PartService;
@Service
public class PartServiceImp implements PartService {
	@Autowired
	private PartDao pDao;
	
	/**
	 * ��ѯ��ɫ����������
	 */
	@Override
	public Map<String, Object> queryPart(Page page) {
		int startIndex = (page.getPage()-1) * page.getRows();
		int endIndex = page.getPage() * page.getRows() + 1;
		page.setStartIndex(startIndex);
		page.setEndIndex(endIndex);
		int total = pDao.queryCountPart();
		List<Part> list=pDao.queryPart(page);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", total);
		map.put("rows", list);
		return map;
	}
	/**
	 * ���Ա����Ϣ�����ݿ�
	 */
	@Override
	public void addPart(Part part) {
		pDao.addPart(part);
	}

	/**
	 * ����Ա��ID��ѯӵ�еĽ�ɫ
	 */
	@Override
	public String queryDescribe(String partId) {
		List<Partjur> pList=pDao.queryDescribe(partId);
		String str="";
		for (int i = 0; i < pList.size(); i++) {
			str += pList.get(i).getJurId()+",";
			
		}
		return str;
	}

	/**
	 * ����Ա��Id������ӵ�еĽ�ɫ
	 */
	@Override
	@Transactional
	public void updateDescribe(Partjur pj) {
		String [] strs=pj.getJurDescribe().split(",");
		String partId=pj.getPartId();
		pDao.deleteDescribe(partId);
		for (int i = 0; i < strs.length; i++) {
			Partjur pp=new Partjur();
			pp.setPartId(partId);
			pp.setJurId(strs[i]);
			pDao.updateDescribe(pp);
		}
	}
	
	/**
	 * ��ɫ�����ظ�����֤
	 * ��ѯȫ���Ľ�ɫ����
	 */
	@Override
	public List<Map<String, Object>> queryAllPart() {
		return pDao.queryAllPart();
	}
	
	/**
	 * ��ɫ�����ظ�����֤
	 * ��ѯӵ�еĵĽ�ɫ����
	 */
	@Override
	public List<Map<String, Object>> queryselPart(String userId) {
		List<Map<String, Object>> allList=queryAllPart();
		List<Map<String, Object>> sonList=pDao.queryselPart(userId);
		for (int i = 0; i < allList.size(); i++) {
			Map<String, Object> map=allList.get(i);
			for (int j = 0; j < sonList.size(); j++) {
				System.out.println(map.get("PART_ID")+" : "+sonList.get(j).get("PART_ID"));
				
				if(map.get("PART_ID").equals(sonList.get(j).get("PART_ID"))){
					map.put("checkeds", "checked");
					break;
				}else{
					map.put("checkeds", " ");
				};
			}
		}
		
		return allList;
	}
	
	/**
	 * ɾ����ɫȨ�޹�����Ϣ
	 */
	@Override
	public void deleteConPart(String consusId) {
		pDao.deleteConPart(consusId);
	}
	
	/**
	 * �����ɫȨ�޹�����Ϣ
	 */

	@Override
	@Transactional
	public void insertConPart(Map<String, String> cp) {
		String[] str=cp.get("partId").split(",");
		deleteConPart(cp.get("consusId"));
		for (int i = 0; i < str.length; i++) {
			Map<String, String> map=new HashMap<String,String>();
			map.put("partId", str[i]);
			map.put("consusId", cp.get("consusId"));
			pDao.insertConPart(map);
		}
		
	}

	/**
	 * ���ý��ý�ɫ
	 */
	@Override
	public void updatePartStatus(Map<String, String> map) {
		pDao.updatePartStatus(map);
	}
	/**
	 * ���ݽ�ɫ���Ʋ�ѯ�Ƿ�����ͬ�Ľ�ɫ��
	 */
	@Override
	public int queryAllPartName(String str) {
		return pDao.queryAllPartName(str).size();
	}
	/**
	 * �޸Ľ�ɫ����
	 */

	@Override
	public void updatePart(Part part) {
		pDao.updatePart(part);
		
	}

}
