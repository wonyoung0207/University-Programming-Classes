<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Traditional Event</title>
</head>
<body>
    <button id="button">버튼 - </button>
    <script>
        document.getElementById('button').onclick = function () {
        	/* this.textContent = this.textContent + '★'; */
        	bnt = document.getElementById("button");
        	bnt.textContent += '★';

        };
    </script>
</body>
</html>
