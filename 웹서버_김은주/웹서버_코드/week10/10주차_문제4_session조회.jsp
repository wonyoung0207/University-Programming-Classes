<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>session </title>
</head>
<body>
<%@ page import="java.util.Enumeration, java.util.Date" %>
<h1> ���� ����</h1>
<hr><h2> ���� �ֿ� ���� ��ȸ</h2>
���� ID (������ �ĺ���) : <%= session.getId() %> <br><!-- �⺻���� �����Ǿ��ִ� ���� ���̵� ���  -->
���� MaxInactiveInterval (�⺻ ���� ���� �ð�) : <%= session.getMaxInactiveInterval() %><!-- �⺻ �����ð��� 30���� -->

<%
	long mseconds = session.getCreationTime();/* ����ð��� mseconds�� ���� */
	Date time = new Date(mseconds);
	
%>
���� CreationTime(1970�� 1�� 1�� 0�� ������ ���� �и�������): <%= mseconds %><br>
���� CreationTime( �ð����� �ٽ� ���) : <%= time.toLocaleString() %>

</body>
</html>