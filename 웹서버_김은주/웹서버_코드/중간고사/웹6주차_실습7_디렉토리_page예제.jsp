<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
<title> import예제 입니다. </title>
</head>
<body>
<h3> JSP 디렉티브 태그 중 page에 있는 import 예제 입니다. </h3>
<h4> page 디렉티브는 지시자 태그라고도 부르며 JSP 페이지에 대한 여러 속성과 값을 지정할 경우 사용 </h4>
<h2> page 지시자의 import 속성</h2>
<hr>
<%@ page import="java.util.Date" %>
현재시각 : <%= new Date().toLocaleString() %>
</body>
</html>
