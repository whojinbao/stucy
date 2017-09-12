package com.service.imp.cq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.cq.auditinfoDao;
import com.entity.Auditinfo;
import com.service.cq.auditinfoService;
@Service
public class auditinfoImpl implements auditinfoService{
	/*
	 * Ìí¼ÓÉóºË¼ÇÂ¼±í
	 */
	@Autowired
	private auditinfoDao auditinfoDao ;
	@Override
	public int addAuditinfo(Auditinfo af) {
		// TODO Auto-generated method stub
		return auditinfoDao.addAuditinfo(af);
	}

}
