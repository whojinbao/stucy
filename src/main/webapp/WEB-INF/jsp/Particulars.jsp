<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
#final {
	margin-left: 710px;
}
</style>
<body>
<input class="easyui-datetimebox" name="birthday"     
        data-options="required:true,showSeconds:false" value="3/4/2010 2:3" style="width:150px">
        
        <input class="easyui-datetimebox" name="birthday"     
        data-options="required:true,showSeconds:false" value="3/4/2010 2:3" style="width:150px">  

	<input class="easyui-validatebox" name="userName" id="pisance" />
	<a href="javascript:void(0)" id="pisbtn" class="easyui-linkbutton"
		data-options="iconCls:'icon-search'">账号查询</a>

	<table id="pisdg"></table>
	<script type="text/javascript">
	/* $(function() {
		$("#pisbtn").click(function() {
			var pisance = $("#pisance").val();
			alert(pisance);
			var data=
			{
				selVal : pisance
			}
			$("#pisdg").datagrid("reload", data); 
		})
		
	}) */

	$(function() {
		$("#pisdg").datagrid({
			url : "/stucy/Particulars/queryParticulars.do",
			fitColumns : true,
			striped : true,
			singleSelect : true,
			pagination : true,
			/* 		pagePosition : "bottom",
					pageSize : '5',
					pageList : [ 5, 10, 15, 20, 25, 30 ], */
			columns : [ [ {
				field : "USER_ID",
				title : "账号",
				width : 50
			}, {
				field : "MEMBER_TYPE",
				title : "类型",
				width : 50,
				formatter : function(value, row, index) {
					if (value == 1) {
						return "月会员";
					} else {
						return "年会员";
					}
				}

			}, {
				field : "MEMBER_MONSY",
				title : "充值金额",
				width : 50
			}, {
				field : "START_TIME",
				title : "开始时间",
				width : 50
			} ] ]

		});
	});
</script>
</body>

</html>