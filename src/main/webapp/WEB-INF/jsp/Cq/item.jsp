<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@page isELIgnored="false" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link  href="/stucy/p2p/css/common.css" rel="stylesheet" />
<link href="/stucy/p2p/css/index.css" rel="stylesheet" type="text/css">
<link href="/stucy/p2p/css/detail.css" rel="stylesheet" type="text/css">
<script type="/stucy/text/javascript" src="/p2p/script/jquery.min.js"></script>
<script src="/stucy/helpframe/bootstrap-3.3.7-dist/js/jquery-3.1.1.min.js"></script>
<style type="text/css">
	.t1{
		background:#B4CDE6;
	}
	.investitem{
		display:none;
	}
	.Touitem{
		display:none;
	}
	.LhitemId{	
		display:none;
	}
	.itemtypeId{
		display:none;
	}
	.itemareaid{
		display:none;
	}
	#ph1{
		display:none;
	}
	.TouJin{
		display:none;
	}
	.kai{
		display:none;
	}
	.guan{
		display:none;
	} 
	#gezheng{
		width:270px;
		height:60px;
		font-size:30px;
	}
	#gexiang{
		width:270px;
		height:60px;
		font-size:30px;
	}
	
</style>
</head>
<body>
<header>
  <div class="header min-width">
    <div class="container">
      <div class="fn-left logo"> <a class="" href="homepage.html"> <img src="images/zxcf_logo.png" style="height:70px;width:344px;" title=""> </a> </div>
      <ul class="top-nav fn-clear">
        <li > <a href="homepage.html">首页</a> </li>    
        <li ><a href="/stucy/yemian/list.do">寻找项目</a></li>
        <li class="on"><a href="#">寻找投资</a></li>
        <li><a href="/stucy/financial/member.do">会员充值</a></li>
		<li><a href="/stucy/financial/Personal.do">个人中心</a></li>
        <li class="top-nav-safe"> <a href="/stucy/queryInvestorinfo.do">我的账户</a> 
        	 <span id="userId" style="display:">${userId }</span> <br/>
            <span id="userRole" style="display:">${userRole }</span> <br/>
            <span id="xuan"></span>
        </li>                  
      </ul>
    </div>
  </div>
</header>
<!--列表-->
<div class="page-filter wrap">
  <div class="breadcrumbs"><a href="index.html">首页</a>&gt;<span class="cur">已投资列表</span></div>
  <div class="invest-filter" data-target="sideMenu">
    <div>
      <div class="filter-item">
        <div>
          <dl>
            <dt>项目类型</dt>
          
              <ul>
	              <c:forEach items="${lItemtype}" var="typeitem">
	                <li class="n1"><span class="itemtypeId">${typeitem.itemtypeId}</span><a class="itemtypeName">${typeitem.itemtypeName}</a></li>
	              </c:forEach>
              </ul>
          
          </dl>
         
          <dl>
            <dt>项目区域</dt>
            
              <ul>
                <c:forEach items="${lItemarea}" var="areaitem">
	                <li class="n1"><span class="itemareaid">${areaitem.itemareaid}</span><a class="itemareaname">${areaitem.itemareaname}</a></li>
	              </c:forEach>
              </ul>
            
          </dl>
    </div>
  </div>
  <div class="invest-list mrt30 clearfix">
  <div class="hd">
	      <div class="count">
		       <a href="/stucy/item.do">
		       		<button id="gexiang" style="background-color:#FFA800">
		  				显示全部项目
					</button>
			   </a>
	      </div>
    </div>
    <div class="hd">
      <div class="count">
         <a href="/stucy/ja.do">
       	 	<button id="gezheng" style="background-color:#FFA800">
  				个人信息认证
			</button>
		 </a>
      </div>
    </div>
    <div class="hd">
      <div class="count">
       <img src="/stucy/caoImage/5.jpg.jpg" width="1200"/>
      </div>
    </div>
    <div class="bd">
      <div class="invest-table clearfix">
        <div class="title clearfix">
          <ul>
            <li class="col-120">项目名称</li>
            <li class="col-300">项目简介</li>
            <li class="col-110">项目资金</li>
            <li class="col-190">投资总资金</li>
            <li class="col-200">操作</li>
           
          </ul>
        </div>
        <!------------投资列表-------------->
	       <c:forEach items="${lb}" var="lh">
		        <div class="item">
			          <ul>
				            <li class="col-120"><span class="LhitemId">${lh.itemId}</span>${lh.itemName}</li>
				            <li class="col-300">
					            <textarea id="itemIntro"  class="form-control " cols="30" rows="5" disabled="disabled">
					            	${lh.itemIntro}
	           				    </textarea>
				            </li>
				            <li class="col-110"><span class="itemMoney1" >${lh.itemMoney}</span></li>
				            <li class="col-190"><span class="inerstMoney1" >${lh.inerstAllMoney}</span></li>
				            <span class="itemtypeId" >${lh.itemtypeId}</span>
				            <span class="itemareaid" >${lh.itemareaid}</span>
				           <li class="col-200 pw">
				           	 <button class="t1"style="background-color:#EFB64F">我要投资</button>
				           	   <input class="TouJin"/>
				       		   <button class="kai"style="background-color:#EFB64F">确认投资</button>
				       		   <button class="guan"style="background-color:#EFB64F">取消</button>
				           </li>
			          </ul>
		        </div>
	        </c:forEach>
       </div>
      <div class="pagination clearfix mrt30"> <span class="page">
            <a href="javascript:void(0);" onclick="">上一页</a>&nbsp;
      		<a class="curr" href="javascript:;">1</a>
            <a href="javascript:void(0);" onclick=" ">下一页</a>
         <em>共2297页&nbsp;</em></span>
        <dl class="page-select">
          <dt><span>1</span><i class="icon icon-down"></i></dt>
          <dd style="display: none;">
            <ul name="nump" id="jsnump">
              <li><a href="##">1</a></li>
              <li><a href="##">2</a></li>
              <li><a href="##">3</a></li>
            </ul>
          </dd>
        </dl>
      </div>
  <div class="ft-record">
    <div class="ft-approve clearfix"><a class="icon-approve approve-0 fadeIn-2s" target="_blank" href="#"></a><a class="icon-approve approve-1 fadeIn-2s" target="_blank" href="#"></a><a class="icon-approve approve-2 fadeIn-2s" target="_blank" href="#"></a><a class="icon-approve approve-3 fadeIn-2s" target="_blank" href="#"></a></div>
    <div class="ft-identity">©2015 亿人宝 All rights reserved&nbsp;&nbsp;&nbsp;<span class="color-e6">|</span>&nbsp;&nbsp;&nbsp;安徽省亿人宝投资管理有限公司&nbsp;&nbsp;&nbsp;<span class="color-e6">|</span>&nbsp;&nbsp;&nbsp;<a target="_blank" href="http://www.miitbeian.gov.cn/">皖ICP备12345678号-1</a></div>
  </div>
