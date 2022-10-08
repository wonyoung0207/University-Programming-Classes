<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> 정보출력  </title>
</head>
<body>

<% request.setCharacterEncoding("euc-kr"); %>
<!-- 한글처리 하기 위해서 사용해준것 써줘야 한글 재대로 출력됨   -->

<%
	String name = request.getParameter("name");
	String stuNum = request.getParameter("stuNum");
	String sex = request.getParameter("sex");
	String country = request.getParameter("country");
	
	if(sex.equalsIgnoreCase("men")){//equalsIgnoreCase = 대소문자 구분하지 않고 비교 
		sex = "남자";
	}else{
		sex = "여자";	
	}
%>

<table>
	<tr><th><h3>학생정보 입력</h3> </th></tr>
	<tr><td>이름 : <%=name %></td></tr>
	<tr><td>학번 : <%= stuNum %></td></tr>
	<tr><td>성별 : <%= sex %></td></tr>
	<tr><td>국적 : <%=country %></td></tr>
</table>

</body>