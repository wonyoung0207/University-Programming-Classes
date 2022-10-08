<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> out 예제  </title>
</head>
<body>

<% request.setCharacterEncoding("euc-kr"); %>
<!-- 한글처리 하기 위해서 사용해준것 써줘야 한글 재대로 출력됨   -->

<%
	out.println("이 부분은 출력되지 않습니다 ");
	out.clear();/* clear가 버퍼의 내용을 지우기 때문에 출력 삭제됨  */
%>

<h3> 현재 페이지의 출력 버퍼 상태 </h3>
초기 출력 버퍼 크기 : <%= out.getBufferSize() %> byte <p>
남은 출력 버퍼 크기: <%= out.getRemaining() %> byte <p>
autoFlush : <%= out.isAutoFlush() %>


</body>
</html>