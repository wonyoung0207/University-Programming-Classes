<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html, charset=UTF-8">
<title> request 예제2  </title>
</head>
<body>

<!-- Enumeration(열거형) 라이브러리 불러옴  -->
<!-- getParameterNames 사용하려면 이거 있어야함.  -->
<%@ page import="java.util.Enumeration" %>
<% request.setCharacterEncoding("euc-kr"); %>
<!-- 한글처리 하기 위해서 사용해준것 써줘야 한글 재대로 출력됨   -->


<h2> 취미와 가보고 싶은 국가 결과 </h2>
<%
	Enumeration e = request.getParameterNames();
	/* 폼에서 입력받은 정보들의 name들을 열거형식으로 e 에 저장  */
	
	while(e.hasMoreElements()){//총 2번 돔 -> hobby 와 country
		//hasMoreElements는 Enumeration 의 메서드로, 현재 커서가 가리키는 다음 위치에 요소가 있으면 true 반환한다. 
		String name = (String)e.nextElement();
		String [] data = request.getParameterValues(name);//hobby 이름으로 저장된 배열 파라미터들을 저장
		if(data != null){
			for(String obj : data){
				out.println(obj + "");
			}
		}
		out.println("<p>");
		
	}

%>

</body>
</html>