package 알고리즘_1week;

public class A10_Rectangle implements A10_Shape{
	private int x,y;
	double area;
	
	A10_Rectangle(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	public void getArea() {
		this.area = this.x * this.y;
	}
	

}
