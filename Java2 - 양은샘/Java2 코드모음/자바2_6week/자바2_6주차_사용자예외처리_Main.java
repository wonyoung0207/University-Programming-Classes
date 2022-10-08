package 자바2_6week;

//************시험출제************** 
//************시험출제************** 
//************시험출제************** 

public class 자바2_6주차_사용자예외처리_Main {

	public static void main(String[] args) {
		자바2_6주차_사용자예외처리_Account account = new 자바2_6주차_사용자예외처리_Account();
		
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		//출금하기
		try {
			account.withdraw(30000);//10000원밖에 없어서 예외발생
		}catch(자바2_6주차_사용자예외처리_사용자정의 e){
			//"자바2_6주차_사용자예외처리_사용자정의" 클래스의 상속받은 Exception 메소드인 getMessage 호출
			//new로 //"자바2_6주차_사용자예외처리_사용자정의" 클래스 생성했기 때문에 
			//생성시 전달된 message를 getMessage로 가져온다.
			String message = e.getMessage(); 
			
			System.out.println(message);
			System.out.println();
			e.printStackTrace();  
			
		}

	}

}
