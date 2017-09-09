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
<link rel="stylesheet" href="/stucy/helpframe/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	type="text/css"></link>
</head>
<body>
<!-- 头部 -->
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
      <div class="fn-left logo"> <a class="" href=""> <img src="/stucy/p2p/images/logo.png"  title=""> </a> </div>
      <ul class="top-nav fn-clear">
         <li > <a href="/stucy/list.jsp">首页</a> </li>    
        <li class="on"><a href="/stucy/list.jsp">寻找项目</a></li>
        <li><a href="/stucy/item">寻找投资</a></li>
        <li class="top-nav-safe"> <a href="/stucy/openitem/person">我的账户</a> </li> 
      </ul>
    </div>
  </div>
<!--列表-->
<!-- js -->
<!-- <script type="text/javascript" src="/stucy/js/openitemlogin.js"></script> -->
<!--  -->
   <div class="invest-list mrt30 clearfix" id="" style="margin-left:50px">
       <div style="padding: 0% 30% 20% 20%;" >
	     <div class="page-header">
           <h2 class="text-center">项目介绍</h2>  
         </div>
         <br/>
         <br/>
		 <div class="input-group" >
			<span class="input-group-addon">项目名称</span>			
			 <input id="itemName"  name="itemName" value="${openitem.itemName}" class="form-control ">
		 </div>
	   <br>
	
	    <div class="input-group">
			<span class="input-group-addon">项目类型</span>
			<input id="itemType"  name="itemType" value="${openitem.itemtypeId}" class="form-control ">												
		</div>
	   <br>
	  
	    <div class="input-group">
			<span class="input-group-addon">创业人员</span>			
			<input id="userId"   value="${openitem.userId}" class="form-control " >
		</div>
	 <br>
	  
       <div class="input-group">
			<span class="input-group-addon">项目地区</span>		
			 <input id="itemArea" value="${openitem.itemareaId}"  class="form-control " >
		</div>	
	 <br>
	 
	 <div class="input-group">
			<span class="input-group-addon">项目简介</span>		
			<textarea id="itemIntro"  class="form-control "   cols="30" rows="5" onKeyup="if(this.value.length>300){this.value=''}">
               
            </textarea>
		</div>	
	 <br>	 	
	 
	 <div class="input-group">
			<span class="input-group-addon">项目资金</span>						
			<input id="itemMoney" value="${openitem.itemMoney}" class="form-control" >
			<span class="input-group-addon">&nbsp;&nbsp;&nbsp;&nbsp;.00</span>
		</div>
		<br/>				
   </div>
   </div>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="/stucy/helpframe/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="/stucy/helpframe/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>           
</body>
</html>