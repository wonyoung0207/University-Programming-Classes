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
#container{
	margin-left:50px;
	margin-top:50px;
	
}
#top_bar{
	background:red;
	position:fixed;
	left:0;top:0;right:0;/* 이렇게해야 top 에 붙어있는 div가 상단과 양 옆의 크기가 달라져도 늘어남, bottom 부분은 container이 움직이기때문에 상관 없음  */
	height:50px;
}
#left_bar{
	background:blue;
	position:fixed;
	left:0;top:0;bottom:0;/* 이렇게해야 top 에 붙어있는 div가 상단과 양 옆의 크기가 달라져도 늘어남, bottom 부분은 container이 움직이기때문에 상관 없음  */
	width:50px;
}


</style>
</head>
<body>
<div id="top_bar"> 고정된 바 형태로, 화면의 크기에 따라 늘어났다 줄어들었다 합니다. </div>
<div id="left_bar"></div>
<div id="container">

<p> 내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.
내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다. </p>
<p> 내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.
내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다. </p>
<p> 내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.
내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다. </p>
<p> 내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.
내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다.내용이 출력됩니다. </p>

</div>



</body>
</html>