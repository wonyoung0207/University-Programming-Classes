package 자바2_5week;

public class 자바2_5주차_응용학습11번_RectangleTest {

	public static void main(String[] args) {
		자바2_5주차_응용학습11번_Rectangle r = new 자바2_5주차_응용학습11번_Rectangle();
		System.out.println("면적 = " + r.getArea());//아무것도 설정되지 않은 값이 리턴됨 
		
		r.setvalue(10,10);
		System.out.println("면적 = " + r.getArea());
		
		r.draw();

	}

}
