<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> out ����  </title>
</head>
<body>

<% request.setCharacterEncoding("euc-kr"); %>
<!-- �ѱ�ó�� �ϱ� ���ؼ� ������ذ� ����� �ѱ� ���� ��µ�   -->

<%
	out.println("�� �κ��� ��µ��� �ʽ��ϴ� ");
	out.clear();/* clear�� ������ ������ ����� ������ ��� ������  */
%>

<h3> ���� �������� ��� ���� ���� </h3>
�ʱ� ��� ���� ũ�� : <%= out.getBufferSize() %> byte <p>
���� ��� ���� ũ��: <%= out.getRemaining() %> byte <p>
autoFlush : <%= out.isAutoFlush() %>


</body>
</html>