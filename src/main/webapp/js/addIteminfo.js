$(function(){
	$.ajax({
		type : "post",
		url : "/stucy/Iteminfo/itemtype.do",
		contentType : "application/json;charset=utf-8",
		success : function(data1) {			
			var str1 = "";
			for (var i = 0; i < data1.length; i++) {
				str1 = str1+"<option class='form-control' value="+data1[i].itemtypeId+"><span>"+data1[i].itemtypeName+"</span></option>";			
			}
			$("#itemtype").append(str1);
		},error:function(){
			alert("error");
		}
	});

	$.ajax({
		type : "post",
		url : "/stucy/Iteminfo/itemarea.do",
		contentType : "application/json;charset=utf-8",
		success : function(data2) {
			var str2 = "";
			for (var i = 0; i < data2.length; i++) {
				str2 = str2+"<option value="+data2[i].itemareaId+"><span>"+data2[i].itemareaName+"</span></option>";
			}
			$("#itemarea").append(str2);

		},error:function(){
			alert("error");
		}
	});
})
//图片上传预览    IE是用了滤镜。
function previewImage(file)
{
	var MAXWIDTH  = 260; 
	var MAXHEIGHT = 180;
	var div = document.getElementById('preview');
	if (file.files && file.files[0])
	{
		div.innerHTML ='<img id=imghead>';
		var img = document.getElementById('imghead');
		img.onload = function(){
			var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);
			img.width  =  rect.width;
			img.height =  rect.height;
//			img.style.marginLeft = rect.left+'px';
			img.style.marginTop = rect.top+'px';
		}
		var reader = new FileReader();
		reader.onload = function(evt){img.src = evt.target.result;}
		reader.readAsDataURL(file.files[0]);
	}
	else //兼容IE
	{
		var sFilter='filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src="';
		file.select();
		var src = document.selection.createRange().text;
		div.innerHTML = '<img id=imghead>';
		var img = document.getElementById('imghead');
		img.filters.item('DXImageTransform.Microsoft.AlphaImageLoader').src = src;
		var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);
		status =('rect:'+rect.top+','+rect.left+','+rect.width+','+rect.height);
		div.innerHTML = "<div id=divhead style='width:"+rect.width+"px;height:"+rect.height+"px;margin-top:"+rect.top+"px;"+sFilter+src+"\"'></div>";
	}
}
function clacImgZoomParam( maxWidth, maxHeight, width, height ){
	var param = {top:0, left:0, width:width, height:height};
	if( width>maxWidth || height>maxHeight )
	{
		rateWidth = width / maxWidth;
		rateHeight = height / maxHeight;

		if( rateWidth > rateHeight )
		{
			param.width =  maxWidth;
			param.height = Math.round(height / rateWidth);
		}else
		{
			param.width = Math.round(width / rateHeight);
			param.height = maxHeight;
		}
	}

	param.left = Math.round((maxWidth - param.width) / 2);
	param.top = Math.round((maxHeight - param.height) / 2);
	return param;
} 



