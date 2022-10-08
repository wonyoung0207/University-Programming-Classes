public class ass10Area {

	public static void main(String[] args) {

		ass10ex1 a = new ass10ex1(30, 15);
		a.getArea();
		System.out.println("삼각형 넓이 " + a.area);

		ass10ex2 b = new ass10ex2(30, 15);
		b.getArea();
		System.out.println("사각형 넓이 " + b.area1);

	}

}
