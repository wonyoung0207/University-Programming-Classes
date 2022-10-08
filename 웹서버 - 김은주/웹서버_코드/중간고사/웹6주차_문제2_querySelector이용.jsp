<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>DOM Basic</title>
    <script>
      window.onload = function () {
           var header = document.querySelector('h1');

            header.style.color = 'orange';
            header.style.background = 'red';
            header.innerHTML = 'From JavaScript';
       };
    </script>
</head>
<body>
    <h1>Header</h1>
    <h1>Header</h1>
    <h1>Header</h1>
</body>
</html>

