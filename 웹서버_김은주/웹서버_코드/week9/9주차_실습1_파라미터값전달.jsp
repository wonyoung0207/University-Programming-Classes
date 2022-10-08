<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> request 예제2  </title>
</head>
<body>

<% request.setCharacterEncoding("euc-kr"); %>
<!-- 한글처리 하기 위해서 사용해준것 써줘야 한글 재대로 출력됨   -->

<%
	String id = request.getParameter("ID");
	String pw = request.getParameter("pw");
%>
아이디 : <%= id %><br>
비밀번호 : <%= pw %><br>


</body>
</html>