<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr" %>
<%
	request.setCharacterEncoding("euc-kr");
	
	String ko = request.getParameter("ko");
	String am = request.getParameter("am");
	
	out.println("전송된 ko는 " + ko + " 입니다." + "<br>");
	out.println("전송된 am는 " + am + " 입니다." + "<br>");
	
%>


