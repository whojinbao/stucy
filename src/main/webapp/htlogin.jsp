<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="/stucy/css/hhtlogin.css" rel="stylesheet" type="text/css" />
</head>
<body>
<!-- 代码begin -->
<div class="wrap">
	<div class="banner-show" id="js_ban_content">
		<div class="cell bns-01">
			<div class="con"></div>
		</div>
	</div>
	<div class="container">
		<div class="register-box">
			<div class="reg-slogan">
				用户登录</div>
			<div class="reg-form" id="js-form-mobile">
				<br/>
				<div class="cell">
					<label for="js-mobile_ipt"></label>
					<input type="text" name="mobile"  placeholder="请输入账号"  id="js-mobile_ipt" class="text" maxlength="11" />
				</div>
				<div class="cell">
					<label for="js-mobile_pwd_ipt"></label>
					<input type="password" name="passwd" id="js-mobile_pwd_ipt"  placeholder="请输入密码" class="text" />
					<input type="text" name="passwd" id="js-mobile_pwd_ipt_txt" class="text" maxlength="20" style="display:none;" /></div>
				<!-- !短信验证码 -->
				<div class="cell vcode">
					<input  id ="Txtidcode"  placeholder="验证码" type="text" name="code" class="text" />
					<span id="idcode" style="margin-left:-110px;"></span>
					<span style="font-size:12px;color:red;margin-top:15px;">
						区分大小写</span> </div>
				<div id="errorTxtidcode" >验证码输入有误请重新输入</div>
				<div class="bottom">
					<a id="js-mobile_btn"  class="button btn-green">
					立即登录</a></div> 
					

			</div>
			<div id="errornull">错误：<br />
			<span id="errorContent" style="margin-left: 40px;"></span></div>
			
		</div>
	</div>
</div>
<script src="/stucy/js/jquery-1.12.3.min.js"></script>
<!--//引用idcode插件-->
<script src="/stucy/js/jquery.idcode.js"></script>
<script>
    $.idcode.setCode();   //加载生成验证码方法
   
	$("#Txtidcode").keyup(function(){
		var verValue=$("#Txtidcode").val();
		if(verValue.length==4){
			var IsBy = $.idcode.validateCode()
			if(IsBy){
				$("#Txtidcode").css("border","1px solid green")
				$("#errorTxtidcode").hide();
			}else{
				$("#errorTxtidcode").show();
				
			}
		};
	})
	
	
	$("#js-mobile_btn").click(function (){
		var IsBy = $.idcode.validateCode()
		if(IsBy){
			$("#Txtidcode").css("border","1px solid green")
			$("#errorTxtidcode").hide();
			var user=$("#js-mobile_ipt").val();
			var password=$("#js-mobile_pwd_ipt").val();
			if(user!=""&&password!=""){
				var data ={
						conUser:user,
						conPassword:password
				};
				$.ajax({
					type : "post",
					dataType : "json",
					url : "/stucy/consumer/valiconsumer.do",//请求登录验证
					contentType : "application/json;charset=utf-8",
					data :  JSON.stringify(data),
					success : function(data1) {
						if(data1==3){
							window.location.href="htIndex.jsp";
						}else{
							$("#errorContent").html("账号和密码不匹配");
							$("#errornull").show();
						};
						
					}		
				});
			}else{
				$("#errorContent").html("账号或密码不能为空");
				$("#errornull").show();
			}
		}else{
			$("#errorTxtidcode").show();
			
		}
	});
</script>

</body>
</html>
