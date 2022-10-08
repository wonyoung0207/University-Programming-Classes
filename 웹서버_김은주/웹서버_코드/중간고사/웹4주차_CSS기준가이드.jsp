<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<title>중앙 블록 설정 </title>
<style>
body{
	margin : 0;
}
div{
	padding : 0;
	font-family : "맑은 고딕";
	color : yellow;
}
#total{
	margin:0 auto;
	/* margin:0; */
	width:800px;
}
#header{
	padding:10px;/* padding 0으로 통일해도 되지만, 글씨의 위치를 안쪽에 출력하기 위해서 10px지정  */
	height:40px;
	background-color:gray;
}

#left{
	float:left;
	padding:10px;
	width:100px;
	height:100px;
	background-color:red;
}
#right{
	float:left;
	padding:10px;
	width:100px;
	height:100px;
	background-color:green;
}
#read{
	float:left;
	padding:10px;
	width:540px;
	height:100px;
	background-color:blue;
}
#footer{
	clear:both;/* clear는 float의 취소를 의미,줄바꿈한다고 생각 , clear:left 는 float:left를 취소한다는 의미임 , 글자가 float 적용된것의 아래로 내려감  */
	padding:10px;
	height:40px;
	background-color:pink;
}

</style>
</head>
<body>
<div id = "total">
	<div id="header"> header </div>
	<div id="contents">
		<div id="left">left</div>
		<div id="read">read</div>
		<div id="right">right</div>
	</div>
	<div id="footer">footer</div>
</div>

</body>
</html>