<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>DOM Basic</title>
    <script>
        window.onload = function () {
           var output = '';
            for (var i = 0; i < 256; i++) {
                output += '<div></div>';
            }
            document.body.innerHTML = output;
            
            var div = document.querySelectorAll('div');
            
            for(var i = 0; i < div.length; i++){
            	var div_local = div[i];
            	/* 배열을 쓰기보다는 지역변수를 이용한다면 처리 속도가 더 빨라진다.  */
            	div_local.style.height = '2px';
            	div_local.style.background = 'rgb(' + i + ',' + i + ',' + i +')';
            }            
        };
    </script>
</head>
<body>
</body>
</html>

