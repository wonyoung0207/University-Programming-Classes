<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> buffer 를 flush 해주는 예제  </title>
</head>
<body>

<% request.setCharacterEncoding("euc-kr"); %>
<!-- 한글처리 하기 위해서 사용해준것 써줘야 한글 재대로 출력됨   -->

<%@ page autoFlush="false" buffer="1kb" %>
<h3> 현재 autoFlush = <%= out.isAutoFlush() %> </h3>
<%
	for(int i= 1; i<25; i++){
		out.println("남은 출력 버퍼 크기" + out.getRemaining() + "<br>");
		if(out.getRemaining() < 50){
			out.println("<br>");
			out.flush();
		}
	}

%>
<hr>
초기 출력 버퍼 크기 : <%= out.getBufferSize() %> byte <p>
남은 출력 버퍼 크기: <%= out.getRemaining() %> byte <p>


</body>
</html>