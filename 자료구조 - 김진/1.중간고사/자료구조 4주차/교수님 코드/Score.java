
import java.util.*; //Ű���� �Է��� �ޱ����� ��ƿ ���̺귯�� ���

public class Score {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); //sc�� ��ĳ�� ��� ����
		
		int a[] = new int [10]; // 10ĭ¥�� int�� �迭 a ����
		int sum=0,ave; // ���� �� ��� ���� ����
		
		for(int i=0;i<10;i++){  // �л� ���� �Է��� ���� for��
			System.out.print((i+1)+"��° ������ �Է��Ͻÿ� : ");
			int n =sc.nextInt(); //�л� ���� Ű���� �Է�
			if(n<0||n>100){ //�Է� ���� 0���� �۰� 100���� Ŭ��
 				System.out.println("[����] 1���� 100���� ���ڸ� �Է����ּ���");
				i--; //�ݺ� �� i ��  1���༭ �ٽ� �Է��ϰ� �ϰ�
				continue; // for������ ���ư��� �Ѵ�
			}
			a[i] = n; // �迭 a�� i��° ĭ�� �Է��� �� n�� �־��ش�
			sum +=n;  // �Է��� ������ ������ sum �� ����
		}
		ave = sum/10; // ������ 10���� ������ ����� ����
		System.out.println("������ ���� : " + sum + "\n������ ����� : " + ave); // ���� �� ��� ���
	}
}