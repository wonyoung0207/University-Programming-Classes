package 자바2_6week;

public class 자바2_6주차_사용자예외처리_Account {
	private long balance;
	
	public 자바2_6주차_사용자예외처리_Account() {
		
	}
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws 자바2_6주차_사용자예외처리_사용자정의{
		//throws : 여기서 예외발생시 호출한 곳으로 가서 예외를 처리한다.
		if(balance < money) {
			//throw : 예외를 발생시킨다. throw는 항상 new객체와 함께 쓰인다. 
			////"자바2_6주차_사용자예외처리_사용자정의" 클래스로 객체를 생성 , 생성자에게 전달 
			throw new 자바2_6주차_사용자예외처리_사용자정의("잔고부족 " + (money-balance) + " 모자람");
		}
		balance -= money;
	}
}
