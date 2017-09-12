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
	#condd *{margin-top: 15px;}
</style>
</head>-0
<body>
	<div>
		<span style="position:relative;right: -55%; " >
		<a id="conbtn5" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-acondd'">员工修改</a>  
		<a id="conbtn1" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-acondd'">增加员工</a>  
		<a id="conbtn4" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-acondd'">修改角色</a>  
		<a id="conbtn2" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove'">启用/禁用</a> 
		<input class="easyui-validatebox"  name="userName" id="consel" />
		<a  href="javascript:void(0)" id="conselBtn" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查找</a>
		</span>
	</div>
	<table id="condg"></table>
	<div id="condd">
		&nbsp;&nbsp;&nbsp;&nbsp;姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：&nbsp;<input type="text" class="easyui-validatebox" id="conName" placeholder="请输入姓名" data-options="required:true"/><br>
		&nbsp;&nbsp;&nbsp;&nbsp;性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：&nbsp;<input type="radio" name="sex" value="男" checked/>男&nbsp;&nbsp;<input type="radio"  value="女" name="sex"/>女<br>
		&nbsp;&nbsp;&nbsp;&nbsp;账&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;户：&nbsp;<input type="text" class="easyui-validatebox" id="conUser" placeholder="字母数字组成6到10位" data-options="required:true"/><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="conUserts" style="display: none;color: red;"></span><br/>
		&nbsp;&nbsp;&nbsp;&nbsp;密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：&nbsp;<input type="text" value="123456" disabled="disabled"  class="easyui-validatebox" id="conPassword" data-options="required:true"/><br>
		&nbsp;&nbsp;&nbsp;&nbsp;电&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;话：&nbsp;<input type="text" class="easyui-validatebox" id="tel" placeholder="请输入手机号码" data-options="required:true"/><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="telts" style="display: none;color: red;">手机号码格式不正确</span><br/>
		&nbsp;&nbsp;&nbsp;&nbsp;家庭住址：&nbsp;<input type="text" class="easyui-validatebox" id="home" data-options="required:true"/><br>
		&nbsp;&nbsp;&nbsp;&nbsp;身份证号：&nbsp;<input type="text" class="easyui-validatebox" id="idCardurl"  placeholder="请输入身份证号码" data-options="required:true"/><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="idCardurlts" style="display: none;color: red;"></span><br/>
		<div></div>
		&nbsp;&nbsp;&nbsp;&nbsp;<span style="color:red">默认登录密码为：123456</span>
		
	</div> 
	
	<div id="condd2">
		&nbsp;&nbsp;&nbsp;&nbsp;姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：&nbsp;<input type="text" class="easyui-validatebox" id="conName2"  data-options="required:true"/><br>
		&nbsp;&nbsp;&nbsp;&nbsp;性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：&nbsp;<input type="radio" id="input2" name="sex" value="男"/>男&nbsp;&nbsp;<input type="radio"  value="女" name="sex"/>女<br>
		&nbsp;&nbsp;&nbsp;&nbsp;账&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;户：&nbsp;<input type="text" class="easyui-validatebox" disabled="disabled" id="conUser2"  data-options="required:true"/><br>
		&nbsp;&nbsp;&nbsp;&nbsp;密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：&nbsp;<input type="text" class="easyui-validatebox" id="conPassword2" data-options="required:true"/><br>
		&nbsp;&nbsp;&nbsp;&nbsp;电&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;话：&nbsp;<input type="text" class="easyui-validatebox" id="tel2"  data-options="required:true"/><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="telts2" style="display: none;color: red;">手机号码格式不正确</span><br/>
		&nbsp;&nbsp;&nbsp;&nbsp;家庭住址：&nbsp;<input type="text" class="easyui-validatebox" id="home2" data-options="required:true"/><br>
		&nbsp;&nbsp;&nbsp;&nbsp;身份证号：&nbsp;<input type="text" class="easyui-validatebox" id="idCardurl2"   data-options="required:true"/><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="idCardurlts2" style="display: none;color: red;"></span><br/>
		<div></div>
		
	</div> 
	
	
	<div id="condd1">
		&nbsp;&nbsp;&nbsp;&nbsp;员工编号：&nbsp;<span id="conuserid"></span><br>
		&nbsp;&nbsp;&nbsp;&nbsp;姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：&nbsp;<span id="conusername"></span><br>
		<br>&nbsp;&nbsp;&nbsp;&nbsp;角色修改：
		<div id="conPartcheck" >
			<p></p>
		</div>
		
	</div>
