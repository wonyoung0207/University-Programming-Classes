<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Cookie </title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();

	for(int i = 0; i<cookies.length; i++){
		cookies[i].setMaxAge(0);/* 문제2에서 저장됐던 디폴트 뺀것들이 삭제됨  */
		response.addCookie(cookies[i]);
	}
	response.sendRedirect("10주차_문제2_cookie조회.jsp");
%>

</body>
</html>