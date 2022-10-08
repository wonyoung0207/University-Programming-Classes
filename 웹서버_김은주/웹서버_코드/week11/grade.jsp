<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP : 자바빈즈</title>
</head>
<body> 
<h2> JavaBeans를 이용한 학생의 점수에 따른 성적 처리 예제 </h2><p>
<jsp:useBean id="score" class="javabean.GradeBean" scope="page"></jsp:useBean>
<!-- 자바빈즈 생성 -> 이 페이지 안에서만 자바빈즈 사용할 수 있다.  -->

<%
	String na = request.getParameter("use_name");
	int po = Integer.parseInt(request.getParameter("use_point"));
%>
이름 : <%= na %><br>
성적 : <%= po %>

<hr>
<h2> 폼에서 전달받은 이름과 성적을 JavaBeans 패키지의 GradeBean 클래스에 저장 </h2>

<jsp:setProperty property="name" name="score" param="use_name"/><br>
<jsp:setProperty property="point" name="score" param="use_point"/><p>
<!-- 여기서의 name과 point는 grade_main으로부터 전달받은 값이 아닌 GradeBean의 멤버변수이다. -->
<!-- param은 전달받은 파라미터의 값을 전달해줄떄 사용한다. value와는 다르게 쓰인다. value는 내가 직접 설정할떄 사용  -->

<h2>JavaBeans 패키지의 GradeBean 클래스에 저장된 정보를 조회 출력</h2>
이름 : <jsp:getProperty property="name" name="score"/><br>
점수 : <jsp:getProperty property="point" name="score"/><br>
등급 : <jsp:getProperty property="grade" name="score"/>
<!-- getProperty 로 인해 getgrade가 있어야 한다.   -->
<!-- 멤버변수 grade값을 가져오기 위해 getGrade() 가 실행된다. -->
<!-- 자바빈즈의 변수인 grade 값을 가져온다.  -->

</body>
</html>