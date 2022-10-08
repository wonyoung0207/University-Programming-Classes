package 자바1프로젝트;

public class 자바1_10주차_Car메인 {

	public static void main(String[] args) {
		자바1_10주차_Car mycar = new 자바1_10주차_Car();
		mycar.changeGear(10);
		mycar.speedup();
		mycar.speedup();
		System.out.println(mycar);//객체만 써주면 자동으로 tostring 메소드가 실행된다. 
		
		mycar.speeddown();
		System.out.println("속도 감소한 mycar-> "+mycar);

	}

}
