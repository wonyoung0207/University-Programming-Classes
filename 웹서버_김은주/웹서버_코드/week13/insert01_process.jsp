<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*" %>
<html>
<head>
<meta charset="EUC-KR">
<title>DataBase SQL</title>
</head>
<body>
	<%@ include file="dbconn.jsp" %>
	<%
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("name");
		
		Statement stmt = null;
		/* Statement : ���������� ���, �ϳ��� ������ ����ϰ� �� �� ���� ��� �Ұ�, 
		�ϳ��� ���� ������ close()�� ��ü ��� ���� �ؾ���  */
		try{
			String sql = "insert into Member(id,passwd,name) values('" + id + "','" + passwd + "','" + name + "')";
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			out.println("Member ���̺� ������ �����߽��ϴ�. ");
		}catch(SQLException e){
			out.println("Member ���̺� ������ �����߽��ϴ�. <br>");
			out.println("SQLEXception : " + e.getMessage());
		}finally{
			if(stmt != null){
				stmt.close();
			}
			if(conn != null){
				conn.close();
			}
		}
	%>

</body>
</html>