<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>个人中心</title>

<link href="/stucy/p2p/css/common.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="/stucy/p2p/css/user.css" />
<script type="text/javascript" src="/stucy/p2p/script/jquery.min.js"></script>
<script src="/stucy/p2p/script/user.js" type="text/javascript"></script>
</head>
<body>
<header>
  <div class="header-top min-width">
    <div class="container fn-clear"> 
      <ul class="fn-right header-top-ul">
        <li> <a href="/stucy/login.html" class="app">返回首页</a> </li>
        <li>
          <div class=""><a href="/stucy/register.html" class="c-orange" title="免费注册">免费注册</a></div>
        </li>
        <li>
          <div class=""><a href="/stucy/login.html" class="js-login" title="登录">登录</a></div>
        </li>
      </ul>
    </div>
  </div>
  <div class="header min-width">
    <div class="container">
      <div class="fn-left logo"> <a class="" href=""> <img src="/stucy/p2p/images/logo.png"  title="logo"/> </a> </div>
      <ul class="top-nav fn-clear">
        <li > <a href="/stucy/yemian/list">首页</a> </li>    
        <li ><a href="/stucy/yemian/list">寻找项目</a></li>
        <li><a href="/stucy/item">寻找投资</a></li>
        <li class="on top-nav-safe"> <a href="/stucy/openitem/person">我的账户</a> </li>         
      </ul>
    </div>
  </div>
</header>
<!--个人中心-->

<div class="wrapper wbgcolor">
  <div class="w1200 personal">
    <div class="credit-ad" style="width:1200px"><img src="/stucy/p2p/images/clist1.jpg" width="1200" height="96"/></div>
    <div class="personal-main"style="width:1200px">     
      <div class="pmain-profile" style="width:1200px">
        <div class="pmain-welcome"> <span class="fl"><span id="outLogin">晚上好，</span>${person.zName }   喝一杯下午茶，让心情放松一下~</span> </div>
        <div class="pmain-user">
             <div class="user-head">               
             
             </div> 
             <div class="user-info" style="margin-top:-20px">       
               <ul  >
               <li>用户名<span>${person.zName }</span></li>
               <li>电话<span>${person.telephone }</span></li>
               <li>证件类型<span>大陆身份证</span></li>
               <li>证件号码<span>${person.idCardnum}</span></li>
          
              </ul>
            </div> 
        </div>        
      </div>
      <script type="text/javascript">		
			       $(function(){			    	  			    	   
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
		</script>
      <div class="pmain-connent" style="width:100%">
        <div id="pmain-contab" class="pmain-contab" style="width:100%">
          <ul>
              <li id="pmain-contab1" class="on" style="width:25%">项目记录</li>    
              <li id="pmain-contab2" style="width:25%">创建项目</li>
              <li id="pmain-contab3" style="width:25%">个人设置</li>                               
          </ul>
        </div>
   
        <div class="pmain-conmain" id="pmain-conmain" style="width:100%">
          <div class="pmain-conmain1"style="height:300px">
                 <table>
                     <thead>
                           <tr>
                           <th width="300px">项目名称</th>
                           <th width="100px">项目类型</th>
                           <th width="100px">项目地区</th>
                           <th width="300px" >项目简介</th>
                           <th width="100px">项目资金</th>
                           <th width="100px">项目进度</th>
                           </tr>
                     </thead>
                     <tbody>
                        <c:forEach items="${openitems }" var="openitem">
                          <tr>
                           <td width="300px">${openitem.itemName }</td>
                           <td width="100px">${openitem.itemtypeId }</td>
                           <td width="100px">${openitem.itemareaId }</td>
                           <td width="300px" >${openitem.itemIntro }</td>
                           <td width="100px">${openitem.itemMoney }</td>
                           <td width="100px">${openitem.itemStatus }</td>
                          </tr>
                        </c:forEach>
                     </tbody>
                 </table>      
          </div>
         <div class="pmain-conmain2" style="display:none;width:200px;height:300px" >
              <div class="pmain-contitle"> <a href="/stucy/yemian/addIteminfo.do"><span class="pmain-titledate">创建项目</span></a></div>
         
         </div>
         <div class="pmain-conmain3" style="display:none;width:200px;height:300px" >
             <div class="pmain-contitle">
                   <span class="pmain-titledate">个人信息</span><br/>
                   <table>
                       <tbody>
                           <tr>
                               <td>姓名</td><td>${person.zName }</td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                               <td>性别</td><td>${person.sex }</td>
                           </tr>
                           <tr>
                               <td>家庭住址</td><td>${person.address }</td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                               <td>学校</td><td>${person.schName }</td>  
                           </tr>                           
                       </tbody>
                   </table>
             </div>
         </div>
       </div>       
    </div>
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
        <dd><span class="icon-ft-erweima"><img src="images/code.png" style="display: inline;"></span></dd>
      </dl>
    </div>
  </div>
  <div class="ft-record">
    <div class="ft-approve clearfix"><a class="icon-approve approve-0 fadeIn-2s" target="_blank" href="#"></a><a class="icon-approve approve-1 fadeIn-2s" target="_blank" href="#"></a><a class="icon-approve approve-2 fadeIn-2s" target="_blank" href="#"></a><a class="icon-approve approve-3 fadeIn-2s" target="_blank" href="#"></a></div>
    <div class="ft-identity">©2015 亿人宝 All rights reserved&nbsp;&nbsp;&nbsp;<span class="color-e6">|</span>&nbsp;&nbsp;&nbsp;安徽省亿人宝投资管理有限公司&nbsp;&nbsp;&nbsp;<span class="color-e6">|</span>&nbsp;&nbsp;&nbsp;<a target="_blank" href="http://www.miitbeian.gov.cn/">皖ICP备12345678号-1</a></div>
  </div>
</div>
</div>
</body>
</html>
