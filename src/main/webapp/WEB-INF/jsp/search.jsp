<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript"
		src="/stucy/helpframe/easyui/jquery.min.js"></script>
	<script type="text/javascript"
		src="/stucy/helpframe/easyui/jquery.easyui.min.js"></script>
	<link rel="stylesheet"
		href="/stucy/helpframe/easyui/bootstrap/easyui.css" type="text/css"></link>
	<script type="text/javascript"
		src="/stucy/helpframe/easyui/easyui-lang-zh_CN.js"></script>	
	
</head>
<style type="text/css">
#searsel{
	margin-left:660px;
}
</style>
<body>
	<input class="easyui-validatebox" name="userName" id="searsel" />
	<a href="javascript:void(0)" id="searSelBtn" class="easyui-linkbutton"
		data-options="iconCls:'icon-search'">账号查寻</a>
	<table id="searchdg"></table>
	<script type="text/javascript">
	$(function() {
		$("#searSelBtn").click(function (){
			var searsel=$("#searsel").val();
			var data={
					selVal:searsel
			}
			$("#searchdg").datagrid("reload",data);
		})
		$("#searchdg").datagrid({
			url : "/stucy/member/querymember.do",
			fitColumns:true,
		    striped:true,
		    singleSelect:true, 
		    pagination:true,
		    pagePosition:"bottom",
		    pageSize:'5',		    
			pageList:[5,10,15,20,25,30],
			columns : [ [ {
				field : "userId",
				title : "账号",
				width : 50
			}, {
				field : "memberType",
				title : "类型",
				width : 50
			}, {
				field : "memberContent",
				title : "使用项",
				width : 50
			}, {
				field : "memberTime",
				title : "开通时长",
				width : 50
			}, {
				field : "count",
				title : "发布次数",
				width : 50
			}, {
				field : "memberMonsy",
				title : "金额",
				width : 50
			}, {
				field : "startTime",
				title : "开始时间",
				width : 50
			}, {
				field : "endTime",
				title : "到期时间",
				width : 50
			}

			] ]
		});
	});
</script>
</body>

</html>