<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Tye" content="text/html; charset="EUC-KR">
<title>session </title>
</head>
<body>
<%@ page import="java.util.Enumeration, java.util.Date" %>
<h1> 세션 예제</h1>
<hr>
<h2>세션 만들기</h2>
<%
	session.setAttribute("id", "javajsp");/* 서버의 세션에 id와 pwd변수 생성 후 값을 설정한다.  */
	session.setAttribute("pwd", "jdktomcat");
%>
<hr><h2>세션 조회</h2>
세션 ID : <%= session.getId() %><br><!-- 세션의 디폴트 아이디 출력  -->
세션 CreationTime : <%= new Date(session.getCreationTime()) %><br><!-- 현재 세션의 생성 날짜   -->

<%
	Enumeration<String> e = session.getAttributeNames();/* 세션에 저장되어있는 모든 변수들을 가져온다. */
	while(e.hasMoreElements()){/* 남은 원소가 있으면 true 반환  */
		String name = e.nextElement();/* 다음 원소의 변수가 저장됨 */
		String value = (String) session.getAttribute(name);/* 변수를 이용해 값을 가져옴 */
		out.println("세션 name : " + name + ", ");
		out.println("세션 value : " + value + "<br>");		
	}
%>
<br>
세션 Invalidate : <% session.invalidate(); %><!--  세션의 내용을 여러개 지운다.  -->

<%-- 세션 remove : <%= session.removeAttribute("id") %><!--  세션의 내용을 한개 지운다.  --> --%>
  
</body>
</html>