<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
<title>다양한 메뉴의 구성 1</title>
<style>
body{
	padding :0;
	margin : 0;
	
}

#body div{
	margin : 10px;
	padding :5px;	
	border : 1px solid blue;
	width : 200px;
	color : blue;
}
#color:hover{
	background-color:blue;
	color:white;
	transition:background-color 1s, transform 1s;
}

#xoffset:hover{
	margin-left:50px;
}

#border:hover{
	border : 10px solid blue;
}

#boxsize:hover{
	height:200px;
	
}

#boxsize,#xoffset,#border{
	transition:height 2s,border 2s,margin-left 2s transform 1s;
}

</style>
</head>
<body>
<div id="body">
<div id="color">
color change
</div>
<div id="xoffset">
x offset change
</div>
<div id="border">
border change
</div>
<div id="boxsize">
box size change
</div>



</div>




</body>
</html>