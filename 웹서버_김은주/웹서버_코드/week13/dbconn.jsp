<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*"%><!--sql�� ����ϱ� ���� ���̺귯�� ������ -->
<%
	Connection conn = null;
	
	String url = "jdbc:mysql://localhost:3306/JSPBookDB";
	/* ����� jdbc�� diver�� ������ �ּҿ� ��������,�����DB */
	String user = "root";
	String password = "0000";/* mysql ���� �н����� */
	
	Class.forName("com.mysql.jdbc.Driver");
	/* JDBC ����̹� �ε�. �̶� DriverManager ����� �� �ְ� �� */
	conn = DriverManager.getConnection(url,user,password);
	/* �����ͺ��̽� ���� */
	
%>
