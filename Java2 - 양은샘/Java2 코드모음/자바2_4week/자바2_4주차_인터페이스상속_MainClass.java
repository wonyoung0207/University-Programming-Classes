package 자바2_4week;

public class 자바2_4주차_인터페이스상속_MainClass {

	public static void main(String[] args) {
		자바2_4주차_인터페이스상속_implementClass impl = new 자바2_4주차_인터페이스상속_implementClass();
		
		자바2_4주차_인터페이스상속_interfaceA ia = impl;
		ia.methodA();
		//ia.methodB(); -> 불가능, 
		//인터페이스A는 인터페이스B를 알지 못한다. A와B를 아는것은 이 둘을 상속받은 인터페이스C 만 알수 있다. 
		System.out.println();
		
		자바2_4주차_인터페이스상속_interfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		자바2_4주차_인터페이스상속_interfaceC ic = impl;
		ic.methodC();
		ic.methodA();
		ic.methodB();
		System.out.println();
	}

}
