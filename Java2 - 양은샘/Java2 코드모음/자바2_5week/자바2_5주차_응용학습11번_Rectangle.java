package 자바2_5week;

public class 자바2_5주차_응용학습11번_Rectangle implements 자바2_5주차_응용학습11번_IGraphics {
	private int length,width;
	
	public 자바2_5주차_응용학습11번_Rectangle() {//디폴트 생성자 
		this.length = 0;
		this.width = 0;
		
	}
	
	public void setvalue(int l,int w) {
		this.length = l;
		this.width = w;
	}
	
	public int getArea() {
		return this.length * this.width;//면적을 리턴 
	}
	
	public void draw() {//디폴트 메소드 재정의 
		System.out.println("사각형을 그립니다. ");
	}

}
