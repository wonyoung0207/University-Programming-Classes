package �ڹ�2_6week;

//************��������************** 
//************��������************** 
//************��������************** 

public class �ڹ�2_6����_����ڿ���ó��_Main {

	public static void main(String[] args) {
		�ڹ�2_6����_����ڿ���ó��_Account account = new �ڹ�2_6����_����ڿ���ó��_Account();
		
		account.deposit(10000);
		System.out.println("���ݾ� : " + account.getBalance());
		
		//����ϱ�
		try {
			account.withdraw(30000);//10000���ۿ� ��� ���ܹ߻�
		}catch(�ڹ�2_6����_����ڿ���ó��_��������� e){
			//"�ڹ�2_6����_����ڿ���ó��_���������" Ŭ������ ��ӹ��� Exception �޼ҵ��� getMessage ȣ��
			//new�� //"�ڹ�2_6����_����ڿ���ó��_���������" Ŭ���� �����߱� ������ 
			//������ ���޵� message�� getMessage�� �����´�.
			String message = e.getMessage(); 
			
			System.out.println(message);
			System.out.println();
			e.printStackTrace();  
			
		}

	}

}
