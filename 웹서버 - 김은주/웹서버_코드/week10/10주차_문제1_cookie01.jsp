<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>Cookie </title>
</head>
<body>
<% request.setCharacterEncoding("euc-kr"); %>
<%
	String user_id = request.getParameter("id");
	String user_pw = request.getParameter("passwd");
	
  	if(user_id.equals("admin") && user_pw.equals("1234")){
		Cookie cookie_id = new Cookie("userID", user_id);
		Cookie cookie_pw = new Cookie("userPW", user_pw);
		
		response.addCookie(cookie_id);/* main의 클라이언트에게 쿠키를 전달  */
		response.addCookie(cookie_pw);
		out.println("쿠키 생성이 성공했습니다. <br>");
		out.println(user_id +"님 환영합니다.");
		
	}else{
		out.println("쿠키 생성이 실패했습니다. ");
	}


%>


</body>
</html>