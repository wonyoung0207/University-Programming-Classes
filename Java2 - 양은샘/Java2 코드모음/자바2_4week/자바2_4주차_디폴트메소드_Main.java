package 자바2_4week;

public class 자바2_4주차_디폴트메소드_Main {

	public static void main(String[] args) {
		자바2_4주차_디폴트메소드_Myinterface myiA = null;
		myiA = new 자바2_4주차_디폴트메소드_MyclassA();
		myiA.method1();
		myiA.method2();
		

		자바2_4주차_디폴트메소드_Myinterface myiB = new 자바2_4주차_디폴트메소드_MyclassB();
		myiB.method1();
		myiB.method2();//오버라이딩되어 다형성에 의해 MyclassB의 method2가 호출된다. 
		
		
		//위에 myiB를 이렇게 써도 됨. myiA의 선언과 myiB의 선언은 동일하고,
		//implements를 했기 때문에 둘다 매칭이 가능하다.
//		myiA = new 자바2_4주차_디폴트메소드_MyclassA();
//		myiA.method1();
//		myiA.methode2();

	}

}
