<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr" %>

<%
	request.setCharacterEncoding("euc-kr");
	
	String nid = request.getParameter("id");
	out.println("���۵� ���̵� : " + nid + "<br>");
%>
<!-- �׼��±״� ��ũ��Ʈ�±� �ٱ����� ����ؾ� �Ѵ�.  -->
	<jsp:include page="9����_����2_include_include.jsp" flush="false"/>
	<!-- ������ flush�� ���༭ ���۸� ����� �ʾ� include�� jsp ���������� ������ ������ ��� �� �� �ִ�.  -->
<%

String name = request.getParameter("name");
out.println("���۵� �̸� : " + name + "<br>");

%>

