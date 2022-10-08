<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
<title>JSP 예제 expression.jsp </title>
</head>
<body>

	<% int i = 24; %>
	<% 
		out.println("하루는 " + i + " 시간이며, <br>");
		out.println("하루는 " + i*60 + " 분 입니다. ");
	%>
	

</body>
</html>
