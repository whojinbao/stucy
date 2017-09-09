package com.dao.who;

import java.util.List;
import java.util.Map;


import com.entity.Part;
import com.entity.Partjur;
import com.entity.util.Page;

public interface PartDao {
	/**
	 * 查询所有的角色(分页查询)
	 */
	public List<Part> queryPart(Page page);
	/**
	 * 增加一个角色
	 */
	public void addPart(Part part);
	/**
	 * 根据角色ID查询该角色下所有的权限
	 */
	public List<Partjur> queryDescribe(String partId);
	
	/**
	 * 根据角色ID删除所有的权限
	 */
	public void deleteDescribe(String partId);
	
	/**
	 * 插入要修改的权限
	 */
	public void updateDescribe(Partjur partJur);
	/**
	 *查询所有用户的角色
	 */
	public List<Map<String, Object>> queryConpart();
	/**
	 * 查询所有的角色
	 */
	public List<Map<String, Object>> queryAllPart();
	/**
	 * 根据员工ID查询所拥有的角色
	 */
	public List<Map<String, Object>> queryselPart(String userId);
	/**
	 * 根据角色删除所有相关的用户角色表信息
	 */
	public void deleteConPart(String consusId);
	/**
	 * 插入更新的用户角色表信息
	 */
	public void insertConPart(Map<String,String> cp);
	/**
	 * 启用禁用角色
	 */
	public void  updatePartStatus(Map<String,String> map);
	/**
	 * 根据角色名称查询是否有相同的角色名
	 */
	public List<Map<String,Object>> queryAllPartName(String param);
	/**
	 * 查询角色总数（分页使用）
	 */
	public int queryCountPart();
	/**
	 * 修改角色描述
	 */
	public void updatePart(Part part);
}
