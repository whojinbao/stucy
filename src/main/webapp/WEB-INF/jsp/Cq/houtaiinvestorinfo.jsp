<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page isELIgnored="false" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="/stucy/helpframe/easyui/jquery.min.js"  type="text/javascript"></script>
<script src="/stucy/helpframe/easyui/jquery.easyui.min.js" type="text/javascript"></script>
<script src="/stucy/helpframe/easyui/easyui-lang-zh_CN.js" type="text/javascript"></script>
<link href="/stucy/demo/bootstrap/easyui.css" rel="stylesheet" type="text/css" /> 
<link href="/stucy/demo/icon.css" rel="stylesheet" type="text/css" /> 

<script type="text/javascript" src="/stucy/js/area.js"></script>
<script type="text/javascript" src="/stucy/js/location.js"></script>
<script type="text/javascript" src="/stucy/js/select2.js"></script>
<script type="text/javascript" src="/stucy/js/select2_locale_zh-CN.js"></script>
<link rel="stylesheet" href="/stucy/js/select2.css" type="text/css"></link>
<link rel="stylesheet" href="/stucy/js/common.css" type="text/css"></link>
<style type="text/css">
	#addinvestor{
		background: #87B7FF;
	}
</style>
</head>
<body>
	<button id="addinvestor" class="easyui-linkbutton" data-options="iconCls:'icon-save'">修改个人信息</button>
	<table id="dg">
		<c:forEach items="${lfo}" var="lo">
			<tr>
				<td>${lo.investorId}</td>
				<td>${lo.investorname}</td>
				<td>${lo.investorsex}</td>
				<td>${lo.investortel}</td>
				<td>${lo.investoraddress}</td>
				<td>${lo.nocardnum}</td>
				<td><img src="/stucy/caoImage/${lo.investorphoto}" width="100px" height="100px"></td>
				<td><img src="/stucy/caoImage/${lo.companyurl}" width="100px" height="100px"></td>
				<td>${lo.companynum}</td>
				<td><img src="/stucy/caoImage/${lo.companyphoto}" width="100px" height="100px"></td>
				<td>${lo.companyname}</td>
				<td>${lo.companyaddress}</td>
				<td>${lo.credit}</td>
			</tr>
		</c:forEach>
	</table>
	<div id="dd">
  	</div>
  	<script>
  $(function(){  
  	$("#dg").datagrid({  
  		url:'/stucy/queryAllInvestorinfo.do',
  		striped:"true",
  		pagination:"true",
  		singleSelect:"true",
  	    columns:[[    
  	        {field:'investorId',title:'账号',width:100,},    
  	        {field:'investorname',title:'真实姓名',width:100},    
  	        {field:'investorsex',title:'性别',width:100},    
  	        {field:'investortel',title:'电话',width:100},    
  	        {field:'investoraddress',title:'家庭住址',width:100},    
  	        {field:'nocardnum',title:'身份证号',width:150},      
  	        {field:'investorphoto',title:'本人照片',width:170},    
  	        {field:'companyurl',title:'公司网截图',width:170},    
  	        {field:'companynum',title:'工号',width:100},    
  	        {field:'companyphoto',title:'工作证',width:170},    
  	        {field:'companyname',title:'公司名称',width:100},    
  	        {field:'companyaddress',title:'公司地址',width:100},    
  	        {field:'credit',title:'信用',width:100}   
  	  	  ]]    
  		}); 
    }) 
  	</script>
</body>
</html>
