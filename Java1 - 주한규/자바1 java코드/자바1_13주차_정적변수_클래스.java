package 자바1프로젝트;

public class 자바1_13주차_정적변수_클래스 {

	public static void main(String[] args) {
		//생성자의 형태에 맞춰 써야함
		자바1_13주차_정적변수_메소드 car1 = new 자바1_13주차_정적변수_메소드("s600","white",80);
		자바1_13주차_정적변수_메소드 car2= new 자바1_13주차_정적변수_메소드("x1000","blue",100);
		
		System.out.println(car1.getCarOption());

		System.out.println(car2.getCarOption());

		int n = 자바1_13주차_정적변수_메소드.getNumberOfCars();//정적변수 number 을 사용
		System.out.println("지금까지 생성한 차의 갯수는 " + n + "대 입니다. ");
//		System.out.println(car1.getNumberOfCars());// -> 각 객체에서도 접근 가능 
		
		System.out.println(자바1_13주차_정적변수_메소드.test);
		System.out.println(자바1_13주차_정적변수_메소드.gettest());
		
		for(int i = 0; i < 자바1_13주차_정적변수_메소드.arr.length; i++) {
			System.out.println(자바1_13주차_정적변수_메소드.arr[i]);
		}
		
		for(int i = 자바1_13주차_정적변수_메소드.arr.length-1; i >= 0; i--) {
			System.out.println(자바1_13주차_정적변수_메소드.arr[i]);
		}
		

	}

}
