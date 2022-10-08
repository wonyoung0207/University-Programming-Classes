<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
<title>Scripting Tag</title>
</head>
<body>

<%! 
String makeItLower(String s){
		return s.toLowerCase();
	}
	
%>

<%
     out.println(makeItLower("Hello World")+"<br>");  // 문자열 데이터가 모두 소문자로 출력
     out.println("Hello World".toUpperCase());  // 문자열 데이터가 모두 대문자로 출력
%>
</body>
</html>
