<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr" %>
<%
	request.setCharacterEncoding("euc-kr");
	
	out.println("ù��° ȭ�� �Դϴ�. "+ "<hr>");
%>
<!-- include�� ���� �� ������������ �ٽ� ���ƿͼ� ����ǰ� ����ȴ�. -->
<!-- �ݸ� forward�� ������������ �Ѿ�� �ű⼭ ����ȴ�.���� �������� ȣ��� �� �κ��� ������� �ʰԵȴ�.   -->
<jsp:include page="9����_����3_param_sub.jsp" flush="false">
	<jsp:param value="�ѱ�" name="ko"/>
	<jsp:param value="�̱�" name="am"/>
</jsp:include>

<%
	out.println("<hr> ������ ȭ�� �Դϴ�. " + "<br>");

%>
