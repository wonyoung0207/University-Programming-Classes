<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> response ����  </title>
</head>
<body>

<% request.setCharacterEncoding("euc-kr"); %>
<!-- �ѱ�ó�� �ϱ� ���ؼ� ������ذ� ����� �ѱ� ���� ��µ�   -->

<%
/* ���̹� �˻����� �ּ� ��� */
	String URL = "http://search.naver.com/search.naver?where=nexearch";
	String keyword = request.getParameter("word");
	URL += "&" + "query=" + keyword;/* �˻�� ������ ����� url�� ���� */
	response.sendRedirect(URL);
%>

</body>
</html>