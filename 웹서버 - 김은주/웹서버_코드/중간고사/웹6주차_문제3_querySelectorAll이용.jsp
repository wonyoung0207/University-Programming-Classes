<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>DOM Basic</title>
    <script>
      window.onload = function () {
           var header = document.querySelectorAll('h1');
           
           for(var i=0; i<header.length;i++){
        	   header[i].style.color = 'orange';
               header[i].style.background = 'red';
               header[i].innerHTML = 'From JavaScript';
           }
       };
    </script>
</head>
<body>
    <h1>Header</h1>
    <h1>Header</h1>
    <h1>Header</h1>
</body>
</html>

