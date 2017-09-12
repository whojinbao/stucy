<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="shehelogging">
			<input id="ITEM_ID" style="display:none;"/>
            <div style="margin-bottom:10px"> 
            	 <label>项目名字:</label>  
		        <input class="easyui-validatebox"   style="width:100%" name="itemName" id="ITEM_NAME"  readonly="readonly"/>   
		    </div>
		    <br/>  
		    <div style="margin-bottom:10px"> 
		    <input id="CONSUS_ID" style="display:none;"/>
		     <label>审核人:</label>  
		      <input class="easyui-validatebox" style="width:100%" id="CON_NAME"  readonly="readonly"/>   
		    </div> 
		    <br/>
		    <div style="margin-bottom:10px">
		     <label>审核建议:</label>
		     <textarea class="easyui-validatebox"  name="itemContent" style="width:100%" id="auditAdvice" cols="30" rows="5">
		     
		     </textarea>
		    </div>
		    <br/>
		    <div style="margin-bottom:10px"> 
			     <label>是否通过:</label>     
			    <select  class="easyui-validatebox"  style="width:100%" id="isno"  disabled="disabled">   
				    <option>通过</option>   
				    <option>未通过</option>   
				</select>  
		    </div>     
		    <br/>
		    <div style="margin-bottom:10px"> 
			 <label>审核时间:</label>     
		        <input class="easyui-validatebox"   name="startTime" style="width:100%"  id="auditTime"  readonly="readonly"/>   
		    </div> 
	</div>
	<script>
		
	</script>
</body>
</html>