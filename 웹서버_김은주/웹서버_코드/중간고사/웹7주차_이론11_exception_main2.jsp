<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> buffer overflow 발생시켜서 처리하기 예제  </title>
</head>
<body>


<%@ page autoFlush="false" buffer="1kb" errorPage="웹7주차_이론11_exception_errorpage.jsp" %>

<h3>buffer 에서 overflow가 발생해 예외를 발생시킵니다. </h3>
<%
	for(int i=1; i< 40; i++){
		out.println("남은 출력 버퍼 크기 " + out.getRemaining() + "<br>");
	}

%>
</body>
</html>