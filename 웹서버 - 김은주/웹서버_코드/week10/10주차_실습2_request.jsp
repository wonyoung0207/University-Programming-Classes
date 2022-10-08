<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr" %>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> 정보출력  </title>
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
		sex = "남자";
	}else{
		sex = "여자";	
	}
%>


1) 관리자 : <%= client %><p>
2) 현재 접속 시간 : 
<%@ page import="java.util.Date" %>
<% 
out.println(new Date().getHours() +":"+ new Date().getMinutes() +":"+ new Date().getSeconds());
%>
<p>

---------------------------------------
<table>
	<tr><th><h3>학생정보 입력</h3> </th></tr>
	<tr><td>이름 : <%=name %></td></tr>
	<tr><td>학번 : <%= stuNum %></td></tr>
	<tr><td>성별 : <%= sex %></td></tr>
	<tr><td>국적 : <%=country %></td></tr>
</table>
---------------------------------------
<p>
</body>