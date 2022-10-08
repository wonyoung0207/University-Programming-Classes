package 자바1프로젝트;

public class 자바1_12주차_생성자클래스 {

	public static void main(String[] args) {
		자바1_12주차_생성자 a = new 자바1_12주차_생성자(100);//선언시 매겨변수 했기 때문에, 매개변수값이 꼭 들어가야함
		자바1_12주차_생성자 b = new 자바1_12주차_생성자(200,300);
		
		System.out.println("객체 a의  counter = " + a.counter);
		System.out.println("객체 b의  counter = " + b.counter + " num = " + b.a);

	}

}
