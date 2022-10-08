<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*, java.util.ArrayList, java.util.List" %>

<html>
<head>
<meta charset="EUC-KR">
<title>book read </title>
<link href="main.css" type="text/css" rel="stylesheet">
</head>
<body>
<%@ include file="dbconn.jsp" %>
<jsp:include page="header.jsp"></jsp:include>

<div id="container">
<table id="book_info" border="1">
<%
	request.setCharacterEncoding("utf-8");
	
	String book_code = request.getParameter("book_code");
	String book_num = request.getParameter("book_num");
	
	//���� �̿��� ����ڰ� �Է��� ������ ����س��� �ٸ������� ����Ѵ�. 
	session.setAttribute("book_code", book_code);
	session.setAttribute("book_num", book_num);
	
	int num = Integer.parseInt(book_num);
	
	
	PreparedStatement pstmt = null;
	/* PreparedStatement : ���������� ���, �ϳ��� ��ü�� �������� ������ ������ �� ���  */
	/* ����� PreparedStatement, ������ preparseStatement */
	
	try{

		String[] type = new String[num];
		String[] title = new String[num];
		String[] author = new String[num]; 
				
		String rsql = "select * from book_main";
		pstmt = conn.prepareStatement(rsql);
		ResultSet result = pstmt.executeQuery(rsql);
		int i = 0;
		
		//out.println("<tr><th>start : " + book_code + " å�� �� " + num + "�� ��õ�մϴ�." + "</th></tr>");
		
		while(result.next()){
			if(result.getString(2).equals(book_code)){
				type[i] = result.getString(2);
				title[i] = result.getString(3);
				author[i] = result.getString(4);
				i++;
			}
 			if(i >= num){
				break;
			}
		}
		out.print("<tr id='�Ӹ�'><th> å Ÿ�� </th><th> å ���� </th><th> ���� </th><tr>" );
	 	for(i=0; i < num; i++){
	 		out.print("<tr><td>" + type[i] + "</td><td>"
	 	+ title[i] + "</td><td>" + author[i] + "</td><tr>");
	 		
	 	}
		
	}catch(SQLException e){
		out.println("Member ���̺� ������ �����߽��ϴ�. <br>");
		out.println("SQLEXception : " + e.getMessage());
	}finally{
		if(pstmt != null){
			pstmt.close();
		}
		if(conn != null){
			conn.close();
		}
	}
	

%>
</table>

</div>
<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>