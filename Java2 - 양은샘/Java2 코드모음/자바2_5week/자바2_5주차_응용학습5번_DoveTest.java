package 자바2_5week;

public class 자바2_5주차_응용학습5번_DoveTest {

	public static void main(String[] args) {
		자바2_5주차_응용학습5번_ISound d = null;// 인터페이스형으로 선언해야 다형성으로 인해서 접근 가능 
		d = new 자바2_5주차_응용학습5번_Dove();//객체 생성
		
		d.sound();
	}

}
