<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="/stucy/p2p/css/common.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="/stucy/p2p/css/user.css" />
<script type="text/javascript" src="/stucy/p2p/script/jquery.min.js"></script>
<script type="text/javascript" src="/stucy/p2p/script/common.js"></script>
<script src="/stucy/p2p/script/user.js" type="text/javascript"></script>
<link rel="stylesheet" href="/stucy/css/newperson.css" type="text/css"></link>
<link rel="stylesheet"
	href="/stucy/helpframe/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	type="text/css"></link>
<style type="text/css">
</style>
</head>
<body>
<!-- 头部 -->
  <div class="header-top min-width">
    <div class="container fn-clear">     
      <ul class="fn-right header-top-ul">
        <li> <a href="/stucy/login.html" class="app">返回首页</a> </li>
        <li>
          <div class=""><a href="/stucy/register.html" class="c-orange" title="免费注册">免费注册</a></div>
        </li>
        <li>
          <div class=""><a href="/stucy/login.html" class="js-login" title="登录">登录</a></div>
        </li>
      </ul>
    </div>
  </div>
  <div class="header min-width">
    <div class="container">
      <div class="fn-left logo">  </div>
      <ul class="top-nav fn-clear">
        <li > <a href="/stucy/yemian/list">首页</a> </li>    
        <li class="on"><a href="/stucy/yemian/list">寻找项目</a></li>
        <li><a href="/stucy/item">寻找投资</a></li>
        <li class="top-nav-safe"> <a href="/stucy/openitem/person?userId=${loaginuserId }">我的账户</a> </li>      
      </ul>
    </div>
  </div>
	<div class="w1200 personal wrapper wbgcolor "
		style="width: 1250px; ">
		<div class="treebox ">
			<ul class="menu">
				<li class="level1"><a href="#none"><em class="ico ico1"></em>信息管理<i
						class="down"></i></a>
					<ul class="level2">
						<li><a href="javascript:;">系统消息</a></li>
						<li><a href="javascript:;">客户留言</a></li>
					</ul></li>
				<li class="level1"><a href="#none"><em class="ico ico2"></em>项目查看<i></i></a>
					<ul class="level2">
						<li><a href="javascript:;">项目记录</a></li>
						<li><a href="javascript:;">创建项目</a></li>
					</ul></li>
				<li class="level1"><a href="#none"><em class="ico ico3"></em>用户设置<i></i></a>
					<ul class="level2">
						<li><a href="password.jsp">修改密码</a></li>
					</ul></li>
				<li class="level1"><a href="#none"><em class="ico ico3"></em>账户管理<i></i></a>
					<ul class="level2">
					    <li><a href="password.jsp">我的会员</a></li>
						<li><a href="password.jsp">会员充值</a></li>
						<li><a href="password.jsp">账户余额</a></li>						
					</ul></li>
			</ul>
		</div>
		<div class="personal-main">
			<div class="pmain-profile">
				<div class="pmain-welcome">
					<span class="fl"><span id="outLogin">晚上好，</span>tg_gpdt0139
						喝一杯下午茶，让心情放松一下~</span> <span class="fr">本次登录时间：<span id="newtime">
					</span></span>
				</div>
				<div class="pmain-user">
					<div class="user-head ">
						<img 
							src="/stucy/caoImage/1505116819128.jpg" 
							style="width: 150px; height: 200px; z-index: 0;"> <i
							class="headframe img-circle"></i>
					</div>
					<div class="user-info user-info1 ">
						<ul>
							<li>用户名:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>曹奇</span></li>
							<li>电&nbsp;&nbsp;话:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>18435613896</span></li>
							<li>性&nbsp;&nbsp;别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>男</span></li>
							<li>居住地址:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>郑州</span></li>
							<li>会员状态:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>正常</span><span></span></li>
							<li>消息提醒:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>客户留言</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>系统消息</span></li>
						</ul>
					</div>
				</div>
			</div>
	  </div>
    </div>

	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="/stucy/helpframe/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
	<script src="/stucy/js/easing.js"></script>
	<script src="/stucy/js/newperson.js"></script>
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="/stucy/helpframe/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</body>
</html>