package 자바1프로젝트;

public class 자바1_11주차_circle메인 {

	public static void main(String[] args) {
		자바1_11주치_circle circle = new 자바1_11주치_circle(5);
		
		circle.increaseByPercent(10);//10퍼센트만큼 원의 반지름을 키움
		System.out.println(circle);
		System.out.println("원의 넓이 : " + circle.area());
		
		circle.decreaseByPercent(20);
		System.out.println(circle);
		System.out.println("원의 넓이 : " + circle.area());
		

	}

}
