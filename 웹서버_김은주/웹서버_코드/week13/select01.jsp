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
	<% request.setCharacterEncoding("utf-8"); %>
	<table width="300" border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
		</tr>
		<%
			ResultSet rs = null;
			Statement stmt = null;
			
			try{
				String sql = "select * from member";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);/* 모든 레코드를 테이블 형식으로 가져와서 저장 */
				
				while(rs.next()){/* while문이 rs에 저장된 레코드 갯수만큼 반복한다.  */
					/* Result클래스에 있는 next 메소드 이용해서 하나의 행씩 데이터를 가져온다.  */
					String id = rs.getString("id");
					String pw = rs.getString("passwd");
					String name = rs.getString("name");
		%>
		<tr>
			<td><%= id %></td>
			<td><%= pw %></td>
			<td><%= name %></td>
		</tr>
		<%
				}
			}catch(SQLException e){
				out.println("Meber 테이블 호출이 실패했습니다. <br>");
				out.println("SQLException : " + e.getMessage());
			}finally{
				if(rs != null){
					rs.close();
				}
				if(stmt != null){
					stmt.close();
				}
				if(conn != null){
					conn.close();
				}
			}
		
		%>

	</table>


</body>
</html>