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
<link href="/stucy/helpframe/bootstrap-3.3.7-dist/css/bootstrap.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript" src="/stucy/p2p/script/jquery.min.js"></script>
<script type="text/javascript"
	src="/stucy/js/who/distpicker.data.min.js"></script>
<script type="text/javascript" src="/stucy/js/who/distpicker.min.js"></script>
<script type="text/javascript" src="/stucy/js/who/main.js"></script>
<script type="text/javascript"
	src="/stucy/helpframe/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<style type="text/css">
#qtitemId {
	display: none;
}

#qtdconter {
	position: relative;
	background-color: #F7F7F7;
	height: 1px;
}

#qtdconterleft, #qtdconterright {
	background-color: #FFFFFF;
	border: 1px solid gray;
}

#qtdconterleft {
	position: absolute;
	top: 0px;
	left: 0px;
	width: 74%;
	height: auto;
}

#qtdconterright {
	position: absolute;
	top: 200px;
	right: 40px;
	width: 24%;
	height: 400px;
	position: fixed;
}
#qtdimg {
	display: inline-block;
	margin-top: 15px;
	margin-left: 15px;
	width: 360px;
	height: 360px;
}

#qtdintroduce {
	position: absolute;
	top: 15px;
	left: 405px;
	width: 360px;
	height: 360px;
}

#qtdimg img {
	width: 100%;
	height: 100%;
}

#qtdintroduce * {
	margin-left: 10px;
	font-weight: bold;
}

#qtdintroduce span {
	font-weight: normal;
}

#qtdintroduce div {
	margin-bottom: 20px;
}

#qtdintroduce h3 {
	margin-bottom: 20px;
}

.qtdp {
	text-indent: 30px;
	letter-spacing: 1px;
	margin-left: 50px;
	margin-right: 80px;
}

#qtdts {
	margin-top: 40px;
	margin-bottom: 40px;
	border-top: 1px solid gray;
}

#qtdtsp {
	text-indent: 30px;
	letter-spacing: 1px;
	margin-left: 50px;
	margin-right: 80px;
	margin-top: 20px;
	font-size: 11px;
	color: gray;
}

#shengcheng {
	position: relative;
}

#savetel {
	height: 600px;
	border: 1px solid gray;
	position: relative;
}

#savetel>* {
	margin-left: 20px;
	margin-top: 20px;
}

#savetel input {
	display: inline-block;
	height: 30px;
}

#sanji select {
	margin-left: 20px;
	display: inline-block;
	height: 30px;
}

#huifang {
	margin-top: -10px;
}

#huifang input {
	margin-left: 10px;
	margin-right: 5px;
}

#liuyan {
	width: 35%;
	height: 300px;
	border: 1px solid gray;
	position: absolute;
	top: 0px;
	right: 30px;
}

#liuyan input {
	color: #EA5924;
	border: none;
	background-color: #FFFFFF;
}

#liuyan li {
	margin-left: 20px;
	margin-top: 10px;
}

#qtdsubmit {
	width: 260px;
	height: 40px;
	margin-top: 30px;
	margin-left: 200px;
	background-color: #E7141B;
	color: #FFFFFF;
	border: 1px solid gray;
}

#telts {
	color: red;
	margin-left: 60px;
	display: none;
}

#wsxx {
	color: red;
	margin-left: 40%;
	display: none;
}

#qtflag {
	display: none;
}
#qtdconterright img{
	width:100%;
	height:100%;
}
</style>
</head>
<body>
	<!-- 头部 -->
	<input value="${qtitemId }" id="qtitemId" />
	<input value="${qtflag }" id="qtflag" />
	<div class="header-top min-width">
		<div class="container fn-clear">
			<ul class="fn-right header-top-ul">
				<li><a href="/stucy/login.html" class="app">返回首页</a></li>
				<li>
					<div class="">
						<a href="/stucy/register.html" class="c-orange" title="免费注册">免费注册</a>
					</div>
				</li>
				<li>
					<div class="">
						<a href="/stucy/login.html" class="js-login" title="登录">登录</a>
					</div>
				</li>
			</ul>
		</div>
	</div>
	<div class="header min-width">
		<div class="container">
			<div class="fn-left logo"></div>
			<ul class="top-nav fn-clear">
				<li><a href="/stucy/yemian/list">首页</a></li>
				<li class="on"><a href="/stucy/yemian/list">寻找项目</a></li>
				<li><a href="/stucy/item">寻找投资</a></li>
				<li class="top-nav-safe"><a
					href="/stucy/openitem/person?userId=${loaginuserId }">我的账户</a></li>
			</ul>
		</div>
	</div>
	<!--列表-->

	<div class="page-filter wrap">
		<div style="height: 20px"></div>
		<div class="invest-filter">
			<div class="filter-inner clearfix" id="qtdconter">
				<div id="qtdconterleft">
					<div id="shengcheng">

    				</div>
    		
    		 <div id="savetel">
    		 	<h4>联系咨询</h4>
    		 	<textarea id="textarea" name="a" style="width:50%;height:200px;"></textarea>
						<br />
    		 	<div>
							<span>姓名：</span><input name="user"
								style="width: 300px;margin-left: 20px;" class="ipt" />
						</div>
    		 	<div>
							<span>手机：</span><input name="tel"
								style="width: 300px;margin-left: 20px;" class="ipt" /><br>
    		 		<span id="telts">手机号码格式不正确</span>
    		 	</div>
    		 	<div id="sanji" data-toggle="distpicker">
							<span>地区：
								<select id="sel1"></select>
								<select id="sel2"></select>
								<select id="sel3"></select>
							
						</div>
						<br />
				<div id="huifang">
	    		 	<span>回访：
	    		 	</span><input type="radio" name="hf" value="随时" checked /><span>随时</span>
	    		 	<input type="radio" name="hf" value="上班" /><span>上班</span>
	    		 	<input type="radio" name="hf" value="下班" /><span>下班</span>
	    		 	<br>
	    		 	<span id="wsxx">请完善信息！！</span>
    		 	</div>
    		 	<div id="liuyan">
    		 		<div
								style="background-color: #EA5924;height:40px;color:white;line-height: 40px;text-indent : 30px;">
								<p>您可以根据意向选择下列 【 快速留言 】</p>
							</div>
    			 	<ul>
    			 		<li><input type="button" value="项目很好，请尽快联系我详谈。" /></li>
    			 		<li><input type="button" value="请问我所在的地区可以合作吗？" /></li>
    			 		<li><input type="button" value="我想详细了解项目流程，请联系我！" /></li>
    			 		<li><input type="button" value="请问投资	所需要的费用有哪些？" /></li>
    			 		<li><input type="button" value="我想合作，请电话联系我。" /></li>
    			 	</ul>
    			 </div>
    			 <button id="qtdsubmit">点击提交</button>
    		 </div>
    		 
    		 <div style="height:200px;"></div>
    	</div>
    	<div id="qtdconterright">
    		<a href="http://www.aaa-cg.com.cn/">
    			<img alt="AAA友情赞助" src="/stucy/caoImage/aaa.png">
    		</a>
    	</div>
      	
    </div>
  </div>
 
