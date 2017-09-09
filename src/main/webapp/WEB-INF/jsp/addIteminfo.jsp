<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>创建项目</title>

<link rel="stylesheet" href="/stucy/demo/bootstrap/easyui.css"
	type="text/css"></link>
<link rel="stylesheet" href="/stucy/helpframe/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	type="text/css"></link>

<link href="/stucy/p2p/css/common.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="/stucy/p2p/css/user.css" />
<script type="text/javascript" src="/stucy/p2p/script/jquery.min.js"></script>
<script src="/stucy/p2p/script/user.js" type="text/javascript"></script>
</head>
<body >  
  <div class="header-top min-width">
    <div class="container fn-clear"> 
      <ul class="fn-right header-top-ul">
        <li> <a href="/stucy/p2p/index.jsp" class="app">返回首页</a> </li>
        <li>
          <div class=""><a href="" class="c-orange" title="免费注册">免费注册</a></div>
        </li>
        <li>
          <div class=""><a href="" class="js-login" title="登录">登录</a></div>
        </li>
      </ul>
    </div>
  </div>
  <div class="header min-width">
    <div class="container">
      <div class="fn-left logo"> <a class="" href=""> <img src="/stucy/p2p/images/logo.png"  title="logo"/> </a> </div>
      <ul class="top-nav fn-clear">
        <li > <a href="#">首页</a> </li>    
        <li class="on"><a href="/stucy/yemian/list.do">寻找项目</a></li>
        <li><a href="#">寻找投资</a></li>
        <li class="top-nav-safe"> <a href="#" id="person">我的账户</a>
                 <span id="userId" style="display:">${userId }</span> <br/>
                  <span id="userRole" style="display:">${userRole }</span> <br/>
                <span id="xuan">
                
                </span>
        </li>      
      </ul>
    </div>
  </div>
  
<div class="page-filter wrap">
  <div style="height:30px"></div>
  <div class="invest-filter" >
     <!-- 表单 -->
     <div style="padding: 2% 20% 2% 20%;" >	     
     <form action="/stucy/Iteminfo/additem.do"  method="post" enctype="multipart/form-data">      		 
		 <div class="input-group" >
			<span class="input-group-addon">项目名称</span>			
			 <input id="itemName"  name="itemName" class="form-control ">
		 </div>
	   <br>
	
	    <div class="input-group">
			<span class="input-group-addon">项目类型</span>							
			<select id="itemtypeId"  class="form-control" name="itemtypeId">
			<option >---</option>			
			 <c:forEach items="${itemtypelist }" var="itemtype">   	           
   	           <span style="display:none">${itemtype.itemtypeId }</span><option value="${itemtype.itemtypeId }"><span>${itemtype.itemtypeName}</span></option>  	        
   	         </c:forEach>
            </select> 
		</div>
	   <br>
	  
	    <div class="input-group">
			<span class="input-group-addon">创业人员</span>			
			<input id="userId"  name="userId" value="${userId }" class="form-control " style="display:">
			<input id="zName"  name="zName" value="${zName }" class="form-control " >
		</div>
	 <br>
	  
       <div class="input-group">
			<span class="input-group-addon">项目地区</span>				
			 <select id="itemareaid" name="itemareaid" class="form-control">
   	           <option >---</option>
   	           <c:forEach items="${itemarealist }" var="itemarea">   	           
   	           <span style="display:none">${itemarea.itemareaid }</span><option  value="${itemarea.itemareaid }"><span>${itemarea.itemareaname}</span></option>  	        
   	         </c:forEach>     	               	         
            </select> 
		</div>	
	 <br>
	 
	 <div class="input-group">
			<span class="input-group-addon">项目简介</span>		
			<textarea id="itemIntro"  class="form-control " cols="30" rows="5" onKeyup="if(this.value.length>300){this.value=''}" name="itemIntro">
            </textarea>
		</div>	
	 <br>
	 
	  <div class="input-group">
			<span class="input-group-addon">项目内容</span>			
			<textarea name="itemContent"  class="form-control " cols="30" rows="5" onKeyup="if(this.value.length>2000){this.value=''}">
            </textarea>
		</div>	
	 <br>
	 
	 <div class="input-group">
			<span class="input-group-addon">项目资金</span>						
			<input name="itemMoney"  class="form-control" >			
		</div>
		<br/>
		
		<div class="input-group">
			<span class="input-group-addon">项目附件</span>		
			 <input id="itemmaterials"  type="file" name="file"  class="form-control ">		
		</div>	
	    <br>	  
	    <div style="margin-left:40%">
           <input type="submit" class="btn btn-primary" value="确认"/> &nbsp;&nbsp;&nbsp;&nbsp;提 &nbsp;&nbsp;交&nbsp;&nbsp;&nbsp;&nbsp;
         
	    </div>
	</form>
	  
    </div>
    <!-- 表单 -->
 </div>
</div>    
  
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="/stucy/helpframe/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="/stucy/helpframe/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<!-- easyui -->
<script type="text/javascript" src="/stucy/demo/jquery.min.js"></script>
<script type="text/javascript" src="/stucy/demo/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/stucy/demo/easyui-lang-zh_CN.js"></script>
<!-- js -->
<!-- <script type="text/javascript" src="/stucy/js/addIteminfo.js"></script>   -->
</body>
</html> 