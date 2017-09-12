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
<link href="/stucy/helpframe/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/stucy/p2p/script/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="/stucy/css/paging.css">
<style type="text/css">
	a{
		color:black;
		text-decoration:none;
	}
	a:visited{text-decoration: none;}
	a:hover {text-decoration: none;} 
	a:active{text-decoration:none;}
	.active{
		text-decoration:none;
	}
	.filter-item{
		width:98%;
		border:none;
		color:
	}
	.itemdiv{
		width:23.9%;
		height:230px;
		margin-right:5px;
		margin-left:5px;
		margin-bottom:5px;
		margin-top:5px;
		display: inline-block;
		position: relative;
		background-color: #FFFFFF;
	}
	.itemImg{
		width:90%;
		height:140px;
		position:absolute;
		left:5%;
		top:5%;
	}
	.itema{
		position:absolute;
		left:5%;
		top:73%;
	}
	.itemdivson{
		width:90%;
		position:absolute;
		left:2%;
		top:85%;
	}
	.itemdivson div{
		width:43%;
		height:26px;
		display: inline-block;
		text-align:center;
		margin-left: 15px;
		line-height:26px; 
		font-size: 12px;
		border-radius:5px 5px 5px 5px;
	}
	.itemImg img{
		width:100%;
		height:100%;
	}
	.itemdivsondiv1{
		border:1px solid #DBDBDB;
		background-color: #F4F4F4;
	}
	.itemdivsondiv2{
		color:white;
		background-color: #D62E17;
	}
	.itemdivsondiv2 a{
		display:inline-block;
		width:100%;
		height:100%;
		color:white;
	}
	#itembox{
		background-color: #F7F7F7;
		width:100%;
		position: relative;
		overflow:hidden;
	}
	#pageTool{
		margin-top: 20px;
	}
</style>
</head>
<body>
<!-- 头部 -->
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
      <div class="fn-left logo">  </div>
      <ul class="top-nav fn-clear">
        <li > <a href="/stucy/yemian/list">首页</a> </li>    
        <li class="on"><a href="/stucy/yemian/list">寻找项目</a></li>
        <li><a href="/stucy/item">寻找投资</a></li>
        <li class="top-nav-safe"> <a href="/stucy/openitem/person?userId=${loaginuserId }">我的账户</a> </li>      
      </ul>
    </div>
  </div>
<!--列表-->
  
<div class="page-filter wrap">
  <div style="height:30px"></div>
  <div class="invest-filter" data-target="sideMenu">
    <div class="filter-inner clearfix">
      <div class="filter-item">
        <div class="hd">
          <h3>筛选投资项目</h3>
        </div>
       
          <dl>
            <dt>项目类型</dt>
            <dd>
              <ul id="itemtypeNameId">
                    <li class="n1"><a href="javascript:void(0);" value="-1" class="itemtypeName active">不限</a></li> 
              </ul>
            </dd>
          </dl>
          <dl class="repayment">
            <dt>所在地区</dt>
            <dd>
              <ul id="itemareanameId">
                <li class="n1"><a href="javascript:void(0);" value="-1" class="itemareaname active">不限</a></li>                
              </ul>
            </dd>
          </dl>
      </div>
     
    </div>
  </div>
  <!--  -->
  <div class="invest-list mrt30 clearfix" id="itembox">
		
   </div>
   <div id="pageTool"></div>
   <div style="width:100%;height:200px;"></div>
