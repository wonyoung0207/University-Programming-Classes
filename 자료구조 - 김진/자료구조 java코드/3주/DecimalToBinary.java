
public class DecimalToBinary {	//10������ 2������ �����ϴ� ���α׷�
	
	static void decToBin(int num, int base) {
		if(num > 0) { //������
			decToBin(num/base, base);	//2�� ������ �ٽ� �Լ� ȣ�� �ȳ��� ��������
			
			/*
			 * 20 / 2 = 10	������ 0
			 * 10 / 2 = 5	������ 0
			 * 5 / 2 = 2 	������ 1
			 * 2 / 2 = 1	������ 0
			 * -> �д� ���� : �ǹؿ� �� 1 -> ������ 0 ...
			 * ���� 1 0 1 0 0
			 */
			System.out.println(num % base);	//�Է°��� 2�� ���� �������� ����Ʈ
		}else if(num < 0) {
			System.out.println("�����Դϴ�");
		}
	}	

	public static void main(String[] args) {
		int decNo = 20;
		System.out.println("������" + decNo + "�� �������� ��ȯ -> ");
		decToBin(decNo, 2);
		System.out.println();

	}

}
