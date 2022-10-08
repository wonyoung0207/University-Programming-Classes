<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>DOM Basic</title>
    <script>
        // 이벤트 연결
        window.onload = function () {

            // 문서 객체 선택
            var header = document.getElementById('header');

            // 문서 객체 조작
            header.style.color = 'orange';
            header.style.background = 'red';
            header.innerHTML = 'From JavaScript';
        };
    </script>
</head>
<body>
    <h1 id="header">Header</h1>
</body>
</html>
