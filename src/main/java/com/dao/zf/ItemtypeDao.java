package com.dao.zf;

import java.util.List;

import com.entity.Itemtype;
/**
 * 
 * @author ���� :zf
 * @version ����ʱ�䣺2017��9��11�� ����9:45:13 
 * ��˵��  ��Ŀ���͵�dao��
 */
public interface ItemtypeDao {
	/**
	 * ��ѯ���е���Ŀ����
	 * @return
	 */
	public List<Itemtype> queryItemtype();
}
