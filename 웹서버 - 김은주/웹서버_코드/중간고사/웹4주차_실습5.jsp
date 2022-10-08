<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<title>절대 위치를 사용한 요소 배치 (absolute)</title>
<script></script>
<style>
*{
	margin:0;
	padding:0;
}

#container{
	border: 3px solid black;
	width:500px; height:300px;
	overflow:hidden;
	position:relative;
	/* 이거로 인해 안에 원들이 절대배치로 들어가있는것임. 없다면 div를 벗어나 전체 화면을 기준으로 설정됨 */
}
.circle{
	border-radius:50% 50%;
	width:100px; height:100px;
	position:absolute;
}
#red{
	background:red;
	top:20px;left:20px;
}
#green{
	background:green;
	bottom:20px;left:20px;
}
#yellow{
	background:yellow;
	bottom:20px;right:20px;
}
#blue{
	background:blue;
	top:20px;right:20px;
}



</style>
</head>
<body>
<h1>자손의 position 속성에 absolute를 적용하려면 , 부모의 position 속성에 relative 를 적용</h1>
<div id="container">
	<div id="red" class="circle"></div>
	<div id="blue" class="circle"></div>
	<div id="green" class="circle"></div>
	<div id="yellow" class="circle"></div>
</div>
<h1> 빈 공간 입니다. </h1>

</div>
</body>
</html>