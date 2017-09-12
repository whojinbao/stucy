package com.service.imp.cq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.cq.ShenHememberDao;
import com.dao.cq.ShenheOpenitemDao;
import com.entity.Member;
import com.entity.Openitem;
import com.service.cq.ShenheOpenitemService;
@Service
public class ShenheOpenitemImpl implements ShenheOpenitemService{
	/*
	 * 添加发布表
	 */
	@Autowired
	private ShenheOpenitemDao ShenheOpenitemDao;
	@Override
	public int addShenheOpenitem(Openitem ot) {
		return ShenheOpenitemDao.addShenheOpenitem(ot);
	}
}
