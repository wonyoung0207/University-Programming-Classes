package �ڹ�2_7week;

public class ex_17_NegativeBalanceException extends Exception{
	public ex_17_NegativeBalanceException() {
		super("����Ʈ �ܰ� �����Դϴ�.");
		//this("�ܰ� �����Դϴ�.");//�̰͵� ���� 
	}
	public ex_17_NegativeBalanceException(String message) {
		super(message);
//		System.out.println("�ܰ� �����Դϴ� 2");
	}

}
