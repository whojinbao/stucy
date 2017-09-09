<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>寻找项目</title>
<link href="/stucy/p2p/css/common.css" rel="stylesheet" />
<link href="/stucy/p2p/css/index.css" rel="stylesheet" type="text/css">
<link href="/stucy/p2p/css/detail.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/stucy/p2p/script/jquery.min.js"></script>

<link rel="stylesheet"
	href="/stucy/helpframe/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	type="text/css"></link>
</head>
<style type="text/css">
.main {
	width: 100%;
	margin: auto;
	margin-top: 30px;
}

.form-group .text-left1 {
	text-align: left;
}

.description {
	height: 420px;
	width: 100%;
	overflow: hidden;
	background: #eaeaea;
}

.detion {
	padding-top: 25px;
	height: 420px;
	overflow: hidden;
	background: #eaeaea;
}
#memberTime{
	width:30px;
	height:20px;
}
.muselectxm{
	width:180px;
}
#input3{
	width:300px;
	height:26px;
}
#bert{
	display: inline-block;
	width:200px;
}
</style>
<body>
	<!-- 头部 -->
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
				<li><a href="">寻找投资</a></li>
				<li><a href="/stucy/financial/member.do">会员充值</a></li>
				<li><a href="/stucy/financial/Personal.do">个人中心</a></li>
				<li class="top-nav-safe"><a>我的账户</a></li>
			</ul>
		</div>
	</div>
<div class="container">
		<!-- <div class="col-sm-12 text-center">
			<h3>欢迎进行大学生创业平台充值</h3>
		</div> -->
		<div class="main">
			<div class="col-sm-3 col-sm-offset-1 text-left">
				<div class="description">
					<h3 class="text-center">充值说明</h3>
					<ul>
						<li>创业平台会员</li>
						<li>开通会员享有发布项目的权利</li>
						<li>会员20元/月</li>
						<li>每开通一个月有两次发布项目的次数</li>
						<li>每个会员时间到期和次数用完都不能在发项目</li>
					</ul>
					<h5><input type="checkbox" checked>我已阅读并同意</h5>
				</div>
			</div>
			<div class="form-horizontal col-sm-7 col-xs-1 detion">
				<div class="form-group">
					<label class="col-sm-2 control-label" >开通账号</label>
					<div class="col-sm-10">
						<input type="email" id="input3" class="form-control" 
							placeholder="请输入您的账号"><span id="uid"></span>
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">套餐模式</label>
					<div class="col-sm-10">
						<label class="radio-inline"> <input type="radio"
							name="inlineRadioOptions" id="inlineRadio1" value="1" checked>
							按月
						</label> <label class="radio-inline"> <input type="radio"
							name="inlineRadioOptions" id="inlineRadio2" value="12">
							按年
						</label>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">开通服务</label>
					<div class="col-sm-10">
						<select class="form-control muselectxm">
							<option value="a">项目发布</option>
							<option value="s">项目ASD</option>
						</select>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">开通时长</label>
					<div class="col-sm-3" style="width:70px;">
						<input type="email" class="form-control" value="1" id="memberTime"
							placeholder="请输入"><span id="bert"></span>
						
					</div>
					<span id="month" class="col-sm-7 control-label text-left1">月</span>
					<span id="year" class="col-sm-7 control-label text-left1">年</span>
					
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">应付金额</label>
					<div class="col-sm-10">
						<span id="num">20</span>元
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">可用次数</label>
					<div class="col-sm-10">
						<span id="coun">2</span>次
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<input type="submit" class="btn btn-info" value="充值" onclick="memenr()"/>
					</div>
				</div>
			</div>

		</div>
	</div>
	</div>
	<script type="text/javascript"
		src="http://localhost:9088/stucy/js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript">
		/* 类型选折和价格 */
		function sum() {
			var num = $("#memberTime").val()* $("input[type='radio']:checked").val() * 20;
			$("#num").html(num);
			var count = $("#memberTime").val()* $("input[type='radio']:checked").val() * 2;
			$("#coun").html(count);
		}
		//松开键盘事件判断隐藏提示语
		$("#input3").keyup(function(){
			if($("#input3").val()==""){}else{
				$("#uid").hide();
			}
		})
		
		$("#memberTime").keyup(function() {
			//隐藏开通时长提示语
			if(!$("#memberTime").val()>0){}else{
				$("#bert").hide();
			}
			//校验开通时长输入框
			var inp = $("#memberTime").val();
			var re = /^[1-9]\d*$/;
			if (!re.test(inp)) {
				$("#memberTime").val("");
			}
			sum();
		})

		/* 选择不同类型 */
		$("#year").hide(); // 先隐藏第二组文本框
		$(":radio").click(function() {
			var num = $(this).val(); // 当前按钮的value值对应需要显示文本框的位置
			if (num == 1) {
				$("#month").show();
				$("#year").hide();
			} else {
				$("#year").show();
				$("#month").hide();
			}
			sum();
		});
		/*插入会员充值信息  */
		function memenr() {
			alert($("#input3").val())
			var tr = {
				userId : $("#input3").val(),
				memberType : $("input[type='radio']:checked").val(),
				memberContent : $("select option:checked").val(),
				memberTime : $("#memberTime").val(),
				memberMonsy : $("#num").html(),
				count : $("#coun").html()
			}
			if($("#input3").val()==""){
				$("#uid").show();
					$("#uid").append("<span style='color:red'>请输入账号</span>");				
			}else{				
				if(!$("#memberTime").val()>0){
					
					$("#bert").show();
					if($("#bert").html()==""){
						$("#bert").append("<span style='color:red'>请输入开通时间</span>")
					}
					
				}else{
					
			$.ajax({
				type : "post",
				url : "/stucy/member/addmember.do",
				contentType : "application/json;charset=utf-8",
				data : JSON.stringify(tr),
				success : function(data1) {
					alert(data1)
				}
			});
				}
			}
		}		
	</script>

</body>
</html>