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
	String user_id = (String) session.getAttribute("userID");/* ������ session�� ����Ǿ��ִ� userID ������ ���� �����´�. */
	String user_pw = (String) session.getAttribute("userPW");
	
	out.println("������ ������ �Ӽ� ��[1] : " + user_id + "<br>");
	out.println("������ ������ �Ӽ� ��[2] : " + user_pw + "<br>");
	
%>

</body>
</html>