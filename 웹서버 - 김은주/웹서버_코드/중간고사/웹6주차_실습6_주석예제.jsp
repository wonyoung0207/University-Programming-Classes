<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
<title> 주석예제 입니다. </title>
</head>
<body>
<h3> 주석으로 작성되어도 html주석을 이용하면 JSP 태그를 이용해 소스코드에서 보이게 할 수 있다.  </h3>
<h2> html의 주석은 소스보기에서 볼 수 있다. </h2>
<h2>HTML : <!--  --> , JSP : <%-- --%> </h2>
<hr>
<!-- 이것은 HTML 주석으로 웹 브라우저의 [소스보기]에서 보입니다.-->
	<%-- 이것은 자바코드의 스크립트릿입니다. [소스보기]에서 안보입니다. --%>
	<%
		String str;
		if(java.util.Calendar.getInstance().get(java.util.Calendar.HOUR_OF_DAY) >= 12)
			str = "오후";
		else
			str = "오전";
	%>
	<!-- 지금은 <%= str %> 입니다. -->
	지금 시각은 <%= new java.util.Date() %> 입니다.
</body>
</html>
