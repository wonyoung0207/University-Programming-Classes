<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr" %>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> �������  </title>
</head>
<body>

<%
	request.setCharacterEncoding("euc-kr");
	
	String  name = request.getParameter("name");
	String stuNum = request.getParameter("stuNum");
	String  sex = request.getParameter("sex");
	String country = request.getParameter("country");
	String client = request.getParameter("client");
	
	if(sex.equalsIgnoreCase("men")){
		sex = "����";
	}else{
		sex = "����";	
	}
%>


1) ������ : <%= client %><p>
2) ���� ���� �ð� : 
<%@ page import="java.util.Date" %>
<% 
out.println(new Date().getHours() +":"+ new Date().getMinutes() +":"+ new Date().getSeconds());
%>
<p>

---------------------------------------
<table>
	<tr><th><h3>�л����� �Է�</h3> </th></tr>
	<tr><td>�̸� : <%=name %></td></tr>
	<tr><td>�й� : <%= stuNum %></td></tr>
	<tr><td>���� : <%= sex %></td></tr>
	<tr><td>���� : <%=country %></td></tr>
</table>
---------------------------------------
<p>
</body>