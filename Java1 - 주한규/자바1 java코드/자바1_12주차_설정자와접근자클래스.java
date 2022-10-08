package 자바1프로젝트;

public class 자바1_12주차_설정자와접근자클래스 {

	public static void main(String[] args) {
		자바1_12주차_설정자와접근자 my = new 자바1_12주차_설정자와접근자();
		my.setName("Tom");
		my.setBalance(1000000);
		System.out.println("이름은 " + my.getName() + "의 통장잔고는 "
								+ my.getBalance() + "입니다.");
		System.out.println(my);
		
		자바1_12주차_설정자와접근자 my2 = new 자바1_12주차_설정자와접근자();
		System.out.println(my2.getName());

	}

}
