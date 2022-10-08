<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr" %>

<%
	request.setCharacterEncoding("euc-kr");
	
	String nid = request.getParameter("id");
	String npw = request.getParameter("pw");
	
	out.println("전송된 아이디 : " + nid + "<br>");
	out.println("전송된 패스워드 : " + npw + "<br>");
	
%>