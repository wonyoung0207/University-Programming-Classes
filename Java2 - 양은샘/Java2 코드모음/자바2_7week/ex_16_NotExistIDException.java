package ÀÚ¹Ù2_7week;

public class ex_16_NotExistIDException extends Exception{
	public ex_16_NotExistIDException() {
		this("NotExisIDException");
	}
	
	public ex_16_NotExistIDException(String message) {
		super(message);
	}

}
