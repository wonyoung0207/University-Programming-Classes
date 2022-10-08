<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
<title>JSP 예제 declaration.jsp </title>
</head>
<body>
<h3> 지역변수와 전역변수의 개념을 알아간다. </h3>
<h3> 여기서 중요한것은 변수 선언의 순서이다. 스크립트 언어는 위치와 상관없이 객체를 해석한다.
 따라서 a의 선언을 증감식보다 밑에 써줬지만 잘 돌아간다.</h3>
<h3> 리로드 눌러보면 전역변수인 a의 값만 증가하는 것을 볼수 있다. </h3>
 
<hr>
	<% int i = 0; %>
	[지역변수,스크립트릿] i = <%= ++i %>
	<!-- 지역변수는 프로그램이 실행되면 메모리를 할당받고 괄호'}'가 끝나면 메인메모리주소를 반납한다.가비지가 된다.  -->
	<p>
	[전역변수,선언] a = <%= ++a %>
	<!-- 전역변수는 프로그램이 종료될때까지 메인메모리상에서 주소를 가진다. -->
	<%! int a=0; %>
	
</body>
</html>
