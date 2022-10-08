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
		
		PreparedStatement pstmt = null;
		/* PreparedStatement : ���������� ���, �ϳ��� ��ü�� �������� ������ ������ �� ���  */
		/* ����� PreparedStatement, ������ preparseStatement */
		
		try{
			String sql = "insert into Member(id,passwd,name) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			/* preparseStatement : ���� ���� ���� ���(��ü����) */
			pstmt.setString(1,id);
			pstmt.setString(2,passwd);
			pstmt.setString(3,name);
			pstmt.executeUpdate();
			
			out.println("Member ���̺� ������ �����߽��ϴ�. " + "<br>");

			//��� ������ ���� 
			//String dsql = "delete from member";
			//pstmt.executeUpdate(dsql);
			
			String rsql = "select * from member";
			ResultSet result = pstmt.executeQuery(rsql);
			
			while(result.next()){
				String col1 = result.getString(1);
				String col2 = result.getString(2);
				String col3 = result.getString(3);
				out.println("id: "+ col1 + ", passwd: "+ col2 + ", name: " + col3 + "<br>");
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

</body>
</html>