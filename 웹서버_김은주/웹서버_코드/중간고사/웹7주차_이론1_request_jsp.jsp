<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=EUC-KR">
<title> request JSP 파일 </title>
</head>
<body>
<% request.setCharacterEncoding("euc-kr"); %>
<!-- 한글처리 하기 위해서 사용해준것  -->

<!-- 폼에서 입력한 데이터가 임시버퍼에 저장되어있는데, 그것을 request를 이용해 데이터를 가져온다.  -->
<!-- name이라는 이름을 가진 태그의 파라미터(입력된 정보) 를 가져와서 name에 저장  -->
<%
	String name = request.getParameter("name");
	String studentNum = request.getParameter("studentNum");
	String sex= request.getParameter("sex");
	String country = request.getParameter("country");
	
	if(sex.equalsIgnoreCase("men")){
		sex = "남자";
	}else{
		sex = "여자";	
	}
%>

<h2> 학생 정보 입력 결과 </h2>
성명 : <%= name %><p>
학번 : <%= studentNum %><p>
성별 : <%= sex %><p>
국적 : <%= country %><p>

</body>
</html>