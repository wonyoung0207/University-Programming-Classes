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
	if(sex.equalsIgnoreCase("men")){
		sex = "����";
	}else{
		sex = "����";	
	}
	
%>

<table>
	<tr><th><h3>�л����� �Է�</h3> </th></tr>
	<tr><td>�̸� : <%=name %></td></tr>
	<tr><td>�й� : <%= stuNum %></td></tr>
	<tr><td>���� : <%= sex %></td></tr>
	<tr><td>���� : <%=country %></td></tr>
</table>
</body>