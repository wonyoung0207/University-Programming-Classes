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
session.setAttribute("userID", "admin");/* ������ ���ǰ����ϴ� ���� userID ������ �� user_id �� �����Ѵ� */
session.setAttribute("userPW", "1234");
%>

<p> <h4>-------------- ������ �����ϱ� �� --------------</h4>
<%
/* �̰� �������� ���� ���� ��Ϻ��� �س��� �� */
	String user_id = (String) session.getAttribute("userID");
	String user_pw = (String) session.getAttribute("userPW");
	
	out.println("������ ���� �̸� userID : " + user_id + "<br>");
	out.println("������ ���� �� userPW : " + user_pw + "<br>");
	
	if(request.isRequestedSessionIdValid() == true){/* ������ ��ȿ���� ������ �½�Ʈ */
		out.println("������ ��ȿ�մϴ�.");
	}
	else{
		out.println("������ ��ȿ���� �ʽ��ϴ�.");
	}
	
	session.invalidate();/* ��� ������ ������Ŵ  */
%>

<p> <h4>-------------- ������ ������ �� --------------</h4>
<%
	if(request.isRequestedSessionIdValid() == true){
		out.println("������ ��ȿ�մϴ�.");
	}
	else{
		out.println("������ ��ȿ���� �ʽ��ϴ�.");
	}
%>

</body>
</html>