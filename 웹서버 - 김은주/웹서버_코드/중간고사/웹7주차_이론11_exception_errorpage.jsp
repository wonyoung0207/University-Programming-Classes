<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> 예외처리 페이지   </title>
</head>
<body>

<%@ page isErrorPage="true" %>
<h1> 예외처리 페이지</h1>

오류 문자열 [exception.toString()] : <%= exception.toString() %><p>
오류 메시지 [exception.getMessage()] : <%= exception.getMessage() %>


</body>
</html>