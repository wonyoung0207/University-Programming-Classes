package 자바2_5week;

public class 자바2_5주차_응용학습7번_Shape implements 자바2_5주차_응용학습7번_IDrawable {
	public void draw() {//형태에 public 붙여줘야함. 인터페이스의 메소드를 구현한거기 때문에 
		//인터페이스는 일반적으로 공유를 목적으로 하기 때문에 public 으로 설정된다. 
		System.out.println("Shape Draw");
	}
}
