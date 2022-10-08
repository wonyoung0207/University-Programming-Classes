<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
<title> 에러페이지의 에러 처리부분 입니다. </title>
</head>
<body>
<h3> 이 jsp는 에러를 발생시킵니다. 에러 발생시 에러를 처리하는 exception jsp를 호출합니다. </h3>
<hr>
	<%@ page errorPage="웹6주차_실습8_exception.jsp" %>
	<% String[] str = {"감사합니다.","Thank you."}; %>
	한국어로 [<%= str[0] %>]는 <br>
	영어로 [<%= str[2] %>]이다.(여기서 에러를 발생시킴)
</body>
</html>
