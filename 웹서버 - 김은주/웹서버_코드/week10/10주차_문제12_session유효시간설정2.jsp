<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>session </title>
</head>
<body>
<h3> 현재 세션에 얼마나 있었는지 계산하는 예제 </h3>
<%
	String session_id = session.getId();
	long last_time = session.getLastAccessedTime();
	long start_time = session.getCreationTime();
	long used_time = (last_time - start_time) / 60000;
	
	out.println("세션 아이디 : " + session_id + "<br>");
	out.println("요청 시작 시간 : " + start_time + "<br>");
	out.println("요청 마지막 시간 : " + last_time + "<br>");
	out.println("웹 사이트에서 경과 시간  : " + used_time + "<br>");
	
%>

</body>
</html>