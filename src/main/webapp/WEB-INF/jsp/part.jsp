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
	#partdd *{margin-top: 15px;}
</style>
</head>
<body>
	<a id="partbtn1" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-apartdd'">增加角色</a>  
	<a id="partbtn3" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-apartdd'">修改权限</a>  
	<a id="partbtn4" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-apartdd'">修改角色描述</a>  
	<a id="partbtn2" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove'">启用/禁用角色</a>  
	<table id="partdg"></table>
	<div id="partdd">
		&nbsp;&nbsp;&nbsp;&nbsp;角色名称：<input type="text" class="easyui-validatebox" id="partName" data-options="required:true"/><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="partNamets" style="color:red;display: none;">角色名已存在</span><br/>
		&nbsp;&nbsp;&nbsp;&nbsp;角色描述：<input type="text" class="easyui-validatebox" id="partDescribe" data-options="required:true"/><br>	
	</div>
	<div id="partdd1">
		&nbsp;&nbsp;&nbsp;&nbsp;角色名称：<input type="text" class="easyui-validatebox" id="partName1" disabled="disabled"  data-options="required:true"/><br>
		&nbsp;&nbsp;&nbsp;&nbsp;角色描述：<input type="text" class="easyui-validatebox" id="partDescribe1" data-options="required:true"/><br>	
	</div>
	<div id="partupdate">
		<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;修改的角色：<span id="partrole"></span><br/><br/>
		<ul id="qxtree">
		<li> 
			<input type="checkbox" name="parent" value="1"/>系统管理1
			<ul>
				<li><input type="checkbox" name="son" value="2"/>员工管理12<br/>
					<input type="checkbox" name="son" value="3"/>角色管理13<br/>
					<input type="checkbox" name="son" value="4"/>权限管理14<br/>
				</li>
			</ul>
		</li>

		<li> 
			<input type="checkbox" name="parent" value="5"/>权限管理2
			<ul>
				<li><input type="checkbox" name="son" value="6"/>员工管理22<br/>
					<input type="checkbox" name="son" value="7"/>角色管理23<br/>
					<input type="checkbox" name="son" value="8"/>权限管理24<br/>
				</li>
			</ul>
		</li>

		<li> 
			<input type="checkbox" name="parent" value="9"/>权限管理3
			<ul>
				<li><input type="checkbox" name="son" value="10"/>员工管理32<br/>
					<input type="checkbox" name="son" value="11"/>角色管理33<br/>
					<input type="checkbox" name="son" value="12"/>权限管理34<br/>
				</li>
			</ul>
		</li>

		<li> 
			<input type="checkbox" name="parent" value="13"/>权限管理4
			<ul>
				<li><input type="checkbox" name="son" value="14"/>员工管理42<br/>
					<input type="checkbox" name="son" value="15"/>角色管理43<br/>
					<input type="checkbox" name="son" value="16"/>权限管理44<br/>
				</li>
			</ul>
		</li>

	</ul>
	</div> 
