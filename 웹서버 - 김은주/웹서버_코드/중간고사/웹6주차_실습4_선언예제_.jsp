<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
<title>JSP 예제 declaration.jsp </title>
</head>
<body>
<h3>선언은 ! 를 붙여주며, 변수와 메소드를 생성할 경우 사용한다. </h3>
<h3>"스크립트릿" 에서 선언되는 변수는 지역변수이고, "선언"에서 선언되는 변수는 전역변수로 인식된다. </h3>
<h3> 따라서 "선언" 은 자바문법을 사용하기 때문에 ;를 꼭 써줘야 한다. </h3>
<hr>
	<%! double radius = 4.8; %>
	<%!
		public double getArea(double r){
			return r * r * 3.14;
		}
	%>
	반지름이 <%= radius %> 인 원의 면적은 <%= getArea(radius) %>이다.

</body>
</html>
