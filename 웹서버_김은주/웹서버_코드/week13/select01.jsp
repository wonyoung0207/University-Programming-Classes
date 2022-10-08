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
			<th>���̵�</th>
			<th>��й�ȣ</th>
			<th>�̸�</th>
		</tr>
		<%
			ResultSet rs = null;
			Statement stmt = null;
			
			try{
				String sql = "select * from member";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);/* ��� ���ڵ带 ���̺� �������� �����ͼ� ���� */
				
				while(rs.next()){/* while���� rs�� ����� ���ڵ� ������ŭ �ݺ��Ѵ�.  */
					/* ResultŬ������ �ִ� next �޼ҵ� �̿��ؼ� �ϳ��� �྿ �����͸� �����´�.  */
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
				out.println("Meber ���̺� ȣ���� �����߽��ϴ�. <br>");
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