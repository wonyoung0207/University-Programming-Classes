package 자바2_7week;

//Throws 사용시 try catch 없이 사용할 수 있다. 다만 호출한곳으로 돌아가서 그 메소드에 throws 해줘야함

public class ex_17_BankAccountTest {
//	public static void main(String[] args) throws ex_17_NegativeBalanceException{
	
	public static void main(String[] args){
		ex_17_BankAccount ba = new ex_17_BankAccount();
		System.out.print("저축 100,");
		System.out.println("잔고 = " + ba.deposit(100));
		System.out.print("저축 500,");
		System.out.println("잔고 = " + ba.deposit(500));
		
		System.out.print("출금 800,");

//		System.out.print("잔고 = " + ba.withdraw(800));

		
		try {//여기서 예외발생 -> 저장된건 600원인데 800원 인출
			System.out.print("잔고 = " + ba.withdraw(800));//왜 return 값 출력 안되는지 
		}catch(ex_17_NegativeBalanceException e) {
			System.out.println("메인문에서 출력 : "+e.getMessage());
		}
		
		
		
	}

}
