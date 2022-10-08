<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Tye" content="text/html; charset="EUC-KR">
<title>session </title>
</head>
<body>
<%@ page import="java.util.Enumeration" %>

<%
session.setAttribute("userID", "admin");/* 서버의 세션관리하는 곳에 userID 변수와 값 user_id 를 저장한다 */
session.setAttribute("userPW", "1234");
%>

<p> <h4>-------------- 세션을 삭제하기 전 --------------</h4>
<%
/* 이거 실행전에 먼저 세션 등록부터 해놔야 함 */
	String name;
	String value;
	
	Enumeration e = session.getAttributeNames();/* 서버의 세션에 저장된 모든 변수들을 열거형으로 가져옴  */
	int i = 0;
	
	while(e.hasMoreElements()){
		i++;
		name = e.nextElement().toString();
		value = session.getAttribute(name).toString();
		out.println("설정된 세션 이름 [" + i + "] : "+ name + "<br>");
		out.println("설정된 세션 값 [" + i + "] : "+ value + "<br>");
	}
	
	session.removeAttribute("userID");
%>

<p> <h4>-------------- 세션을 삭제한 후 --------------</h4>
<%
	e = session.getAttributeNames();
	i=0;
	while(e.hasMoreElements()){
		i++;
		name = e.nextElement().toString();
		value = session.getAttribute(name).toString();
		out.println("설정된 세션 이름 [" + i + "] : "+ name + "<br>");
		out.println("설정된 세션 값 [" + i + "] : "+ value + "<br>");
	}
%>

</body>
</html>