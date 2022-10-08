<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Tye" content="text/html; charset="EUC-KR">
<title>session </title>
</head>
<body>
<%
session.setAttribute("userID", "admin");/* 서버의 세션관리하는 곳에 userID 변수와 값 user_id 를 저장한다 */
session.setAttribute("userPW", "1234");
%>

<p> <h4>-------------- 세션을 삭제하기 전 --------------</h4>
<%
/* 이거 실행전에 먼저 세션 등록부터 해놔야 함 */
	String user_id = (String) session.getAttribute("userID");/* 서버의 세션 userID 변수에 저장되어있는 값을 가져온다. */
	String user_pw = (String) session.getAttribute("userPW");
	out.println("설정된 세션 이름 userID : " + user_id + "<br>");
	out.println("설정된 세션 값 userPW : " + user_pw + "<br>");
	
	session.removeAttribute("userID");/* 해당 변수의 세션정보만 지움 */
%>

<p> <h4>-------------- 세션을 삭제한 후 --------------</h4>
<%
	user_id = (String) session.getAttribute("userID");
	user_pw = (String) session.getAttribute("userPW");
	out.println("설정된 세션 이름 userID : " + user_id + "<br>");
	out.println("설정된 세션 값 userPW : " + user_pw + "<br>");
%>

</body>
</html>