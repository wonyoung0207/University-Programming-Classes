<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>DOM Basic</title>
    <script>
        window.onload = function () {
            // 변수 선언
            var output = '';
            
            for(var i=0; i < 10; i++){
            	output += 'Header - ' + i + '<br>';
            }
            
           document.body.innerHTML = output;

        };
    </script>
</head>
<body>
    
</body>
</html>

