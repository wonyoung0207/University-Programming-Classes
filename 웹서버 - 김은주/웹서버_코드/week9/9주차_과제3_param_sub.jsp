<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr" %>
<%
	request.setCharacterEncoding("euc-kr");
	
	String ko = request.getParameter("ko");
	String am = request.getParameter("am");
	
	out.println("���۵� ko�� " + ko + " �Դϴ�." + "<br>");
	out.println("���۵� am�� " + am + " �Դϴ�." + "<br>");
	
%>


