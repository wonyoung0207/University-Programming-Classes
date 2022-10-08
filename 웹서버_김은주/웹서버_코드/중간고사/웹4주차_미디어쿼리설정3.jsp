<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<title>중앙 블록 설정 </title>
<!-- user-scalable : 확대 및 축소 기능 여부 , initial-scale : 초기 확대 비율 -->
<meta name="viewport" content="user-scalable=no,initial-scale=1,maximum-scale=1"/>
<style>
*{
	margin:0;
	padding:0;
}
body{
	width:960px;
	margin: 0 auto;
	overflow:hidden;/* 박스의 내용이 넘치면 잘린다.  */
}
#menu{
	width:260px;
	float:left;/* 유동배치로, 왼쪽에 달라붙게 배치시킴 */
}
#menu li{
	list-style-type : none;
}
#section{
	width:700px;
	float:right;/* left로 해도 상관 없음.  */
}
@media screen and (max-width:767px){/* 스크린이 줄어들면 실행  */
	body{/* 너비와 배치 설정을 풀어버림   */
		width:auto
	}
	#menu{
		width:auto;
		float:none;
	}
	#section{
		width:auto;
		float:none;
	}
}

</style>
</head>
<body>

<div id="menu">
<ul>
	<li>메뉴 A </li>
	<li>메뉴 B </li>
	<li>메뉴 C </li>
</ul>
</div>

<div id="section">
<h1> 이곳은 바디에 h1 입니다. </h1>
<p> 택스트의 내용들이 들어가는 자리 입니다. 계속 반복됩니다.택스트의 내용들이 들어가는 자리 입니다. 계속 반복됩니다. 
택스트의 내용들이 들어가는 자리 입니다. 계속 반복됩니다. 택스트의 내용들이 들어가는 자리 입니다. 계속 반복됩니다. 
택스트의 내용들이 들어가는 자리 입니다. 계속 반복됩니다. 택스트의 내용들이 들어가는 자리 입니다. 계속 반복됩니다. 
</p> 
</div>

</body>
</html>
