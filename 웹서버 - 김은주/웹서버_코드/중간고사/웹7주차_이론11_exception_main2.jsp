<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> buffer overflow �߻����Ѽ� ó���ϱ� ����  </title>
</head>
<body>


<%@ page autoFlush="false" buffer="1kb" errorPage="��7����_�̷�11_exception_errorpage.jsp" %>

<h3>buffer ���� overflow�� �߻��� ���ܸ� �߻���ŵ�ϴ�. </h3>
<%
	for(int i=1; i< 40; i++){
		out.println("���� ��� ���� ũ�� " + out.getRemaining() + "<br>");
	}

%>
</body>
</html>