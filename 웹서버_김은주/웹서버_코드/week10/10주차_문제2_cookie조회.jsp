<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Cookie </title>
</head>
<body>
<!--  쿠키의 값을 어디로부터 받아오는지 어떻게 아는지. 쿠키 클래스에 저장되서 쿠키클래스로부터 가져옴    -->
<%
	Cookie[] cookies = request.getCookies();
	out.println("현재 설정된 쿠키의 개수 => " + cookies.length + "<br>");
	out.println("==========================<br>");
	for(int i = 0; i<cookies.length; i++){
		out.println("설정된 쿠키의 속성 이름 [ " + i + " ] : " + cookies[i].getName() + "<br>");
		out.println("설정된 쿠키의 속성 값 [ " + i + " ] : " + cookies[i].getValue() + "<br>");
		out.println("-----------------------------------------------<br>");
	}
%>

</body>
</html>