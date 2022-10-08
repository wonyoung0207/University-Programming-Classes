package 자바2_9week;

public class MyException extends Exception{
	public MyException() {
		super("MyException 오류 입니다. ");
		
	}
	public MyException(String Message) {
		super(Message);
	}
}
