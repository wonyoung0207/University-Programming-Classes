<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<title> login_pro </title>
</head>
<body>
<% request.setCharacterEncoding("euc-kr"); %>
<%
	String user_id = request.getParameter("id");
	String user_pw = request.getParameter("passwd");
	
  	if(user_id.equals("ahn") && user_pw.equals("1234")){
		Cookie cookie_id = new Cookie("userID", user_id);
		Cookie cookie_pw = new Cookie("userPW", user_pw);
		
		response.addCookie(cookie_id);/* main의 클라이언트에게 쿠키를 전달  */
		response.addCookie(cookie_pw);
		out.println("<h1> 로그인에 성공했습니다 </h1>");
		out.println("[" + user_id +"] 님 반갑습니다.");
	
%>
<br>
<a href="my.jsp"><%= user_id %> 님의 로그인 페이지로 이동합니다. </a><br>
<a href="logout.jsp" onclick="javascript:alert('로그아웃 합니다.'); "> 로그아웃 합니다. </a>

<%
	}else{
		out.println("<script> alert('아이디와 패스워드가 다릅니다.');</script>");
		out.println("<script> history.back(); </script>");
	}
%>
<jsp:forward page="login.jsp" />

</body>
</html> 