$(function (){
	$.ajax({
	    type : "post",	 
		url : "/stucy/openitem/personopenitem.do",
		contentType : "application/json;charset=utf-8",		
		success : function(data1) {			
			var str = "";
			for (var i = 0; i < data1.length; i++) {
				str = str +"<tr><td width='300px'>"+data1[i].itemName+"</td>" +
						        "<td width='300px'>"+data1[i].itemStaus+"</td>" +
								"<td width='300px'>"+data1[i].starttime+"</td>"+
								"<td width='300px'>"+data1[i].endtime+"</td></tr>"						
								;
			}
			$("#itemlist").append(str);
		}
	 });
	
});