package �ڹ�1������Ʈ;
import java.util.*;

public class �ڹ�1_11����_Cartest {

	public static void main(String[] args) {
		int num;//�����Է°� �޴� �ʵ�
		int change;//���� �Է°� �޴� �ʵ�
		
		
		�ڹ�1_11����_Car mycar = new �ڹ�1_11����_Car();
		System.out.println(mycar);
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �����Է�(����:1, ����:2, ����:3, ����:-1) :");
		num = input.nextInt();
		
		while(true) {
			if (num == 1) {
				System.out.print("�� ������ �������� �Է�: ");
				change = input.nextInt();
				mycar.changeGear(change);
			}
			else if(num == 2) {
				mycar.speedup();
			}
			else if(num ==3) {
				mycar.speeddown();
			}
			else if(num == -1) {
				break;
			}
			System.out.println(mycar);
			System.out.print("������ �����Է�(����:1, ����:2, ����:3, ����:-1) :");
			num = input.nextInt();
		
		}
		

	}

}
