package 자바2_5week;

public interface 자바2_5주차_응용학습11번_IGraphics {
	public int getArea();//면적을 리턴한다. 
	public default void draw() {
		System.out.println("그립니다. ");
	}
	

}
