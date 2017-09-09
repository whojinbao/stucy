package com.dao.who;

import java.util.List;
import java.util.Map;


import com.entity.Part;
import com.entity.Partjur;
import com.entity.util.Page;

public interface PartDao {
	/**
	 * ��ѯ���еĽ�ɫ(��ҳ��ѯ)
	 */
	public List<Part> queryPart(Page page);
	/**
	 * ����һ����ɫ
	 */
	public void addPart(Part part);
	/**
	 * ���ݽ�ɫID��ѯ�ý�ɫ�����е�Ȩ��
	 */
	public List<Partjur> queryDescribe(String partId);
	
	/**
	 * ���ݽ�ɫIDɾ�����е�Ȩ��
	 */
	public void deleteDescribe(String partId);
	
	/**
	 * ����Ҫ�޸ĵ�Ȩ��
	 */
	public void updateDescribe(Partjur partJur);
	/**
	 *��ѯ�����û��Ľ�ɫ
	 */
	public List<Map<String, Object>> queryConpart();
	/**
	 * ��ѯ���еĽ�ɫ
	 */
	public List<Map<String, Object>> queryAllPart();
	/**
	 * ����Ա��ID��ѯ��ӵ�еĽ�ɫ
	 */
	public List<Map<String, Object>> queryselPart(String userId);
	/**
	 * ���ݽ�ɫɾ��������ص��û���ɫ����Ϣ
	 */
	public void deleteConPart(String consusId);
	/**
	 * ������µ��û���ɫ����Ϣ
	 */
	public void insertConPart(Map<String,String> cp);
	/**
	 * ���ý��ý�ɫ
	 */
	public void  updatePartStatus(Map<String,String> map);
	/**
	 * ���ݽ�ɫ���Ʋ�ѯ�Ƿ�����ͬ�Ľ�ɫ��
	 */
	public List<Map<String,Object>> queryAllPartName(String param);
	/**
	 * ��ѯ��ɫ��������ҳʹ�ã�
	 */
	public int queryCountPart();
	/**
	 * �޸Ľ�ɫ����
	 */
	public void updatePart(Part part);
}
