<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
request.setCharacterEncoding("euc-kr");
%>
<jsp:include page="10주차_실습2_request.jsp">
	<jsp:param name="client" value="나관리"/>
</jsp:include>

<%
	out.println("수고하셨습니다. ");
%>
