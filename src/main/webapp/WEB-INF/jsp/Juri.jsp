<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript" src="/stucy/demo/jquery.min.js"></script>
<script type="text/javascript" src="/stucy/demo/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/stucy/demo/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" href="/stucy/demo/bootstrap/easyui.css"
	type="text/css"></link>
<link rel="stylesheet" href="/stucy/demo/icon.css" type="text/css"></link>
<style type="text/css">
#juridd * {
	margin-top: 15px;
}
</style>
</head>
<body>
	<div>
		<span style="position: relative; right: -1%;"> <a id="juribtn1"
			href="#" class="easyui-linkbutton"
			data-options="iconCls:'icon-ajuridd'">启用</a> &nbsp;&nbsp; <a
			id="juribtn2" href="#" class="easyui-linkbutton"
			data-options="iconCls:'icon-remove'">禁用</a>
		</span>
	</div>
	<table id="juridg"></table>
	<script type="text/javascript">
$(function (){
	 $('#juridg').datagrid({     
		url:'/stucy/juri/getjuri.do', 
		fitColumns:true,
		striped:true,
		singleSelect:true, 
		pagination:true,
		pagePosition:"bottom",
		pageSize:'10',
		pageList:[10,15,20,25,30],
	    columns:[[    
	        {field:'jurId',title:'序号',width:300},    
	        {field:'jurName',title:'权限名称',width:300},    
	        {field:'jurStatus',title:'权限状态',width:300,
	        	formatter:function(value,row,index){
  		      		if(value == 1){
  		      			return "已启用";
  		      		}else{
  		      			return "<span style='color:red'>已禁用</span>";
  		      		}
	        	}
	        }
	    ]]    
	}); 
	$("#juribtn1").click(function (){
		var numVal=$('#juridg').datagrid("getSelected");
		if(numVal==null){
			jurimessager("请先选中一条数据后再进行操作")
			return
		}
		if(confirm("确定启用该权限?")){
			 $.ajax({
				type : "post",
				url : "/stucy/juri/enable.do",
				contentType : "application/json;charset=utf-8",
				data : numVal.jurId ,
				success : function(data1) {
					$("#juridg").datagrid('reload');
				}
			});
			replace();
			jurimessager("已启用")
		}
	}); 
	$("#juribtn2").click(function (){
		var numVal=$('#juridg').datagrid("getSelected");
		if(numVal==null){
			jurimessager("请先选中一条数据后再进行操作")
			return
		}
		if(confirm("确定禁用该权限?")){
			 $.ajax({
				type : "post",
				url : "/stucy/juri/disable.do",
				contentType : "application/json;charset=utf-8",
				data : numVal.jurId ,
				success : function(data1) {
					$("#juridg").datagrid('reload');
				}
			});
		    replace();
		    jurimessager("已禁用")
		}
		 
	});
	function jurimessager(test){
		$.messager.show({
		    title:'消息提示框',
		    msg:test,
		    timeout:5000,
		    height:220,
		    width:330,
		    showType:'slide'
		});
	}
	function replace(){
		$('#juridg').datagrid("reload");
	}
	  
	
});
</script>
</body>
</html>