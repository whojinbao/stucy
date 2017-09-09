<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/p2p/css/common.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/p2p/css/user.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/p2p/script/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/p2p/script/common.js"></script>
<script src="script/user.js" type="${pageContext.request.contextPath}/p2p/text/javascript"></script>
<link href="${pageContext.request.contextPath}/helpframe/bootstrap-3.3.7-dist/css/bootstrap.min.css" />
<link href="${pageContext.request.contextPath}/helpframe/bootstrap-3.3.7-dist/css/bootstrap-theme.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/helpframe/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<style type="text/css">
	.lobitemId{
		display:none;
	}
</style>
</head>
<body>
	<header>
  <div class="header-top min-width">
    <div class="container fn-clear">     
      <ul class="fn-right header-top-ul">
        <li> <a href="login.html" class="app">返回首页</a> </li>
        <li>
          <div class=""><a href="register.html" class="c-orange" title="免费注册">免费注册</a></div>
        </li>
        <li>
          <div class=""><a href="login.html" class="js-login" title="登录">登录</a></div>
        </li>
      </ul>
    </div>
  </div>
  <div class="header min-width">
    <div class="container">
      <div class="fn-left logo"> <a class="" href="item.do"> <img src="${pageContext.request.contextPath}/images/zxcf_logo.png" style="height:70px;width:344px;"  title=""> </a> </div>
      <ul class="top-nav fn-clear">
	         <li > <a href="/stucy/item.do">首页</a> </li>    
             <li ><a href="list.jsp">寻找项目</a></li>
             <li class="on"><a href="/stucy/item.do">寻找投资</a></li>
             <li class="top-nav-safe"> <a href="/stucy/queryInvestorinfo.do">我的账户</a> </li>             	       
    </div>
  </div>
