<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> buffer �� flush ���ִ� ����  </title>
</head>
<body>

<% request.setCharacterEncoding("euc-kr"); %>
<!-- �ѱ�ó�� �ϱ� ���ؼ� ������ذ� ����� �ѱ� ���� ��µ�   -->

<%@ page autoFlush="false" buffer="1kb" %>
<h3> ���� autoFlush = <%= out.isAutoFlush() %> </h3>
<%
	for(int i= 1; i<25; i++){
		out.println("���� ��� ���� ũ��" + out.getRemaining() + "<br>");
		if(out.getRemaining() < 50){
			out.println("<br>");
			out.flush();
		}
	}

%>
<hr>
�ʱ� ��� ���� ũ�� : <%= out.getBufferSize() %> byte <p>
���� ��� ���� ũ��: <%= out.getRemaining() %> byte <p>


</body>
</html>