</div>
<script type="text/javascript" src="/stucy/js/who/query.js"></script>
<script type="text/javascript" src="/stucy/js/who/paging.js"></script>

     <script>
     		$("body").on("click",".itemareaname",function (){
     			for(var i=0;i<$(".itemareaname").length;i++){
     				$(".itemareaname").eq(i).removeClass("active") 
     			}
     			$(this).addClass("active")
     			condition()
     		});
     		$("body").on("click",".itemtypeName",function (){
     			for(var i=0;i<$(".itemtypeName").length;i++){
     				$(".itemtypeName").eq(i).removeClass("active") 
     			}
     			$(this).addClass("active")
     			condition()
     		});
     		var itemtypeName=-1;
 			var itemareaname=-1;
     		function condition(){
     			
     			for(var i=0;i<$(".itemtypeName").length;i++){
     				if($(".itemtypeName").eq(i).is(".active")){
     					itemtypeName=$(".itemtypeName").eq(i).attr("value");
     				} 
     			}
     			for(var i=0;i<$(".itemareaname").length;i++){
     				if($(".itemareaname").eq(i).is(".active")){
     					itemareaname=$(".itemareaname").eq(i).attr("value");
     				} 
     			}
     			getTotal(1,12);
     			params(1,12);
     		}
     			$.ajax({
					type : "post",
					dataType : "json",
					url : "/stucy/itemtype/getitemtype.do",
					contentType : "application/json;charset=utf-8",
					success : function(data1) {
						var str="";
						for (var i = 0; i < data1.length; i++) {
							str += "<li class='n1'><a href='javascript:void(0);' value='"+data1[i].itemtypeId+"' class='itemtypeName '>"+data1[i].itemtypeName+"</a></li>";
						}
						$("#itemtypeNameId").append(str);
					}		
				});
     			$.ajax({
					type : "post",
					dataType : "json",
					url : "/stucy/itemarea/getitemarea.do",
					contentType : "application/json;charset=utf-8",
					success : function(data1) {
						var str="";
						for (var i = 0; i < data1.length; i++) {
							str += "<li class='n1'><a href='javascript:void(0);' value='"+data1[i].itemareaid+"' class='itemareaname '>"+data1[i].itemareaname+"</a></li>";
						}
						$("#itemareanameId").append(str);
					}		
				}); 
     			function params(page,rows){
     				var data={};
     				data["itemtypeId"]=itemtypeName;
     				data["itemareaId"]=itemareaname;
     				data["page"]=page;
     				data["rows"]=rows;
     				$.ajax({
    					type : "post",
    					dataType : "json",
    					url : "/stucy/readitem/getreaditem.do",
    					contentType : "application/json;charset=utf-8",
    					data :  JSON.stringify(data),
    					success : function(data1) {
    						var dev=$("#itembox").find(".itemdiv");
    						for(var i=0;i<dev.length;i++){
    							dev.eq(i).remove();
    						}
    						var str="";
    						for (var i = 0; i < data1.length; i++) {
    							str += "<div class='itemdiv'><div class='itemImg'><img src='/stucy/caoImage/060092_320_133_1.png'/>"+
    									"</div><a href='/stucy/qtitemdetail/goqtitemdetail.do?itemId="+data1[i].ITEM_ID+"&&flag=0' class='itema'>"+data1[i].ITEM_NAME+"</a><div class='itemdivson'>"+		
    									"<div class='itemdivsondiv1'><a href='/stucy/qtitemdetail/goqtitemdetail.do?itemId="+data1[i].ITEM_ID+"&&flag=0'><span class='glyphicon glyphicon-list'></span>&nbsp;项目介绍</a></div>"+		
    									"<div class='itemdivsondiv2'><a href='/stucy/qtitemdetail/goqtitemdetail.do?itemId="+data1[i].ITEM_ID+"&&flag=1'><span class='glyphicon glyphicon-phone-alt'></span>&nbsp;免费咨询</a></div></div></div>"	;
    						}
    						if(data1.length==0){
    							str="<div class='itemdiv'><h4>暂无数据</h4></div>"
    						}
    						$("#itembox").append(str);
    						
    					}		
    				});
     			}
     			function getTotal(page,rows){
     				var data={};
     				data["itemtypeId"]=itemtypeName;
     				data["itemareaId"]=itemareaname;
     				data["page"]=page;
     				data["rows"]=rows;
     				$.ajax({
    					type : "post",
    					dataType : "json",
    					url : "/stucy/readitem/getreaditemcount.do",
    					contentType : "application/json;charset=utf-8",
    					data :  JSON.stringify(data),
    					success : function(data1) {
    						pageitem(data1);
    					}
    				});
     			}
     			getTotal(1,12);
     			params(1,12);
     			function pageitem(sum){
     				$("#pageTool").empty();
     				$('#pageTool').Paging({pagesize:12,count:sum,toolbar:true,callback:function(page,size,count){
     		       		console.log(arguments)
     		       		params(page,size);
	     		       	 var speed=200;//滑动的速度
	     		        $('body,html').animate({ scrollTop:180 }, speed);
     		       	}});
     			}
     				
     		    
     </script>      
</body>
</html>