<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<title>중앙정렬 레이아웃 예제</title>
<script></script>
<style>
*{
	margin:0;
	padding:0;
}

body{
	width:500px;
	margin:10px auto;
}
#middle{
	overflow:hidden;
}
#left{
	float:left; width:150px; background:red;
}
#right{
	float:right; width:350px; background:blue;
}
#top{
	background:green;
}
#bottom{
	background:purple;
}

</style>
</head>
<body>
<div id="top"> top 에 들어갈 내용 입니다.</div>
<div id="middle">
	<div id="left"> left 에 들어갈 내용 입니다.</div>
	<div id="right"> right 에 들어갈 내용 입니다.</div>
</div>
<div id="bottom">bottom 에 들어갈 내용 입니다.</div>
</body>
</html>