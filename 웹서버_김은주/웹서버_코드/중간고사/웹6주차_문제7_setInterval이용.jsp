<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>	
<head>
<title>Clock</title>
<script>
   window.onload = function () {
          var clock = document.getElementById('clock');
           setInterval(function () {
                        var now = new Date();
                       clock.innerHTML = now.toString();
            }, 1000);
   };
</script>
</head>
<body>
	<h1 id="clock"></h1>
</body>
</html>
