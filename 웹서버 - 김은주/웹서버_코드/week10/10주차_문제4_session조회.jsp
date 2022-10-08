<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>session </title>
</head>
<body>
<%@ page import="java.util.Enumeration, java.util.Date" %>
<h1> 세션 예제</h1>
<hr><h2> 세션 주요 정보 조회</h2>
세션 ID (유일한 식별자) : <%= session.getId() %> <br><!-- 기본으로 설정되어있는 세션 아이디 출력  -->
세션 MaxInactiveInterval (기본 세션 유지 시간) : <%= session.getMaxInactiveInterval() %><!-- 기본 유지시간은 30분임 -->

<%
	long mseconds = session.getCreationTime();/* 현재시간을 mseconds에 저장 */
	Date time = new Date(mseconds);
	
%>
세션 CreationTime(1970년 1월 1일 0시 이후의 지난 밀리세컨드): <%= mseconds %><br>
세션 CreationTime( 시각으로 다시 계산) : <%= time.toLocaleString() %>

</body>
</html>