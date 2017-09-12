package com.dao.cq;

import com.entity.Iteminfo;

public interface IteminfoUpdateDao {
	/*
	 * 更改申请项目表中的状态(审核和未审核)
	 */
	public int updateIteminfo(Iteminfo itf);
}
