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
	String name;
	String value;
	
	Enumeration e = session.getAttributeNames();/* ������ ���ǿ� ����� ��� �������� ���������� ������  */
	int i = 0;
	
	while(e.hasMoreElements()){
		i++;
		name = e.nextElement().toString();
		value = session.getAttribute(name).toString();
		out.println("������ ���� �̸� [" + i + "] : "+ name + "<br>");
		out.println("������ ���� �� [" + i + "] : "+ value + "<br>");
	}
	
	session.removeAttribute("userID");
%>

<p> <h4>-------------- ������ ������ �� --------------</h4>
<%
	e = session.getAttributeNames();
	i=0;
	while(e.hasMoreElements()){
		i++;
		name = e.nextElement().toString();
		value = session.getAttribute(name).toString();
		out.println("������ ���� �̸� [" + i + "] : "+ name + "<br>");
		out.println("������ ���� �� [" + i + "] : "+ value + "<br>");
	}
%>

</body>
</html>