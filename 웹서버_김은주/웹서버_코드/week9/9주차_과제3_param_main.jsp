<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr" %>
<%
	request.setCharacterEncoding("euc-kr");
	
	out.println("첫번째 화면 입니다. "+ "<hr>");
%>
<!-- include는 실행 후 메인페이지로 다시 돌아와서 실행되고 종료된다. -->
<!-- 반면 forward는 서브페이지로 넘어가서 거기서 종료된다.현재 페이지의 호출된 밑 부분은 실행되지 않게된다.   -->
<jsp:include page="9주차_과제3_param_sub.jsp" flush="false">
	<jsp:param value="한국" name="ko"/>
	<jsp:param value="미국" name="am"/>
</jsp:include>

<%
	out.println("<hr> 마지막 화면 입니다. " + "<br>");

%>
