<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<title> 고정바 만들기 </title>
<script></script>
<style>
*{
	margin:0;
	padding:0;
}
h1,p{
	width:300px;
}
.ellipsis{
	white-space:nowrap;
	overflow:hidden;
	text-overflow:ellipsis;
}
</style>
</head>
<body>
<h3> ellipsis의 속성을 이용해 문자가 숨겨집니다.</h3>
<h1 class="ellipsis"> 첫번째 내용이 ellipsis 속성으로 인해 숨겨집니다. </h1>
<p class="ellipsis"> 두번째 내용이 ellipsis 속성으로 인해 숨겨집니다. </p>
</body>
</html>