package 알고리즘_1week;

public class A10_Triangle implements A10_Shape{
	private int x,y;
	public double area;
	
	
	A10_Triangle(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	public void getArea() {
		this.area = this.x * this.y /2;
	}
	


}