</header>
<!--个人中心-->
<div class="wrapper wbgcolor">
  <div class="w1200 personal">
    <div class="credit-ad"><img src="${pageContext.request.contextPath}/p2p/images/clist1.jpg" width="1200" height="96"></div>
    
    <div class="personal-main">
      <link rel="stylesheet" type="text/css" href="css/fileupload.less.css">
      <style type="text/css">
		.ui-fileupload-choose{
			background:none;
			width: 90px; height: 90px;
			border:0px none;
		}
		.ui-fileupload-choose input{
			width:100%;height:100%;
		}
		.ui-icon{
			background:none;
			width:0px;height:0px;
		} 
		#userinfo1{
			border:1px solid while;
			width:600px;
			height:350px;
		}
	</style>
      <div class="pmain-profile">
        <div class="pmain-welcome"> <span class="fl"><span id="outLogin">晚上好，</span>${ph.userId} 喝一杯下午茶，让心情放松一下~</span> <span class="fr">上次登录时间：
          2015-09-11 14:05:07 </span> </div>
        <div class="pmain-user">
          <div class="user-head"> <span id="clickHeadImage" class="head-img" title="点击更换头像">
            <form  method="post" action="">
              <input type="hidden" name="userPhotoUploadForm" value="userPhotoUploadForm">
              <span id="userPhotoUploadForm:photo"><img id="userPhotoUploadForm:photoImage" src="${pageContext.request.contextPath}/p2p/images/touxiang.png" alt="" style="width:88px;height:88px;z-index:0;"> <i class="headframe" style="z-index:0;"></i>-
              <div id="userPhotoUploadForm:shangchuan-btn" class="ui-fileupload ui-widget" style="z-index:0;">
                <div class="ui-fileupload-buttonbar ui-corner-top"><span class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-fileupload-choose" role="button"><span class="ui-button-icon-left ui-icon ui-c ui-icon-plusthick"></span><span class="ui-button-text ui-c"></span>
                  <input type="file" id="userPhotoUploadForm:shangchuan-btn_input" name="userPhotoUploadForm:shangchuan-btn_input" style="z-index:0;">
                  </span></div>
                <div class="ui-fileupload-content ui-widget-content ui-corner-bottom">
                  <table class="ui-fileupload-files">
                    <tbody>
                    </tbody>
                  </table>
                </div>
              </div>
              </span>
              <input type="hidden" name="javax.faces.ViewState" id="javax.faces.ViewState" value="2696547217205030168:-301641994240890871" autocomplete="off">
            </form>
            <span class="head-icon"><img src="/stucy/caoImage/${lfo.investorphoto}" width="100px" height="100px"></span> 
            </span> </div>
          <div class="user-info user-info1" id="userinfo1">
            <ul>
				  	 <li><span>账&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号:${lfo.investorId}</span></li>
			  		 <li><span>真实姓名:${lfo.investorname} </span><br/><br/>
			  		 <li><span>性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别:${lfo.investorsex}</span></li>
			  		 <li><span>电&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;话:${lfo.investortel}</span></li>
			  		 <li><span>地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址:${lfo.investoraddress}</span></li>
			  		 <li><span>身份证号:${lfo.nocardnum} </span></li>
			  		 <li><span>工&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号:${lfo.companynum}</span></li>
			  		 <li><span>公司名称:${lfo.companyname}</span></li>
			  		 <li><span>公司地址:${lfo.companyaddress}</span></li>
			  		 <li><span>个人信用:${lfo.credit}</span></li>
            </ul>
          </div>
		 <span>公司网截图:<img src="/stucy/caoImage/${lfo.companyurl}" width="100px" height="100px"></span><br/>
		 <span>&nbsp;&nbsp;&nbsp;工作证:<img src="/stucy/caoImage/${lfo.companyphoto}" width="100px" height="100px"></span>
        </div>
      </div>
      <script type="text/javascript">
			//<![CDATA[
			       $(function(){
			    	   $("#clickHeadImage").click(function(){
			    		   $(this).find('span').removeClass('ui-state-hover');
			    		   document.getElementById("userPhotoUploadForm:shangchuan-btn_input").click();
			    	   });
			    	   var safeLevel = "低";
			    	   if(safeLevel=="高"){
			    		   $(".pmain-user .user-info li .safe-level .onlevel").css("background-color","#f1483c");
			    	   }
			    	   $("#clickHeadImage span").hover(function(){
			    		   $(this).removeClass('ui-state-hover');
			    	   }); 
			    	   var myDate = new Date();
			    	   var h = myDate.getHours();
			    	   if(h>11 && h<19){
			    	   	 $("#outLogin").html("下午好，");
			    	   }else if(h>18){
			    	   	 $("#outLogin").html("晚上好，");
			    	   }else{
			    	   	 $("#outLogin").html("上午好，");
			    	   }
			       });
			//]]>           
		</script>
      <div class="pmain-connent">
        <div class="pmain-conmain" id="pmain-conmain">
          <div class="pmain-conmain1">
            <div>
            <table class="table table-bordered" width="1200">
				<tr>
					<td><span>我投资的项目</span></td>
					<td><span>项目简介</span></td>
					<td><span>项目所需资金</span></td>
					<td><span>投资的总金额</span> </td>
				</tr>
				 <c:forEach items="${loib}" var="lob">
					 <tr>
						<td class="loib"><span class="lobitemId">${lob.itemId}</span><span>${lob.itemName}</span></td>
						<td>
							<span>
								<textarea cols="20" rows="3" disabled="disabled">
										${lob.itemIntro}
	            				</textarea>
	            			</span>
	            		</td>
						<td><span>${lob.itemMoney}</span></td>
						<td><span>${lob.reninerstAllMoney}</span></td>
					</tr>
				  </c:forEach>
			</table>
           </div>
          <div class="pmain-conmain2" style=" display:none;">
           
            <div class="pmain-morebtn" style="border-top:0;margin-top:0">
            	
            </div>
          </div>
          <div class="pmain-conmain3" style=" display:none;">
            <div class="pmain-contitle"> <span class="pmain-titledate">交易时间</span><span class="pmain-w210">项目</span><span class="pmain-w80">状态</span><span class="pmain-whb200">我的投资</span><span class="pmain-whb110">我的收益</span> </div>
            <ul style="float:left;">
              <li><span class="pmain-titledate">2015-10-20</span><span class="pmain-w210">债权转让</span><span class="pmain-w80 pmain-money">10.00</span><span class="pmain-whb200 pmain-money">10.00</span><span class="pmain-whb110">备注</span></li>
              <!--	<div style=" width:760px;height:200px;padding-top:100px; text-align:center;color:#d4d4d4; font-size:16px;">
										    <img src="${pageContext.request.contextPath}/p2p/images/nondata.png" width="60" height="60"><br><br>
										   暂无投资记录</div>-->
            </ul>
            <div class="pmain-morebtn" style="border-top:0;margin-top:0"></div>
          </div>
        </div>
      </div>
    </div>
    <div class="clear"></div>
  </div>