</div>

     <script>
     	$(function (){
     		
     	})
     	$("#liuyan input").click(function (){
     		$("#textarea").html("");
     		$("#textarea").html($(this).val());
     		
     	});
     	
     	$("input[name='tel']").blur(function (){
     		ipublur()
     	})
     	function ipublur(){
     		var reg = /^1\d{10}$/;
     		if(reg.test($("input[name='tel']").val())){
     			$("#telts").hide();
     			return true;
     		}else{
     			$("#telts").show();
     			return false;
     		}
     	}
     	$("#qtdsubmit").click(function (){
     		var textarea=$("#textarea").html();
     		var user=$("input[name='user']").val();
     		var tel=$("input[name='tel']").val();
     		var sel1=$("#sel1 option:selected").val();
     		var sel2=$("#sel2 option:selected").val();
     		var sel3=$("#sel3 option:selected").val();
     		var sel=sel1+sel2+sel3;
     		var radio=$("input:radio:checked").val();
     		if(textarea==""){
     			textarea="无留言"
     		}
     		if(!sel3==""&&ipublur()&&!user==""){
     			$("#wsxx").hide();
     			var data={
					itemId:$("#qtitemId").val(),
     			    investorName:user,
     			    investorTel:tel,
     			    investorText:textarea,
     			    investorPosition:sel,
     			    investorVisit:radio	
     			}
     			$.ajax({
					type : "post",
					url : "/stucy/qtitemdetail/addinvestor.do",
					contentType : "application/json;charset=utf-8",
					data :  JSON.stringify(data),
					success : function(data1) {
						
					}
				});
     			alert("已通知项目发布人，请耐心等待对方与您联系！");
     		}else{
     			$("#wsxx").show();
     		};
     		
     	})
     	$.ajax({
					type : "post",
					url : "/stucy/qtitemdetail/queryqtitem.do",
					contentType : "application/json;charset=utf-8",
					data : $("#qtitemId").val() ,
					success : function(data1) {
						
						var str="";
							str += "<div id='qtdimg'>"+
							"<img src='/stucy/caoImage/060092_320_133_1.png' />"+
							"</div><div id='qtdintroduce'><h3>项目介绍</h3><div>申请时间：<span>"+data1.START_TIME+"</span></div>"+
							"<div>申请区域：<span>"+data1.ITEMAREA_NAME+"</span></div>"+
							"<div>经营类型：<span>"+data1.ITEMTYPE_NAME+"</span></div>"+
							"<div>投资额度：<span>"+data1.ITEM_MONEY+"元</span></div>"+
							"<div>适合人群：<span>不限</span></div>"+
							"<div><span>商家暂未开通免费电话</span></div></div>"+
							"<div style='width: 300px; border: 2px solid red; margin-top: 30px; margin-left: 20px;'></div>"+
							"<div><h2 style='margin-left: 20px; margin-bottom: 30px;'>详细介绍</h2>"+
							"<p class='qtdp'>"+data1.ITEM_CONTENT+"</p></div>"+
							"<div id='qtdts'><p id='qtdtsp'>温馨提示："+
							"本品牌投资金额、加盟店数量、招商地区和经营模式，请以最新咨询为准！我们建议您在下方【留言板留言】 或致电咨询，您即可与企业"+
							"免费通话并及时获得项目最新动态（企业要求各不一，建议了解多个项目做对比）。 以上内容由第一小组整理发布，更多内容请登陆"+
							"http://www.aaa.com/ 了解。</p></div>;"
						$("#shengcheng").append(str);
					}
				});
     </script>      
</body>
</html>