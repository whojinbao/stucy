package com.service.who;

import java.util.List;
import java.util.Map;

import com.entity.Part;
import com.entity.Partjur;
import com.entity.util.Page;

public interface PartService {
	/**
	 * 查询角色的所有数据
	 */
	public Map<String, Object> queryPart(Page page);
	/**
	 * 增加角色
	 */
	public void addPart(Part part);
	/**
	 * 根据员工ID查询拥有的角色
	 */
	public String queryDescribe(String partId);
	/**
	 * 根据员工Id更新所拥有的角色
	 */
	public void updateDescribe(Partjur pj);
	/**
	 * 查询是否已存在该角色
	 * @param str角色名
	 */
	public int queryAllPartName(String str);
	/**
	 * 角色名字重复性验证
	 * 查询全部的角色名称
	 */
	public List<Map<String, Object>> queryAllPart();
	/**
	 * 角色名字重复性验证
	 * 查询拥有的的角色名称
	 */
	public List<Map<String, Object>> queryselPart(String userId);
	/**
	 * 根据角色删除所有相关的用户角色表信息
	 */
	public void deleteConPart(String consusId);
	/**
	 * 根据更新的用户角色表信息
	 */
	public void insertConPart(Map<String,String> cp);
	
	
	/**
	 * 启用禁用角色
	 */
	public void  updatePartStatus(Map<String,String> map);
	/**
	 * 修改角色描述
	 */
	public void updatePart(Part part);
}
