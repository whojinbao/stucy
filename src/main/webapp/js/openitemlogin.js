$(function (){
	$.ajax({
		type : "post",		
		url : "/stucy/openitem/openitemlogin",		
		success : function(data1) {
			alert(data1);
			
		},
		error:function(data1){
			alert('error');
		}
	 });
})