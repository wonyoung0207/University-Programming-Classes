<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
<title> 에러페이지의 에러 처리부분 입니다. </title>
</head>
<body>
<h3> 에러가 발생하면 이 jsp 파일을 호출해서 에러를 처리합니다  </h3>
<hr>
	<%@ page isErrorPage="true" %>
	<h2> 처리 중 문제 발생</h2>
	빠른 시일 내에 복구하도록 하겠습니다. <p>
	<!-- exception 은 기본적으로 가지고있는 패키지이다. -->
	exception.getMessage() : <%= exception.getMessage() %> <p>
	exception.toString() : <%= exception.toString() %>
</body>
</html>