<script type="text/javascript">
$(function (){
	
	$("#tel2").blur(function (){
		telBlur2();
	})
	$("#idCardurl2").blur(function (){
		idCardurlBlur2();
	})
	function idCardurlBlur2(){
		var val=$("#idCardurl2").val();
		var partn=/^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/;
		if(!partn.test(val)){
			$("#idCardurlts2").html("");
			$("#idCardurlts2").html("身份证格式不正确");
			$("#idCardurlts2").show();
			return false;
		}else{
			$("#idCardurlts2").html("");
			$("#idCardurlts2").hide();
			return true;
		}
	}
	function telBlur2(){
		var val=$("#tel2").val();
		var partn=/^1[34578]\d{9}$/;
		if(!partn.test(val)){
			$("#telts2").html("");
			$("#telts2").html("手机号码格式不正确");
			$("#telts2").show();
			return false;
		}else{
			$("#telts2").html("");
			$("#telts2").hide();
			return true;
		}
	}
	
	$("#conbtn5").click(function (){
		var conVal=$('#condg').datagrid("getSelected");
		if(conVal!=null){
			opendialog2(conVal);
		}else{
			conmessager("请先选中一条数据再进行操作.....");
		}
		
	})
	
	function opendialog2(conVal){    
		$("#conName2").val(conVal.CON_NAME);
		$("#conUser2").val(conVal.CON_USER);
		$("#conPassword2").val('123456')
		$("#tel2").val(conVal.TEL)
		$("#home2").val(conVal.HOME)
		$("#idCardurl2").val(conVal.ID_CARDURL)
		var conId=conVal.CON_ID;
		var sex=conVal.SEX;
		
		var radio=$("#condd2 input[name='sex']");
		if(radio.eq(0).val()==sex){
			radio.eq(0).prop("checked",true);
		}else{
			radio.eq(1).prop("checked",true);
		}
		
		$('#condd2').dialog({    
		    title: '员工修改',    
		    width: 400,    
		    height: 400,
		    top:100,
		    left:400,
		    closed: false,    
		    cache: false,    
		    modal: false ,
		    buttons:[{
				text:'保存',
				handler:function(){
					var conName=$("#conName2").val();
					var conUser=$("#conUser2").val();
					var conPassword=$("#conPassword2").val();
					var tel=$("#tel2").val();
					var home=$("#home2").val();
					var idCardurl=$("#idCardurl2").val();
					var sex=$("#condd2 input[type='radio']:checked").val();
					var data={};
					data["conName"]=conName;
					data["conUser"]=conUser;
					data["conPassword"]=conPassword;
					data["tel"]=tel;
					data["home"]=home;
					data["idCardurl"]=idCardurl;
					data["sex"]=sex;
					data["conId"]=conId;
					if(idCardurlBlur2()&&telBlur2()&&conName!=""&&!conPassword==""&&!home==""){
						$.ajax({
							type : "post",
							url : "/stucy/consumer/updateconsumernew.do",
							contentType : "application/json;charset=utf-8",
							data :  JSON.stringify(data),
							success : function(data1) {
								
							}
						});
						$('#condd2').dialog("close");
						conmessager("已更新");
					}else{
						conmessager("完善数据后进行操作");
					}
					replace();
				
				}
			},{
				text:'关闭',
				handler:function(){
					$('#condd2').dialog("close");
				}
			}]  
		});  
	}
	
	
	$("#conUser").blur(function (){
		conUserBlur();
	})
	$("#tel").blur(function (){
		telBlur();
	})
	$("#idCardurl").blur(function (){
		idCardurlBlur();
	})
	function idCardurlBlur(){
		var val=$("#idCardurl").val();
		var partn=/^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/;
		if(!partn.test(val)){
			$("#idCardurlts").html("");
			$("#idCardurlts").html("身份证格式不正确");
			$("#idCardurlts").show();
			return false;
		}else{
			$("#idCardurlts").html("");
			$("#idCardurlts").hide();
			return true;
		}
	}
	function telBlur(){
		var val=$("#tel").val();
		var partn=/^1[34578]\d{9}$/;
		if(!partn.test(val)){
			$("#telts").html("");
			$("#telts").html("手机号码格式不正确");
			$("#telts").show();
			return false;
		}else{
			$("#telts").html("");
			$("#telts").hide();
			return true;
		}
	}
	function conUserBlur(){
		var val=$("#conUser").val();
		var partn=/^[a-zA-Z0-9]{6,10}$/;
		if(!partn.test(val)){
			$("#conUserts").html("");
			$("#conUserts").html("账户格式不正确");
			$("#conUserts").show();
			return false;
		}else{
			$("#conUserts").html("");
			$("#conUserts").hide();
			$.ajax({
				type : "post",
				url : "/stucy/consumer/querycononly.do",
				contentType : "application/json;charset=utf-8",
				data :  val,
				success : function(data1) {
					if(data1==1){
						$("#conUserts").html("账户已存在");
						$("#conUserts").show();
						return false;
					};
					return true;
				}
			});
		};
	}
	
	 $('#condg').datagrid({    
	    url:'/stucy/consumer/getconsumer.do', 
	    fitColumns:true,
	    striped:true,
	    singleSelect:true, 
	    pagination:true,
	    pagePosition:"bottom",
	    pageSize:'10',
		pageList:[10,15,20,25,30],
	    columns:[[    
	        {field:'CON_ID',title:'员工编号',width:150},    
	        {field:'CON_USER',title:'账户名',width:300},    
	        {field:'CON_NAME',title:'姓名',width:150},    
	        {field:'SEX',title:'性别',width:150} ,    
	        {field:'TEL',title:'电话',width:200} ,    
	        {field:'HOME',title:'家庭住址',width:300} ,    
	        {field:'ID_CARDURL',title:'身份证号',width:300} ,    
	        {field:'CONPART',title:'拥有角色',width:300} ,    
	        {field:'CON_STATUS',title:'状态',width:150,
	        	formatter:function(value,row,index){
  		      		if(value == 1){
  		      			return "已启用"; 
  		      		}else{
  		      			return "<span style='color:red'>已禁用</span>";
  		      		}
	        	}
	        }  
	    ]]    
	}); 
	$("#conbtn2").click(function (){
		var conVal=$('#condg').datagrid("getSelected");
		if(conVal!=null){
			var altext="";
			if(conVal.CON_STATUS==0){
				 altext="启用";
			}else{
				altext="禁用";
			}
			if(confirm("确定"+altext+"该员工吗?")){
				updateConStatus(conVal,'已'+altext);
			}
		}else{
			conmessager("请先选中一条数据再进行操作.....");
		}
	});
	function updateConStatus(conVal,test){
		
			var status=conVal.CON_STATUS
			if(status==0){
				status=1;
			}else{
				status=0;
			}
			var data ={
					conId : conVal.CON_ID,
					conStatus : status
			}
			$.ajax({
				type : "post",
				url : "/stucy/consumer/updateconsum.do",
				contentType : "application/json;charset=utf-8",
				data :  JSON.stringify(data),
				success : function(data1) {
				}
			});
			conmessager(test);
			replace();
	};
	$('#condd').dialog({
		 closed: true
	})
	$('#condd2').dialog({
		 closed: true
	})
	$('#condd1').dialog({
		 closed: true
	})
	$("#conbtn1").click(function (){
		opendialog();
	});
	$("#conbtn4").click(function (){
		var conVal=$('#condg').datagrid("getSelected");
		if(conVal!=null){
			$("#conuserid").html(conVal.CON_ID);
			$("#conusername").html(conVal.CON_NAME);
			$.ajax({
				type : "post",
				url : "/stucy/consumer/querypartcon.do",
				contentType : "application/json;charset=utf-8",
				data :  conVal.CON_ID,
				success : function(data1) {
					$("#conPartcheck span").remove();
					var str="";
					for(var i=0;i<data1.length;i++){
						str+="<span><input type='checkbox' name='conPartCheck' value='"+data1[i].PART_ID+"' "+data1[i].checkeds+"/>"+data1[i].PART_NAME+"&nbsp;&nbsp;</span>"
					}
					$("#conPartcheck p").append(str);
				}
			});
			
			$('#condd1').dialog({    
			    title: '修改角色',    
			    width: 400,    
			    height: 400,
			    top:100,
			    left:400,
			    closed: false,    
			    cache: false,    
			    modal: false ,
			    buttons:[{
					text:'保存',
					handler:function(){
						var checkStr="";
						$('#conPartcheck input[name="conPartCheck"]:checked').each(function(){  
							checkStr+=$(this).val()+",";//向数组中添加元素  
						});
						var data={
								consusId : conVal.CON_ID,
								partId : checkStr
						};
						$.ajax({
							type : "post",
							async:false,
							url : "/stucy/consumer/updateconpart.do",
							contentType : "application/json;charset=utf-8",
							data :  JSON.stringify(data),
							success : function(data1) {
							}
						});
						$('#condd1').dialog("close");

						replace();
						conmessager("修改已完成")
					}
				},{
					text:'关闭',
					handler:function(){
						$('#condd1').dialog("close");
					}
				}]  
			}); 

		}else{
			conmessager("请先选中一条数据再进行操作.....");
		}
	});
	function replace(){
		$('#condg').datagrid("reload");
	} 
	function opendialog(){
		$('#condd').dialog({    
		    title: '增加员工',    
		    width: 400,    
		    height: 400,
		    top:100,
		    left:400,
		    closed: false,    
		    cache: false,    
		    modal: false ,
		    buttons:[{
				text:'保存',
				handler:function(){
					var conName=$("#conName").val();
					var conUser=$("#conUser").val();
					var conPassword=$("#conPassword").val();
					var tel=$("#tel").val();
					var home=$("#home").val();
					var idCardurl=$("#idCardurl").val();
					var sex=$("#condd input[type='radio']:checked").val();
					var data={};
					data["conName"]=conName;
					data["conUser"]=conUser;
					data["conPassword"]=conPassword;
					data["tel"]=tel;
					data["home"]=home;
					data["idCardurl"]=idCardurl;
					data["sex"]=sex;
					if(!conName==""&&conUserBlur()&&telBlur()&&!conPassword==""&&!home==""&&idCardurlBlur()){
						$.ajax({
							type : "post",
							url : "/stucy/consumer/addconsumer.do",
							contentType : "application/json;charset=utf-8",
							data :  JSON.stringify(data),
							success : function(data1) {
								$('#condd').dialog("close");
								replace();
							}
						});
					}else{
						conmessager("请更改不合格数据")
					};
				}
			},{
				text:'关闭',
				handler:function(){
					$('#condd').dialog("close");
				}
			}]  
		});  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	$("#conselBtn").click(function (){
		var val=$("#consel").val();
		var data={
				selVal:val
		}
		$('#condg').datagrid("load",data);
	});
	function conmessager(test){
		$.messager.show({
		    title:'消息提示框',
		    msg:test,
		    timeout:5000,
		    height:220,
		    width:330,
		    showType:'slide'
		});
	}
	
	
});
</script>
</body> 
</html>