<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> application 예제  </title>
</head>
<body>

<% request.setCharacterEncoding("euc-kr"); %>
<!-- 한글처리 하기 위해서 사용해준것 써줘야 한글 재대로 출력됨   -->

<%! int count = 0; %>
<h2> 웹 응용 프로그램()에서 조회 수 관리 </h2>

<%
	String scount = (String) application.getAttribute("count");
/* 웹 응용의 지정된 이름의 속성 count를 설정  */
/* count가 전역변수로 선언되어 있어 리로드 할때마다 1씩 증가  */
	
	if(scount != null){
		count = Integer.parseInt(scount);//이전의 전역변수에 저장되있던 count를 count에 저장 
	}else{
		count = 0;
	}
	/* 지정된 count라는 이름으로 객체를 저장  */
	application.setAttribute("count",Integer.toString(++count));/* count 객체에 값을 증가시킨 count를 저장  */
	application.log("현재까지 조회 수 : " + count);
	

%>
<hr>
서버 컨테이너 정보 : <%= application.getServerInfo() %> <p>
현재까지 조회 수 : <%= count %>  


</body>
</html>