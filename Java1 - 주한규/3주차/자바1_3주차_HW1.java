package �ڹ�1������Ʈ;
import java.util.*;//Scanner�� �ҷ����� ���� ����ߴ�.

public class �ڹ�1_3����_HW1 {

	public static void main(String[] args) {

		int num;//������ ���� num�� ����
		
		Scanner input = new Scanner(System.in);//Scanner �� ����ϱ� ���� ���� input�� ������ �־���.
		System.out.println("���ڸ� �Է��ϼ��� : ");
		
		num = input.nextInt();//num�� �Է¹��� input�� ���� �־��ش�.
		
		if(num % 5 == 0) {//�Է¹��� ���ڸ� 5�� ���� �������� 0�̶��, �Է¹��� ���ڴ� 5�� ����̴�.
			System.out.println(num + "�� 5�� ����Դϴ�.");
		}
		else {//5�� ����� �ƴ϶�� ����ȴ�.
			System.out.println(num + "�� 5�� ����� �ƴմϴ�.");
		}

	}

}