</div>
<!--网站底部-->
<div id="footer" class="ft">
  <div class="ft-inner clearfix">
    <div class="ft-helper clearfix">
      <dl>
        <dt>关于我们</dt>
        <dd><a href="公司简介.html">公司简介</a><a href="管理团队.html">管理团队</a><a href="网站公告.html">网站公告</a></dd>
      </dl>
      <dl>
        <dt>相关业务</dt>
        <dd><a href="list.html">我要投资</a><a href="我要借款.html">我要借款</a></dd>
      </dl>
      <dl>
        <dt>帮助中心</dt>
        <dd><a href="帮助中心.html">新手入门</a><a href="个人中心首页.html">我的账户</a><a href="list.html">债权转让</a></dd>
      </dl>
      <dl>
        <dt>联系我们</dt>
        <dd><a href="联系我们.html">联系我们</a></dd>
      </dl>
    </div>
    <div class="ft-service">
      <dl>
        <dd>
          <p><strong>400-660-1268</strong><br>
            工作日 9:00-22:00<br>
            官方交流群:<em>12345678</em><br>
            工作日 9:00-22:00 / 周六 9:00-18:00<br>
          </p>
          <div class="ft-serv-handle clearfix"><a class="icon-hdSprite icon-ft-sina a-move a-moveHover" title="亿人宝新浪微博" target="_blank" href="#"></a><a class="icon-hdSprite icon-ft-qqweibo a-move a-moveHover" title="亿人宝腾讯微博" target="_blank" href="#"></a><a class="icon-ft-qun a-move a-moveHover" title="亿人宝QQ群" target="_blank" href="#"></a><a class="icon-hdSprite icon-ft-email a-move a-moveHover mrn" title="阳光易贷email" target="_blank" href="mailto:xz@yirenbao.com"></a></div>
        </dd>
      </dl>
    </div>
    <div class="ft-wap clearfix">
      <dl>
        <dt>官方二维码</dt>
        <dd><span class="icon-ft-erweima"><img src="${pageContext.request.contextPath}/p2p/images/code.png" style="display: inline;"></span></dd>
      </dl>
    </div>
  </div>
  <div class="ft-record">
    <div class="ft-approve clearfix"><a class="icon-approve approve-0 fadeIn-2s" target="_blank" href="#"></a><a class="icon-approve approve-1 fadeIn-2s" target="_blank" href="#"></a><a class="icon-approve approve-2 fadeIn-2s" target="_blank" href="#"></a><a class="icon-approve approve-3 fadeIn-2s" target="_blank" href="#"></a></div>
    <div class="ft-identity">©2015 中兴财富 All rights reserved&nbsp;&nbsp;&nbsp;<span class="color-e6">|</span>&nbsp;&nbsp;&nbsp;安徽省中兴财富投资管理有限公司&nbsp;&nbsp;&nbsp;<span class="color-e6">|</span>&nbsp;&nbsp;&nbsp;<a target="_blank" href="http://www.miitbeian.gov.cn/">皖ICP备12345678号-1</a></div>
  </div>
</div>
<script>
	$(function(){
		
	})
</script>
</body>
</html>