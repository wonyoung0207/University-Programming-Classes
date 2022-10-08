<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> page 객체  </title>
</head>
<body>

<% request.setCharacterEncoding("euc-kr"); %>
<!-- 한글처리 하기 위해서 사용해준것 써줘야 한글 재대로 출력됨   -->

<%@ page info="내장객체 . page 자기자신의 객체는this로 표현가능 " %>
<%= this.getServletInfo() %><p>
<%= ((org.apache.jasper.runtime.HttpJspBase) (page)).getServletInfo() %>

</body>
</html>