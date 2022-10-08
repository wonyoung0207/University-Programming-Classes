package 알고리즘_1week;

public class A10_AreaCalc {

	public static void main(String[] args) {
		A10_Triangle t = new A10_Triangle(30,15);
		t.getArea();
		System.out.println("삼각형의 넓이 : " + t.area);
		
		A10_Rectangle r = new A10_Rectangle(30,15);
		r.getArea();
		System.out.println("사각형의 넓이 : " + r.area);
	}

}
