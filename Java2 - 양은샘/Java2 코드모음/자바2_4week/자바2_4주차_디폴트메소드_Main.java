package �ڹ�2_4week;

public class �ڹ�2_4����_����Ʈ�޼ҵ�_Main {

	public static void main(String[] args) {
		�ڹ�2_4����_����Ʈ�޼ҵ�_Myinterface myiA = null;
		myiA = new �ڹ�2_4����_����Ʈ�޼ҵ�_MyclassA();
		myiA.method1();
		myiA.method2();
		

		�ڹ�2_4����_����Ʈ�޼ҵ�_Myinterface myiB = new �ڹ�2_4����_����Ʈ�޼ҵ�_MyclassB();
		myiB.method1();
		myiB.method2();//�������̵��Ǿ� �������� ���� MyclassB�� method2�� ȣ��ȴ�. 
		
		
		//���� myiB�� �̷��� �ᵵ ��. myiA�� ����� myiB�� ������ �����ϰ�,
		//implements�� �߱� ������ �Ѵ� ��Ī�� �����ϴ�.
//		myiA = new �ڹ�2_4����_����Ʈ�޼ҵ�_MyclassA();
//		myiA.method1();
//		myiA.methode2();

	}

}
