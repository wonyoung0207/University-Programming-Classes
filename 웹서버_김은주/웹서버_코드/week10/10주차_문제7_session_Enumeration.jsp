<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Tye" content="text/html; charset="EUC-KR">
<title>session </title>
</head>
<body>
<%@ page import="java.util.Enumeration, java.util.Date" %>
<h1> ���� ����</h1>
<hr>
<h2>���� �����</h2>
<%
	session.setAttribute("id", "javajsp");/* ������ ���ǿ� id�� pwd���� ���� �� ���� �����Ѵ�.  */
	session.setAttribute("pwd", "jdktomcat");
%>
<hr><h2>���� ��ȸ</h2>
���� ID : <%= session.getId() %><br><!-- ������ ����Ʈ ���̵� ���  -->
���� CreationTime : <%= new Date(session.getCreationTime()) %><br><!-- ���� ������ ���� ��¥   -->

<%
	Enumeration<String> e = session.getAttributeNames();/* ���ǿ� ����Ǿ��ִ� ��� �������� �����´�. */
	while(e.hasMoreElements()){/* ���� ���Ұ� ������ true ��ȯ  */
		String name = e.nextElement();/* ���� ������ ������ ����� */
		String value = (String) session.getAttribute(name);/* ������ �̿��� ���� ������ */
		out.println("���� name : " + name + ", ");
		out.println("���� value : " + value + "<br>");		
	}
%>
<br>
���� Invalidate : <% session.invalidate(); %><!--  ������ ������ ������ �����.  -->

<%-- ���� remove : <%= session.removeAttribute("id") %><!--  ������ ������ �Ѱ� �����.  --> --%>
  
</body>
</html>