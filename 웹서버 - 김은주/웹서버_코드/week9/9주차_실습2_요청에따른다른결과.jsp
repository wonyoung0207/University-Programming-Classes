<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> request 예제2  </title>
</head>
<body>

<% request.setCharacterEncoding("euc-kr"); %>
<!-- 한글처리 하기 위해서 사용해준것 써줘야 한글 재대로 출력됨   -->

<%
	String id = request.getParameter("ID");
	String pw = request.getParameter("pw");
	
	if(id.equals("나관리") && pw.equals("1234")){
		out.println(
				"이름 : " + id + "<br>" + 
				"클라이언트 IP : " + request.getRemoteAddr() + "<br>" + 
				"요청 정보 길이 : " + id + "<br>" +
				"요청 정보 전송방식 : " + request.getMethod() + "<br>" +
				"요청 URl : " + request.getRequestURL() + "<br>" +
				"서버 이름 : " + request.getServerName() + "<br>" +
				"서버 포트 : " + request.getServerPort()
				);
	}
	else{
		out.println(id + "님은 관리자가 아닙니다. ");
	}
%>
<%-- 
아이디 : <%= id %><br>
비밀번호 : <%= pw %><br>
요청 방식 : <%= request.getMethod() %><p>
요청 URL : <%= request.getRequestURL() %><p>
요청 URI : <%= request.getRequestURI() %><p>
클라이언트 주소 : <%= request.getRemoteAddr() %><p>
클라이언트 호스트 : <%= request.getRemoteHost() %><p>
프로토콜 방식 : <%= request.getProtocol() %><p>
서버 이름 : <%= request.getServerName() %><p>
서버포트 번호 : <%= request.getServerPort() %><p>
 
 --%>

</body>