$(function (){
		$('#dg').datagrid({    
		    url:'/stucy/consumer/getconsumer', 
		    fit : true,
		    fitColumns:true,   
		    columns:[[    
		        {field:'conId',title:'员工编号',width:300},    
		        {field:'conUser',title:'账户名',width:300},    
		        {field:'conName',title:'姓名',width:300},    
		        {field:'sex',title:'性别',width:300} ,    
		        {field:'tel',title:'电话',width:300} ,    
		        {field:'home',title:'家庭住址',width:300} ,    
		        {field:'idCardurl',title:'身份证',width:300} ,    
		        {field:'conStatus',title:'状态',width:300}  
		    ]]    
		}); 
		$('#dd').dialog({
			 closed: true
		})
		$("#btn1").click(function (){
			$('#dd').dialog({    
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
						var sex=$("input[type='radio']:checked").val();
						alert(conName+" "+conUser+" "+conPassword+" "+tel+" "+home+" "+idCardurl+" "+sex);
						var data={};
						data["conName"]=conName;
						data["conUser"]=conUser;
						data["conPassword"]=conPassword;
						data["tel"]=tel;
						data["home"]=home;
						data["idCardurl"]=idCardurl;
						data["sex"]=sex;
						if(!conName==""){
							$.ajax({
								type : "post",
								url : "/stucy/consumer/addconsumer",
								contentType : "application/json;charset=utf-8",
								data :  JSON.stringify(data),
								success : function(data1) {
									$('#dd').dialog("close");
								}
							});
						};
					}
				},{
					text:'关闭',
					handler:function(){
						$('#dd').dialog("close");
					}
				}]  
			});  
		}); 
		  
		
	});