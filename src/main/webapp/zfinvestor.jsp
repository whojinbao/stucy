<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>个人中心-项目查看</title>
<link href="/stucy/p2p/css/common.css" rel="stylesheet" />
<link href="/stucy/p2p/css/index.css" rel="stylesheet" type="text/css"/>
<link href="/stucy/p2p/css/detail.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="/stucy/p2p/script/jquery.min.js"></script>
<link rel="stylesheet" href="/stucy/helpframe/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	type="text/css"></link>
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
  <!-- 项目列表 -->
 <div style="height:auto;min-height:300px;width:1200px;margin:50px 0 0 200px">
 <div>
     <h3 style="text-align:center;"><span>客户留言</span></h3>
 </div>
         <table class="table table-striped table-hover">
                  <thead>
                           <tr>
                           <th width="300px">项目名称</th>                     
                           <th width="200px">客户姓名</th>
                           <th width="200px">客户电话</th>
                           <th width="300px">客户地址</th>
                           <th width="200px">浏览时间</th>
                           <th width="600px">客户留言</th>
                           <th width="200px">回访安排</th>
                           </tr>
                    </thead>
                      <tbody id="investormlist">
                        
                     </tbody>
                 </table>      
 </div>
 <!-- js -->
 <script type="text/javascript" src="/stucy/js/investor.js"></script>
 <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="/stucy/helpframe/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="/stucy/helpframe/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>          
</body>
</html>
