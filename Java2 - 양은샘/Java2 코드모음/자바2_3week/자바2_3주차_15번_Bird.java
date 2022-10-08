package 자바2_3week;
//abstract 클래스는 다른 클래스에서 상속받아 사용할 수 있도록 정의만 해놓은 클래스이다. 

public abstract class 자바2_3주차_15번_Bird {
	public abstract void sound();//sound를 정의만 해놓은것이기 때문에 생성 안해줌
	public void method1() {
		System.out.println("bird의 메소드 그냥 호출 ");
	}
}
