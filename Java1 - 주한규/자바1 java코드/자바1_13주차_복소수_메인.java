package 자바1프로젝트;
// 복소수로 덧셈, 곱셈, 비교 해주는 클래스 


public class 자바1_13주차_복소수_메인 {

	public static void main(String[] args) {
		
		자바1_13주차_복소수 c1 = new 자바1_13주차_복소수(3.0, 2.0);
		자바1_13주차_복소수 c2 = new 자바1_13주차_복소수(1.0, 7.0);
		자바1_13주차_복소수 r1 = c1.add(c2);
		자바1_13주차_복소수 r2 = c1.mul(c2);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(r1);
		System.out.println(r2);
		
		자바1_13주차_복소수 c3 = new 자바1_13주차_복소수(3.0, 2.0);
		System.out.println(c1.equals(c3));
		System.out.println(c2.equals(c3));
		

	}

}
