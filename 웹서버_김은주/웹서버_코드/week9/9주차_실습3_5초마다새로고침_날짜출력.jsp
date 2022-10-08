<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>	
<head>
<title>Clock</title>
<!-- <script>
   window.onload = function () {
          var clock = document.getElementById('clock');
           setInterval(function () {
                        var now = new Date();
                       clock.innerHTML = now.toString();
            }, 5000);
   };
</script> -->
</head>
<body>
<h3>이 페이지는 5초마다 새로고침 됩니다.</h3> 
<%@ page import="java.util.Date" %>
<%
	response.setIntHeader("Refresh",5);
	out.println(new Date().toLocaleString());
	
%>

</body>
</html>
