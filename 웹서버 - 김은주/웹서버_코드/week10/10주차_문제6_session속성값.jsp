<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>session </title>
</head>
<body>
<%
	String user_id = (String) session.getAttribute("userID");/* 서버의 session에 저장되어있는 userID 변수의 값을 가져온다. */
	String user_pw = (String) session.getAttribute("userPW");
	
	out.println("설정된 세션의 속성 값[1] : " + user_id + "<br>");
	out.println("설정된 세션의 속성 값[2] : " + user_pw + "<br>");
	
%>

</body>
</html>