<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<title>부모의 overflow 요소 기능 </title>
<script></script>
<style>
div.container{
	overflow:hidden;/* 이게 있느냐 없느냐에 따라 붙고 안붙고가 차이난다.  */
}
div.item{
	float:left;
	margin: 0 3px;/* 상하 0, 좌우 3px */
	padding:10px;
	border: 1px solid black;
}
</style>
</head>
<body>
<p> 첫번쨰 내용이 들어갑니다. </p>
<div class="container">
	<div class="item">메뉴 - 1</div>
	<div class="item">메뉴 - 2</div>
	<div class="item">메뉴 - 3</div>
	<div class="item">메뉴 - 4</div>
</div>
<p> 두번쨰 내용이 들어갑니다. </p>
</body>
</html>