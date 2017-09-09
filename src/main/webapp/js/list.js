$(function (){	
	/* 获取 已发布的项目*/
	$.ajax({
		type : "post",		
		url : "/stucy/openitem/itemlist.do",		
		success : function(data1) {			
	      var str = "";
		  for (var int = 0; int <data1.length; int++) {		
			  str = str
  		      +"<ul><li class='col-330 '><a class='f18' href='/stucy/openitem/openitemlogin?itemId="+data1[int].itemId+"' target='_blank'>"+data1[0].itemName+"</a></li>"
              +"<li class='col-180'><span >"+data1[int].itemtypeId+"</span></li>"
              +"<li class='col-110'><span >"+data1[int].itemareaId+"</span></li>"
              +"<li class='col-150'> <span >"+data1[int].userId+"</span></li>"
              +"<li class='col-150'>"+data1[int].itemMoney+"</li>"
              +"<li class='col-120'>"+data1[int].itemStatus+"</li>"       
              +"</ul>";		 			
		  }		 
		  $("#item").append(str);			         
		}, 
		error:function(data1){
			alert('error');
		}
	})	;
	
})
$("#person").click(function(){
	var userId =$("#userId").html();
	var userRole=$("#userRole").html();
	alert(userRole=="1");
    if(userRole == "" ){
		$("#xuan").append("<a href='/stucy/yemian/addPersoninfo.do'><span>做创业人</span></a><br/><a href='#'><span>做投资人</span></a>");
    }else if(userRole=="1"){
    	 window.location.href ="/stucy/openitem/person.do?userId="+userId;
    }else if(userRole =="2"){
    	 window.location.href ="/stucy/openitem/person.do?userId="+userId;
    }
	
	
})