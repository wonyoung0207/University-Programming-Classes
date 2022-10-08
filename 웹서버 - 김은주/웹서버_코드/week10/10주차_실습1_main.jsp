<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr" %>
<!DOCTYPE html>
<html>	
<head>
<mata charset="EUC-KR">
<title>Clock</title>
</head>
<body>
<form method="post" action="10주차_실습1_액션태그.jsp">
<table>
	<tr><th><h3>학생정보 입력</h3> </th></tr>
	<tr><td>성명 : <input type="text" name="name"></td></tr>
	<tr><td>학번 : <input type="text" name="stuNum"></td></tr>
	<tr><td>성별 : 	남자 <input type="radio" name="sex" value="men">
					여자 <input type="radio" name="sex" value="women"></td></tr>
	<tr><td>국적 : 	<select name="country">
						<option value="대한민국"> 대한민국 </option>
						<option value="일본"> 일본 </option>
						<option value="중국"> 중국 </option>
					</select></td></tr>
	<tr><td><input type="submit" value="보내기"></td></tr>
	
</table>
</form>
</body>
</html>

