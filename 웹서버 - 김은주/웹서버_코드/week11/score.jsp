<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP : 자바빈즈</title>
</head>
<body> 
<h2> 이름과 성적을 JavaBeans ScoreBean 에 저장 </h2><p>
<jsp:useBean id="score" class="javabean.ScoreBean" scope="page"></jsp:useBean>
<!-- id="객체변수 명" class="패키지명.클래스명" 자바빈즈범위 -->
<hr>
<h2> 이름과 성적을 JavaBeans패키지의 ScoreBean 클래스에 저장</h2>
(저장할 이름 설정) 이름 : <%= "홍길동" %><br>
(저장할 성적 설정) 성적 : <%= "78" %><p>

<jsp:setProperty property="name" name="score" value="홍길동"/><br>
<jsp:setProperty property="point" name="score" value="78"/>
<!-- property="클래스의 멤버변수" name="객체변수명" value="값"  -->

<hr>
<h2>JavaBeans ScoreBean 에 저장된 정보를 조회 출력</h2>
이름 : <jsp:getProperty property="name" name="score"/><br>
성적 : <jsp:getProperty property="point" name="score"/>
 

</body>
</html>