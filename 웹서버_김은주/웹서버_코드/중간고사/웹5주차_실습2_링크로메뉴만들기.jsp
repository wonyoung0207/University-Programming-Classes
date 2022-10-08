<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
<title>다양한 메뉴의 구성 1</title>
<style>
body{
	margin :0px;
	padding:0px;
}
#bar{
	background-color:lightgray;
	margin : 0px 3px;
	top :0px;
	color:white;
	height:50px;
	width:500px;
	position : relative;
	/* overflow :hidden; */
}
#bar li{
	posision:absolute;
	list-style-type:none;
	display:inline-block;
	padding-left : 40px;
	line-height:50px;
}
#bar li a{
	text-decoration : none;
	color:white;
}
#bar li a:hover{
	color:black;
	font-size:20px;
	
}
</style>
</head>
<body>
<div id="bar">
<ul id="menu">
	<li><a href="#">menu01</a></li>
	<li><a href="#">menu02</a></li>
	<li><a href="#">menu03</a></li>
	<li><a href="#">menu04</a></li>
</ul>
</div>
</body>
</html>
