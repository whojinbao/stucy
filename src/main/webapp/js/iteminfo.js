$(function (){	
      $('#iteminfo').datagrid({    
		    url:'/stucy/Iteminfo/itemlist', 
		    fit : true,
		    fitColumns:true,   
		    columns:[[    
		                {field:'itemId',title:'项目编号',width:300},   
				        {field:'itemName',title:'项目名称',width:300},   		       
				        {field:'itemtypeId',title:'项目类型',width:300},   
				        {field:'itemareaId',title:'项目地区',width:300},   		         
				        {field:'itemIntro',title:'项目简介',width:300},  
				        {field:'itemContent',title:'项目内容',width:300},  
				        {field:'itemmaterialsurl',title:'项目附件',width:300},  				      
				        {field:'userId',title:'创业人员',width:300},
				        {field:'itemMoney',title:'项目资金',width:300}
				     				      			       			       
		    ]]    
		}); 
})