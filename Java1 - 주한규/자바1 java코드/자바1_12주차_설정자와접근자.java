package �ڹ�1������Ʈ;
//�����ڿ� ������
//������ = �ʵ��� ���� �����ϴ� �޼ҵ� -> set()����
//������ = �ʵ��� ���� ��ȯ�ϴ� �޼ҵ� -> get()����


public class �ڹ�1_12����_�����ڿ������� {
	private int regNumber;
	private String name;
	private int balance;
	
	public String toString() {
		return "this�� �̿��ؼ� Ŭ������ ��ü������ �ٲ���� �� �� �ִ�. "+"�̸�: " + name + " �̰� balance: " + balance + " �Դϴ�.";
	}
	
	public String getName() {//������ = get
		return name;
	}
	public void setName(String name) {//������->��ü�� name�� �ٱ���.
		this.name = name;//�� ��ü�� name�� �ٲ��. �� Ŭ������ �ʵ��� name�� �ٲ�°� �ƴ� 
	}
//	public void setName(String name) {//������->Ŭ������ ��������name�� �ٲ�
//		name = name;//�̷��� �ϸ� �ȵ� -> name = n ���� �ϴ��� , this.name = name���� �ؾ��� 
//	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
