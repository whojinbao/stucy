<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@page isELIgnored="false" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link  href="/stucy/p2p/css/common.css" rel="stylesheet" />
<link href="/stucy/p2p/css/index.css" rel="stylesheet" type="text/css">
<link href="/stucy/p2p/css/detail.css" rel="stylesheet" type="text/css">
<script type="/stucy/text/javascript" src="/p2p/script/jquery.min.js"></script>
<script src="/stucy/helpframe/bootstrap-3.3.7-dist/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="/stucy/js/caojs/area.js"></script>
<script type="text/javascript" src="/stucy/js/caojs/location.js"></script>
<script type="text/javascript" src="/stucy/js/caojs/select2.js"></script>
<script type="text/javascript" src="/stucy/js/caojs/select2_locale_zh-CN.js"></script>
<link rel="stylesheet" href="/stucy/js/caojs/select2.css" type="text/css"></link>
<link rel="stylesheet" href="/stucy/js/caojs/common.css" type="text/css"></link>
<script type="text/javascript" src="/stucy/helpframe/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<script type="text/javascript" src="/stucy/helpframe/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/stucy/helpframe/bootstrap-3.3.7-dist/css/bootstrap.css" type="text/css"></link>
<link rel="stylesheet" href="/stucy/helpframe/bootstrap-3.3.7-dist/css/bootstrap.min.css" type="text/css"></link>
<script src="/stucy/js/caojs/distpicker.data.js"></script>
<script src="/stucy/js/caojs/distpicker.js"></script>
<script src="/stucy/js/caojs/main.js"></script>
<style type="text/css">
	
	#f1{
		margin-left:100px;
		margin-top:40px;
		float:left;
		
	}
	#f2{
		float:left;
		margin-left:300px;
		margin-top:200px;
		
	}
	#investorId{
		width:700px;
	}
	#investorname{
		width:700px;
	}
	#investortel{
		width:700px;}
	#nocardnum{
		width:700px;
	}
	#companynum{
		width:700px;}
	#companyname{
		width:700px;
	}
	#credit{
		width:700px;
	}
</style>
</head>
<body>
<header>
  <div class="header-top min-width">
    <div class="container fn-clear"> 
      <ul class="fn-right header-top-ul">	
         	<li> <a href="login.html" class="app">返回首页</a> </li>
        <li>
          <div class=""><a href="register.html" class="c-orange" title="免费注册">免费注册</a></div>
        </li>
        <li>
          <div class=""><a href="login.html" class="js-login" title="登录">登录</a></div>
        </li>
      </ul>
    </div>
  </div>
  <div class="header min-width">
    <div class="container">
      <div class="fn-left logo"> 
	      <a class="" href="item.do"> 
	      	<img src="images/zxcf_logo.png" style="height:70px;width:344px;" title="">
	      </a> 
	  </div>
      <ul class="top-nav fn-clear">
        <li > <a href="login.html">首页</a> </li>    
        <li ><a href="list.jsp">寻找项目</a></li>
        <li class="on"><a href="/stucy/item.do">寻找投资</a></li>
        <li class="top-nav-safe"> <a href="/stucy/queryInvestorinfo.do">我的账户</a> </li>                  
      </ul>
    </div>
  </div>
  	<div id="f1">
  		<form action="/stucy/addInvestorinfo.do" method="post"  enctype="multipart/form-data"> 
	  	 <input type="text" class="form-control" id="investorname" placeholder="姓名" name="investorname">
  		 <br/>
  		<input type="radio" name="investorsex" id="investorsex" value="男" checked>男
  		<input type="radio" value="女" name="investorsex" id="investorsex">女
  		 <br/>
  		<input type="text" class="form-control" id="investortel" placeholder="电话" name="investortel">
  		<br/>
  		家庭地址:
  			<div>
				<select id="loc_province" style="width:100px;"></select>
				<select id="loc_city" style="width:100px;"></select>
				<select id="loc_town" style="width:100px;"></select>
			</div>						
  			<br/><br/>
  		<input type="text" class="form-control" id="nocardnum" placeholder="身份证号" name="nocardnum">
  		<br/>
  		<input type="text" class="form-control" id="companynum" placeholder="工号" name="companynum">
  		<br/>
  		<input type="text" class="form-control" id="companyname" placeholder="公司名称" name="companyname">
<br/>
  		<span>&nbsp;&nbsp;公司地址:</span>
  		      		  <div id="distpicker2">
							  <select name="location1"></select>
							  <select name="location2"></select>
							  <select name="location3"></select>
						</div>				
  		<br/><br/>
  		<input type="text" class="form-control" id="credit" placeholder="个人信用" name="credit" value="0" readonly="readonly">
  		<br/>
  	</div>
  	<div id="f2">
  	 &nbsp;&nbsp;&nbsp;本人照片:<input  type="file" name="file" id="investorphoto">
  	 <br/> <br/>
	   		公司网截图:<input type="file" name="file" id="companyurl">
	   <br/> <br/>
	  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;工作证:<input type="file" name="file" id="companyphoto">
	  <br/> <br/>
	 <input class="btn btn-primary" type="submit"  value="确认">
	 <input class="btn btn-warning" type="reset"   value="取消">
	</div>
</form>
</header>
</div>
<script >

$("#distpicker2").distpicker({
	  province: "---- 所在省 ----",
	  city: "---- 所在市 ----",
	  district: "---- 所在区 ----"
	});
</script>
</body>
</html>
</html>