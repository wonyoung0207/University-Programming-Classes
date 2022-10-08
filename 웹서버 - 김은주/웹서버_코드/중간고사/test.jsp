<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!-- /*1. 한영출력 관련 질문
//2. var url 관련 에러 질문
//3. 사진 경로 관련 질문
4. 주석관련 질문(//로 안됨)  -->


<html>
<head><title>test</title>
<script>
//var url_img = "C:\Users\82102\Desktop\Wy\2021 수강 과목\3. 웹서버_김은주\3 웹 클라이언트 UI설계3\과제\";
var a = "1";


function over(obj,alt){
	alert(a + obj.src);
}
/* 
function out(obj,alt){
	obj.src = "c:\users\82102\desktop\wy\2021 수강 과목\3. 웹서버_김은주\3 웹 클라이언트 ui설계3\과제\" + alt;
	alert(obj.src);
	
} */
</script>
</head>
<body>
<img alt="1" src="C:\Users\82102\Desktop\Wy\2021 수강 과목\3. 웹서버_김은주\3 웹 클라이언트 UI설계3\과제\1.png" 
onmouseover="over(this,alt)" onmouseout="out(this,alt)">



</body>
</html>