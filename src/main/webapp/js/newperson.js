//等待dom元素加载完毕.
$(function(){	   	  
   	 /*  var myDate = new Date();
   	   alert(myDate);
   	    $("#newtime").append(myDate);
   	   var h = myDate.getHours();
   	   if(h>11 && h<19){
   	   	 $("#outLogin").html("下午好，");
   	   }else if(h>18){
   	   	 $("#outLogin").html("晚上好，");
   	   }else{
   	   	 $("#outLogin").html("上午好，");
   	   } 
      });*/
	$(".treebox .level1>a").click(function(){
		$(this).addClass('current')   //给当前元素添加"current"样式
		.find('i').addClass('down')   //小箭头向下样式
		.parent().next().slideDown('slow','easeOutQuad')  //下一个元素显示
		.parent().siblings().children('a').removeClass('current')//父元素的兄弟元素的子元素去除"current"样式
		.find('i').removeClass('down').parent().next().slideUp('slow','easeOutQuad');//隐藏
		 return false; //阻止默认时间
	});
})