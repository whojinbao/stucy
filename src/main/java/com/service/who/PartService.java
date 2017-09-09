package com.service.who;

import java.util.List;
import java.util.Map;

import com.entity.Part;
import com.entity.Partjur;
import com.entity.util.Page;

public interface PartService {
	/**
	 * ��ѯ��ɫ����������
	 */
	public Map<String, Object> queryPart(Page page);
	/**
	 * ���ӽ�ɫ
	 */
	public void addPart(Part part);
	/**
	 * ����Ա��ID��ѯӵ�еĽ�ɫ
	 */
	public String queryDescribe(String partId);
	/**
	 * ����Ա��Id������ӵ�еĽ�ɫ
	 */
	public void updateDescribe(Partjur pj);
	/**
	 * ��ѯ�Ƿ��Ѵ��ڸý�ɫ
	 * @param str��ɫ��
	 */
	public int queryAllPartName(String str);
	/**
	 * ��ɫ�����ظ�����֤
	 * ��ѯȫ���Ľ�ɫ����
	 */
	public List<Map<String, Object>> queryAllPart();
	/**
	 * ��ɫ�����ظ�����֤
	 * ��ѯӵ�еĵĽ�ɫ����
	 */
	public List<Map<String, Object>> queryselPart(String userId);
	/**
	 * ���ݽ�ɫɾ��������ص��û���ɫ����Ϣ
	 */
	public void deleteConPart(String consusId);
	/**
	 * ���ݸ��µ��û���ɫ����Ϣ
	 */
	public void insertConPart(Map<String,String> cp);
	
	
	/**
	 * ���ý��ý�ɫ
	 */
	public void  updatePartStatus(Map<String,String> map);
	/**
	 * �޸Ľ�ɫ����
	 */
	public void updatePart(Part part);
}
