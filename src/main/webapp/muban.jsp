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
<!--列表-->
  
<div class="page-filter wrap">
  <div style="height:30px"></div>
  <div class="invest-filter" data-target="sideMenu">
    <div class="filter-inner clearfix">
      <div class="filter-item">
        <div class="hd">
          <h3>筛选投资项目</h3>
              <label>
                 <input id="filterMulti" name="multiple_choice" type="checkbox">
                               多选</label>
        </div>
       
          <dl>
            <dt>项目类型</dt>
            <dd>
              <ul >
                    <li class="n1"><a href="javascript:url('repay_style','');" id="repay_style_" class="active">不限</a></li> 
                    <c:forEach items="${itemtypelist}" var="typeitem">
	                <li class="n1"><span class="itemtypeId" style="display:none">${typeitem.itemtypeId}</span><a class="itemtypeName">${typeitem.itemtypeName}</a></li>
	                </c:forEach>             
              </ul>
            </dd>
          </dl>
                  
          <dl class="repayment">
            <dt>所在地区</dt>
            <dd>
              <ul>
                <li class="n1"><a href="javascript:url('repay_style','');" id="repay_style_" class="active">不限</a></li>               
                 <c:forEach items="${itemarealist}" var="areaitem">
	                <li class="n1"><span class="itemareaid" style="display:none">${areaitem.itemareaid}</span><a class="itemareaname">${areaitem.itemareaname}</a></li>
	              </c:forEach>
              </ul>
            </dd>
          </dl>
      
      </div>
     
    </div>
  </div>
  <!--  -->
  <div class="invest-list mrt30 clearfix">
    <div class="hd">
      <h3>热门项目</h3>    
    </div>
    <div class="bd">
      <div class="invest-table clearfix">
        <div class="title clearfix">
          <ul>
            <li class="col-330">项目名称</li>
            <li class="col-180"><a href="javascript:url('order','account_up');" class="">项目类型</a> </li>
            <li class="col-110"><a href="javascript:url('order','apr_up');" class="">所在地区</a> </li>
            <li class="col-150"><a href="javascript:url('order','period_up');" class="">发布人</a> </li>
            <li class="col-150">项目资金</li>
            <li class="col-120"><a href="javascript:url('order','scale_up');" class="">项目进度</a></li>           
          </ul>
        </div>
        <!------------投资列表-------------->
        <div id="item">
        
        </div> 
      </div>
     </div>
   </div>
</div>
     <script>
     	
     </script>      
</body>
</html>