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
* {
	margin: 0px;
}

h1 {
	text-align: center;
}

#user {
	text-align: right;
	margin-top: 15px;
	margin-right: 15px;
	font-size: 15px;
}
</style>
</head>

<body id="cc" class="easyui-layout">
	<div data-options="region:'north'" style="height:80px;">
		<h1>教师评定系统</h1>
		<div id="user">
			<span>欢迎： ${userName }</span>
		</div>
	</div>
	<div data-options="region:'west',title:'导航'" style="width:200px;">
		<ul id="tt"></ul>
	</div>
	<div id="tt1" class="easyui-tabs"
		data-options="region:'center',title:''"
		style="padding:5px;background:#eee;">
		<div title="Tab1" style="padding:20px;display:none;">tab1</div>

	</div>
</body>
<!-- <script type="text/javascript">
	$('#tt').tree({
		fit : true,
		data : [ {
			"id" : 1,
			"text" : "学生管理",
			"children" : [ {
				"text" : "全部学生",
				"checked" : true,
				"attributes" : {
					"url" : "/teacher/student/gostudent",
					"price" : 100
				}
			}, {
				"text" : "Books",
				"state" : "open",
				"attributes" : {
					"url" : "/teacher/login/gologin",
					"price" : 100
				}
			} ]
		}, {
			"text" : "教师管理",
			"state" : "closed",
			"children" : [ {
				"text" : "Java"
			}, {
				"text" : "C#"
			} ]
		}, {
			"text" : "评价管理",
			"state" : "closed",
			"children" : [ {
				"text" : "Java"
			}, {
				"text" : "C#"
			} ]
		}, {
			"text" : "查看评分",
			"state" : "closed",
			"children" : [ {
				"text" : "Java"
			}, {
				"text" : "C#"
			} ]
		} ],
		onClick : function(node) {
			var node = $("#tt").tree("getSelected");
			var cnode = $("#tt").tree("getChildren", node.target);
			var nn = $("#tt1").tabs("getTab", node.text);
			if (cnode.length == 0) {
				if (!nn) {
					addTabs(node.text,node.attributes.url);
				} else {
					$("#tt1").tabs("select", node.text);
				}
				;

			}

		}
	});

	function addTabs(title,url) {
		$('#tt1').tabs('add', {
			title : title,
			content : 'Tab Body',
			closable : true,
			href : url,
			tools : [ {
				iconCls : 'icon-mini-refresh',
				handler : function() {
					var current_tab = $('#tt1').tabs('getSelected');
					alert(current_tab.href)
					$('#tt1').tabs('update',{
					tab:current_tab,
					options : {
					href :'current_tab.attributes.url'
					//或者 href : ‘‘;
					}
					});
					
				}
			} ]
		});
	}
</script> -->
</html>
