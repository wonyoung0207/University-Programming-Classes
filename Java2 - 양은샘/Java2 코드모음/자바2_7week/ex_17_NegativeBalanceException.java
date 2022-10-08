package 자바2_7week;

public class ex_17_NegativeBalanceException extends Exception{
	public ex_17_NegativeBalanceException() {
		super("디폴트 잔고가 음수입니다.");
		//this("잔고가 음수입니다.");//이것도 가능 
	}
	public ex_17_NegativeBalanceException(String message) {
		super(message);
//		System.out.println("잔고가 음수입니다 2");
	}

}
