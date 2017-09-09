<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>项目发布</title>
<script type="text/javascript" src="/stucy/demo/jquery.min.js"></script>
<script type="text/javascript" src="/stucy/demo/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/stucy/demo/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" href="/stucy/demo/bootstrap/easyui.css"
	type="text/css"></link>
<link rel="stylesheet" href="/stucy/demo/icon.css" type="text/css"></link>
</head>
<body>
    <a id="btn1" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'">增加</a>   
	<table id="openitems"></table>
	<div id="addopenitem">
	    &nbsp;&nbsp;&nbsp;&nbsp;项目名称：&nbsp;<input type="text" class="easyui-validatebox" id="itemName" data-options="required:true"/><br>
		&nbsp;&nbsp;&nbsp;&nbsp;项目状态：&nbsp;<input type="text" class="easyui-validatebox" id="itemStatus" data-options="required:true"/><br>
        &nbsp;&nbsp;&nbsp;&nbsp;发布时间：&nbsp;<input  class="easyui-datetimebox" id="starttime" data-options="required:true"/><br>
        &nbsp;&nbsp;&nbsp;&nbsp;结束时间：&nbsp;<input  class="easyui-datetimebox" id="endtime" data-options="required:true"/><br>	
	</div> 
<script type="text/javascript" src="/stucy/js/openitem.js"></script>
</body>
</html>