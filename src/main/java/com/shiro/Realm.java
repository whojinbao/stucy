package com.shiro;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.dao.who.ConsumerDao;
import com.entity.Consumer;
import com.entity.util.MD5;

public class Realm extends AuthorizingRealm{
	@Autowired
	private ConsumerDao conDao;
	/**
	 * 授权方法
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection val) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		Consumer con=(Consumer) val.getPrimaryPrincipal();
		List<Map<String,Object>> pList=conDao.queryConPartJuri(con.getConUser());
		for (int i = 0; i < pList.size(); i++) {
			info.addStringPermission((String) pList.get(i).get("JUR_DESCRIBE"));
		}
		return info;
	}
	/**
	 * 认证方法
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken upToken =(UsernamePasswordToken) token;
		String userName = upToken.getUsername();
		List<Consumer> list=conDao.queryUser(userName);
		if(list.size()==0){
			return null;
		}else{
			Consumer user = list.get(0);
			String password = user.getConPassword();
			password = MD5.md5(password);
			System.out.println(3+" "+password);
			SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,password,this.getClass().getSimpleName());
		
			return info;
		}
		

	}

}
