package 자바2_4week;

public interface 자바2_4주차_디폴트메소드_Myinterface {
	public void method1();
	
	public default void method2() {
		System.out.println("Myinterface - method2 실행");
	}

}
