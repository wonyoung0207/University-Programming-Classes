<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> application ����  </title>
</head>
<body>

<% request.setCharacterEncoding("euc-kr"); %>
<!-- �ѱ�ó�� �ϱ� ���ؼ� ������ذ� ����� �ѱ� ���� ��µ�   -->

<%! int count = 0; %>
<h2> �� ���� ���α׷�()���� ��ȸ �� ���� </h2>

<%
	String scount = (String) application.getAttribute("count");
/* �� ������ ������ �̸��� �Ӽ� count�� ����  */
/* count�� ���������� ����Ǿ� �־� ���ε� �Ҷ����� 1�� ����  */
	
	if(scount != null){
		count = Integer.parseInt(scount);//������ ���������� ������ִ� count�� count�� ���� 
	}else{
		count = 0;
	}
	/* ������ count��� �̸����� ��ü�� ����  */
	application.setAttribute("count",Integer.toString(++count));/* count ��ü�� ���� ������Ų count�� ����  */
	application.log("������� ��ȸ �� : " + count);
	

%>
<hr>
���� �����̳� ���� : <%= application.getServerInfo() %> <p>
������� ��ȸ �� : <%= count %>  


</body>
</html>