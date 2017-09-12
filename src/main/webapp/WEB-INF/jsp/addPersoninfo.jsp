<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>完善个人信息</title>
<link rel="stylesheet"
	href="/stucy/helpframe/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	type="text/css"></link>
<style type="text/css">
.form-control {
	display: black;
	width: 104%;
	height: auto;
	min-height: 50px;
}

.zfphoto {
	border: 1px #ccc solid;
	background-color: #fff;
}
</style>
</head>
<body>
	<div style="padding: 10% 30% 20% 20%;" >
		<div class="page-header">
			<h2 class="text-center">完善个人信息</h2>
		</div>
		<br /> <br />
		<form action="/stucy/personinfo/addpersoninfo.do" method="post"
			enctype="multipart/form-data">
			<%--  <div class="input-group" style="display:">
			 <span class="input-group-addon">用户编号</span>			
			 <input id="userId"  name="userId" value="${userId }" class="form-control ">
		 </div> --%>
			<div class="input-group">
				<span class="input-group-addon">真实姓名</span> <input id="zName"
					name="zName" class="form-control ">
			</div>
			<br>

			<div class="input-group" style="min-height: 50px;">
				<span class="input-group-addon" > 性 &nbsp;&nbsp;别</span>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" style="min-height: 50px; id="sex"
					name="sex" value="男" checked />男&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" style="min-height: 50px;" value="女"
					name="sex" />女<br>
			</div>
			<br>

			<div class="input-group">
				<span class="input-group-addon">联系电话</span> <input id="telephone"
					name="telephone"
					<%-- value="${userId }" --%>  class="form-control ">
			</div>
			<br>

			<div class="input-group">
				<span class="input-group-addon">居住地址</span> <input id="address"
					name="address" class="form-control ">
			</div>
			<br>
			<div class="input-group">
				<span class="input-group-addon">身份证号</span> <input id="noIdcard"
					name="noIdcard" class="form-control ">
			</div>
			<br>

			<div class="input-group">
				<span class="input-group-addon">身份证图片(正)</span>
				<div class="zfphoto">
					<div class="preview">
						<img class="imghead" width=100 height=100 border=0
							src='<%=request.getContextPath()%>/images/defaul.jpg' />
					</div>
				</div>
				<input id="zIdcard" name="file" type="file" class="form-control"
					onchange="previewImage(this)">
			</div>
			<br>

			<div class="input-group">
				<span class="input-group-addon">身份证图片(反)</span>
				<div class="zfphoto">
					<div class="preview">
						<img class="imghead" width=100 height=100 border=0
							src='<%=request.getContextPath()%>/images/defaul.jpg' />
					</div>
				</div>
				<input id="fIdcard" name="file" type="file" class="form-control"
					onchange="previewImage(this)">
			</div>
			<br>
			<div class="input-group">
				<span class="input-group-addon">个人照片</span>
				<div class="zfphoto">
					<div class="preview">
						<img class="imghead" width=100 height=100 border=0
							src='<%=request.getContextPath()%>/images/defaul.jpg' />
					</div>
				</div>
				<input id="photo" name="file" type="file" class="form-control"
					onchange="previewImage(this)">
			</div>
			<br>

			<div style="margin-left: 40%">
				<button type="submit" class="btn btn-primary ">
					&nbsp;&nbsp;&nbsp;&nbsp;提 &nbsp;&nbsp;交&nbsp;&nbsp;&nbsp;&nbsp;</button>
			</div>
		</form>

	</div>


	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="/stucy/helpframe/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="/stucy/helpframe/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<!-- js -->
	<script type="text/javascript" src="/stucy/js/addPersoninfo.js"></script>
</body>
</html>