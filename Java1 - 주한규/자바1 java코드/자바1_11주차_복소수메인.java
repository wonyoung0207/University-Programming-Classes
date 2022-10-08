package 자바1프로젝트;

public class 자바1_11주차_복소수메인 {

	public static void main(String[] args) {
		자바1_11주차_복소수 c1 = new 자바1_11주차_복소수();
		자바1_11주차_복소수 c2 = new 자바1_11주차_복소수();
		
		c1.real = 2; c1.imagine = 3;
		
		c2.real = 3; c2.imagine = 4;
		
		자바1_11주차_복소수 c3 = c1.add(c2);
		System.out.println(c3.real + c3.imagine + "i");

	}

}
