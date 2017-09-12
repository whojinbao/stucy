<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="/stucy/helpframe/easyui/jquery.min.js"
	type="text/javascript"></script>
<script src="/stucy/helpframe/easyui/jquery.easyui.min.js"
	type="text/javascript"></script>
<script src="/stucy/helpframe/easyui/easyui-lang-zh_CN.js"
	type="text/javascript"></script>
<link href="/stucy/demo/bootstrap/easyui.css" rel="stylesheet"
	type="text/css" />
<link href="/stucy/demo/icon.css" rel="stylesheet" type="text/css" />
<style type="text/css">
	#shehelogging{
	display:none;
}
</style>
</head>
<body>
	<div id="big">
	<a id="shenhebtn1" href="#" class="easyui-linkbutton"
		data-options="iconCls:'icon-acondd'">项目详情</a>
	<table id="addShen"></table>
	<div id="shehedd">
			<input id="ITEM_ID" style="display:none;"/>
            <div style="margin-bottom:10px"> 
            	 <label>项目名字:</label>  
		        <input class="easyui-validatebox"   style="width:100%" name="itemName" id="ITEM_NAME"  readonly="readonly"/>   
		    </div>
		    <br/>  
		    <div style="margin-bottom:10px">
		     <label>申请人:</label>  
		      <input class="easyui-validatebox"   style="width:100%" id="Z_NAME"  readonly="readonly"/>   
		    </div> 
		    <br/>     
		    <div style="margin-bottom:10px">  
		     <label>申请人电话:</label>  
		      <input class="easyui-validatebox"    style="width:100%" id="TELEPHONE1"  readonly="readonly"/>   
		    </div> 
		    <br/>     
		    <div style="margin-bottom:10px">  
		     <label>申请人地址:</label>  
		      <input class="easyui-validatebox"   style="width:100%" id="ADDRESS"  readonly="readonly"/>   
		    </div> 
		    <br/>     
		    <div style="margin-bottom:10px">  
		     <label>身份证号:</label>  
		      <input class="easyui-validatebox"   name="auditIid" style="width:100%" id="NO_IDCARD"  readonly="readonly"/>   
		    </div> 
		    <br/>     
		    <div style="margin-bottom:10px">  
		     <label>身份证正面截图:</label>  
		      <input class="easyui-validatebox"   name="auditIid" style="width:100%" id="Z_IDCARD"  readonly="readonly"/>   
		    </div> 
		    <br/>     
		    <div style="margin-bottom:10px">  
		     <label>身份证反面截图:</label>  
		      <input class="easyui-validatebox"   name="auditIid" style="width:100%" id="F_IDCARD"  readonly="readonly"/>   
		    </div> 
		    <br/>     
		    <div style="margin-bottom:10px">  
		     <label>本人图片:</label>  
		      <input class="easyui-validatebox"   style="width:100%" id="PHONO1"  readonly="readonly"/>   
		    </div> 
		    <br/>     
		    <div style="margin-bottom:10px">
		     <label>项目内容:</label>
		     <textarea class="easyui-validatebox"  name="itemContent" style="width:100%" id="ITEM_CONTENT" cols="30" rows="5"  readonly="readonly">
		     
		     </textarea>        
		    </div>  
		    <br/>    
			<div style="margin-bottom:10px">  
			 <label>项目金额:</label>   
		        <input class="easyui-validatebox"   name="itemMoney" style="width:100%"  id="ITEM_MONEY"  readonly="readonly"/>   
		    </div>  
		    <br/>    
			<div style="margin-bottom:10px"> 
			 <label>申请时间:</label>     
		        <input class="easyui-validatebox"   name="startTime" style="width:100%"  id="START_TIME"  readonly="readonly"/>   
		    </div> 
		    <br/>     
		    
		    <div style="margin-bottom:10px">
		    	 <label>项目图片:</label>     
		         
		         <input class="easyui-validatebox"   name="itemmaterialsurl" style="width:100%" id="itemmaterialsurl"  readonly="readonly" />   
		  		<!-- <div id="po">
		  		 	<img src="D:\二期项目\stucy\stucy\src\main\webapp\caoImage\3.jpg.jpg" width="10" height="10"/>
		  		</div> -->
		   </div>
			<br/>     
		    <div style="margin-bottom:10px"> 
			     <label>审核状态:</label>     
			    <select  class="easyui-validatebox"  style="width:100%" id="ITEM_STATUS"  disabled="disabled">   
				    <option value="1">已审核</option>   
				    <option value="0">未审核</option>   
				</select>  
		    </div>       
	</div>
	</div>
	
	<div id="shehelogging">
            
	</div>
	<script>
	$(function(){
		$("#shehelogging").dialog({
			 closed: true
		})
		$('#shehedd').dialog({
			 closed: true
		})
		$("#shenhebtn1").click(function (){
			var conVal=$('#addShen').datagrid("getSelected");
			if(conVal!=null){
				shenheopendialog(conVal);
			}else{
				shehemessager("请选择一条数据后再进行操作！");
			}	
		});
		function shenheopendialog(conVal){
			$("#ITEM_ID").val(conVal.ITEM_ID);
			$("#ITEM_NAME").val(conVal.ITEM_NAME);
			$("#Z_NAME").val(conVal.Z_NAME);
			$("#TELEPHONE1").val(conVal.TELEPHONE);
			$("#ADDRESS").val(conVal.ADDRESS);
			$("#ITEM_MONEY").val(conVal.ITEM_MONEY);
			$("#START_TIME").val(conVal.START_TIME);
			$("#NO_IDCARD").val(conVal.NO_IDCARD);
			$("#Z_IDCARD").val(conVal.Z_IDCARD); 
			$("#F_IDCARD").val(conVal.F_IDCARD);
			$("#PHONO1").val(conVal.PHOTO);
			$("#ITEM_CONTENT").val(conVal.ITEM_CONTENT);
			$("#itemmaterialsurl").val(conVal.ITEM_PHOTO);
			$("#ITEM_STATUS").val(conVal.ITEM_STATUS);
			$('#shehedd').dialog({ 
			    title: '查看项目详情',    
			    width: 800,    
			    height:800,
			    top:100,
			    left:400,
			    closed: false,    
			    cache: false,    
			    modal: false ,
			    buttons:[{
					text:'通过',
					iconCls: 'icon-ok',
					handler:function(){
						var itemId=$("#ITEM_ID").val();
						var itemStatus=$("#ITEM_STATUS").val();
							itemStatus="1";
						$.ajax({
							type:'post',
							url:'/stucy/cao/updateIteminfo.do',
							data:{itemStatus:itemStatus,itemId:itemId},
							success: function(data1){
								if(data1=="yes"){
									$.ajax({
										type: 'POST',
										url: '/stucy/cao/hong.do',
										success: function(data){
											var arr=new Array();
											arr=data.split(",");
				   	var str="<div style='margin-bottom:10px'>" 
							            	+"<label>项目名字:</label>"  
							            	+"<input class='easyui-validatebox'   style='width:100%'  id='ITEM_NAME1'  readonly='readonly'/>"   
							            	+"</div>"
							            	+"<br/>"  
							            	+"<div style='margin-bottom:10px'>" 
							            	+"<input id='CONSUS_ID' style='display:none;' value='"+arr[1]+"'/>"
							            	+"<label>审核人:</label>" 
							            	+"<input class='easyui-validatebox' style='width:100%' id='CON_NAME' value='"+arr[0]+"' readonly='readonly'/>"   
							            	+"</div>" 
							            	+"<br/>"
							            	+"<div style='margin-bottom:10px'>"
							            	+"<label>审核建议:</label>"
							            	+"<textarea class='easyui-validatebox'  name='itemContent' style='width:100%' cols='30' rows='5' id='active'>"
									     
							            	+"</textarea>"
							            	+"</div>"
							            	+"<br/>"
							            	+"<div style='margin-bottom:10px'>" 
							            	+"<label>是否通过:</label>"    
							            	+"<select  class='easyui-validatebox'  style='width:100%' id='isno'  disabled='disabled'>"   
							            	+" <option value='1'>通过</option>"  
							            	+"<option value='0'>未通过</option>"
							            	+"</select>"  
							            	+"</div>"     
							            	+"<br/>"
							            	+"<div style='margin-bottom:10px'>"
							            	+"<label>审核时间:</label>"    
							            	+"<input class='easyui-validatebox'  value='"+arr[2]+"' style='width:100%'  id='auditTime'  readonly='readonly' />"   
							            	+"</div>"
							            $("#shehelogging").append(str);	
							            	var itemId=$("#ITEM_ID").val();
											var itemName1=$("#ITEM_NAME").val();
											var itemName=$("#ITEM_NAME1").val(itemName1);
											var consusId=$("#CONSUS_ID").val();		
											var auditAdvice=$("#auditAdvice").val();				
											var isno=$("#isno").val("1");	
											var auditTime=$("#auditTime").val();
											$("#big").css("display","none");
											$('#shehelogging').dialog({
										    width: 800,    
										    height:800,
										    top:100,
										    left:400,
										    closed: false,    
										    cache: false,    
										    modal: false ,
										    buttons:[{
												text:'发布',
												iconCls: 'icon-ok',
												handler:function(){
													var itemId=$("#ITEM_ID").val();
													var auditId=$("#CONSUS_ID").val();
													var auditAdvice=$("#active").val();
													var isno=$("#isno").val();
													var auditTime=$("#auditTime").val();
													$.ajax({
														type:'post',
														url:'/stucy/cao/addAuditinfo.do',
														data:{itemId:itemId,auditId:auditId,auditAdvice:auditAdvice,isno:isno,auditTime:auditTime},
														success: function(data3){
																if(data3=="yes"){
																	var shenQingPhone=$("#TELEPHONE1").val();
																	var shenQingTime=$("#START_TIME").val();
																	var data ={
																			telephone:shenQingPhone,
																			shenQingTime:shenQingTime
																	}
																	$.ajax({
																		type:'post',
																		url:'/stucy/cao/queryShenHemember.do',
																		contentType : "application/json;charset=utf-8",
																		data :  JSON.stringify(data),
																		success: function(data4){
																			if(data4=="xiao"){
																				var itemId=$("#ITEM_ID").val();
																				var itemStatus="1";
																				$.ajax({
																					type:'post',
																					url:'/stucy/cao/addShenheOpenitem.do',
																					data:{itemId:itemId,itemStatus:itemStatus},
																					success:function(data5){
																						if(data5=="addShenheOpenitem"){
																							 var tel=$("#TELEPHONE1").val();	
																							var data={telephone:tel}
																							$.ajax({
																								type:'post',
																								url:'/stucy/cao/updateShenHemember.do',
																								contentType : "application/json;charset=utf-8",
																								data :JSON.stringify(data),
																								success:function(data6){
																									if(data6=="updateShenHemember"){
																										alert("发布成功");
																									}
																								}}) 
																						}
																					}})												
																			}else{
																				alert("该人还不是会员或会员到期,或发布次数用完");
																			}
																		}})
																}
															}
														})		
												}
										    },
											{
													text:'取消',
													iconCls: 'icon-cancel',
													handler:function(){
														
													},	
											}] 
									 }) 
										}			
									});	 
								}
							}}) 
					}
				},{
					text:'未通过',
					iconCls: 'icon-cancel',
					handler:function(){
						var itemId=$("#ITEM_ID").val();
						var itemStatus=$("#ITEM_STATUS").val();
							itemStatus="1";
						$.ajax({
							type:'post',
							url:'/stucy/cao/updateIteminfo.do',
							data:{itemStatus:itemStatus,itemId:itemId},
							success: function(data1){
								if(data1=="yes"){
									$.ajax({
										type: 'POST',
										url: '/stucy/cao/hong.do',
										success: function(data){
											var arr=new Array();
											arr=data.split(",");
				   	var str="<div style='margin-bottom:10px'>" 
							            	+"<label>项目名字:</label>"  
							            	+"<input class='easyui-validatebox'   style='width:100%'  id='ITEM_NAME1'  readonly='readonly'/>"   
							            	+"</div>"
							            	+"<br/>"  
							            	+"<div style='margin-bottom:10px'>" 
							            	+"<input id='CONSUS_ID' style='display:none;' value='"+arr[1]+"'/>"
							            	+"<label>审核人:</label>" 
							            	+"<input class='easyui-validatebox' style='width:100%' id='CON_NAME' value='"+arr[0]+"' readonly='readonly'/>"   
							            	+"</div>" 
							            	+"<br/>"
							            	+"<div style='margin-bottom:10px'>"
							            	+"<label>审核建议:</label>"
							            	+"<textarea class='easyui-validatebox'  name='itemContent' style='width:100%' cols='30' rows='5' id='active'>"
									     
							            	+"</textarea>"
							            	+"</div>"
							            	+"<br/>"
							            	+"<div style='margin-bottom:10px'>" 
							            	+"<label>是否通过:</label>"    
							            	+"<select  class='easyui-validatebox'  style='width:100%' id='isno'  disabled='disabled'>"   
							            	+" <option value='1'>通过</option>"  
							            	+"<option value='0'>未通过</option>"
							            	+"</select>"  
							            	+"</div>"     
							            	+"<br/>"
							            	+"<div style='margin-bottom:10px'>"
							            	+"<label>审核时间:</label>"    
							            	+"<input class='easyui-validatebox'  value='"+arr[2]+"' style='width:100%'  id='auditTime'  readonly='readonly' />"   
							            	+"</div>"
							            $("#shehelogging").append(str);	
							            	var itemId=$("#ITEM_ID").val();
											var itemName1=$("#ITEM_NAME").val();
											var itemName=$("#ITEM_NAME1").val(itemName1);
											var consusId=$("#CONSUS_ID").val();		
											var auditAdvice=$("#auditAdvice").val();				
											var isno=$("#isno").val("0");	
											var auditTime=$("#auditTime").val();
											$("#big").css("display","none");
											$('#shehelogging').dialog({
										    width: 800,    
										    height:800,
										    top:100,
										    left:400,
										    closed: false,    
										    cache: false,    
										    modal: false ,
										    buttons:[{
												text:'驳回',
												iconCls: 'icon-ok',
												handler:function(){
													var itemId=$("#ITEM_ID").val();
													var auditId=$("#CONSUS_ID").val();
													var auditAdvice=$("#active").val();
													var isno=$("#isno").val();
													var auditTime=$("#auditTime").val();
													$.ajax({
														type:'post',
														url:'/stucy/cao/addAuditinfo.do',
														data:{itemId:itemId,auditId:auditId,auditAdvice:auditAdvice,isno:isno,auditTime:auditTime},
														success: function(data3){
																if(data3=="yes"){
																	alert("项目已驳回");
																	$('#shehelogging').dialog("close");
																	$('#shehedd').dialog("close");
																	$("#big").css("display","block");
																}
															}
														})		
												}
										    },
											{
													text:'取消',
													iconCls: 'icon-cancel',
													handler:function(){
														var fabu=confirm("确认再看看吗");
														if(fabu==false){
															$('#shehelogging').dialog("close");
														}
													},	
											}] 
									 }) 
										}			
									});	 
								}
							}}) 
					
						$('#condd').dialog("close");
					}
				}]  
			});
				/* var itemmaterialsurl=$("#itemmaterialsurl").val();
				$("#po").html("<img src="+itemmaterialsurl+">"); */
		}
	$("#addShen").datagrid({
		url:"/stucy/cao/Seedetails.do",
  		pagination:true,
  		singleSelect:true,
  		striped:true,
  		fitColumns:true,
  	    columns:[[    
  	        {field:'ITEM_ID',title:'项目编号',width:100,hidden:true},    
  	        {field:'USER_ID',title:'发布人编号',width:100,hidden:true},    
  	        {field:'Z_NAME',title:'申请人姓名',width:100},    
  	        {field:'TELEPHONE',title:'申请人电话',width:100},    
  	        {field:'ADDRESS',title:'申请人地址',width:100},    
  	        {field:'NO_IDCARD',title:'身份证号',width:100},    
  	        {field:'Z_IDCARD',title:'身份证正面截图',width:100,hidden:true},    
  	        {field:'F_IDCARD',title:'身份证反面截图',width:100,hidden:true},    
  	        {field:'PHONO',title:'本人图片',width:100,hidden:true},    
  	        {field:'ITEM_NAME',title:'项目名字',width:100},    
  	        {field:'ITEM_MONEY',title:'项目金额',width:100},    
  	        {field:'START_TIME',title:'申请时间',width:100},
  	      	{field:'ITEM_CONTENT',title:'项目内容',width:300,hidden:true}, 
  	    	{field:'ITEM_PHONO',title:'项目图片',width:300,hidden:true}, 
  	  		{field:'USER_ID',title:'申请人',width:300,hidden:true}, 
  	        {field:'ITEM_STATUS',title:'状态',width:150,
  	        	formatter:function(value,row,index){
  		      		if(value == 1){
  		      			return "<span style='color:green'>已审核</span>";
  		      		}else{
  		      			return "<span style='color:red'>未审核</span>";
  		      		}
  	        	}
  	        }
  	  	  ]] 
  		});
	
	function shehemessager(test){
		$.messager.show({
		    title:'消息提示框',
		    msg:test,
		    timeout:5000,
		    height:220,
		    width:330,
		    showType:'slide'
		});
	}	
	})
	</script>
</body>
</html>