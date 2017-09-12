$(function (){
	$.ajax({
	    type : "post",	 
		url : "/stucy//.do",
		contentType : "application/json;charset=utf-8",		
		success : function(data1) {			
			var str = "";
			for (var i = 0; i < data1.length; i++) {
				str = str +"<tr><td width='300px'>"+data1[i].itemName+"</td>" +
						        "<td width='200px'>"+data1[i].+"</td>" +
								"<td width='200px'>"+data1[i].+"</td>"+
								"<td width='300px'>"+data1[i].+"</td>" +
								"<td width='200px'>"+data1[i].+"</td>"+
								"<td width='600px'>"+data1[i].+"</td>"+
								"<td width='200px'>"+data1[i].+"</td></tr>"						
								;
			}
			$("#itemlist").append(str);
		}
	 });
	
});