package �ڹ�2_7week;

//Throws ���� try catch ���� ����� �� �ִ�. �ٸ� ȣ���Ѱ����� ���ư��� �� �޼ҵ忡 throws �������

public class ex_17_BankAccountTest {
//	public static void main(String[] args) throws ex_17_NegativeBalanceException{
	
	public static void main(String[] args){
		ex_17_BankAccount ba = new ex_17_BankAccount();
		System.out.print("���� 100,");
		System.out.println("�ܰ� = " + ba.deposit(100));
		System.out.print("���� 500,");
		System.out.println("�ܰ� = " + ba.deposit(500));
		
		System.out.print("��� 800,");

//		System.out.print("�ܰ� = " + ba.withdraw(800));

		
		try {//���⼭ ���ܹ߻� -> ����Ȱ� 600���ε� 800�� ����
			System.out.print("�ܰ� = " + ba.withdraw(800));//�� return �� ��� �ȵǴ��� 
		}catch(ex_17_NegativeBalanceException e) {
			System.out.println("���ι����� ��� : "+e.getMessage());
		}
		
		
		
	}

}
