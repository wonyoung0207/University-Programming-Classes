// 삼각형 넓이 계산
class ass10ex1 implements assignment10 {

	private double x, y;
	double area;

	ass10ex1(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void getArea() {
		this.area = (this.x + this.y) / 2;
	}

}
