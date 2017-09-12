<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>寻找项目</title>
<link href="/stucy/p2p/css/common.css" rel="stylesheet" />
<link href="/stucy/p2p/css/index.css" rel="stylesheet" type="text/css">
<link href="/stucy/p2p/css/detail.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/stucy/p2p/script/jquery.min.js"></script>
</head>
<style type="text/css">
#person{
	line-height:40px;
	font-size:20px;
}
#div{
	margin: auto;
	margin-top: 30px;
	margin-left:200px;
}
</style>
<body>
	<!-- 头部 -->
	<div class="header-top min-width">
		<div class="container fn-clear">
			<ul class="fn-right header-top-ul">
				<li><a href="/stucy/login.html" class="app">返回首页</a></li>
				<li>
					<div class="">
						<a href="/stucy/register.html" class="c-orange" title="免费注册">免费注册</a>
					</div>
				</li>
				<li>
					<div class="">
						<a href="/stucy/login.html" class="js-login" title="登录">登录</a>
					</div>
				</li>
			</ul>
		</div>
	</div>
	<div class="header min-width">
		<div class="container">
			<div class="fn-left logo"></div>
			<ul class="top-nav fn-clear">
				<li><a href="/stucy/yemian/list">首页</a></li>
				<li class="on"><a href="/stucy/yemian/list">寻找项目</a></li>
				<li><a href="">寻找投资</a></li>
				<li><a href="/stucy/financial/member.do">会员充值</a></li>
				<li><a href="/stucy/financial/Personal.do">个人中心</a></li>
				<li class="top-nav-safe"><a>我的账户</a></li>
			</ul>
		</div>
	</div>
	<script type="text/javascript" src="/stucy/js/jquery-3.1.1.min.js"></script>
	
	<div id="div">
	账号：<input type="text" id="userId" value="854631421">	
	</div>

	<script type="text/javascript">
		
				window.onload=function() {
					var userId = $("#userId").val();
					//得到当前时间
					var newdate=new Date();
					$.ajax({
						type : "post",
						url : "/stucy/personal/queryPersonal.do",
						data : userId,
						contentType : "application/json;charset=utf-8",
						success : function(data) {
							var dd="";
							if(data.length>0){
								dd=data[0].USER_ID
							}										
							if(userId==dd){
								//时间转换
								var starttime=new Date(Date.parse(data[0].END_TIME));
								/* 判断会员是或到期 */
								if(newdate<starttime){
									str="<table id='person'><tr><td>账户金额:</td><td>"+data[0].MEMBER_MONSY+" 元</td></tr>"
									+"<tr><td>可用次数:</td><td>"+data[0].COUNT+"次</td></tr>"+"<tr><td>开始时间:</td><td>"+data[0].START_TIME+"</td></tr>"+
									"<tr><td>到期时间:</td><td>"+data[0].END_TIME+"</td></tr></table>"; 
								}else{
									str="会员已过期";									
								}
								}else{
									str="还没有开通任何会员";
									}					
							$("#div").append(str);							
						},
						error : function(data) {						
						alert(data);	
						}
					});
				}
	</script>
</body>
</html>