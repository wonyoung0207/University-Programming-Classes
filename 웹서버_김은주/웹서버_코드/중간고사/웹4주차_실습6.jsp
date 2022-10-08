<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<title> 요소의 중앙 배치</title>
<script></script>
<style>
*{
	margin:0;
	padding:0;
}
body{
	background:lightblue;
	position:relative;
}
#container{
	width: 300px; height:300px;
	position:absolute;
	left:50%; top:50%;
	border: 3px solid black;
	/* 절대배치로 그 요소를 중간(너비와 높이 50%)에 배치하더라도 중앙으로 오지 않음 */
	/* 왜냐하면 50% 50% 하면 왼쪽 상단 모서리를 기준으로 박스가 만들어져서 밑으로,오른쪽으로 더 나오게됨 */
	/* 중앙으로 하기 위해서는 해당 태그의 너비와 높이의 절반(1/2) 부분만큼 margin-left와 margin-top로 옮겨줘야함 */
	margin-left:-150px;
	margin-top:-150px;

}



</style>
</head>
<body>
<div id="container">
	<h1>요소의 중앙 배치 </h1>
</body>
</html>