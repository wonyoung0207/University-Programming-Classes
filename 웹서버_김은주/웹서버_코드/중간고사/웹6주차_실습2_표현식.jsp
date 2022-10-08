<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
<title>JSP 예제 expression.jsp </title>
</head>
<body>
<h3> 표현식은 = 을 나타내며, 변수,계산식, 함수호출 결과를 문자열로 출력한다.</h3>
<h3> 따라서 웹 브라우저에서 출력할 부분을 표현하며, 기본데이터 타입과 자바객체 사용이 가능하다. 
또한 문자 마감인 ; 를 사용할 수 없다. </h3>
	<% int year= 365; %>
	<% out.println("1년은 약 몇주일까요? <br>"); %>
	<%= year / 7 %>
	<%= "주 입니다." %>
</body>
</html>
