<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
<title>실습 2</title></head>
<style>
div{
	width : 40%;
	background-color : lightgray;
}
input[type="text"],input[type="submit"]{
	border-radius : 20%;
}

input[type="submit"]{
	width : 100%;
}

</style>
<body>
<div>
<h3>간단한 입력 양식</h3>
<table>
	<tr><th>아이디</th><td><input type="text"> </td></tr>
	<tr><th>비밀번호</th><td><input type="text"> </td></tr>
	<tr><th></th><td><input type="submit" value="제출"> </td></tr>
</table>
</div>
</body>
</html>