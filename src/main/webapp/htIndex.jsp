<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 

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
#condd1 span{display:inline-block;margin-top: 15px;}
#condd input{margin-top: 15px;}
#condd2 input{margin-top: 15px;}
#juridd *{margin-top: 15px;}
#partdd *{margin-top: 15px;}
#partdd1 *{margin-top: 15px;}
h1 {
	text-align: center;
}
#conPartcheck{
	margin-left: 30px;
	margin-top: 0px;
}
body{ margin:0;font-family:微软雅黑;}
.left{ width:180px; height:90%; border:1px solid #ccc ; color:#000; font-size:14px; text-align:center; margin:0 auto;}
.div1{text-align:center; width:180px; padding-top:10px;}
.div2{height:40px; line-height:40px;cursor: pointer; font-size:13px; position:relative;border-bottom:#ccc 1px dotted;}
.jbsz {position: absolute; height: 20px; width: 20px; left: 40px; top: 10px; background:url(images/1.png);}
.xwzx {position: absolute; height: 20px; width: 20px; left: 40px; top: 10px; background:url(images/2.png);}
.zxcp {position: absolute; height: 20px; width: 20px; left: 40px; top: 10px; background:url(images/4.png);}
.lmtj {position: absolute; height: 20px; width: 20px; left: 40px; top: 10px; background:url(images/8.png);}
.div3{display: none;cursor:pointer; font-size:13px;}
.div3 ul{margin:0;padding:0;}
.div3 li{ height:30px; line-height:30px; list-style:none; border-bottom:#ccc 1px dotted; text-align:center;}
#user {
	text-align: right;
	margin-top: 15px;
	margin-right: 15px;
	font-size: 15px;
}
li{
	list-style:none
}
</style>
</head>

<body id="cc" class="easyui-layout">
	<div data-options="region:'north'" style="height: 80px;">
		<h1>创业平台后台管理</h1>
		<div id="user">
			<span>欢迎： ${userName }</span>
		</div>
	</div>
	<div data-options="region:'west',title:'导航'" style="width: 200px;">
		<ul id="tt"></ul>
		<div class="left">
			<div class="div1">
			<shiro:hasPermission name="a">
				<div class="div2">
					<div class="jbsz"></div>
					系统管理1
				</div>
				<div class="div3">
					<ul>
					<shiro:hasPermission name="a1">
						<li><span>员工管理12</span><a href="/stucy/htlogin/goconsumer.do"  onclick="return false" ></a> </li>
					</shiro:hasPermission>
					<shiro:hasPermission name="a2">	
						<li><span>角色管理13</span><a href="/stucy/htlogin/gopart.do"  onclick="return false" ></a></li>
					</shiro:hasPermission>
					<shiro:hasPermission name="a3">	
						<li><span>权限管理14</span><a href="/stucy/htlogin/gojur.do"  onclick="return false" ></a></li>
					</shiro:hasPermission>
					</ul>
				</div>
			</shiro:hasPermission>
			<shiro:hasPermission name="b">
				<div class="div2">
					<div class="xwzx"></div>
					系统管理2
				</div>
				<div class="div3">
					<ul>
					<shiro:hasPermission name="b1">
						<li><span>会员详情</span><a href="/stucy/financial/search.do"  onclick="return false" ></a></li>
					</shiro:hasPermission>
					<shiro:hasPermission name="b2">	
						<li><span>充值记录</span><a href="/stucy/financial/Particulars.do"  onclick="return false" ></a></li>
					</shiro:hasPermission>
					<shiro:hasPermission name="b3">
						<li><span>金额统计</span><a href="/stucy/financial/Finance.do"  onclick="return false" ></a></li>
					</shiro:hasPermission>
					</ul>
				</div>
			</shiro:hasPermission>
			<shiro:hasPermission name="c">
				<div class="div2">
					<div class="zxcp"></div>
					系统管理3
				</div>
				<div class="div3">
					<ul>
					<shiro:hasPermission name="c1">
						<li><span>员工管理32</span><a href="/stucy/goshenhe.do"  onclick="return false" ></a></li>
					</shiro:hasPermission>
					<shiro:hasPermission name="c2">	
						<li><span>角色管理33</span><a href=""  onclick="return false" ></a></li>
					</shiro:hasPermission>
					<shiro:hasPermission name="c3">	
						<li><span>权限管理34</span><a href=""  onclick="return false" ></a></li>
					</shiro:hasPermission>
					</ul>
				</div>
			</shiro:hasPermission>
			<shiro:hasPermission name="d">
				<div class="div2">
					<div class="lmtj"></div>
					系统管理4
				</div>
				<div class="div3">
					<ul>
					<shiro:hasPermission name="d1">
						<li><span>员工管理42</span><a href=""  onclick="return false" ></a></li>
					</shiro:hasPermission>
					<shiro:hasPermission name="d2">	
						<li><span>角色管理43</span><a href=""  onclick="return false" ></a></li>
					</shiro:hasPermission>
					<shiro:hasPermission name="d3">	
						<li><span>权限管理44</span><a href=""  onclick="return false" ></a></li>
					</shiro:hasPermission>
					</ul>
				</div>
			</shiro:hasPermission>
			</div>
		</div>
	</div>
	<div id="tt1" class="easyui-tabs"
		data-options="region:'center',title:''"
		style="padding: 5px; background: #eee;">
		<div title="Tab1" style="padding: 20px; display: none;">tab1</div>

	</div>
</body>
<script>
$(function(){
	$(".div2").click(function(){ 
		$(this).next("div").slideToggle("slow").siblings(".div3:visible").slideUp("slow");
	});
	$("li").click(function (){
		var url=$(this).find("a").attr("href");
		var title=$(this).find("span").html();
		var node = $("#tt1").tabs("getTab", title);
		if (!node) {
				addTabs(title,url);
		} else {
				$("#tt1").tabs("select", title);
		}
	});
	
	
	function addTabs(title,url) {
		$('#tt1').tabs('add', {
			title : title,
			closable : true,
			href : url
		});
	}
	
	
	
	
	
	
	
	/* function addTabs(title) {
		$('#tt1').tabs('add', {
			title : title,
			content : 'Tab Body',
			closable : true,
			tools : [ {
				iconCls : 'icon-mini-refresh',
				handler : function() {
				}
			}]
		});
	} */
});
	

</script>
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
