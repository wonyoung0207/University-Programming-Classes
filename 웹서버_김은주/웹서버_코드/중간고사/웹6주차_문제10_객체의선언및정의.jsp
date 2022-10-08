<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<script>
   // 객체 선언 및 정의
/*     {} 는 정의를 뜻함 
var person = {}; -> 선언(세미콜론이 있기때문에)과 동시에 정의를 한 것임 
person 안에 eat라는 함수 있음  */

var person ={//객체생성
    name:"홍길동",
    eat:funtion(food){
    	alert(this.name + '이' + food +'을/를 먹습니다. ');
	}
};

    // 메서드 호출
person.eat('라면');

</script>
