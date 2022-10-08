<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> request 예제2  </title>
</head>
<body>

<% request.setCharacterEncoding("euc-kr"); %>
<!-- 한글처리 하기 위해서 사용해준것 써줘야 한글 재대로 출력됨   -->

<%
	String studentNum = request.getParameter("studentNum");
	String[] majors = request.getParameterValues("major");
	/* 여러개의 정보를 배열 형태로 가져오기 때문에 배열로 받아야하고 파라미터도 여러개여서 valuse 붙여줌*/
%>

<h2> 학생 정보 입력 결과 </h2>
 학번 : <%= studentNum %><p>
 전공 : <%
 			if(majors == null){
 				out.println("전공없음");
 			}
 			else{
 				for(String obj : majors){
 					out.println(obj + "");
 				}
 			}
 		%>
<h2> 요청 정보 </h2>
요청 방식 : <%= request.getMethod() %><p>
요청 URL : <%= request.getRequestURL() %><p>
요청 URI : <%= request.getRequestURI() %><p>
클라이언트 주소 : <%= request.getRemoteAddr() %><p>
클라이언트 호스트 : <%= request.getRemoteHost() %><p>
프로토콜 방식 : <%= request.getProtocol() %><p>
서버 이름 : <%= request.getServerName() %><p>
서버포트 번호 : <%= request.getServerPort() %><p>
 

</body>
</html>