package �ڹ�2_6week;

public class �ڹ�2_6����_����ڿ���ó��_Account {
	private long balance;
	
	public �ڹ�2_6����_����ڿ���ó��_Account() {
		
	}
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws �ڹ�2_6����_����ڿ���ó��_���������{
		//throws : ���⼭ ���ܹ߻��� ȣ���� ������ ���� ���ܸ� ó���Ѵ�.
		if(balance < money) {
			//throw : ���ܸ� �߻���Ų��. throw�� �׻� new��ü�� �Բ� ���δ�. 
			////"�ڹ�2_6����_����ڿ���ó��_���������" Ŭ������ ��ü�� ���� , �����ڿ��� ���� 
			throw new �ڹ�2_6����_����ڿ���ó��_���������("�ܰ���� " + (money-balance) + " ���ڶ�");
		}
		balance -= money;
	}
}
