<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=UTF-8">
<title> post 예제  </title>
</head>
<body>

<% request.setCharacterEncoding("euc-kr"); %>
<!-- 한글처리 하기 위해서 사용해준것 써줘야 한글 재대로 출력됨   -->

<%
	String korname = request.getParameter("korname");
	String engname = request.getParameter("engname");
%>

<h2> 메소드 post 방식에서 한글 처리 </h2>
<hr>
한글 성명 : <%= korname %><p>
영문 성명 : <%= engname %><p>

</body>
</html>