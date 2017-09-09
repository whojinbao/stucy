$(function (){	
      $('#personinfos').datagrid({    
		    url:'/stucy/personinfo/personinfos', 
		    fit : true,
		    fitColumns:true,   
		    columns:[[    
		        {field:'userId',title:'账号',width:300},    
		        {field:'zName',title:'真实姓名',width:300},		    
		        {field:'sex',title:'性别',width:300} ,    
		        {field:'telephone',title:'电话',width:300} ,    
		        {field:'address',title:'家庭住址',width:300} ,    
		        {field:'idCardnum',title:'身份证号码',width:300} ,
		        {field:'idCardurl',title:'身份证图片',width:300} ,
		        {field:'photoUrl',title:'本人照片',width:300} ,
		        {field:'schphotoUrl',title:'学信网截图',width:300} ,
		        {field:'stuNum',title:'学号',width:300} ,
		        {field:'stuPhoto',title:'学生证照片',width:300} ,
		        {field:'schName',title:'学校名称',width:300} ,
		        {field:'schAddress',title:'学校地址',width:300},
		        {field:'credit',title:'信用',width:300}		       
		    ]]    
		}); 
})