<script type="text/javascript">
$(function (){
	
	$("#partbtn4").click(function (){
		var numVal=$('#partdg').datagrid("getSelected");
		if(numVal==null){
			partmessager("请选中一条数据进行操作")
			return
		}
		$("#partName1").val(numVal.partName);
		$("#partDescribe1").val(numVal.partDescribe);
		$('#partdd1').dialog({    
		    title: '修改角色描述',    
		    width: 400,    
		    height: 280,
		    top:100,
		    left:400,
		    closed: false,    
		    cache: false,    
		    modal: false ,
		    buttons:[{
				text:'保存',
				handler:function(){
					var partDescribe=$("#partDescribe1").val();
					var data={};
					data["partId"]=numVal.partId;
					data["partDescribe"]=partDescribe;
						$.ajax({
							type : "post",
							url : "/stucy/part/updatepart.do",
							contentType : "application/json;charset=utf-8",
							data :  JSON.stringify(data),
							success : function(data1) {
								$('#partdd1').dialog("close");
								partupdatedialog();
							}
						});
					
				}
			},{
				text:'关闭',
				handler:function(){
					$('#partdd1').dialog("close");
				}
			}]  
		});
	})
	
	 $('#partdg').datagrid({    
		fitColumns:true,
		striped:true,
		singleSelect:true, 
		pagination:true,
		pagePosition:"bottom",
		pageSize:'10',
	    pageList:[10,15,20,25,30],
	    url:'/stucy/part/getpart.do', 
	    columns:[[    
	        {field:'partId',title:'角色ID',width:100},    
	        {field:'partName',title:'角色名称',width:130},    
	        {field:'partDescribe',title:'角色描述',width:300},    
	        {field:'state',title:'状态',width:50,
	        	formatter:function(value,row,index){
  		      		if(value == 1){
  		      			return "已启用";
  		      		}else{
  		      			return "<span style='color:red'>已禁用</span>";
  		      		}
	        	}
	        }
	        
	    ]],
	    pageSize: 10,        //设置默认分页大小
        pageList: [10, 15, 20, 25, 30, 35, 40, 45, 50],   //设置分页大小
	});
	 
	 $("#partName").blur(function (){
		 partBlur()
	 })
	 function partBlur(){
		 var val=$("#partName").val();
		 var flag=0;
		 $.ajax({
		    type : "post",
		    async: false,
			url : "/stucy/part/queryallpartname.do",
			contentType : "application/json;charset=utf-8",
			data :  val,
			success : function(data1) {
				flag=data1;
			}
		 })
		 $("#partNamets").hide();
		 if(!flag==0){
				$("#partNamets").show();
				return false;
				
			}else{
				return true;
			}
	 }
	 
	$('#partupdate').dialog({
		 closed: true
	})
	$("#partbtn3").click(function (){
		var numVal=$('#partdg').datagrid("getSelected");
		if(numVal==null){
			partmessager("请选中一条数据进行操作")
			return
		}
		$("#partrole").html(numVal.partName);
		var partnode=$("#qxtree").find("input");
		for (var j = 0; j < partnode.length; j++) {
			partnode.eq(j).prop("checked",false);
		};
		$.ajax({
			type : "post",
			url : "/stucy/part/queryDescribe.do",
			contentType : "application/json;charset=utf-8",
			data :  numVal.partId,
			success : function(data1) {
				var arr=data1.split(",");
				for (var i = 0; i < arr.length; i++) {
					for (var j = 0; j < partnode.length; j++) {
						if(arr[i]==partnode.eq(j).val()){
							partnode.eq(j).prop("checked",true);
						};
					}
				};
			}
		});
		
		$('#partupdate').dialog({    
		    title: '修改权限',    
		    width: 400,    
		    height: 400,
		    top:100,
		    left:400,
		    closed: false,    
		    cache: false,    
		    modal: false ,
		    singleSelect:true,
		    buttons:[{
				text:'保存',
				handler:function(){
					var node=$("#qxtree").find("input");
					var str="";
					for (var i=0;i<node.length ;i++ ){
						if(node.eq(i).is(":checked")){
							str += node.eq(i).val()+",";
						}
					}
					var dataDes={
							jurDescribe:str,
							partId:numVal.partId
					};
					
					$.ajax({
						type : "post",
						url : "/stucy/part/updateDescribe.do",
						contentType : "application/json;charset=utf-8",
						data :  JSON.stringify(dataDes),
						success : function(data1) {
						}
					});
					$('#partupdate').dialog("close");
				}
			},{
				text:'关闭',
				handler:function(){
					$('#partupdate').dialog("close");
				}
			}]  
		});  
	}); 
	
	function partupdatedialog(){
		$("#partdg").datagrid('reload');
	}
	
	$('#partdd').dialog({
		 closed: true
	})
	$('#partdd1').dialog({
		 closed: true
	})
	$("#partbtn1").click(function (){
		$('#partdd').dialog({    
		    title: '增加角色',    
		    width: 400,    
		    height: 280,
		    top:100,
		    left:400,
		    closed: false,    
		    cache: false,    
		    modal: false ,
		    buttons:[{
				text:'保存',
				handler:function(){
					var partName=$("#partName").val();
					var partDescribe=$("#partDescribe").val();
					var data={};
					data["partName"]=partName;
					data["partDescribe"]=partDescribe;
					if(!partName==""&&partBlur()){
						$.ajax({
							type : "post",
							url : "/stucy/part/addpart.do",
							contentType : "application/json;charset=utf-8",
							data :  JSON.stringify(data),
							success : function(data1) {
								$('#partdd').dialog("close");
								
								partupdatedialog();
							}
						});
					}else{
						if(partName==""){
							partmessager("角色名不许为空")
						}else{
							partmessager("角色名不允许重复")
						}
						
					};
				}
			},{
				text:'关闭',
				handler:function(){
					$('#partdd').dialog("close");
				}
			}]  
		});
		
	}); 
	
	
	
	$("#partbtn2").click(function (){
		var partVal=$('#partdg').datagrid("getSelected");
		var statext="";
		if(partVal!=null){
			if(partVal.state==0){
				statext="启用"
			}else{
				statext="禁用"
			}
			if(confirm("确定"+statext+"该角色吗?")){
				updatePartStatus(partVal,'已'+statext);
			}
			partupdatedialog();
		}else{
			partmessager("请先选中一条数据再进行操作.....");
		}
	})
	
	
	function updatePartStatus(conVal,text){
		var status=conVal.state
		if(status==0){
			status=1;
		}else{
			status=0;
		}
		var data ={
				partId : conVal.partId,
				Status : status
		}
		$.ajax({
			type : "post",
			url : "/stucy/part/updatepartstatus.do",
			contentType : "application/json;charset=utf-8",
			data :  JSON.stringify(data),
			success : function(data1) {
				
			}
		});
		partmessager(text);
		
		
	}
	function partmessager(test){
		$.messager.show({
		    title:'消息提示框',
		    msg:test,
		    timeout:5000,
		    height:220,
		    width:330,
		    showType:'slide'
		});
	}

	$("input[name='parent']").click(function (){
		var son=$(this).next().find("input");
		var status=$(this).is(":checked");
		for(var i=0; i<son.length;i++){
			if(status){
				son.eq(i).prop("checked",true);
			}else{
				son.eq(i).prop("checked",false);
			}
		}
	});
	$("input[name='son']").click(function (){
		var node=$(this).parent().find('input');
		var filg=0;
		for (var i=0;i<node.length ;i++ ){
			if(node.eq(i).is(":checked")){
				filg=1;
			}
		}
		if(filg==1){
			$(this).parent().parent().parent().find("input").eq(0).prop("checked",true);
		}else{
			$(this).parent().parent().parent().find("input").eq(0).prop("checked",false);
		}
	})
	  
	
});
</script>
</body> 
</html>