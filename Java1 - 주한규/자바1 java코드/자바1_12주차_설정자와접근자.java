package 자바1프로젝트;
//설정자와 접근자
//설정자 = 필드의 값을 설정하는 메소드 -> set()형식
//접근자 = 필드의 값을 반환하는 메소드 -> get()형식


public class 자바1_12주차_설정자와접근자 {
	private int regNumber;
	private String name;
	private int balance;
	
	public String toString() {
		return "this를 이용해서 클래스의 객체변수가 바뀐것을 알 수 있다. "+"이름: " + name + " 이고 balance: " + balance + " 입니다.";
	}
	
	public String getName() {//접근자 = get
		return name;
	}
	public void setName(String name) {//설정자->객체의 name을 바군다.
		this.name = name;//그 객체의 name이 바뀐다. 이 클래스의 필드인 name이 바뀌는게 아님 
	}
//	public void setName(String name) {//설정자->클래스의 전역변수name을 바꿈
//		name = name;//이렇게 하면 안됨 -> name = n 으로 하던지 , this.name = name으로 해야함 
//	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
