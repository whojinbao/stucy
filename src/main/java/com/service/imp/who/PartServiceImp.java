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
	 * 查询角色的所有数据
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
	 * 添加员工信息到数据库
	 */
	@Override
	public void addPart(Part part) {
		pDao.addPart(part);
	}

	/**
	 * 根据员工ID查询拥有的角色
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
	 * 根据员工Id更新所拥有的角色
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
	 * 角色名字重复性验证
	 * 查询全部的角色名称
	 */
	@Override
	public List<Map<String, Object>> queryAllPart() {
		return pDao.queryAllPart();
	}
	
	/**
	 * 角色名字重复性验证
	 * 查询拥有的的角色名称
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
	 * 删除角色权限关联信息
	 */
	@Override
	public void deleteConPart(String consusId) {
		pDao.deleteConPart(consusId);
	}
	
	/**
	 * 插入角色权限关联信息
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
	 * 启用禁用角色
	 */
	@Override
	public void updatePartStatus(Map<String, String> map) {
		pDao.updatePartStatus(map);
	}
	/**
	 * 根据角色名称查询是否有相同的角色名
	 */
	@Override
	public int queryAllPartName(String str) {
		return pDao.queryAllPartName(str).size();
	}
	/**
	 * 修改角色描述
	 */

	@Override
	public void updatePart(Part part) {
		pDao.updatePart(part);
		
	}

}
