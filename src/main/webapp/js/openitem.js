$(function (){
		$('#openitems').datagrid({    
		    url:'/stucy/openitem/itemlist', 
		    fit : true,
		    fitColumns:true,   
		    columns:[[    
		        {field:'itemId',title:'项目编号',width:300},   
		        {field:'itemName',title:'项目名称',width:300},   		       
		        {field:'itemtypeId',title:'项目类型',width:300},   
		        {field:'itemareaId',title:'项目地区',width:300},   		         
		        {field:'itemIntro',title:'项目简介',width:300},  
		        {field:'userId',title:'创业人员',width:300},
		        {field:'itemMoney',title:'项目资金',width:300},  
		        {field:'itemStatus',title:'项目状态',width:300},   
		        {field:'starttime',title:'发布时间',width:300},   
		        {field:'endtime',title:'结束时间',width:300},   		       
		    ]]    
		}); 
		$('#addopenitem').dialog({
			 closed: true
		})
		$("#btn1").click(function (){
			$('#addopenitem').dialog({    
			    title: '发布项目',    
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
						var itemName=$("#itemName").val();
						var itemtypeId=$("#itemtypeId").val();
						var itemareaId=$("#itemareaId").val();
						var itemIntro=$("#itemIntro").val();
						var userId=$("#userId").val();
						var itemMoney=$("#itemMoney").val();
						var itemStatus=$("#itemStatus").val();
						var starttime=$("#starttime").val();
						var endtime=$("#endtime").val();					
						alert(itemName+" "+itemtypeId+" "+starttime+" "+endtime);
						var data={};
						data["itemName"]=itemName;
						data["itemtypeId"]=itemtypeId;
						data["itemareaId"]=itemareaId;
						data["itemIntro"]=itemIntro;
						data["userId"]=userId;
						data["itemMoney"]=itemMoney;
						data["itemStatus"]=itemStatus;
						data["starttime"]=starttime;
						data["endtime"]=endtime;
									
							$.ajax({
								type : "post",
								url : "/stucy/openitem/additem",
								contentType : "application/json;charset=utf-8",
								data :  JSON.stringify(data),
								success : function(data1) {
									$('#addopenitem').dialog("close");
								}
							});						
						}

				},{
					text:'关闭',
					handler:function(){
						$('#addopenitem').dialog("close");
					}
				}]  
			});  
		}); 
		  
		
	});