package 자바1프로젝트;
//***생성자***
//객체가 생성될 때에 필드에게 초기값을 제공하고 필요한 초기화 절차를 실행하는 메소드
//클래스 이름과 동일한 메소드로, 반환형(int,void...)이 없어야한다. 
//매개변수 가질 수 있다.


public class 자바1_12주차_생성자 {
	int counter;
	int a;
	
	자바1_12주차_생성자(int value){
		counter = value;
		
	}
	
	자바1_12주차_생성자(int value,int num){//오버로딩
		counter = value;
		a = num;
		
	}

}
