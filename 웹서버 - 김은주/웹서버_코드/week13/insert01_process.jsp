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
		/* Statement : 정적쿼리에 사용, 하나의 쿼리를 사용하고 난 후 더는 사용 불가, 
		하나의 쿼리 끝내면 close()로 객체 즉시 해제 해야함  */
		try{
			String sql = "insert into Member(id,passwd,name) values('" + id + "','" + passwd + "','" + name + "')";
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			out.println("Member 테이블 삽입이 성공했습니다. ");
		}catch(SQLException e){
			out.println("Member 테이블 삽입이 실패했습니다. <br>");
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