<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> �ܺ����� �о����  </title>
</head>
<body>

<% request.setCharacterEncoding("euc-kr"); %>
<!-- �ѱ�ó�� �ϱ� ���ؼ� ������ذ� ����� �ѱ� ���� ��µ�   -->
<h2> paggContext �� include ����</h2>
<% pageContext.getOut().println("include.html �� �߰� "); %>
<hr>
<% pageContext.include("��7����_�̷�12_pageContext_include.html"); %>

</body>
</html>