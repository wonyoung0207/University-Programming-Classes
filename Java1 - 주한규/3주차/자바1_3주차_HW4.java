package �ڹ�1������Ʈ;
import java.util.*;


public class �ڹ�1_3����_HW4 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��� �ּ��� : ");
		num = input.nextInt();
		
		
		if(num % 2 == 0) {//���� ¦������ �Ǻ����ش�.
			if(num % 3 ==0) {//¦���� ���, 3���� ���� �������� 0�̶�� 3�� ����̴�.
				System.out.println("¦���̸� 3�� ����Դϴ�.");
			}
			else {//¦�������� 3���� ���� �������� 0�� �ƴϸ� 3�� ����� �ƴϴ�.
				System.out.println("¦���̸� 3�� ����� �ƴմϴ�.");
			}
		}
		else {//¦���� �ƴ� Ȧ���� ��� ����
			if(num % 5==0) {//Ȧ���� ��� 5�� ���� �������� 0�̶�� 5�� ����̴�.
				System.out.println("Ȧ���̸� 5�� ����Դϴ�.");
			}
			else {//Ȧ���� ��� 5�� ���� �������� 0�� �ƴ϶�� 5�� ����� �ƴϴ�.
				System.out.println("Ȧ���̸� 5�� ����� �ƴմϴ�.");
			}
		}
	}

}
