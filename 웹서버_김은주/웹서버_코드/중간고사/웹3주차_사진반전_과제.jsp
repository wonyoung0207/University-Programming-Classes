<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head><title>학교홈페이지 서비스 만들기</title>
<style>
#peple{
	text-align : center;
	font-size: 20px;
	font-weight : bold;
	background-color:lightgray;

}
#peple a:hover{
	color:blue;
	text-decoration : underline;
}

li{
	display : inline-block;
	list-style-type : none;
	text-align : center;
	margin : 0px 70px;
}

#p li:hover{
	background-color:lightblue;

}
a{
	text-decoration : none;
	color:black;
}
a:hover{
	color:white;
}

img{
	width:30px;
	height:30px;
}

#q{
	z-index : 3;
	text-align : center;
	color : white;
	background-color : lightblue; 
	font-size : 30px;
	width : 10%;
	padding-top: 10px;
	position: absolute;
}
</style>
<script>

function over(obj,alt){
	obj.style = "background-color : 'black'";
	obj.src = alt + "-r.png";
	
}

function out(obj,alt){
	obj.src = alt + ".png";	
}


</script>

</head>
<body>
<div id="service">
<span id="q"> QUICK SERVICE</span>
</div>

<div id="peple">
<ul>
<li> <a href="#" > 학생 </a>
<li><span>l</span>
<li> <a href="#"> 교수 </a>
</ul>
</div>
<div id="p">
<ul>
<li><a href="#">
<img alt="1" src="1.png" onmouseover="over(this,alt)" onmouseout="out(this,alt)">
<br>통합정보</a>
<li><a href="#">
<img alt="2" src="2.png" onmouseover="over(this,alt)" onmouseout="out(this,alt)">
<br>전자출결</a>
<li><a href="#">
<img alt="3" src="3.png" onmouseover="over(this,alt)" onmouseout="out(this,alt)">
<br>버스시간</a>
<li><a href="#">
<img alt="4" src="4.png" onmouseover="over(this,alt)" onmouseout="out(this,alt)">
<br>마이크on</a>
</ul>

<br>

<ul>
<li><a href="#">
<img alt="5" src="5.png" onmouseover="over(this,alt)" onmouseout="out(this,alt)">
<br>찾아가기</a>
<li><a href="#">
<img alt="6" src="6.png" onmouseover="over(this,alt)" onmouseout="out(this,alt)">
<br>모바일폰</a>
<li><a href="#">
<img alt="7" src="7.png" onmouseover="over(this,alt)" onmouseout="out(this,alt)">
<br>네트워크</a>
<li><a href="#">
<img alt="8" src="8.png" onmouseover="over(this,alt)" onmouseout="out(this,alt)">
<br>전자문서</a>
</ul>

</div>

</body>

</html>