<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr" %>

<%
	request.setCharacterEncoding("euc-kr");
	
	String nid = request.getParameter("id");
	out.println("전송된 아이디 : " + nid + "<br>");
%>
<!-- 액션태그는 스크립트태그 바깥에서 사용해야 한다.  -->
	<jsp:include page="9주차_과제2_include_include.jsp" flush="false"/>
	<!-- 위에서 flush를 해줘서 버퍼를 비우지 않아 include한 jsp 페이지에서 버퍼의 정보를 사용 할 수 있다.  -->
<%

String name = request.getParameter("name");
out.println("전송된 이름 : " + name + "<br>");

%>

