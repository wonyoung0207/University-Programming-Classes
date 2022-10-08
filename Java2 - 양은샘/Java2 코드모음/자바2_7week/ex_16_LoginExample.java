package 자바2_7week;

public class ex_16_LoginExample {
	public static void main(String[] args) {
		try {
			login("white",12345);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			login("blue",54321);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void login(String ID, int password) throws ex_16_NotExistIDException,ex_16_WrongPasswordException {

		if(ID != "blue") {//if(!ID.equals("blue"))
			
			throw new ex_16_NotExistIDException("ID 가 틀렸습니다.");
		}
		
		if(password != 12345) {
			throw new ex_16_WrongPasswordException("password가 틀렸습니다. ");
		}
	}

}
