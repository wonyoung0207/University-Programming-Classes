<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> page ��ü  </title>
</head>
<body>

<% request.setCharacterEncoding("euc-kr"); %>
<!-- �ѱ�ó�� �ϱ� ���ؼ� ������ذ� ����� �ѱ� ���� ��µ�   -->

<%@ page info="���尴ü . page �ڱ��ڽ��� ��ü��this�� ǥ������ " %>
<%= this.getServletInfo() %><p>
<%= ((org.apache.jasper.runtime.HttpJspBase) (page)).getServletInfo() %>

</body>
</html>