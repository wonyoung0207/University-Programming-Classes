<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<script>
   
   function callTenTimes(call){//여기서의 callback이름은 매개변수일뿐이다. call로 바꿔도됨 
	   for(var i=0; i<10; i++){
		   call();
	   }
   }
   
/*    function callTenTimes(callback){//여기서의 callback이름은 매개변수일뿐이다. call로 바꿔도됨 
	   for(var i=0; i<10; i++){
		   callback();
	   }
   } */
   
   var callback = function () {
        alert('함수 호출');
    };
    // 함수 호출
    callTenTimes(callback);

</script>
