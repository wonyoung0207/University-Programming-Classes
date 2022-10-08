package 자바2_7week;

public class ex_17_BankAccount {
	private int balance;
	public int deposit(int amount) {
		this.balance += amount;
		return this.balance;
	}
	
//	public int withdraw(int amount) throws ex_17_NegativeBalanceException {
//		if(this.balance >= amount) {
//			this.balance -= amount;
//		}
//		else {
//			throw new ex_17_NegativeBalanceException("잔고가 음수입니다.throw");
//		}
//		return this.balance;
//	}
//	
	
	public int withdraw(int amount) throws ex_17_NegativeBalanceException{
		try {
			if(this.balance >= amount) {
				this.balance -= amount;
				
			}
			else {
				throw new ex_17_NegativeBalanceException("잔고가 음수입니다.");
			}
		}catch(ex_17_NegativeBalanceException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {//모든 예외를 잡는다. 
			System.out.println(e.getMessage());
		}finally {
			return this.balance;
		}
		
	}

}