</div>
<script >
	$(function(){
		$(".t1").each(function(){
			var itemMoney=$(this).parent().parent().find(".itemMoney1").html();
			var inerstMoney=$(this).parent().parent().find(".inerstMoney1").html();
			if(itemMoney== inerstMoney){
				$(this).attr('disabled',"true");
			}
		})
		$(".t1").click(function(){
			$(this).css("display","none");
			$(this).parent().find(".TouJin").css("display","block");
			$(this).parent().find(".kai").css("display","block");
			$(this).parent().find(".guan").css("display","block");
		})
		$(".kai").click(function(){
			var itemId=$(this).parent().parent().find(".LhitemId").html();
			var userId=$("#ph1").html();
			var inerstMoney=$(this).parent().find(".TouJin").val();
			var data={};
			data["itemId"]= itemId;
			data["userId"]= userId;
			data["inerstMoney"]=inerstMoney;
			 $.ajax({
				type: "post",
				url: "/stucy/addInvestitem.do",
				contentType :"application/json;charset=UTF-8",			
				data:JSON.stringify(data),
				success: function(data1){
					if(data1=="addInvestitem"){window.location.href="/stucy/item.do";}
					else{
						alert("投入的金额超出项目所需金额");
					}
			}})
		})	
		$(".guan").click(function(){
			$(this).parent().find(".TouJin").css("display","none");
			$(this).parent().find(".kai").css("display","none");
			$(this).css("display","none");
			$(this).parent().find(".TouJin").val("");
			$(this).parent().find(".t1").css("display","block");
		})	
		$(".itemtypeName").click(function(){
			var itemtypeId=$(this).parent().find(".itemtypeId").html();
			$(".item").each(function(){
				var itemtypeId1=$(this).find(".itemtypeId").html();
				if(itemtypeId!=itemtypeId1){
					$(this).css("display","none");
				}else{
					$(this).css("display","block");
				}
			})
		})
		$(".itemareaname").click(function(){
			var itemareaId=$(this).parent().find(".itemareaid").html();
			$(".item").each(function(){
				var itemareaId1=$(this).find(".itemareaid").html();
				
				if(itemareaId!=itemareaId1){
					$(this).css("display","none");
				}else{
					$(this).css("display","block");
				}
			})
		})
	})
</script>
</body>
</html>
</html>