<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr" %>

<%
	request.setCharacterEncoding("euc-kr");
	
	String nid = request.getParameter("id");
	String npw = request.getParameter("pw");
	
	out.println("���۵� ���̵� : " + nid + "<br>");
	out.println("���۵� �н����� : " + npw + "<br>");
	
%>