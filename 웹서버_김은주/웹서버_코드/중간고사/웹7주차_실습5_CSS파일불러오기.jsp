<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
</style>
<link href="웹7주차_실습5_CSS파일.css" type="text/css" rel="stylesheet">
</head>
<body>

<nav class="menu">
     <a class="home" href=""> Home </a>
</nav>

<%! 
	String content1="Welcome to Web Shopping Mall";
	String content2="Welcome to Web Market!"; 
%>

<h2> <%= content1 %> </h2>
<h3> <%= content2 %></h3>

<footer class="foot">
<p>&copy; WebMarket</p>
</footer>

</body>
</html>
