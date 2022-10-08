package �ڹ�2_2week;

//******************************������ Ǯ��*************************************
//***************************************************************************

import java.util.*;
public class �ڹ�2_2����_CellPhoneTest {
	public static void main(String[] args) {
		�ڹ�2_2����_CellPhone cp_array[] = new �ڹ�2_2����_CellPhone[5];//5���� ��ü������ Ȯ����, ��ü�� �������� �ʾҴ�.
		
		System.out.println("\n��ü�� ���� cp_array ��, �迭�� ������ �����Դϴ�. ");
		for(int i = 0; i < cp_array.length; i++) {//��ü������ �Ҵ�Ȱ��� ���� ���� for��
			System.out.println(cp_array[i]);//��ü�� ȣ���ϰ� �Ǹ� toString�� ȣ���ϰ� �ȴ�. 
		}
		
		//getCount�� static(����) ���� ����Ǿ� �ֱ� ������ ��ü �������� �ʰ� ȣ�� ����
		System.out.println("��ü ���� ���� = " + �ڹ�2_2����_CellPhone.getCount());
		
		System.out.println("\n ��ü�� ���� cp_array ��, ���� ��ü�� �����մϴ�.");
		for(int i=0; i< cp_array.length; i++) {//�� for������ ��ü�� �������ش�. 
			// ��ü�����Ҷ� "" �� �ڿ� �����ִ� ������ ���ڷ� �ν��ϰ� �ϱ� �����̴�. 
			cp_array[i] = new �ڹ�2_2����_CellPhone("111-111-111" + i + "");
		}//new ��� �����ڸ� ����� ��ü�� �����Ѵ�. 
		
		//������ ��ü���� ������ ��� 
		for(int i = 0; i < cp_array.length; i++) {
			System.out.println(cp_array[i]);
			
		}
		
		System.out.println("��ü ���� ���� = " + �ڹ�2_2����_CellPhone.getCount());
		
		cp_array[2].powerToggle();//3��°�� ����� ��ü�� power�� ��۽����ش�. -> power : false �� ����
		
		System.out.println("\n cp_array[2].powerToggle ���� ���� ���� Ȯ���ϱ�");
		//������ for�� -> ������ �迭�� ��쿡�� ���Ǹ�, obj��� "�ڹ�2_2����_CellPhone" Ÿ���� ��ü���� ó������ �ϳ��� ������.
		for(�ڹ�2_2����_CellPhone obj : cp_array) {//�ٲ� power�� Ȯ���ϱ� ���� ������ for��
			System.out.println(obj);//obj�� ��ü�����̱� ������ toString ȣ��
			
		}
		
		Scanner input = new Scanner(System.in);
		
		do {//�ݺ���
			System.out.println("\n��ȭ��ȣ�� �Է��Ͻø� �������¸� �˷��帳�ϴ�. ");
			System.out.println("��ȭ��ȣ �Է��� �����Ͻ÷��� q�� �����ּ���");
			String pn = input.next();
			
			if (pn.charAt(0) == 'q') break;//�ݺ����� Ż��
			
			// ���� Ż�⹮ 3����
			//1. continue : ���ǹ����� ���ư�
			//2. break : �ݺ����� ��������
			//3. return : ȣ��� �Լ��� ���ư�
			
			boolean hasflag = false;
			for(�ڹ�2_2����_CellPhone cp : cp_array) {
				if(cp.getTelNum().equals(pn)) {//�Է°��� ������ telNum�� ������� ����
					System.out.println("�������� = " + cp.getPower());//���� ���¸� return ����
					hasflag = true;
				}
			}
			
			if(!hasflag) {//hasflag�� false ��, ���� for��(�Է°��� �������� �������)�� ������� �ʾ����� ���� 
				System.out.println("�� ��ȭ��ȣ�� ������ ���� �ʽ��ϴ�.");
			}
			
		}while(true);//���ǹ�
		
		System.out.println("���α׷��� �����մϴ�.");
		
	}
}



//********************************** ���� Ǯ�� ******************************************


//public class �ڹ�2_2����_CellPhoneTest {
//
//	public static void main(String[] args) {
//		int person_tel;
//		int find_person;
//		
//		//peple�̶�� "�ڹ�2_2����_CellPhone" Ŭ���� ������ �迭 ����
//		�ڹ�2_2����_CellPhone[] peple = new �ڹ�2_2����_CellPhone[5];
//		Scanner input = new Scanner(System.in);
//		
//		for(int i = 0; i < peple.length; i++) {//�迭�� ��ȭ��ȣ�� �ٸ� ������ ��ü ���� 
//			System.out.print("��ȭ��ȣ�� �Է��ϼ���. ");
//			person_tel = input.nextInt();
//			peple[i] = new �ڹ�2_2����_CellPhone(person_tel);
//		}
//		
//		for(int i = 0; i < peple.length; i++) {//�ش� ��ü �ҷ��ָ� toString() �޼ҵ� �ڵ����� ȣ�� 
//			System.out.println(i + "��° ��� : " + peple[i]);
//		}
//		
//		System.out.print("ã���� �ϴ� ��ȭ��ȣ�� �Է��� �ּ���.");//ã���� �ϴ� ��ȣ �Է� 
//		find_person = input.nextInt();
//		
//		for(int i = 0; i < peple.length; i++) {//ã���� �ϴ� ��ȣ ã�� �ݺ��� 
//			if(peple[i].telNum == find_person) {
//				System.out.println(find_person + "��ȣ�� ���� ���´� " + peple[i].powerToggle() + " �Դϴ�. ");
//				break;//��ȣ ã���� �ݺ��� Ż�� 
//			}
//			System.out.println(i + "�� ����");//���°�� �ִ��� Ȯ���ϱ� ���� 
//		
//		}
//
//	}
//
//}
