<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>session </title>
</head>
<body>
<%
	String user_id = request.getParameter("id");
	String user_pw = request.getParameter("passwd");
	
	if(user_id.equals("admin") && user_pw.equals("1234")){
		session.setAttribute("userID", user_id);/* 서버의 세션관리하는 곳에 userID 변수와 값 user_id 를 저장한다 */
		session.setAttribute("userPW", user_pw);

		out.println("세션 생성이 성공했습니다. <br>");
		out.println(user_id +"님 환영합니다.");
		
	}else{
		out.println("세션 생성이 실패했습니다. ");
	}
%>

</body>
</html>