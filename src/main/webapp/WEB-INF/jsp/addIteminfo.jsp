<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>创建项目</title>

<link rel="stylesheet"
	href="/stucy/helpframe/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	type="text/css"></link>
<style type="text/css">
 .form-control{

    display:black;
    width:104%;
    height:auto;
    min-height:50px;
}   
#photo{
   border:1px #ccc solid;
   background-color:#fff;
}
</style>
</head>
<body>

	     <div class="page-header">
           <h2 class="text-center">创建项目</h2>  
         </div>
         <br/>
         <br/>
	<!-- 表单 -->
	<div style="padding: 2% 20% 2% 20%;">
	      
		<form action="/stucy/Iteminfo/additem.do" method="post" enctype="multipart/form-data">			
			<div class="input-group">
				<span class="input-group-addon">项目名称</span> <input id="itemName"
					name="itemName" class="form-control ">
			</div>
			<br>

			<div class="input-group">
				<span class="input-group-addon">经营类型</span> 
				<select id="itemtype" class='form-control' name="itemtypeId">			
					
				</select>
			</div>
			<br>

			<div class="input-group">
				<span class="input-group-addon">申请人员</span> 
				<input id="userId" name="userId" <%-- value="${userId } --%>" class="form-control "
					style="display:"> 
				<%-- <input id="zName" name="zName" value="${zName }" class="form-control "> --%>
			</div>
			<br>

			<div class="input-group">
				<span class="input-group-addon">经营地区</span> 
				<select id="itemarea" name="itemareaId" class="form-control">				
				
				</select>
			</div>
			<br>			

			<div class="input-group">
				<span class="input-group-addon">项目内容</span>
				<textarea id="itemContent"name="itemContent" class="form-control " cols="30"
					rows="5" onKeyup="if(this.value.length>2000){this.value=''}">
            </textarea>
			</div>
			<br>
			<div class="input-group">
				<span class="input-group-addon">项目资金</span>
				 <input id="itemMoney" name="itemMoney" type="text" class="form-control">
				  <span class="input-group-addon">&nbsp;&nbsp;&nbsp;&nbsp;.00</span>				
			</div>
			<br/>

			<div class="input-group " >
				<span class="input-group-addon">项目图片</span> 
				<div id="photo" >
				  <div id="preview" >
                     <img id="imghead" width=100 height=100 border=0 src='<%=request.getContextPath()%>/images/defaul.jpg'/>                 
                  </div>
				  <input id="itemPhoto" type="file" name="file" class="form-control" onchange="previewImage(this)" >
			    </div>
			</div>
			<br>
			<div style="margin-left: 40%">
				<input type="submit" class="btn btn-primary" value="确认" />			
			</div>
		</form>

	</div>

	<!-- 表单 -->

	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="/stucy/helpframe/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="/stucy/helpframe/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<!-- js -->
	 <script type="text/javascript" src="/stucy/js/addIteminfo.js"></script> 
</body>
</html>
