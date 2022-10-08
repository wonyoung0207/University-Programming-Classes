<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> 외부파일 읽어오기  </title>
</head>
<body>

<% request.setCharacterEncoding("euc-kr"); %>
<!-- 한글처리 하기 위해서 사용해준것 써줘야 한글 재대로 출력됨   -->
<h2> paggContext 의 include 예제</h2>
<% pageContext.getOut().println("include.html 을 추가 "); %>
<hr>
<% pageContext.include("웹7주차_이론12_pageContext_include.html"); %>

</body>
</html>